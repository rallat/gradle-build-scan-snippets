# Gradle Build Scan Snippets
Copy-pastable snippets for extending your Gradle build scans

## How to use this repo
Find a build script snippet that matches your needs and copy-paste it into your build script!
Every copy-pastable snippet has been written with both the Groovy and Kotlin DSLs.

## Looking for something but can't find it?
File an [issue](https://github.com/gradle/gradle-build-scan-snippets/issues/new) or create a [PR](https://github.com/gradle/gradle-build-scan-snippets/pulls) to add it!
PRs should include [tests](https://github.com/gradle/gradle-build-scan-snippets/tree/master/test) to validate that the new snippet can be configured correctly.

### Validate changes
Once you've added your new snippets and test(s), `cd` into the `test/` directory and run `./gradlew check`. For the gist tests to pass, you need to add the following to `~/.gradle/gradle.properties`:

```
gistUsername=<your github username>
gistToken=<your gist access token>
```