FILESEXTRAPATHS_prepend := "${THISDIR}/linux-yocto:"

include linux-yocto-${MACHINE}_5.4.inc

SRC_URI_append = " \
    file://amd-iommu.cfg \
    file://intel-iommu-with-dma-remapping.cfg \
    file://remove-logo.cfg \
    ${@bb.utils.contains("USE_AMDGPU", "yes", "file://amdgpu.cfg", "file://radeon.cfg", d)} \
    file://tweaks-5-4.cfg \
    "
