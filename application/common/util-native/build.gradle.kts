import tools.forma.android.config.NdkAbi
import tools.forma.android.config.CMake

androidNative(
    packageName = "com.stepango.blockme.common.util.native",
    owner = Teams.core,
    abi = setOf(NdkAbi.ARM7, NdkAbi.ARM8, NdkAbi.X86),
    buildSystem = CMake(
        path = File(projectDir, "src/main/jni/CMakeLists.txt"),
        version = "3.22.1"
    )
)
