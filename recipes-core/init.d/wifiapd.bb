DESCRIPTION = "wifi runtime script"
SECTION = "wifi"
DEPENDS = "bash"
LICENSE = "CLOSED"

FILESEXTRAPATHS_prepend := "${THISDIR}/init.d:"

SRC_URI = "file://wifiapd"

S = "${WORKDIR}"

do_install(){
	install -d ${D}${sysconfdir}/init.d
	install -d ${D}${sysconfdir}/rc5.d
	install -d ${D}${sysconfdir}/rc6.d
	install ${WORKDIR}/wifiapd ${D}${sysconfdir}/init.d/
	ln -s -r ${D}${sysconfdir}/init.d/wifiapd ${D}${sysconfdir}/rc5.d/S17wifiapd
	ln -s -r ${D}${sysconfdir}/init.d/wifiapd ${D}${sysconfdir}/rc6.d/K20wifiapf
}

