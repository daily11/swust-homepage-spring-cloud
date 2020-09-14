/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50724
 Source Host           : localhost:3306
 Source Schema         : homepage_course

 Target Server Type    : MySQL
 Target Server Version : 50724
 File Encoding         : 65001

 Date: 14/09/2020 22:50:54
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for homepage_course
-- ----------------------------
DROP TABLE IF EXISTS `homepage_course`;
CREATE TABLE `homepage_course`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `couse_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '课程名称',
  `couse_type` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '课程类型名称',
  `couse_icon` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '课程图标',
  `couse_intro` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '课程介绍',
  `create_time` datetime(0) NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP(0),
  `update_time` datetime(0) NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP(0),
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of homepage_course
-- ----------------------------
INSERT INTO `homepage_course` VALUES (1, '语文', '必修', 'Chinese.png', '传统科目，必选', '2020-08-08 21:28:37', '2020-08-08 21:28:39');
INSERT INTO `homepage_course` VALUES (2, '数学', '必修', 'Math.png', '传统科目，必选', '2020-08-08 21:30:00', '2020-08-08 21:30:02');

SET FOREIGN_KEY_CHECKS = 1;
