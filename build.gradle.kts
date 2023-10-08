val invoker by configurations.creating

plugins {
    kotlin("jvm") version "1.9.10"
    kotlin("plugin.serialization") version "1.9.10"
    id("com.github.johnrengelman.shadow") version "8.1.1"
}

group = "com.mihassan"
version = "1.0-SNAPSHOT"
description = "GCPFunctionDemo"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.6.0")
    compileOnly("com.google.cloud.functions:functions-framework-api:1.1.0")
    invoker("com.google.cloud.functions.invoker:java-function-invoker:1.3.1")
}

kotlin {
    jvmToolchain(17)
}

task<JavaExec>("runFunction") {
    mainClass = "com.google.cloud.functions.invoker.runner.Invoker"
    classpath(invoker)
    inputs.files(configurations.runtimeClasspath, sourceSets["main"].output)
    args(
        "--target", project.findProperty("runFunction.target") ?: "HelloWorld",
        "--port", project.findProperty("runFunction.port") ?: 8080
    )
    doFirst {
        args("--classpath", files(configurations.runtimeClasspath, sourceSets["main"].output).asPath)
    }
}

tasks.named("build") {
    dependsOn(":shadowJar")
}

task("buildFunction") {
    dependsOn("build")
    copy {
        from("build/libs/" + rootProject.name + "-all.jar")
        into("build/deploy")
    }
}