SUMMARY = "Qt Simple 12inch Demo Cluster Application Recipe"
DESCRIPTION = "This recipe builds a Qt project for a simple 12inch demo cluster application."
#LICENSE = "MIT"
LICENSE = "CLOSED"
#LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

DEPENDS += "qtbase"

SRC_URI = "git://github.com/spikynavin/qtcluster.git;branch=12inch"
SRCREV = "98de9d84107cf709d16ce1f9d999d1931831fa98"

S = "${WORKDIR}/git"

do_install_append() {
    install -d ${D}/usr/bin/
    install -m 0755 new_12 ${D}/usr/bin/12inch-cluster
}

FILES_${PN} += "/usr/bin/12inch-cluster"
INHIBIT_PACKAGE_STRIP = "1"

inherit qmake5
