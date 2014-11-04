# Provides the variscite i.MX common settings

include conf/machine/include/imx-base.inc

IMAGE_CLASSES_remove = "image_types_fsl"
IMAGE_CLASSES += "image_types_var"

PREFERRED_PROVIDER_virtual/kernel = "linux-variscite"
PREFERRED_PROVIDER_virtual/bootloader = "u-boot-variscite-imx6"
PREFERRED_PROVIDER_u-boot = "u-boot-variscite-imx6"

SPL_BINARY = "SPL"
UBOOT_MAKE_TARGET = "all"
UBOOT_SUFFIX = "img"

UBOOT_CONFIG ??= "sd"
#UBOOT_CONFIG ??= "nand"

UBOOT_CONFIG[sd] = "mx6var_som_sd_config,sdcard"
UBOOT_CONFIG[nand] = "mx6var_som_nand_config,ubifs"

IMAGE_FSTYPES = "ubi sdcard"

#
# UBIFS for Variscite NAND 0.5 GB
#
#UBI_ROOT_FS_NAME = "[rootfs]"
#UBI_VOLNAME  = "rootfs"
#MKUBIFS_ARGS = " -m 2048 -e 124KiB -c 3965 -F "
#UBINIZE_ARGS = " -m 2048 -p 128KiB -s 2048 -O 2048 "
#
#
# UBIFS for Variscite NAND 1.0 GB
#
#UBI_ROOT_FS_NAME = "[rootfs]"
#UBI_VOLNAME  = "rootfs"
#MKUBIFS_ARGS = " -m 4096 -e 516096 -c 1895 "
#UBINIZE_ARGS = " -m 4096 -p 512KiB -s 4096 -O 4096 "
#
#
# UBIFS for Variscite NAND 2.0 GB
#
#UBI_ROOT_FS_NAME = "[rootfs]"
#UBI_VOLNAME  = "rootfs"
#MKUBIFS_ARGS = " -m 2048 -e 124KiB -c 15800 "
#UBINIZE_ARGS = " -m 2048 -p 128KiB -s 2048 -O 2048 "
#
#
# UBIFS for Variscite NAND 4.0 GB MT29F32G08AFACAWP
#
#UBI_ROOT_FS_NAME = "[rootfs]"
#UBI_VOLNAME  = "rootfs"
#MKUBIFS_ARGS = " -m 4096 -e 504KiB -c 7855 -F "
#UBINIZE_ARGS = " -m 4096 -p 512KiB -s 4096 -O 4096 "
#

EXTRA_IMAGEDEPENDS = "u-boot"

KERNEL_IMAGETYPE = "uImage"


