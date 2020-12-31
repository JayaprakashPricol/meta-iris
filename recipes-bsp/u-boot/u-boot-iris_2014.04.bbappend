#FILESEXTRAPATHS_prepend := "${THISDIR}/git:"
FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI_append = " \
           file://0001-uboot-imx-production-mfg-enabled-3.14.28.1.0.ga.patch \
"
