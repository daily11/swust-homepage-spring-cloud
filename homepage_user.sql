/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50724
 Source Host           : localhost:3306
 Source Schema         : homepage_user

 Target Server Type    : MySQL
 Target Server Version : 50724
 File Encoding         : 65001

 Date: 14/09/2020 22:50:46
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for homepage_user
-- ----------------------------
DROP TABLE IF EXISTS `homepage_user`;
CREATE TABLE `homepage_user`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户名称',
  `email` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '邮箱',
  `create_time` datetime(0) NULL DEFAULT NULL,
  `update_time` datetime(0) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of homepage_user
-- ----------------------------
INSERT INTO `homepage_user` VALUES (1, 'cyx', '123456789@qq.com', '2020-08-08 21:30:27', '2020-08-08 21:30:31');
INSERT INTO `homepage_user` VALUES (2, 'zou', '987654321@qq.com', '2020-08-08 21:30:47', '2020-08-08 21:30:49');

-- ----------------------------
-- Table structure for homepage_user_course
-- ----------------------------
DROP TABLE IF EXISTS `homepage_user_course`;
CREATE TABLE `homepage_user_course`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `user_id` bigint(20) NULL DEFAULT NULL COMMENT '用户ID',
  `couse_id` bigint(20) NULL DEFAULT NULL COMMENT '课程ID',
  `create_time` datetime(0) NULL DEFAULT NULL,
  `update_time` datetime(0) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of homepage_user_course
-- ----------------------------
INSERT INTO `homepage_user_course` VALUES (1, 1, 1, '2020-08-08 21:30:59', '2020-08-08 21:31:02');
INSERT INTO `homepage_user_course` VALUES (2, 1, 2, '2020-08-08 21:31:08', '2020-08-08 21:31:10');
INSERT INTO `homepage_user_course` VALUES (3, 2, 1, '2020-08-08 21:31:23', '2020-08-08 21:31:25');

SET FOREIGN_KEY_CHECKS = 1;
