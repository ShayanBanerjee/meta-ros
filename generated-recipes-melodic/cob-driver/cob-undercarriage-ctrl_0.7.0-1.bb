# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "cob_undercarriage_ctrl implements a controller for the omnidirectional base of Care-O-bot 3 on joint level. For a given Pltf-Twist the according wheel steering angles and linear wheel velocities are calculated based on the principle of rigid body motion. Each joint is than controlled individually to achieve the computed position and velocity"
AUTHOR = "Matthias Gruhler <mig@ipa.fhg.de>"
ROS_AUTHOR = "Christian Connette"
HOMEPAGE = "http://ros.org/wiki/cob_undercarriage_ctrl"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

ROS_CN = "cob_driver"
ROS_BPN = "cob_undercarriage_ctrl"

ROS_BUILD_DEPENDS = " \
    cob-msgs \
    cob-utilities \
    control-msgs \
    diagnostic-msgs \
    diagnostic-updater \
    geometry-msgs \
    nav-msgs \
    roscpp \
    tf \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    cob-msgs \
    cob-utilities \
    control-msgs \
    diagnostic-msgs \
    diagnostic-updater \
    geometry-msgs \
    nav-msgs \
    roscpp \
    tf \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    cob-msgs \
    cob-utilities \
    control-msgs \
    diagnostic-msgs \
    diagnostic-updater \
    geometry-msgs \
    nav-msgs \
    roscpp \
    tf \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ipa320/cob_driver-release/archive/release/melodic/cob_undercarriage_ctrl/0.7.0-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "26af457ac9c513f620c547f436393c65"
SRC_URI[sha256sum] = "28f92ad439e996cc1ea5544bfad718bce1c35c860475fc0b0d8b6c8069264279"
S = "${WORKDIR}/cob_driver-release-release-melodic-cob_undercarriage_ctrl-0.7.0-1"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('cob-driver', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('cob-driver', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/cob-driver/cob-driver_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/cob-driver/cob-driver-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/cob-driver/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/cob-driver/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}