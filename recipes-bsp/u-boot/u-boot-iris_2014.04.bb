# Copyright (C) 2013-2015 Freescale Semiconductor

DESCRIPTION = "U-Boot provided by Freescale with focus on  i.MX reference boards."
require recipes-bsp/u-boot/u-boot.inc

PROVIDES += "u-boot"

LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://Licenses/gpl-2.0.txt;md5=b234ee4d69f5fce4486a80fdaf4a4263"

SRCBRANCH = "nxp/imx_v2014.04_3.14.28_1.0.0_ga"
SRC_URI = "git://source.codeaurora.org/external/imx/uboot-imx;protocol=https;branch=${SRCBRANCH}"
SRCREV = "5b983bdcbec103a001d30d96b932168f76b712a5"

S = "${WORKDIR}/git"

#inherit fsl-u-boot-localversion

LOCALVERSION ?= "-${SRCBRANCH}"

PACKAGE_ARCH = "${MACHINE_ARCH}"
COMPATIBLE_MACHINE = "(mx6|mx6ul|mx7)"

