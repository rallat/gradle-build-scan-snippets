// See the Gradle Build Scan User Manual for more information: https://docs.gradle.com/build-scan-plugin/
buildScan {
    // Publish a build scan for each build.
    publishAlways()

    // Accept terms of service.
    termsOfServiceUrl = "https://gradle.com/terms-of-service"
    termsOfServiceAgree = "yes"
}
