DESCRIPTION = "bootloader for variscite imx6 platforms"
require recipes-bsp/u-boot/u-boot.inc

PROVIDES += "u-boot"

LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://Licenses/README;md5=025bf9f768cbcb1a165dbe1a110babfb"

SRCBRANCH = "imx_v2013.10_beta_var4"
SRC_URI = "git://github.com/varigit/uboot-imx.git;protocol=git;branch=${SRCBRANCH}"
SRCREV = "373315e5d74f49cd95bef3bfa3774c6d1e30ff81"

S = "${WORKDIR}/git"

inherit fsl-u-boot-localversion

LOCALVERSION = "+variscite-imx6"
SCMVERSION = "n"

COMPATIBLE_MACHINE = "(varsomimx6dl|varsomimx6q|varsomimx6q2|varsomimx6solo)"

# save UBOOT_CONFIG as separate names
do_deploy_append() {
    install ${UBOOT_BINARY} ${DEPLOYDIR}/${UBOOT_IMAGE}_${UBOOT_CONFIG}
}
