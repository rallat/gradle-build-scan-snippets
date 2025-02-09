// With Gradle Enterprise, the build scan plugin v2.1+, and Gradle 5.0+, we can capture hashes of task inputs for
// use with build comparisons. See https://docs.gradle.com/enterprise/tutorials/task-inputs-comparison/ for more
// information.
buildScan {
    isCaptureTaskInputFiles = true
}
