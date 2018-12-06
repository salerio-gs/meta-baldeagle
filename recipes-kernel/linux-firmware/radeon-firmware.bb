DESCRIPTION = "These binaries provide kernel support for AMD radeon GPU as found in baldeagle"
SECTION = "kernel"
LICENSE = "Firmware-amd"

SRC_URI_baldeagle = " \
	file://kaveri_ce.bin \
	file://kaveri_me.bin \
	file://kaveri_mec2.bin \
	file://kaveri_mec.bin \
	file://kaveri_pfp.bin \
	file://kaveri_rlc.bin \
	file://kaveri_sdma.bin \
	file://bonaire_uvd.bin \
	file://BONAIRE_uvd.bin \
	file://BONAIRE_vce.bin \
	file://LICENSE \
"

LIC_FILES_CHKSUM = "file://LICENSE;md5=07b0c31777bd686d8e1609c6940b5e74"

S = "${WORKDIR}"

# Since, no binaries are generated for a specific target, 
# inherit allarch to simply populate prebuilt binaries
inherit allarch

do_compile() {
	:
}

do_install() {
	install -v -m 444 -D ${S}/LICENSE ${D}/lib/firmware/radeon/LICENSE
	install -v -m 0644 ${S}/*.bin ${D}/lib/firmware/radeon/
}

FILES_${PN} = "/lib/firmware/*"
