COMPATIBLE_MACHINE_baldeagle = "baldeagle"

FILESEXTRAPATHS_prepend := "${THISDIR}/linux-yocto:"

SRC_URI_append = " \
    file://amd-iommu.cfg \
    file://intel-iommu-with-dma-remapping.cfg \   
    file://disable-intel-i915.cfg \   
    file://radeon.cfg \   
    "
