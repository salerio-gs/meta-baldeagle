# Machine configuration for generic X86_64 (64-bit) PCs and servers.
# Supports a moderately wide range of drivers that should boot and be usable on "typical" hardware.
# Copied from Yocto genericx86_64 machine definition.

DEFAULTTUNE ?= "core2-64"
require conf/machine/include/tune-core2.inc
require conf/machine/include/genericx86-common.inc
