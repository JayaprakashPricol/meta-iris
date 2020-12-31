SUMMARY = "Qt Simple Calculator Application Recipe"
DESCRIPTION = "This recipe builds a Qt project for a simple calculator application."
#LICENSE = "MIT"
LICENSE = "CLOSED"
#LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

DEPENDS += "qtbase"

SRC_URI = "git://github.com/spikynavin/qtcluster.git;branch=master"
SRCREV = "f5c52398b1a7f0483f0dec1aa296dafd88880d0c"

S = "${WORKDIR}/git"

do_install_append() {
    install -d ${D}/usr/bin/
    install -m 0755 QT_demo_App ${D}/usr/bin/demo-cluster
}

FILES_${PN} += "/usr/bin/QT_demo_App"

inherit qmake5
