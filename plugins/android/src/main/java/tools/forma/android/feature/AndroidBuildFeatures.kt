package tools.forma.android.feature

class ApplicationBuildFeaturesContainer(
    val dataBinding: Boolean? = null,
    val mlModelBinding: Boolean? = null,
    val aidl: Boolean? = null,
    val buildConfig: Boolean? = null,
    val compose: Boolean? = null,
    val prefab: Boolean? = null,
    val renderScript: Boolean? = null,
    val resValues: Boolean? = null,
    val shaders: Boolean? = null,
    val viewBinding: Boolean? = null,
)

class LibraryBuildFeaturesContainer(
    val aidl: Boolean? = null,
    val buildConfig: Boolean? = null,
    val compose: Boolean? = null,
    val prefab: Boolean? = null,
    val renderScript: Boolean? = null,
    val resValues: Boolean? = null,
    val shaders: Boolean? = null,
    val viewBinding: Boolean? = null,
    val androidResources: Boolean? = null,
    val dataBinding: Boolean? = null,
    val mlModelBinding: Boolean? = null,
    val prefabPublishing: Boolean? = null,
)
