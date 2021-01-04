# Copyright (C) 2013-2015 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

SUMMARY = "Linux Kernel provided and supported by Freescale"
DESCRIPTION = "Linux Kernel provided and supported by Freescale with focus on \
i.MX Family Reference Boards. It includes support for many IPs such as GPU, VPU and IPU."

require recipes-kernel/linux/linux-imx.inc
#require recipes-kernel/linux/linux-dtb.inc

DEPENDS += "lzop-native bc-native"

SRCBRANCH = "iris-imx-production"
LOCALVERSION = "iris-imx-production" # Available branches iris-imx-debug, iris-imx-mfg
SRC_URI = "git://github.com/spikynavin/linux-imx.git;protocol=git;branch=${SRCBRANCH}"
SRCREV = "43f50a6fe01507c5fe8ef1f363f6a54a5686b0cc"

SRC_URI += "file://defconfig"
#SRC_URI += " \
#    file:///tmp/yourpatchfile.patch \
#"

DEFAULT_PREFERENCE = "1"

COMPATIBLE_MACHINE = "(mx6|mx6ul|mx7)"

