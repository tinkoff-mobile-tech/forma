plugins {
    `kotlin-dsl`
}

val application = gradle.includedBuild("application")

tasks.register("checkApp") {
    dependsOn(application.task(":check"))
}

tasks.register("cleanApp") {
    dependsOn(application.task(":clean"))
}
