import java.util.Properties

buildscript {
    androidProjectConfiguration(
        project = project,
        minSdk = 21,
        targetSdk = 31,
        compileSdk = 31,
        dataBinding = true,
        validateManifestPackages = true,
        generateMissedManifests = true,
        extraPlugins = listOf(
            "androidx.navigation:navigation-safe-args-gradle-plugin:2.5.3",
            "com.google.firebase:firebase-crashlytics-gradle:2.9.4",
            "tools.forma.demo:dependencies",
        )
    )
}

/**
 * By design, Forma does not support Root Project plugins
 */
plugins {
    id("com.osacky.doctor") version "0.8.1"
}

val properties = Properties()
val file: File = project.rootProject.file("local.properties")
if (file.exists()) file.inputStream().use { properties.load(it) }


tasks.register("check") {
    dependsOn(subprojects.mapNotNull { project ->
        project.tasks.findByName("check")?.run {
            project.absoluteProjectPath("check")
        }
    })
}
