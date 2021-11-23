DESCRIPTION = "These binaries provide kernel support for AMD R7 GPU as found in the Baldeagle APU"

SECTION = "kernel"

LICENSE = "Firmware-amdgpu"

SRC_URI = " \
	file://kaveri_ce.bin \
	file://kaveri_me.bin \
	file://kaveri_mec.bin \
	file://kaveri_mec2.bin \
	file://kaveri_pfp.bin \
	file://kaveri_rlc.bin \
	file://kaveri_sdma.bin \
	file://kaveri_sdma1.bin \
	file://kaveri_uvd.bin \
	file://kaveri_vce.bin \
	file://LICENSE.amdgpu \
    "

LIC_FILES_CHKSUM = "file://LICENSE.amdgpu;md5=ab515ef6495ab5c5a3b08ab2db62df11"

NO_GENERIC_LICENSE[Firmware-amdgpu] = "LICENSE.amdgpu"

S = "${WORKDIR}"

# Since, no binaries are generated for a specific target, 
# inherit allarch to simply populate prebuilt binaries
inherit allarch

do_compile() {
	:
}

do_install() {
	install -v -m 444 -D ${S}/LICENSE.amdgpu ${D}/lib/firmware/amdgpu/LICENSE
	install -v -m 0644 ${S}/*.bin ${D}/lib/firmware/amdgpu/
}

FILES_${PN} = "/lib/firmware/*"
