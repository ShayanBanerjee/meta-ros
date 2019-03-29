# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "This is an implementation of the EtherCAT master protocol for the PR2       robot based on the work done at Flanders' Mechatronics Technology Centre."
AUTHOR = "David Feil-Seifer <dave@cse.unr.edu>"
ROS_AUTHOR = "Austin Hendrix"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Binary-Only"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=a99890d7e16071ac30156cdebd292056"

ROS_CN = "eml"
ROS_BPN = "eml"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    catkin \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    catkin \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros-gbp/eml-release/archive/release/melodic/eml/1.8.15-2.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "dbf40bab81a111f0696c00898eb5e295"
SRC_URI[sha256sum] = "be4a25b2632c6064f9d2567a5d1f9915aca203bebd8eda03e9cb3758d90e3c2c"
S = "${WORKDIR}/eml-release-release-melodic-eml-1.8.15-2"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('eml', d)}"
ROS_BUILD_TYPE = "cmake"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('eml', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/eml/eml_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/eml/eml-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/eml/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/eml/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}