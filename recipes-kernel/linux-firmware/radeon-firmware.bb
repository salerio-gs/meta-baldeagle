DESCRIPTION = "These binaries provide kernel support for AMD R7 GPU as found in baldeagle"
SECTION = "kernel"
LICENSE = "Firmware-amd"

SRC_URI = " \
	file://kaveri_ce.bin \
	file://kaveri_me.bin \
	file://kaveri_mec.bin \
	file://kaveri_mec2.bin \
	file://kaveri_pfp.bin \
	file://kaveri_rlc.bin \
	file://kaveri_sdma.bin \
	file://BONAIRE_uvd.bin \
	file://BONAIRE_vce.bin \
	file://LICENSE.radeon \
    "

LIC_FILES_CHKSUM = "file://LICENSE.radeon;md5=68ec28bacb3613200bca44f404c69b16"

S = "${WORKDIR}"

# Since, no binaries are generated for a specific target, 
# inherit allarch to simply populate prebuilt binaries
inherit allarch

do_compile() {
	:
}

do_install() {
	install -v -m 444 -D ${S}/LICENSE.radeon ${D}/lib/firmware/radeon/LICENSE
	install -v -m 0644 ${S}/*.bin ${D}/lib/firmware/radeon/
}

FILES_${PN} = "/lib/firmware/*"
