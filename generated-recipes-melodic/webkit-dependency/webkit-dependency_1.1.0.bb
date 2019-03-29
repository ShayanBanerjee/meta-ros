# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "This encapsulates the WebKit dependency for a specific ROS distribution and its Qt version"
AUTHOR = "Dirk Thomas <dthomas@osrfoundation.org>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "webkit_dependency"
ROS_BPN = "webkit_dependency"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    ${ROS_UNRESOLVED_PLATFORM_PKG_python-qt5-bindings-webkit} \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ${ROS_UNRESOLVED_PLATFORM_PKG_python-qt5-bindings-webkit} \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros-gbp/webkit_dependency-release/archive/release/melodic/webkit_dependency/1.1.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "49eccdbfa8b9dc5ec16f1b2489c721fc"
SRC_URI[sha256sum] = "a187ab79ea2545b2dec0f48d74af9b4f3875f73ac649c8527e54e9ea6cda0e29"
S = "${WORKDIR}/webkit_dependency-release-release-melodic-webkit_dependency-1.1.0-0"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('webkit-dependency', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('webkit-dependency', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/webkit-dependency/webkit-dependency_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/webkit-dependency/webkit-dependency-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/webkit-dependency/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/webkit-dependency/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}