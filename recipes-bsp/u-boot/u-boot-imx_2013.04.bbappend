
SRCBRANCH = "imx_v2013.04_3.10.17_1.0.0_beta_var1"
SRC_URI = "git://github.com/varigit/uboot-imx.git;protocol=git;branch=${SRCBRANCH}"
SRCREV = "9ddf517d2d8b66ead230554030725952c64dd892"

# save UBOOT_CONFIG as separate names
do_deploy_append() {
    install ${S}/${UBOOT_BINARY} ${DEPLOYDIR}/${UBOOT_IMAGE}_${UBOOT_CONFIG}
}
