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
    file://0008-mx6-soc-Switch-to-cold-reset.patch \
    file://0009-fix-boot.patch \
    file://0010-update-voltage-switching-to-fix-reboot.patch \
"
SRCREV = "c65c565d6acc27dde27fd7283136d24fd5273884"

S = "${WORKDIR}/git"

inherit fsl-u-boot-localversion

LOCALVERSION = "+variscite-imx6"
SCMVERSION = "n"

COMPATIBLE_MACHINE = "(mx6)"

# save UBOOT_CONFIG as separate names
do_deploy_append() {
    install ${UBOOT_BINARY} ${DEPLOYDIR}/${UBOOT_IMAGE}_${UBOOT_CONFIG}
}
