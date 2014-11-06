# Copyright (C) 2013-14 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-kernel/linux/linux-imx.inc
require recipes-kernel/linux/linux-dtb.inc

DEPENDS += "lzop-native bc-native"

COMPATIBLE_MACHINE = "(mx6)"

SRCBRANCH = "imx_3.10.17_1.0.0_ga"
SRCREV = "8ab15a209a92b62f72e3721dd1780baac59d7082"

SRC_URI += " \
	file://variscite/0001-Variscite-VAR-SOM-MX6-support.patch \
	file://variscite/0002-Update-MIPI-CSI-ID.patch \
	file://variscite/0003-Update-operating-points-to-support-reboot-select-wdo.patch \
	file://variscite/0004-Enable-GPIO-support-for-MMC-port-used-by-wilink.patch \
	file://variscite/0005-vgen2-regulator-voltage-update.-Fixed-Audio.patch \
	file://variscite/0007-update-mtd-partition-table-sizes.patch \
	file://variscite/0008-Temporary-workaround-Set-1.2GHZ-SOMs-OPPs-to-1.2Ghz.patch \
	file://variscite/0009-Structural-modification-to-DTS-files.-Regulators-def.patch \
	file://variscite/0010-More-regulators-definitions-fine-tune.patch \
	file://variscite/0011-More-2-regulators-definitions-fine-tune.patch \
	file://variscite/0012-MTD-Partition-sizes-update-to-DTS-files.patch \
	file://variscite/0013-Update-WILINK-network-paramters.patch \
	\
	file://schnitzeltony/0001-mxc_hdmi.c-parse-EDID-extensions-only-in-case-monito.patch \
	file://schnitzeltony/0002-mxc_hdmi-allow-EDID-to-select-VESA-modes.patch \
	file://schnitzeltony/0003-fbmon.c-enable-verbose-debug.patch \
"

LOCALVERSION = "+variscite-beta_var2+imx-1.0.2_ga"


