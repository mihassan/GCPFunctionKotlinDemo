plugins {
    kotlin("jvm") version "1.9.10"
    kotlin("plugin.serialization") version "1.9.10"
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
}

kotlin {
    jvmToolchain(17)
}
