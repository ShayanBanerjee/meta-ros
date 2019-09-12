# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "URDF file descriptions for P2OS/ARCOS robot"
AUTHOR = "Hunter L. Allen <hunter@openrobotics.org>"
ROS_AUTHOR = "Hunter L. Allen <hunter@openrobotics.org>"
HOMEPAGE = "http://ros.org/wiki/p2os-purdue"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "p2os"
ROS_BPN = "p2os_urdf"

ROS_BUILD_DEPENDS = " \
    geometry-msgs \
    kdl-parser \
    sensor-msgs \
    std-msgs \
    tf \
    urdf \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    geometry-msgs \
    kdl-parser \
    sensor-msgs \
    std-msgs \
    tf \
    urdf \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    geometry-msgs \
    kdl-parser \
    p2os-driver \
    p2os-msgs \
    sensor-msgs \
    std-msgs \
    tf \
    urdf \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/allenh1/p2os-release/archive/release/melodic/p2os_urdf/2.1.1-3.tar.gz
ROS_BRANCH ?= "branch=release/melodic/p2os_urdf"
SRC_URI = "git://github.com/allenh1/p2os-release;${ROS_BRANCH};protocol=https"
SRCREV = "d13cfab5e84845ac03e6d1cbc2465b7e9e2160ac"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}