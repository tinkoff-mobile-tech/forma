androidBinary(
    packageName = "com.stepango.blockme.app",
    owner = Teams.core,
    dependencies = deps(
        project(":root-library"),
        project(":common:extensions:android-util"),
        project(":core:mvvm:library"),
        project(":core:di:library")
    )
)