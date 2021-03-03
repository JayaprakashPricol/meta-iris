DESCRIPTION = "Freescale Image - Adds Qt5"
LICENSE = "MIT"

require recipes-graphics/images/iris-image-gui.bb

inherit distro_features_check

CONFLICT_DISTRO_FEATURES = "directfb"

X11_IMAGE_INSTALL = "${@base_contains('DISTRO_FEATURES', 'x11', \
    'libxkbcommon', '', d)}"

OPENCV_INSTALL = "opencv opencv-dev opencv-apps opencv-samples"

QT5_IMAGE_INSTALL = ""
QT5_IMAGE_INSTALL_common = " \
    packagegroup-qt5-core \
    packagegroup-qt5-qtdeclarative \
    packagegroup-qt5-qtdeclarative-qml \
    ${X11_IMAGE_INSTALL} \
    ${OPENCV_INSTALL} \
    "
QT5_IMAGE_INSTALL_mx6 = " \
    ${QT5_IMAGE_INSTALL_common} \
    packagegroup-qt5-webkit \
    "
QT5_IMAGE_INSTALL_mx6sl = "${@base_contains('DISTRO_FEATURES', 'x11','${QT5_IMAGE_INSTALL_common}', \
    'packagegroup-qt5-core \
     qtbase-examples', d)}"

IMAGE_INSTALL += " \
${QT5_IMAGE_INSTALL} \
"

RRECOMMENDS_${PN} += " \
    qtdeclarative-qmlplugins \
    qtquickcontrols-qmlplugins \
"
export IMAGE_BASENAME = "iris-image-qt5"
