# Google Cloud Function Demo using Kotlin

This is a demo project to show how to use Kotlin to write a Google Cloud Function.

It covers the following:
1. How to write a Google Cloud Function using Kotlin,
1. How to use gradle kts to build the project,
1. How to define gradle tasks to build and run cloud function,
1. How to add additional depedencies (e.g., serialization).

## Deploy

To deply the cloud function, run the following commands after adjusting the parameters:

```bash
$ ./gradlew buildFunction
$ gcloud functions deploy Quote \
  --gen2 \
  --runtime=java17 \
  --region=us-central1 \
  --source=build/deploy \
  --entry-point=Quote \
  --memory=256MB \
  --trigger-http \
  --allow-unauthenticated
```

## References

1. [Google Cloud Functions](https://cloud.google.com/functions/)
1. [kotlin-samples](https://github.com/GoogleCloudPlatform/kotlin-samples)
1. https://github.com/mwhyte-dev/kotlin-google-cloud-function

