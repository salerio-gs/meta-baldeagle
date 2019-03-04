COMPATIBLE_MACHINE_baldeagle = "baldeagle"

FILESEXTRAPATHS_prepend := "${THISDIR}/linux-yocto:"

# CVE-2019-8912 addressed by : net-next-net-crypto-set-sk-to-NULL-when-af_alg_release.patch

SRC_URI_append = " \
    file://amd-iommu.cfg \
    file://intel-iommu-with-dma-remapping.cfg \
    file://remove-logo.cfg \
    ${@bb.utils.contains("USE_AMDGPU", "yes", "file://amdgpu.cfg", "file://radeon.cfg", d)} \
    file://net-next-net-crypto-set-sk-to-NULL-when-af_alg_release.patch \   
    "
