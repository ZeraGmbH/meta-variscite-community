# Copyright (C) 2013-14 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-kernel/linux/linux-imx.inc
require recipes-kernel/linux/linux-dtb.inc

DEPENDS += "lzop-native bc-native"

COMPATIBLE_MACHINE = "(mx6)"

SRCBRANCH = "imx_3.10.53_1.1.0_ga"
SRCREV = "496fbe0b831b77d0ea0a2c7bbd1d58820b3a01f7"

SRC_URI += " \
    file://meta-fsl-arm/0001-ARM-clk-imx6q-fix-video-divider-for-revision-1.0-of-.patch \
    \
    file://variscite/0001-Add-SoC-Audio-support-for-i.MX-boards-with-tlv320aic.patch \
    file://variscite/0002-ads7846-add-deviceetree-support.patch \
    file://variscite/0003-add-CTW1620-based-touchscreens-support.patch \
    file://variscite/0004-more-devicetree-support-for-net-wifi.patch \
    file://variscite/0005-mmc-add-en-gpios-for-wifi.patch \
    file://variscite/0006-mmc-avoid-setting-a-higher-frequency-than-set-in-dev.patch \
    file://variscite/0008-Add-Variscite-VAR-SOM-MX6-support.patch \
    \
    file://schnitzeltony/0002-mxc_hdmi-allow-EDID-to-select-non-CEA-modes.patch \
    file://schnitzeltony/0003-fbmon.c-enable-verbose-debug.patch \
"

#	file://schnitzeltony/0004-mxc_hdmi.c-temp-debug.patch 

LOCALVERSION = "+variscite-1.1.0_ga"


