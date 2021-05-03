DESCRIPTION = "IRIS Rootfs Scripts adding"
SECTION = "scripts"
LICENSE = "CLOSED"
PR = "r0"

RDEPENDS_${PN} += "bash"

FILES_${PN} += "/usr/share/scripts/mmcautorun.sh"
FILES_${PN} += "/usr/share/scripts/usbautorun.sh"

SRC_URI = "file://mmcautorun.sh \
	  file://usbautorun.sh \
	  file://99-usbautorun.rules \
	  file://99-mmcautorun.rules"

SRCREV = "${AUTOREV}"

do_install() {
	install -m 0755 -d ${D}/usr/share/scripts/
	install -m 0755 -d ${D}/etc/udev/rules.d/
        cp ${WORKDIR}/mmcautorun.sh ${D}/usr/share/scripts/
	cp ${WORKDIR}/usbautorun.sh ${D}/usr/share/scripts/
	cp ${WORKDIR}/99-usbautorun.rules ${D}/etc/udev/rules.d/
	cp ${WORKDIR}/99-mmcautorun.rules ${D}/etc/udev/rules.d/
}
