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
"
SRCREV = "c2f199ce56fc10c5ddd7a2f19446e5f1be71931c"

S = "${WORKDIR}/git"

inherit fsl-u-boot-localversion

LOCALVERSION = "+variscite-imx6"
SCMVERSION = "n"

COMPATIBLE_MACHINE = "(mx6)"

# save UBOOT_CONFIG as separate names
do_deploy_append() {
    install ${UBOOT_BINARY} ${DEPLOYDIR}/${UBOOT_IMAGE}_${UBOOT_CONFIG}
}
