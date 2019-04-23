/*
Navicat MySQL Data Transfer

Source Server         : qyy
Source Server Version : 50720
Source Host           : localhost:3306
Source Database       : oes

Target Server Type    : MYSQL
Target Server Version : 50720
File Encoding         : 65001

Date: 2019-04-23 17:48:58
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for admin
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin` (
  `id` int(255) NOT NULL AUTO_INCREMENT COMMENT '管理员主键',
  `admin_id` varchar(20) DEFAULT NULL COMMENT '管理员账号',
  `password` varchar(255) DEFAULT NULL COMMENT '密码',
  `user_type` tinyint(2) DEFAULT NULL COMMENT '用户类型',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of admin
-- ----------------------------
INSERT INTO `admin` VALUES ('1', 'admin', 'admin', '2');

-- ----------------------------
-- Table structure for answerpaper
-- ----------------------------
DROP TABLE IF EXISTS `answerpaper`;
CREATE TABLE `answerpaper` (
  `id` int(255) NOT NULL COMMENT '答题信息主键',
  `submit_time` varchar(6) DEFAULT NULL COMMENT '提交时间',
  `paper_name` varchar(255) DEFAULT NULL COMMENT '答卷名称',
  `answer_userid` varchar(20) DEFAULT NULL,
  `checked` varchar(255) DEFAULT NULL COMMENT '是否改完卷',
  `finished` varchar(255) DEFAULT NULL COMMENT '是否答完卷',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of answerpaper
-- ----------------------------

-- ----------------------------
-- Table structure for answerpaperquestion
-- ----------------------------
DROP TABLE IF EXISTS `answerpaperquestion`;
CREATE TABLE `answerpaperquestion` (
  `id` int(255) NOT NULL,
  `answerpaper_id` int(255) DEFAULT NULL,
  `answerquestion_id` int(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of answerpaperquestion
-- ----------------------------

-- ----------------------------
-- Table structure for answerquestion
-- ----------------------------
DROP TABLE IF EXISTS `answerquestion`;
CREATE TABLE `answerquestion` (
  `id` int(255) NOT NULL AUTO_INCREMENT COMMENT '答卷题目信息主键',
  `question_content` text COMMENT '题干',
  `question_type` int(3) DEFAULT NULL COMMENT '题目类型',
  `option_a` varchar(255) DEFAULT NULL COMMENT '选项A',
  `option_b` varchar(255) DEFAULT NULL COMMENT '选项B',
  `option_c` varchar(255) DEFAULT NULL COMMENT '选项C',
  `option_d` varchar(255) DEFAULT NULL COMMENT '选项D',
  `option_e` varchar(255) DEFAULT NULL COMMENT '选项E',
  `option_f` varchar(255) DEFAULT NULL COMMENT '选项F',
  `correct_answer` varchar(255) DEFAULT NULL COMMENT '正确答案',
  `correct_score` int(255) DEFAULT NULL COMMENT '所占分值',
  `exam_score` int(255) DEFAULT NULL COMMENT '总成绩',
  `number` int(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of answerquestion
-- ----------------------------

-- ----------------------------
-- Table structure for exam
-- ----------------------------
DROP TABLE IF EXISTS `exam`;
CREATE TABLE `exam` (
  `id` int(255) NOT NULL COMMENT '试卷号',
  `examinfo_id` int(255) DEFAULT NULL COMMENT '考试信息主键',
  `questioninfo_id` int(255) DEFAULT NULL COMMENT '题库信息主键',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of exam
-- ----------------------------
INSERT INTO `exam` VALUES ('1', '1', '1');
INSERT INTO `exam` VALUES ('2', '1', '2');
INSERT INTO `exam` VALUES ('3', '1', '3');

-- ----------------------------
-- Table structure for examanswer
-- ----------------------------
DROP TABLE IF EXISTS `examanswer`;
CREATE TABLE `examanswer` (
  `id` int(255) NOT NULL AUTO_INCREMENT,
  `examinfo_id` int(255) DEFAULT NULL COMMENT '试卷信息主键',
  `examscore_id` int(255) DEFAULT NULL COMMENT '成绩表主键',
  `answerpaper_id` int(255) DEFAULT NULL COMMENT '答卷信息主键',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of examanswer
-- ----------------------------

-- ----------------------------
-- Table structure for examinee
-- ----------------------------
DROP TABLE IF EXISTS `examinee`;
CREATE TABLE `examinee` (
  `id` int(255) NOT NULL COMMENT '用户表主键',
  `user_id` varchar(20) DEFAULT NULL COMMENT '学号',
  `user_name` varchar(20) DEFAULT NULL COMMENT '姓名',
  `identity_num` varchar(20) DEFAULT NULL COMMENT '身份证号',
  `user_type` tinyint(2) DEFAULT NULL COMMENT '用户类型',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of examinee
-- ----------------------------
INSERT INTO `examinee` VALUES ('1', '20150012', 'sunny', '452424XXX', '1');
INSERT INTO `examinee` VALUES ('2', '20160012', 'rain', '462826XXX', '1');
INSERT INTO `examinee` VALUES ('3', '20150013', 'eagle', '425678xxx', '1');
INSERT INTO `examinee` VALUES ('4', '20150014', 'eaglea', '425578xxx', '1');
INSERT INTO `examinee` VALUES ('5', '20150017', 'nnn', '258963xxx', '1');
INSERT INTO `examinee` VALUES ('6', '20150014', 'eaglea', '425578xxx', '1');
INSERT INTO `examinee` VALUES ('7', '20150014', 'eaglea', '425578xxx', '1');
INSERT INTO `examinee` VALUES ('8', '20150017', 'nnn', '258963xxx', '1');
INSERT INTO `examinee` VALUES ('9', '20150017', 'nnn', '258963xxx', '1');
INSERT INTO `examinee` VALUES ('10', '25', '55', '48', '55');
INSERT INTO `examinee` VALUES ('12', '25', '26', '23', '22');
INSERT INTO `examinee` VALUES ('16', '1', '2', '3', '4');
INSERT INTO `examinee` VALUES ('56', '20152222', '邱远英', '5289635', '1');

-- ----------------------------
-- Table structure for examinfo
-- ----------------------------
DROP TABLE IF EXISTS `examinfo`;
CREATE TABLE `examinfo` (
  `id` int(255) NOT NULL AUTO_INCREMENT COMMENT '试卷主键',
  `exam_subject` varchar(255) DEFAULT NULL COMMENT '考试科目',
  `exam_name` varchar(255) DEFAULT NULL COMMENT '考试名称',
  `exam_content` varchar(255) DEFAULT NULL COMMENT '考试内容',
  `exam_date` varchar(20) DEFAULT NULL COMMENT '考试日期',
  `exam_time` varchar(20) DEFAULT NULL COMMENT '考试时间',
  `total_time` varchar(20) DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL COMMENT '考试说明',
  `start_time` datetime(4) DEFAULT NULL,
  `end_time` datetime(4) DEFAULT NULL,
  `created` datetime(4) DEFAULT NULL,
  `peoples` int(255) DEFAULT NULL,
  `publish` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of examinfo
-- ----------------------------
INSERT INTO `examinfo` VALUES ('1', '党课', '党课考试', '客观题', '2019-04-20', '9:00-11:00', '2小时', '提前15分钟入场', null, null, null, null, null);
INSERT INTO `examinfo` VALUES ('2', '政治', '政治考试', '客观题', '2019-04-25', '14:00-16:00', '2小时', '提前15分钟入场', null, null, null, null, null);

-- ----------------------------
-- Table structure for examscore
-- ----------------------------
DROP TABLE IF EXISTS `examscore`;
CREATE TABLE `examscore` (
  `id` int(255) NOT NULL COMMENT '成绩表主键',
  `user_id` int(255) DEFAULT NULL COMMENT '考生表主键',
  `examinfo_id` int(255) DEFAULT NULL COMMENT '考试信息主键',
  `exam_score` int(255) DEFAULT NULL COMMENT '考试总分',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of examscore
-- ----------------------------
INSERT INTO `examscore` VALUES ('1', '20150012', '1', '90');
INSERT INTO `examscore` VALUES ('2', '20150012', '2', '85');
INSERT INTO `examscore` VALUES ('3', '20160012', '1', '78');

-- ----------------------------
-- Table structure for questioninfo
-- ----------------------------
DROP TABLE IF EXISTS `questioninfo`;
CREATE TABLE `questioninfo` (
  `id` int(255) NOT NULL COMMENT '题库',
  `question_type` int(255) DEFAULT NULL COMMENT '题型',
  `question_level` int(255) DEFAULT NULL COMMENT '题目难度',
  `question_content` varchar(255) DEFAULT NULL COMMENT '题目内容',
  `option_a` varchar(255) DEFAULT NULL COMMENT '选项A',
  `option_b` varchar(255) DEFAULT NULL COMMENT '选项B',
  `option_c` varchar(255) DEFAULT NULL COMMENT '选项C',
  `option_d` varchar(255) DEFAULT NULL COMMENT '选项D',
  `option_e` varchar(255) DEFAULT NULL COMMENT '判断题选项1',
  `option_f` varchar(255) DEFAULT NULL COMMENT '判断题选项2',
  `correct_answer` varchar(20) DEFAULT NULL COMMENT '正确答案',
  `number` int(255) DEFAULT NULL COMMENT '题目序号',
  `correct_score` int(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of questioninfo
-- ----------------------------
INSERT INTO `questioninfo` VALUES ('1', '2', '3', '4', ' ', ' ', ' ', ' ', '9', '10', '11', '12', null);
INSERT INTO `questioninfo` VALUES ('2', '3', '4', '5', '6', '7', '8', '9', '10', '11', '12', '1', null);
INSERT INTO `questioninfo` VALUES ('5', '3', '4', '5', '6', '7', '8', '9', '10', '11', '12', '1', null);
INSERT INTO `questioninfo` VALUES ('6', '3', '4', '5', '6', '7', '8', '9', '10', '11', '12', '1', null);
INSERT INTO `questioninfo` VALUES ('20', '21', '22', '23', '24', '25', '26', '27', '28', '29', '30', '31', null);
