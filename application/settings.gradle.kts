enableFeaturePreview("STABLE_CONFIGURATION_CACHE")

rootProject.name = "forma-demo-app"

pluginManagement {
    apply(from = "../build-settings/conventions/src/main/kotlin/convention-plugins.settings.gradle.kts")
    includeBuild("../build-settings")
    includeBuild("../build-dependencies")
}

plugins {
    id("convention-dependencies")
    id("tools.forma.android")
    id("tools.forma.deps")
}


include(":toggle-widget")
include(":root-res")
include(":core:theme:res")
include(":common:placeholder:res")
//include(":common:util-native")
include(
    ":binary",

    ":feature:home:api",
    ":feature:home:impl",
    ":feature:home:res",
    ":feature:home:viewbinding",
    ":feature:characters:core:api",
    ":feature:characters:core:impl",
    ":feature:characters:list:api",
    ":feature:characters:list:res",
    ":feature:characters:list:impl",
    ":feature:characters:list:viewbinding",
    ":feature:characters:detail:api",
    ":feature:characters:detail:impl",
    ":feature:characters:detail:res",
    ":feature:characters:detail:viewbinding",
    ":feature:characters:favorite:api",
    ":feature:characters:favorite:res",
    ":feature:characters:favorite:impl",
    ":feature:characters:favorite:viewbinding",

    ":core:di:library",
    ":core:network:library",
    ":core:mvvm:library",
    ":core:navigation:library",
    ":core:theme:android-util",

    ":common:extensions:android-util",
    ":common:extensions:util",
    ":common:extensions:databinding-adapter",
    ":common:progressbar:viewbinding",
    ":common:progressbar:res",
    ":common:recyclerview:widget",
    ":common:util",

    ":root-app"
)
