package tools.forma.android.feature

open class BaseBuildFeaturesContainer(
    val aidl: Boolean? = null,
    val buildConfig: Boolean? = null,
    val compose: Boolean? = null,
    val prefab: Boolean? = null,
    val renderScript: Boolean? = null,
    val resValues: Boolean? = null,
    val shaders: Boolean? = null,
    val viewBinding: Boolean? = null,
)

class ApplicationBuildFeaturesContainer(
    val dataBinding: Boolean? = null,
    val mlModelBinding: Boolean? = null,
    aidl: Boolean? = null,
    buildConfig: Boolean? = null,
    compose: Boolean? = null,
    prefab: Boolean? = null,
    renderScript: Boolean? = null,
    resValues: Boolean? = null,
    shaders: Boolean? = null,
    viewBinding: Boolean? = null,
) : BaseBuildFeaturesContainer(
    aidl = aidl,
    buildConfig = buildConfig,
    compose = compose,
    prefab = prefab,
    renderScript = renderScript,
    resValues = resValues,
    shaders = shaders,
    viewBinding = viewBinding,
)

class LibraryBuildFeaturesContainer(
    val androidResources: Boolean? = null,
    val dataBinding: Boolean? = null,
    val mlModelBinding: Boolean? = null,
    val prefabPublishing: Boolean? = null,
    aidl: Boolean? = null,
    buildConfig: Boolean? = null,
    compose: Boolean? = null,
    prefab: Boolean? = null,
    renderScript: Boolean? = null,
    resValues: Boolean? = null,
    shaders: Boolean? = null,
    viewBinding: Boolean? = null,
) : BaseBuildFeaturesContainer(
    aidl = aidl,
    buildConfig = buildConfig,
    compose = compose,
    prefab = prefab,
    renderScript = renderScript,
    resValues = resValues,
    shaders = shaders,
    viewBinding = viewBinding,
)
