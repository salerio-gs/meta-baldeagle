# meta-baldeagle

Yocto layer to support AMD 2nd Generation R-Series APU (baldeagle).

The layer is intended to be used in conjunction with the Yocto meta-amd layer.

Please see the README file contained in the root meta-amd directory for general information and usage details.

## GPU Driver Support

The recommended GPU driver for the 2nd Generation R-Series APU remains `radeon`, however the meta-amd
layer provides support (in the form of a patch set for kernel version 4.14) for the newer `amdgpu` driver
(see here for kernel configuration details https://wiki.gentoo.org/wiki/AMDGPU). Which driver to use can
be selected via `USE_AMDGPU`. Setting this to `"yes"` selects the newer `amdgpu` driver.
