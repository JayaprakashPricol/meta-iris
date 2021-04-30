DESCRIPTION = "IRIS Rootfs Scripts adding"
SECTION = "scripts"
LICENSE = "CLOSED"
PR = "r0"

RDEPENDS_${PN} += "bash"

FILES_${PN} += "/usr/share/scripts/mmcautorun.sh"

SRC_URI = "file://mmcautorun.sh \
	  file://99-mmcautorun.rules"

SRCREV = "${AUTOREV}"

do_install() {
	install -m 0755 -d ${D}/usr/share/scripts/
	install -m 0755 -d ${D}/etc/udev/rules.d/
        cp ${WORKDIR}/mmcautorun.sh ${D}/usr/share/scripts/
	cp ${WORKDIR}/99-mmcautorun.rules ${D}/etc/udev/rules.d/
}
