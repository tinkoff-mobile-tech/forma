import tools.forma.android.feature.ApplicationBuildFeaturesContainer
import tools.forma.android.feature.LibraryBuildFeaturesContainer

fun applicationBuildFeatures(
    dataBinding: Boolean? = null,
    mlModelBinding: Boolean? = null,
    aidl: Boolean? = null,
    buildConfig: Boolean? = null,
    compose: Boolean? = null,
    prefab: Boolean? = null,
    renderScript: Boolean? = null,
    resValues: Boolean? = null,
    shaders: Boolean? = null,
    viewBinding: Boolean? = null,
): ApplicationBuildFeaturesContainer = ApplicationBuildFeaturesContainer(
    dataBinding = dataBinding,
    mlModelBinding = mlModelBinding,
    aidl = aidl,
    buildConfig = buildConfig,
    compose = compose,
    prefab = prefab,
    renderScript = renderScript,
    resValues = resValues,
    shaders = shaders,
    viewBinding = viewBinding,
)

fun libraryBuildFeatures(
    androidResources: Boolean? = null,
    prefabPublishing: Boolean? = null,
    dataBinding: Boolean? = null,
    mlModelBinding: Boolean? = null,
    aidl: Boolean? = null,
    buildConfig: Boolean? = null,
    compose: Boolean? = null,
    prefab: Boolean? = null,
    renderScript: Boolean? = null,
    resValues: Boolean? = null,
    shaders: Boolean? = null,
    viewBinding: Boolean? = null,
): LibraryBuildFeaturesContainer = LibraryBuildFeaturesContainer(
    androidResources = androidResources,
    prefabPublishing = prefabPublishing,
    dataBinding = dataBinding,
    mlModelBinding = mlModelBinding,
    aidl = aidl,
    buildConfig = buildConfig,
    compose = compose,
    prefab = prefab,
    renderScript = renderScript,
    resValues = resValues,
    shaders = shaders,
    viewBinding = viewBinding,
)
