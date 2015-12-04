DESCRIPTION = "bootloader for variscite imx6 platforms"
require recipes-bsp/u-boot/u-boot.inc

PROVIDES += "u-boot"

LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://Licenses/README;md5=025bf9f768cbcb1a165dbe1a110babfb"

SRCBRANCH = "imx_v2013.10_var4"
SRC_URI = " \
    git://github.com/varigit/uboot-imx.git;protocol=git;branch=${SRCBRANCH} \
    file://0001-Add-linux-compiler-gcc5.h-to-fix-builds-with-gcc5.patch \
    file://0002-mx6var_som.c-remove-solo-custom-board-support.patch \
    file://0003-mx6var_som.c-select-correct-root-mmc-partition.patch \
    file://0004-asm-io.h-fix-build-with-gcc5.patch \
    file://0005-arm-board-use-__weak.patch \
    file://0006-common-main.c-make-show_boot_progress-__weak.patch \
    file://0007-arm-Switch-to-mno-unaligned-access-when-supported-by.patch \
    file://0008-ensure-that-VGEN2EN-is-set.patch \
    file://0009-ensure-VGEN6-runs-at-2.8V-on-reboot.patch \
    file://0010-reduce-VDDARM-VDDSOC-to-1.2V-with-ldo-bypass-1.325V-.patch \
    file://0011-add-a-delay-to-give-pmic-changes-time-to-apply.patch \
    file://0012-optionally-dump-pfuze-registers-at-when-kernel-is-ab.patch \
"
SRCREV = "a2bb081c08f8e18cee3ffbf577adb9bdb7d5a6f9"

S = "${WORKDIR}/git"

inherit fsl-u-boot-localversion

LOCALVERSION = "+variscite-imx6"
SCMVERSION = "n"

COMPATIBLE_MACHINE = "(mx6)"

# save UBOOT_CONFIG as separate names
do_deploy_append() {
    install ${UBOOT_BINARY} ${DEPLOYDIR}/${UBOOT_IMAGE}_${UBOOT_CONFIG}
}
