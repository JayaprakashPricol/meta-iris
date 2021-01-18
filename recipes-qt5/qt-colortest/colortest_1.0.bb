#
#   Copyright (C) 2016 Pelagicore AB
#
#   SPDX-License-Identifier: MIT
#

DESCRIPTION = "A small test program to show a RGB test image on a screen."
HOMEPAGE = "http://www.pelagicore.com"

inherit qmake5

# Disable parallel make until .pro files properly set dependencies
PARALLEL_MAKE = "-j1"
OE_QMAKE_PATH_HEADERS = "${OE_QMAKE_PATH_QT_HEADERS}"

DEPENDS += "qtbase qtdeclarative"

SRC_URI = "https://github.com/spikynavin/qtcluster.git;branch=qt-demo;protocol=https"
SRCREV = "7291d3874c91fe10d0c812a3fe329bbc32a3c9b0"

LICENSE = "MPL-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=9741c346eef56131163e13b9db1241b3"

PR = "r1"

S = "${WORKDIR}/git"

EXTRA_QMAKEVARS_PRE = " PREFIX=${exec_prefix} "

FILES_${PN} += " \
    ${bindir}/colortest \
"