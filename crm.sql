/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50553
 Source Host           : localhost:3306
 Source Schema         : crm

 Target Server Type    : MySQL
 Target Server Version : 50553
 File Encoding         : 65001

 Date: 03/11/2018 10:40:36
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for base_dict
-- ----------------------------
DROP TABLE IF EXISTS `base_dict`;
CREATE TABLE `base_dict`  (
  `dict_id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `dict_type_code` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `dict_type_name` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `dict_item_name` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `dict_item_code` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `dict_sort` int(10) NULL DEFAULT NULL,
  `dict_enable` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `dict_memo` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`dict_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of base_dict
-- ----------------------------
INSERT INTO `base_dict` VALUES ('1', '003', '客户级别', 'VIP客户', NULL, NULL, '1', NULL);
INSERT INTO `base_dict` VALUES ('2', '003', '客户级别', '普通客户', NULL, NULL, '1', NULL);
INSERT INTO `base_dict` VALUES ('3', '001', '客户行业', '房地产', NULL, NULL, '1', NULL);
INSERT INTO `base_dict` VALUES ('4', '001', '客户行业', '酒店旅游', NULL, NULL, '1', NULL);
INSERT INTO `base_dict` VALUES ('5', '001', '客户行业', '教育培训', NULL, NULL, '1', NULL);
INSERT INTO `base_dict` VALUES ('6', '001', '客户行业', '电子商务', NULL, NULL, '1', NULL);
INSERT INTO `base_dict` VALUES ('7', '002', '客户来源', '网络', NULL, NULL, '1', NULL);
INSERT INTO `base_dict` VALUES ('8', '002', '客户来源', '电话', NULL, NULL, '1', NULL);
INSERT INTO `base_dict` VALUES ('9', '002', '客户来源', '广告', NULL, NULL, '1', NULL);

-- ----------------------------
-- Table structure for cst_customer
-- ----------------------------
DROP TABLE IF EXISTS `cst_customer`;
CREATE TABLE `cst_customer`  (
  `cust_id` bigint(32) NOT NULL AUTO_INCREMENT COMMENT '客户编号(主键)',
  `cust_name` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '客户名称(公司名称)',
  `cust_source` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '客户信息来源',
  `cust_industry` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '客户所属行业',
  `cust_level` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '客户级别',
  `cust_linkman` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '联系人',
  `cust_phone` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '固定电话',
  `cust_mobile` varchar(16) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '移动电话',
  PRIMARY KEY (`cust_id`) USING BTREE,
  INDEX `cust_linkman`(`cust_linkman`) USING BTREE,
  INDEX `FKeh5g36duab8g1h051pdjfwcgd`(`cust_source`) USING BTREE,
  INDEX `FK2xhr3arwp3tkuae1da4lqv352`(`cust_industry`) USING BTREE,
  INDEX `FKrty52nvbjg1echf0se39eng49`(`cust_level`) USING BTREE,
  CONSTRAINT `FK2xhr3arwp3tkuae1da4lqv352` FOREIGN KEY (`cust_industry`) REFERENCES `base_dict` (`dict_id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `FKeh5g36duab8g1h051pdjfwcgd` FOREIGN KEY (`cust_source`) REFERENCES `base_dict` (`dict_id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `fkkk` FOREIGN KEY (`cust_source`) REFERENCES `base_dict` (`dict_id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `fkkk1` FOREIGN KEY (`cust_industry`) REFERENCES `base_dict` (`dict_id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `fkkk2` FOREIGN KEY (`cust_level`) REFERENCES `base_dict` (`dict_id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `FKrty52nvbjg1echf0se39eng49` FOREIGN KEY (`cust_level`) REFERENCES `base_dict` (`dict_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 10 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of cst_customer
-- ----------------------------
INSERT INTO `cst_customer` VALUES (1, '百度公司', '7', '3', '1', '马化腾', '17720839626', '17720839626');
INSERT INTO `cst_customer` VALUES (2, '网易云公司', '7', '3', '2', '盖茨', '6546', '7');
INSERT INTO `cst_customer` VALUES (3, '知乎公司', '9', '3', '2', '哦哦', '6546', '777');
INSERT INTO `cst_customer` VALUES (4, '腾讯公司', '9', '5', '2', '杀杀杀', '7', '123');
INSERT INTO `cst_customer` VALUES (5, '莆田学院', '9', '3', '2', '而通过', '123', '777');
INSERT INTO `cst_customer` VALUES (6, 'google公司', '8', '5', '2', '7', '6546', '7');
INSERT INTO `cst_customer` VALUES (7, 'apache公司', '8', '5', '2', '哦哦3333', '777', '11111');
INSERT INTO `cst_customer` VALUES (8, 'maven公司', '8', '5', '1', '嘤嘤嘤', '111', '11111');
INSERT INTO `cst_customer` VALUES (9, 'svn公司', '9', '6', '1', '刘发噶', '111', '11111');

-- ----------------------------
-- Table structure for cst_linkman
-- ----------------------------
DROP TABLE IF EXISTS `cst_linkman`;
CREATE TABLE `cst_linkman`  (
  `lkm_id` bigint(32) NOT NULL AUTO_INCREMENT COMMENT '联系人编号(主键)',
  `lkm_name` varchar(16) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '联系人姓名',
  `lkm_cust_id` bigint(32) NOT NULL COMMENT '客户id',
  `lkm_gender` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '联系人性别',
  `lkm_phone` varchar(16) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '联系人办公电话',
  `lkm_mobile` varchar(16) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '联系人手机',
  `lkm_email` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '联系人邮箱',
  `lkm_qq` varchar(16) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '联系人qq',
  `lkm_position` varchar(16) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '联系人职位',
  `lkm_memo` varchar(512) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '联系人备注',
  PRIMARY KEY (`lkm_id`) USING BTREE,
  INDEX `FKh9yp1nql5227xxcopuxqx2e7q`(`lkm_cust_id`) USING BTREE,
  CONSTRAINT `FKh9yp1nql5227xxcopuxqx2e7q` FOREIGN KEY (`lkm_cust_id`) REFERENCES `cst_customer` (`cust_id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `fkkkk34` FOREIGN KEY (`lkm_cust_id`) REFERENCES `cst_customer` (`cust_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of cst_linkman
-- ----------------------------
INSERT INTO `cst_linkman` VALUES (1, '马化腾', 1, '男', '17720839626', '17720839626', 'test@qq.com', '2867173036', '北京', NULL);
INSERT INTO `cst_linkman` VALUES (2, '知树人', 3, '女', '22211', '22211', NULL, NULL, NULL, NULL);
INSERT INTO `cst_linkman` VALUES (3, '雷哥', 5, '男', '22211', '22211', NULL, NULL, NULL, NULL);
INSERT INTO `cst_linkman` VALUES (4, '马化腾', 4, '男', '222111', '222111', NULL, NULL, NULL, NULL);
INSERT INTO `cst_linkman` VALUES (5, '网易人', 2, '男', '222111', '2223', NULL, NULL, NULL, NULL);

-- ----------------------------
-- Table structure for sale_visit
-- ----------------------------
DROP TABLE IF EXISTS `sale_visit`;
CREATE TABLE `sale_visit`  (
  `visit_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `visit_interviewee` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `visit_addr` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `visit_detail` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `visit_time` date NULL DEFAULT NULL,
  `visit_nexttime` date NULL DEFAULT NULL,
  `visit_cust_id` bigint(20) NULL DEFAULT NULL,
  `visit_user_id` bigint(20) NULL DEFAULT NULL,
  PRIMARY KEY (`visit_id`) USING BTREE,
  INDEX `FKgr4aivocixwcvkwxcmc0b4css`(`visit_cust_id`) USING BTREE,
  INDEX `FKc92iepd26mixxfiris92hccjx`(`visit_user_id`) USING BTREE,
  CONSTRAINT `fk1` FOREIGN KEY (`visit_cust_id`) REFERENCES `cst_customer` (`cust_id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `fk2` FOREIGN KEY (`visit_user_id`) REFERENCES `sys_user` (`user_id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `FKc92iepd26mixxfiris92hccjx` FOREIGN KEY (`visit_user_id`) REFERENCES `sys_user` (`user_id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `FKgr4aivocixwcvkwxcmc0b4css` FOREIGN KEY (`visit_cust_id`) REFERENCES `cst_customer` (`cust_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of sale_visit
-- ----------------------------
INSERT INTO `sale_visit` VALUES ('001', '地方撒', '北京', '很好', '2018-11-21', '2018-11-22', 1, 1);
INSERT INTO `sale_visit` VALUES ('2c91b28266d378de0166d387b3f70000', '马化腾', '网易云基地地点', '洽谈，气氛融洽。', '2018-11-01', '2018-11-03', 2, 1);
INSERT INTO `sale_visit` VALUES ('2c91b28266d378de0166d3894ad60001', 'tttttttts', '莆田学院图书馆', '洽谈，气氛融洽。', '2018-11-14', '2018-11-24', 5, 1);
INSERT INTO `sale_visit` VALUES ('2c91b28266d378de0166d389e8470002', 'google经纪人', 'google公司基地地点', '洽谈，气氛融洽。不', '2018-11-08', '2018-11-23', 6, 1);
INSERT INTO `sale_visit` VALUES ('2c91b28266d378de0166d38c38320003', '马化腾', '腾讯公司基地地点', '仿佛很融洽', '2018-11-13', '2018-11-23', 4, NULL);
INSERT INTO `sale_visit` VALUES ('2c91b28266d378de0166d38cbb7f0004', 'svn负责人', 'svn公司基地地点', '洽谈，气氛融洽。svn融洽', '2018-11-15', '2018-11-30', 9, NULL);

-- ----------------------------
-- Table structure for sys_user
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user`  (
  `user_id` bigint(32) NOT NULL AUTO_INCREMENT,
  `user_code` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `user_name` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `user_password` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `user_state` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`user_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 8 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of sys_user
-- ----------------------------
INSERT INTO `sys_user` VALUES (1, 'cyf', 'cyf', 'e10adc3949ba59abbe56e057f20f883e', '1');
INSERT INTO `sys_user` VALUES (2, 'fff', 'fff', 'e10adc3949ba59abbe56e057f20f883e', '1');
INSERT INTO `sys_user` VALUES (3, 'ccc', 'ccc', 'e10adc3949ba59abbe56e057f20f883e', '1');
INSERT INTO `sys_user` VALUES (4, 'yyy', 'yyy', 'e10adc3949ba59abbe56e057f20f883e', '1');
INSERT INTO `sys_user` VALUES (6, 'qqq', 'qqq', 'b2ca678b4c936f905fb82f2733f5297f', NULL);
INSERT INTO `sys_user` VALUES (7, '', 'Admin', 'e3afed0047b08059d0fada10f400c1e5', NULL);

SET FOREIGN_KEY_CHECKS = 1;
