// Imagine you have a build that, sometimes (but not always), takes much longer than expected.
// You've looked at some build scans and determined the issue is the JavaCompile task.
// You can add the following snippet to your root build.gradle script to tag those builds that
// take "too long" to build. Later on, as a Gradle Enterprise user, you can filter your scans
// list to see just those builds that contained a JavaCompile task that took "too long".
// Borrowed from: https://blog.gradle.org/build-scans-tag-root-cause
allprojects {
    tasks.matching { t ->
        t is org.gradle.api.tasks.compile.JavaCompile
    }.configureEach {
        var start: Long = 0
        doFirst {
            start = System.currentTimeMillis()
        }
        doLast {
            val duration = System.currentTimeMillis() - start
            if (duration > 15 * 60 * 1000) { // 15 min
                buildScan.tag("TooLong")
		buildScan.value("TooLong", path)
            }
        }
    }
}
