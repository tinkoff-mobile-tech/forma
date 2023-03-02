// Configure the ':tasks' task of the root project to only show
// the main lifecycle tasks as entry points to the build
val mainBuildGroup = "main build"
tasks.named<TaskReportTask>("tasks") {
    displayGroup = mainBuildGroup
}

tasks.register("build") {
    group = mainBuildGroup
    description = "Complete build of all modules and the application"
    dependsOn(gradle.includedBuild("application").task(":$name"))
}

tasks.register("check") {
    group = mainBuildGroup
    description = "Runs all checks and produces test summary and code coverage reports"
    dependsOn(gradle.includedBuild("application").task(":$name"))
}

tasks.register("clean") {
    group = mainBuildGroup
    description = "Cleans all build artifacts"
    dependsOn(gradle.includedBuild("application").task(":$name"))
}
