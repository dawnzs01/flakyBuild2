# Support script for mapengine/CMakeLists.txt that sets sources, definitions, includes, link libraries, link directories,
# and compiler options that are specific to Android targets.

set(takenginejni_MACOS_DEFS
    RTTI_ENABLED
    -DTE_GLES_VERSION=3
    SQLITE_HAS_CODEC
)

set(takenginejni_MACOS_INCS
    ${khronos_INCLUDE_DIRS}
    ${JNI_INCLUDE_DIRS}
)

set(takenginejni_MACOS_LDIRS
    ${ttp-dist_LIB_DIRS}
    ${GLES-stub_LIB_DIRS}
)

set(takenginejni_MACOS_LIBS
    # GLES
    GLESv2

    # TTP
    spatialite
    gdal
)

set(takenginejni_MACOS_OPTS
    $<$<NOT:$<BOOL:${MSVC}>>:-O3>
)

set(takenginejni_MACOS_SRCS
)
