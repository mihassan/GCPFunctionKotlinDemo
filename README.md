# Google Cloud Function Demo using Kotlin

**Status: [Demo]**

This is a demo project to show how to use Kotlin to write a Google Cloud Function.

## Current Scope

- Write a Google Cloud Function in Kotlin.
- Build the function with Gradle Kotlin DSL.
- Package deployment artifacts with Gradle tasks.
- Include additional dependencies such as Kotlin serialization.

## Quick Start

```bash
./gradlew build
./gradlew buildFunction
```

## Deploy

To deploy the cloud function, run the following commands after adjusting the parameters:

```bash
./gradlew buildFunction
gcloud functions deploy Quote \
  --gen2 \
  --runtime=java17 \
  --region=us-central1 \
  --source=build/deploy \
  --entry-point=Quote \
  --memory=256MB \
  --trigger-http \
  --allow-unauthenticated
```

## Tech Stack

- Kotlin
- Gradle Kotlin DSL
- Google Cloud Functions Gen 2
- Java 17 runtime

## Verification

```bash
./gradlew build
./gradlew buildFunction
```

## Limitations

- This is a cloud function demo, not a production application.
- Deployment requires a configured Google Cloud project and `gcloud` credentials.
- The repository currently documents deployment more than local invocation or automated tests.

## References

1. [Google Cloud Functions](https://cloud.google.com/functions/)
1. [kotlin-samples](https://github.com/GoogleCloudPlatform/kotlin-samples)
1. https://github.com/mwhyte-dev/kotlin-google-cloud-function
