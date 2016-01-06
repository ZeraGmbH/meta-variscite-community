inherit image_types_fsl

# simple boot partition volume id -> makes life easier for our udev/udisk rules
BOOTDD_VOLUME_ID = "boot-varis"

SDCARD_GENERATION_COMMAND_mx6 = "generate_imx_var_sdcard"

generate_imx_var_sdcard () {
	generate_imx_sdcard
	# rewrite u-boot based on http://www.variwiki.com/index.php?title=VAR-SOM-MX6_Yocto_GS_R5_B2#Build_U-Boot_out_of_Yocto_tree
	dd if=${DEPLOY_DIR_IMAGE}/${SPL_BINARY} of=${SDCARD} conv=notrunc bs=1K seek=1
	dd if=${DEPLOY_DIR_IMAGE}/u-boot-${MACHINE}.${UBOOT_SUFFIX_SDCARD} of=${SDCARD} conv=notrunc bs=1K seek=69 && sync
}


