FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}_4.14:"

SRC_URI_append_baldeagle = " \
    file://baldeagletweaks.cfg \   
    "

COMPATIBLE_MACHINE_baldeagle = "baldeagle"
