# meta-baldeagle

Yocto layer to support AMD 2nd Generation R-Series APU (aka baldeagle).

The layer is intended to be used in conjunction with the Yocto `meta-amd` layer and is dependent upon it.

## GPU Driver Support

The recommended GPU driver for the 2nd Generation R-Series APU (GPU code name Kaveri) when using a 5.4
kernel is `amdgpu`, this is selected by default however the older `radeon` driver may still be selected
via the layers `layer.conf`.

