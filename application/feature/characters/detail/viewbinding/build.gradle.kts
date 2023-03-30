viewBinding(
    packageName = "com.stepango.blockme.feature.characters.detail.viewbinding",
    dependencies = deps(
        google.material,
        androidx.appcompat,
        androidx.constraintlayout,
    ) + deps(
        target(":feature:characters:core:api"),
        target(":feature:characters:detail:api"),
        target(":feature:characters:detail:res"),

        target(":core:theme:res"),
    )
)