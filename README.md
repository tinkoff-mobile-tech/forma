<p align="center">
    <a href="https://forma.tools" target="_blank" rel="noopener noreferrer"><img width="100" src="./img/press.svg" alt="Logo"></a>
</p>

<p align="center">
    <a href="https://forma.tools"><img src="https://forthebadge.com/images/badges/built-by-developers.svg"/></a>
    <a href="https://forma.tools"><img src="https://forthebadge.com/images/badges/built-for-android.svg"/></a>
    <a href="https://forma.tools"><img src="https://forthebadge.com/images/badges/it-works-why.svg"/></a>
</p>

<p align="center">
    <img src="https://github.com/tinkoff-mobile-tech/forma/workflows/Run%20build%20checks/badge.svg"/>
    <img alt="License" src="https://img.shields.io/github/license/tinkoff-mobile-tech/forma"/>
    <img alt="Contributors" src="https://img.shields.io/github/contributors/tinkoff-mobile-tech/forma"/>
    <img alt="GitHub top language" src="https://img.shields.io/github/languages/top/tinkoff-mobile-tech/forma"/>
    <img alt="GitHub closed pull requests" src="https://img.shields.io/github/issues-pr-closed/tinkoff-mobile-tech/forma"/>
    <img alt="GitHub Repo stars" src="https://img.shields.io/github/stars/tinkoff-mobile-tech/forma?style=social"/>
</p>    

**Forma** - Kotlin first, Meta Build System with Android and Gradle support. Opinionated, scalable,
thoughtfully structured, type-safe and guided way to declare your project structure. Distributed as
a Gradle plugin, Forma helps developers to shift focus from `Build Configuration`
to `Project Structure Declaration`, abstracting away build configuration complexity.

- You don't need to be a gradle expert anymore
- Get rid of project configuration bad practices
- Type-safe, single method configuration for your targets, no room for error
- Built-in dependency visibility rules
- Target types - enforce scalable project structure
- High-performance builds: Gradle best practices are applied automatically
- Dependencies framework - helps developers to understand and deal with transitive dependencies hell
- Extensible - be the expert when you need to!
- And much more...

⚠️ We are using `target` term to express application components(e.g. modules or projects, depending
on the context) across documentation and code, there is a couple of reasons for that. `Module` term
often confused with Dagger modules which makes communication harder, `project` from the other hand
used only in Gradle context but not in other build systems like Buck and Bazel.

⚠️ This is still under development. We will notify you when it will be ready for first users
For now you can check concept from original repo
creator [Presentation Link](https://www.beautiful.ai/player/-MLn7RnBBWeh7vePDoDq)

## How to use

Configuration made easy (Gradle 6.8+):

1. Set repositories in `settings.gradle(.kts)` to download plugin

 ```gradle
   dependencyResolutionManagement {
       @Suppress("UnstableApiUsage")
       repositories {
           google()
           jcenter()
       }
   }
   
 ```

2. Apply plugin in your root `build.gradle(.kts)`

 ``` gradle
   // 
   buildscript {
       repositories {
           google()
       }
   }
   
   plugins {
       id("ru.tinkoff.forma.android") version "0.1.0"
   }
   
   // Configure shared aspects of your android Project
   androidProjectConfiguration(
       minSdk = 21,
       targetSdk = 31,
       compileSdk = 33,
       kotlinVersion = "1.8.10",
       agpVersion = "7.4.2",
       versionCode = 1,
       versionName = "1.0"
   )
   ```

3. Setup your kotlin android module with forma dsl

``` gradle
   // Single method, type-safe creation of your target
   // Plugins applied automatically
   // Project configuration shared between targets
   androidLibrary(
       // Mandatory, visible from build configuration
       packageName = "com.stepango.example",
       // External dependencies declaration, one universal syntax
       dependencies = deps(
           google.material,
           androidx.appcompat,
       ) + deps(
           // Internal project dependencies, declared separately from externals
           target(":demo-library")
       ),
       // Test dependencies declaration
       testDependencies = deps(
           test.junit
       ),
       // Android test dependencies declaration
       androidTestDependencies = deps(
           test.espresso
       )
   )
   ```

## Progress

| Supported target types | implemented |            purpose            | validation |
|:----------------------:|:-----------:|:-----------------------------:|:----------:|
|     androidBinary      |      ✅      |      Genearte single APK      |     ✅      |
|       androidApp       |      ✅      |       Application class       |  partial   |
|     androidLibrary     |      ✅      |        Android library        |  partial   |
|     androidWidget      |      ✅      |          Custom View          |  partial   |
|       androidRes       |      ✅      |        Resources Only         |     ✅      |
|    androidTestUtils    |      ✅      | Shared code for Android tests |     ✅      |
|      androidUtils      |      ✅      |      Library extensions       |  partial   |
|       testUtils        |      ✅      |  Shared code for unit tests   |     ✅      |
|         utils          |      ✅      |    JVM Library extensions     |  partial   |
|        library         |      ✅      |          JVM Library          |  partial   |
|          api           |      ✅      |    Feature external API's     |  partial   |
|          impl          |      ✅      |    Feature implementation     |  partial   |

Icons made by <a href="https://www.flaticon.com/authors/freepik" title="Freepik">Freepik</a>
from <a href="https://www.flaticon.com/" title="Flaticon">www.flaticon.com</a>
