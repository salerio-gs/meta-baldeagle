FILESEXTRAPATHS_prepend := "${THISDIR}/linux-yocto_4.14:"

SRC_URI_append_baldeagle = " \
    file://baldeagletweaks.cfg \   
    "

COMPATIBLE_MACHINE_baldeagle = "baldeagle"
