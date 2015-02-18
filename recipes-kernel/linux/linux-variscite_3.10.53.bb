# Copyright (C) 2013-14 Freescale Semiconductor
# Copyright (C) 2015 A.Müller <schnitzeltony@googlemail.com>
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
    file://upstream-backport/0001-ads7846-add-deviceetree-support.patch \
    file://upstream-backport/0002-add-CTW1620-based-touchscreens-support.patch \
    file://upstream-backport/0003-mmc-core-Update-the-ext-csd.rev-check-for-eMMC5.1.patch \
    \
    file://boundarydevices/0001-Add-ft5x06-cap-touch-driver.patch \
    \
    file://schnitzeltony/0001-mxc_hdmi-allow-EDID-to-select-non-CEA-modes.patch \
    file://schnitzeltony/0002-fbmon.c-enable-verbose-debug.patch \
    \
    file://variscite/0001-Add-SoC-Audio-support-for-i.MX-boards-with-tlv320aic.patch \
    file://variscite/0002-more-devicetree-support-for-net-wifi.patch \
    file://variscite/0003-mmc-add-en-gpios-for-wifi.patch \
    file://variscite/0004-add-pin-regulator-debug.patch \
    \
    file://variscite/0005-Add-Variscite-VAR-SOM-MX6-support.patch \
"

# TODO: find a better solution
#    file://variscite/0022-bugfix-modify-opp-core-voltages-to-fix-reboot-proble.patch

# TODO?

LOCALVERSION = "+variscite-1.1.0_ga"


