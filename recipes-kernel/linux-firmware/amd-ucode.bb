LICENSE = "Firmware-amd"

FILESEXTRAPATHS_prepend := "${THISDIR}/${BPN}:"

SRC_URI = " \
		file://LICENSE.amd-ucode \
		file://microcode_amd_fam15h.bin \
"

LIC_FILES_CHKSUM = "file://LICENSE.amd-ucode;md5=3c5399dc9148d7f0e1f41e34b69cf14f"

S = "${WORKDIR}"

# Since, no binaries are generated for a specific target, 
# inherit allarch to simply populate prebuilt binaries
inherit allarch

do_compile() {
	:
}

do_install() {
	install -v -d ${D}/lib/firmware/amd-ucode/
	install -v -m 0644 ${S}/microcode_amd_fam15h.bin ${D}/lib/firmware/amd-ucode/
}

FILES_${PN} = "/lib/firmware/*"
