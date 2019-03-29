# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "controller_manager_tests"
AUTHOR = "Bence Magyar <bence.magyar.robotics@gmail.com>"
ROS_AUTHOR = "Vijay Pradeep"
HOMEPAGE = "http://ros.org/wiki/controller_manager_tests"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "ros_control"
ROS_BPN = "controller_manager_tests"

ROS_BUILD_DEPENDS = " \
    controller-interface \
    controller-manager \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    controller-interface \
    controller-manager \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    controller-interface \
    controller-manager \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    rosbash \
    rosnode \
    rosservice \
    rostest \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros-gbp/ros_control-release/archive/release/melodic/controller_manager_tests/0.15.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "81be415003faa8d1a52d16274dac18e4"
SRC_URI[sha256sum] = "b43edda9914e25875e06aaace29bf7c78afc68d0cc59da2b77dc7e5783a7b4af"
S = "${WORKDIR}/ros_control-release-release-melodic-controller_manager_tests-0.15.1-0"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('ros-control', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('ros-control', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/ros-control/ros-control_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/ros-control/ros-control-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/ros-control/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/ros-control/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}