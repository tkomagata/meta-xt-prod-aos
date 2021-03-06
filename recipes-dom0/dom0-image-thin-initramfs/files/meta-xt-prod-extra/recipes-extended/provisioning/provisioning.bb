DESCRIPTION = "Dom0 scripts used for AOS provisioning"

require inc/xt_shared_env.inc

LICENSE = "CLOSED"

SRCREV = "${AUTOREV}"
SRC_URI = "git://git@gitpct.epam.com/epmd-aepr/aos_provisioning.git;protocol=ssh"

S = "${WORKDIR}/git"

FILES_${PN} = " \
    ${base_prefix}${XT_DIR_ABS_ROOTFS_SCRIPTS}/aos-provisioning.step1.sh \
    ${base_prefix}${XT_DIR_ABS_ROOTFS_SCRIPTS}/aos-provisioning.step2.sh \
"

RDEPENDS_${PN} = "bash"

do_install() {
    install -d ${D}${base_prefix}${XT_DIR_ABS_ROOTFS_SCRIPTS}
    install -m 0755 ${S}/aos-provisioning.step1.sh ${D}${base_prefix}${XT_DIR_ABS_ROOTFS_SCRIPTS}
    install -m 0755 ${S}/aos-provisioning.step2.sh ${D}${base_prefix}${XT_DIR_ABS_ROOTFS_SCRIPTS}
}
