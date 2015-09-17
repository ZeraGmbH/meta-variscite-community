# Copyright (C) 2013-14 Freescale Semiconductor
# Copyright (C) 2015 A.Müller <schnitzeltony@googlemail.com>
# Released under the MIT license (see COPYING.MIT for the terms)

# we grab meta-fsl-arm patches here
FILESEXTRAPATHS_append := ":${BBPATH}"
META_FSL_ARM_PATCH_FOLDER = "recipes-kernel/linux/linux-imx-3.14.38"

require recipes-kernel/linux/linux-imx.inc
require recipes-kernel/linux/linux-dtb.inc

DEPENDS += "lzop-native bc-native"

COMPATIBLE_MACHINE = "(mx6)"

SRCBRANCH = "imx_3.14.38_6qp_beta"
SRCREV = "a4dec7730c98f2639fe250a1a67f782b6f73bdf5"

SRC_URI += " \
    file://${META_FSL_ARM_PATCH_FOLDER}/0003-ARM-imx6sl-Disable-imx6sl-specific-code-when-imx6sl-.patch \
    file://${META_FSL_ARM_PATCH_FOLDER}/0004-mmc-sdhci-esdhc-imx-Fixup-runtime-PM-conditions-duri.patch \
    \
    file://upstream-backport/0001-ARM-8158-1-LLVMLinux-use-static-inline-in-ARM-ftrace.patch \
    file://upstream-backport/0002-ARM-LLVMLinux-Change-extern-inline-to-static-inline-.patch \
    file://upstream-backport/touch/0001-add-CTW1620-based-touchscreens-support.patch \
    file://upstream-backport/weim/0001-bus-imx-weim-support-CS-GPR-configuration.patch \
    file://upstream-backport/weim/0002-bus-imx-weim-populate-devices-on-a-simple-bus.patch \
    file://upstream-backport/wifi/0001-wlcore-memset-wl-rx_filter_enabled-to-zero-after-rec.patch \
    file://upstream-backport/wifi/0002-wlcore-cancel-Tx-watchdog-on-suspend-and-rearm-on-fi.patch \
    file://upstream-backport/wifi/0003-wlcore-block-read-writes-to-FW-during-ELP.patch \
    file://upstream-backport/wifi/0004-wlcore-AP-don-t-start-mac80211-PS-on-non-peer-HLIDs.patch \
    file://upstream-backport/wifi/0005-wlcore-wl12xx-wl18xx-simplify-fw_status-handling.patch \
    file://upstream-backport/wifi/0006-wlcore-wl12xx-wl18xx-configure-num_links-per-hw.patch \
    file://upstream-backport/wifi/0007-wlcore-wl12xx-wl18xx-configure-max_stations-per-hw.patch \
    file://upstream-backport/wifi/0008-wlcore-wl12xx-wl18xx-configure-iface_combinations-pe.patch \
    file://upstream-backport/wifi/0009-wl18xx-move-to-new-firmware-wl18xx-fw-3.bin.patch \
    file://upstream-backport/wifi/0010-wlcore-send-EAPOL-frames-with-voice-priority.patch \
    file://upstream-backport/wifi/0011-wlcore-don-t-stop-sched_scan-on-interface-removal.patch \
    file://upstream-backport/wifi/0012-wlcore-wl18xx-allow-CCK-rates-for-AP-mode.patch \
    file://upstream-backport/wifi/0013-wlcore-don-t-handle-unsetting-of-default-wep-key.patch \
    file://upstream-backport/wifi/0014-wlcore-consider-multiple-APs-when-checking-active_li.patch \
    file://upstream-backport/wifi/0015-wlcore-decrease-warning-verbosity-during-recovery.patch \
    file://upstream-backport/wifi/0016-wlcore-increase-timeout-to-5000-msecs.patch \
    file://upstream-backport/wifi/0017-wlcore-enable-beacon-filtering-only-after-receiving-.patch \
    file://upstream-backport/wifi/0018-wlcore-add-support-for-STA-CSA-with-chan-contexts.patch \
    file://upstream-backport/wifi/0019-wlcore-use-correct-LAA-bit.patch \
    file://upstream-backport/wifi/0020-wlcore-fix-copy-paste-bug-assign-from-src-struct-not.patch \
    \
    file://boundarydevices/0001-Add-ft5x06-cap-touch-driver.patch \
    file://boundarydevices/0002-wlcore-add-initial-device-tree-support-to-the-sdio-m.patch \
    file://boundarydevices/0003-wlcore-add-mac-override-parameter.patch \
    \
    file://schnitzeltony/0001-mxc_hdmi-allow-EDID-to-select-non-CEA-modes.patch \
    file://schnitzeltony/0002-fbmon.c-enable-verbose-debug.patch \
    file://schnitzeltony/0003-imx6q-cpufreq.c-call-mutex_init-before-registering-i.patch \
    file://schnitzeltony/0004-i2c-imx-increase-timeout-to-500ms.patch \
    file://schnitzeltony/0005-mxc-video-add-note-for-successful-loaded-settings.patch \
    \
    file://variscite/0001-Add-SoC-Audio-support-for-i.MX-boards-with-tlv320aic.patch \
    file://variscite/0002-add-pin-regulator-debug.patch \
    file://variscite/0003-Add-Variscite-VAR-SOM-MX6-support.patch \
    \
"

LOCALVERSION = "+variscite"

# TBD TEST !!!!
#    file://upstream-backport/eth/0001-Revert-net-fec-fix-the-warning-found-by-dma-debug.patch
