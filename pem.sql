/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50621
Source Host           : localhost:3306
Source Database       : pem

Target Server Type    : MYSQL
Target Server Version : 50621
File Encoding         : 65001

Date: 2015-11-05 17:46:39
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for bank_running_water
-- ----------------------------
DROP TABLE IF EXISTS `bank_running_water`;
CREATE TABLE `bank_running_water` (
  `id` int(11) NOT NULL,
  `userID` int(11) DEFAULT NULL,
  `running_name` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '流水名称',
  `sum` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '流水金额',
  `status` int(255) DEFAULT NULL COMMENT '0代表存入,1代表支出',
  `bank_balance` float(255,0) DEFAULT NULL COMMENT '卡内余额',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Table structure for consume_detail
-- ----------------------------
DROP TABLE IF EXISTS `consume_detail`;
CREATE TABLE `consume_detail` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) DEFAULT NULL,
  `consume_name` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '消费事由',
  `consume_sum` float unsigned zerofill DEFAULT NULL COMMENT '消费金额',
  `consume_date` date DEFAULT NULL COMMENT '消费时间',
  `consume_address` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '消费地点',
  `consume_reason` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '消费原因',
  `record_ip` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '录入设备api地址',
  `isNeed` int(11) DEFAULT NULL COMMENT '是否是必要开销 0 是，1 不是',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=142 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Table structure for pem_bank
-- ----------------------------
DROP TABLE IF EXISTS `pem_bank`;
CREATE TABLE `pem_bank` (
  `id` int(11) NOT NULL,
  `user_id` int(11) DEFAULT NULL COMMENT '用户表id',
  `bankCode` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '银行卡卡号',
  `bankName` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '银行卡名称',
  `type` int(11) DEFAULT NULL COMMENT '银行卡类型，0代表借记卡，1代表信用卡',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Table structure for pem_wage
-- ----------------------------
DROP TABLE IF EXISTS `pem_wage`;
CREATE TABLE `pem_wage` (
  `id` int(11) NOT NULL,
  `user_id` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `bankId` int(11) DEFAULT NULL COMMENT '银行卡ID',
  `sum` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '所发工资',
  `wage_date` date DEFAULT NULL COMMENT '工资发放时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Table structure for take_money
-- ----------------------------
DROP TABLE IF EXISTS `take_money`;
CREATE TABLE `take_money` (
  `id` int(11) NOT NULL,
  `address` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '取钱记录',
  `sum` float(255,0) DEFAULT NULL COMMENT '所取金额',
  `bank_id` int(11) DEFAULT NULL COMMENT '银行卡卡号',
  `take_date` date DEFAULT NULL COMMENT '取钱时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;
