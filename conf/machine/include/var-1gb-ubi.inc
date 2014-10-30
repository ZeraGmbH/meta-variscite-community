#
# UBIFS for Variscite NAND 1.0 GB
#
UBI_ROOT_FS_NAME = "[rootfs]"
UBI_VOLNAME  = "rootfs"
MKUBIFS_ARGS = " -m 4096 -e 516096 -c 1895 -F "
UBINIZE_ARGS = " -m 4096 -p 512KiB -s 4096 -O 4096 "
#
