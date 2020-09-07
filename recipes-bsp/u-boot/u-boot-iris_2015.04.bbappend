#FILESEXTRAPATHS_prepend := "${THISDIR}/git:"
FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI_append = " \
           file://uboot-imxv2015.04_4.1.15_1.0.0_ga.patch \
"
