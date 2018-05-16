/*
Navicat MySQL Data Transfer

Source Server         : 172.25.60.118
Source Server Version : 50720
Source Host           : 172.25.60.118:3306
Source Database       : lazydsr-web-template

Target Server Type    : MYSQL
Target Server Version : 50720
File Encoding         : 65001

Date: 2018-05-16 17:59:43
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for sys_admin
-- ----------------------------
DROP TABLE IF EXISTS `sys_admin`;
CREATE TABLE `sys_admin` (
  `id` varchar(32) NOT NULL,
  `name` varchar(100) DEFAULT NULL,
  `creator` varchar(32) DEFAULT NULL,
  `create_date` varchar(19) DEFAULT NULL,
  `modifier` varchar(32) DEFAULT NULL,
  `modify_date` varchar(19) DEFAULT NULL,
  `status` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of sys_admin
-- ----------------------------

-- ----------------------------
-- Table structure for sys_datasourceinfo
-- ----------------------------
DROP TABLE IF EXISTS `sys_datasourceinfo`;
CREATE TABLE `sys_datasourceinfo` (
  `id` varchar(32) NOT NULL,
  `name` varchar(100) NOT NULL,
  `dbtype` varchar(255) NOT NULL,
  `address` varchar(255) NOT NULL,
  `prot` varchar(255) NOT NULL,
  `dbname` varchar(255) NOT NULL,
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `min_active` int(11) NOT NULL,
  `max_active` int(11) NOT NULL,
  `creator` varchar(32) DEFAULT NULL,
  `create_date` varchar(19) DEFAULT NULL,
  `modifier` varchar(32) DEFAULT NULL,
  `modify_date` varchar(19) DEFAULT NULL,
  `status` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of sys_datasourceinfo
-- ----------------------------

-- ----------------------------
-- Table structure for sys_menu
-- ----------------------------
DROP TABLE IF EXISTS `sys_menu`;
CREATE TABLE `sys_menu` (
  `id` varchar(32) NOT NULL,
  `name` varchar(100) DEFAULT NULL,
  `en_name` varchar(100) DEFAULT NULL,
  `description` varchar(1000) DEFAULT NULL,
  `parent_id` varchar(32) DEFAULT NULL,
  `icon` varchar(255) DEFAULT NULL,
  `url` varchar(255) DEFAULT NULL,
  `target` varchar(255) DEFAULT NULL,
  `publics` int(11) NOT NULL,
  `allow_edit` int(11) NOT NULL,
  `allow_delete` int(11) NOT NULL,
  `orderNum` double NOT NULL,
  `creator` varchar(32) DEFAULT NULL,
  `create_date` varchar(19) DEFAULT NULL,
  `modifier` varchar(32) DEFAULT NULL,
  `modify_date` varchar(19) DEFAULT NULL,
  `status` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of sys_menu
-- ----------------------------
INSERT INTO `sys_menu` VALUES ('32U455N29Z2QCP6JKA3NTW9K7YV9JET6', '用户相关', 'User Info', null, '0', 'fa fa-fw fa-amazon', '', null, '0', '0', '0', '1', null, '2018-04-01 22:35:14', null, '2018-04-01 22:35:14', '0');
INSERT INTO `sys_menu` VALUES ('3FV2VY3ET7F3H6CKMACWK5PAJFF8JFAU', '菜单管理', 'Menu Manager', null, 'MUUE9WW3TA1KCY2JGQMRTJ6ZNRMTKWGF', 'fa fa-fw fa-chrome', '/menu', null, '0', '0', '0', '100', null, '2018-04-23 21:19:42', null, '2018-04-23 21:19:42', '0');
INSERT INTO `sys_menu` VALUES ('M5WZBHY833S3FY7KJNVW4WXQPQXENXF3', '登录记录', 'Login Record', null, '32U455N29Z2QCP6JKA3NTW9K7YV9JET6', 'fa fa-fw fa-bold', '/userLoginRecord', null, '0', '0', '0', '1', null, '2018-04-15 17:44:41', null, '2018-04-15 17:44:41', '0');
INSERT INTO `sys_menu` VALUES ('MUUE9WW3TA1KCY2JGQMRTJ6ZNRMTKWGF', '系统设置', 'System Config', null, '0', 'fa fa fa-cog', '', null, '0', '0', '0', '100', null, '2018-04-01 17:29:21', null, '2018-04-01 17:29:21', '0');
INSERT INTO `sys_menu` VALUES ('TKV63Z2QZBPMH2EK1S941CBJSCFAK51S', '用户管理', 'User Manager', null, 'MUUE9WW3TA1KCY2JGQMRTJ6ZNRMTKWGF', 'fa fa-fw fa-battery-three-quarters', '/user', null, '0', '0', '0', '1000', null, '2018-04-15 16:37:12', null, '2018-04-15 16:37:12', '0');

-- ----------------------------
-- Table structure for sys_monitorinfo
-- ----------------------------
DROP TABLE IF EXISTS `sys_monitorinfo`;
CREATE TABLE `sys_monitorinfo` (
  `id` varchar(32) NOT NULL,
  `server_id` varchar(255) DEFAULT NULL,
  `total_memory` bigint(20) NOT NULL,
  `free_memory` bigint(20) NOT NULL,
  `max_memory` bigint(20) NOT NULL,
  `os_name` varchar(255) DEFAULT NULL,
  `total_memory_size` bigint(20) NOT NULL,
  `free_physical_memory_size` bigint(20) NOT NULL,
  `used_memory` bigint(20) NOT NULL,
  `total_thread` int(11) NOT NULL,
  `cpu_ratio` double NOT NULL,
  `creator` varchar(32) DEFAULT NULL,
  `create_date` varchar(19) DEFAULT NULL,
  `modifier` varchar(32) DEFAULT NULL,
  `modify_date` varchar(19) DEFAULT NULL,
  `status` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of sys_monitorinfo
-- ----------------------------

-- ----------------------------
-- Table structure for sys_permission
-- ----------------------------
DROP TABLE IF EXISTS `sys_permission`;
CREATE TABLE `sys_permission` (
  `id` varchar(32) NOT NULL,
  `name` varchar(255) NOT NULL,
  `url` varchar(255) DEFAULT NULL,
  `pid` varchar(255) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `creator` varchar(32) DEFAULT NULL,
  `create_date` varchar(19) DEFAULT NULL,
  `modifier` varchar(32) DEFAULT NULL,
  `modify_date` varchar(19) DEFAULT NULL,
  `status` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of sys_permission
-- ----------------------------

-- ----------------------------
-- Table structure for sys_permission_role
-- ----------------------------
DROP TABLE IF EXISTS `sys_permission_role`;
CREATE TABLE `sys_permission_role` (
  `id` varchar(32) NOT NULL,
  `p_id` varchar(255) DEFAULT NULL,
  `r_id` varchar(255) DEFAULT NULL,
  `creator` varchar(32) DEFAULT NULL,
  `create_date` varchar(19) DEFAULT NULL,
  `modifier` varchar(32) DEFAULT NULL,
  `modify_date` varchar(19) DEFAULT NULL,
  `status` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of sys_permission_role
-- ----------------------------

-- ----------------------------
-- Table structure for sys_role
-- ----------------------------
DROP TABLE IF EXISTS `sys_role`;
CREATE TABLE `sys_role` (
  `id` varchar(32) NOT NULL,
  `name` varchar(100) NOT NULL,
  `description` varchar(255) DEFAULT NULL,
  `creator` varchar(32) DEFAULT NULL,
  `create_date` varchar(19) DEFAULT NULL,
  `modifier` varchar(32) DEFAULT NULL,
  `modify_date` varchar(19) DEFAULT NULL,
  `status` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of sys_role
-- ----------------------------

-- ----------------------------
-- Table structure for sys_schedule_job
-- ----------------------------
DROP TABLE IF EXISTS `sys_schedule_job`;
CREATE TABLE `sys_schedule_job` (
  `id` varchar(32) NOT NULL,
  `name` varchar(255) NOT NULL,
  `jobgroup` varchar(255) NOT NULL,
  `classpath` varchar(1000) NOT NULL,
  `method` varchar(255) NOT NULL,
  `concurrent` varchar(255) DEFAULT NULL,
  `cron` varchar(255) NOT NULL,
  `description` varchar(1000) DEFAULT NULL,
  `jobstatus` varchar(11) DEFAULT NULL,
  `creator` varchar(32) DEFAULT NULL,
  `create_date` varchar(19) DEFAULT NULL,
  `modifier` varchar(32) DEFAULT NULL,
  `modify_date` varchar(19) DEFAULT NULL,
  `status` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of sys_schedule_job
-- ----------------------------
INSERT INTO `sys_schedule_job` VALUES ('1111111111', 'aaaa', 'aaass', 'com.lazydsr.lazydsrwebtemplate.vo.ScheduleTest', 'runschedule', '0', '0/5 * * * * ?', '1111', '1', null, null, null, null, '0');

-- ----------------------------
-- Table structure for sys_systeminfo
-- ----------------------------
DROP TABLE IF EXISTS `sys_systeminfo`;
CREATE TABLE `sys_systeminfo` (
  `id` varchar(32) NOT NULL,
  `username` varchar(100) DEFAULT NULL,
  `server_name` varchar(100) DEFAULT NULL,
  `domain` varchar(100) DEFAULT NULL,
  `net_name` varchar(255) DEFAULT NULL,
  `ip` varchar(255) DEFAULT NULL,
  `mac` varchar(1000) DEFAULT NULL,
  `host` varchar(255) DEFAULT NULL,
  `os_arch` varchar(255) DEFAULT NULL,
  `os_name` varchar(255) DEFAULT NULL,
  `os_version` varchar(255) DEFAULT NULL,
  `cpu_mhz` varchar(255) DEFAULT NULL,
  `cpu_vendor` varchar(255) DEFAULT NULL,
  `cpu_model` varchar(1000) DEFAULT NULL,
  `cpu_cache_size` varchar(255) DEFAULT NULL,
  `mem_total` double DEFAULT NULL,
  `jvm_xmx` double DEFAULT NULL,
  `jvm_xms` double DEFAULT NULL,
  `jvm_xmn` double DEFAULT NULL,
  `jvm_available_processors` int(11) DEFAULT NULL,
  `jvm_version` varchar(255) DEFAULT NULL,
  `jvm_home` varchar(255) DEFAULT NULL,
  `jvm_app_home` varchar(255) DEFAULT NULL,
  `jvm_class_version` varchar(255) DEFAULT NULL,
  `creator` varchar(32) DEFAULT NULL,
  `create_date` varchar(19) DEFAULT NULL,
  `modifier` varchar(32) DEFAULT NULL,
  `modify_date` varchar(19) DEFAULT NULL,
  `status` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of sys_systeminfo
-- ----------------------------
INSERT INTO `sys_systeminfo` VALUES ('32TM6JPHBCAFKPPJQA5DK56DRB56KGT7', 'Administrator', 'DESKTOP-QEKTKOJ', 'DESKTOP-QEKTKOJ', 'eth6', '192.168.2.100', 'B0:25:AA:1C:06:9A', '192.168.2.100', 'amd64', 'Windows 10', '10.0', '2494,2494,2494,2494,2494,2494,2494,2494', 'Intel,Intel,Intel,Intel,Intel,Intel,Intel,Intel', 'Core(TM) i7-4710MQ CPU @ 2.50GHz,Core(TM) i7-4710MQ CPU @ 2.50GHz,Core(TM) i7-4710MQ CPU @ 2.50GHz,Core(TM) i7-4710MQ CPU @ 2.50GHz,Core(TM) i7-4710MQ CPU @ 2.50GHz,Core(TM) i7-4710MQ CPU @ 2.50GHz,Core(TM) i7-4710MQ CPU @ 2.50GHz,Core(TM) i7-4710MQ CPU @ 2.50GHz', '-1,-1,-1,-1,-1,-1,-1,-1', '8079.0390625', '1796', '128', '0', '8', '1.8.0_151', 'F:\\Program Files\\Java\\jdk8\\jre', 'E:\\code\\intellijidea\\lazydsr-web-template', '52.0', null, '2018-05-16 16:19:54', null, '2018-05-16 16:19:54', '0');
INSERT INTO `sys_systeminfo` VALUES ('35TMZGU212MVC6QJTBNQ24EYQDY6N2TY', 'root', 'if.founder.com', null, 'eth3', '172.25.60.118', '00:50:56:81:10:27', '172.25.60.118', 'amd64', 'Linux', '4.1.12-37.4.1.el6uek.x86_64', '2397,2397,2397,2397', 'Intel,Intel,Intel,Intel', 'Xeon,Xeon,Xeon,Xeon', '30720,30720,30720,30720', '15790.24609375', '3509.5', '248', '0', '4', '1.8.0_151', '/usr/local/jdk1.8.0_151/jre', '/root', '52.0', null, '2018-05-11 18:11:16', null, '2018-05-11 18:11:16', '0');
INSERT INTO `sys_systeminfo` VALUES ('38WJN6MXW1ZRSP9KUG8SAFBV854GMJD9', 'Administrator', 'DESKTOP-QEKTKOJ', 'DESKTOP-QEKTKOJ', 'eth6', '192.168.2.100', 'B0:25:AA:1C:06:9A', '192.168.2.100', 'amd64', 'Windows 10', '10.0', '2494,2494,2494,2494,2494,2494,2494,2494', 'Intel,Intel,Intel,Intel,Intel,Intel,Intel,Intel', 'Core(TM) i7-4710MQ CPU @ 2.50GHz,Core(TM) i7-4710MQ CPU @ 2.50GHz,Core(TM) i7-4710MQ CPU @ 2.50GHz,Core(TM) i7-4710MQ CPU @ 2.50GHz,Core(TM) i7-4710MQ CPU @ 2.50GHz,Core(TM) i7-4710MQ CPU @ 2.50GHz,Core(TM) i7-4710MQ CPU @ 2.50GHz,Core(TM) i7-4710MQ CPU @ 2.50GHz', '-1,-1,-1,-1,-1,-1,-1,-1', '8079.0390625', '1796', '128', '0', '8', '1.8.0_151', 'F:\\Program Files\\Java\\jdk8\\jre', 'E:\\code\\intellijidea\\lazydsr-web-template', '52.0', null, '2018-05-16 17:10:29', null, '2018-05-16 17:10:29', '0');
INSERT INTO `sys_systeminfo` VALUES ('4MT4R86453NSAQFJ9SYBPW2TKUFQK914', 'Administrator', 'DESKTOP-QEKTKOJ', 'DESKTOP-QEKTKOJ', 'eth6', '192.168.2.100', 'B0:25:AA:1C:06:9A', '192.168.2.100', 'amd64', 'Windows 10', '10.0', '2494,2494,2494,2494,2494,2494,2494,2494', 'Intel,Intel,Intel,Intel,Intel,Intel,Intel,Intel', 'Core(TM) i7-4710MQ CPU @ 2.50GHz,Core(TM) i7-4710MQ CPU @ 2.50GHz,Core(TM) i7-4710MQ CPU @ 2.50GHz,Core(TM) i7-4710MQ CPU @ 2.50GHz,Core(TM) i7-4710MQ CPU @ 2.50GHz,Core(TM) i7-4710MQ CPU @ 2.50GHz,Core(TM) i7-4710MQ CPU @ 2.50GHz,Core(TM) i7-4710MQ CPU @ 2.50GHz', '-1,-1,-1,-1,-1,-1,-1,-1', '8079.0390625', '1796', '128', '0', '8', '1.8.0_151', 'F:\\Program Files\\Java\\jdk8\\jre', 'E:\\code\\intellijidea\\lazydsr-web-template', '52.0', null, '2018-05-16 16:28:44', null, '2018-05-16 16:28:44', '0');
INSERT INTO `sys_systeminfo` VALUES ('69U84Y71X5YRS89JK82D5122BA8RKES6', 'lazy', 'lazydeMBP', null, 'en0', '192.168.2.171', '8C:85:90:A8:10:05', '192.168.2.171', 'x86_64', 'Mac OS X', '10.13.4', '2800,2800,2800,2800,2800,2800,2800,2800', 'Intel,Intel,Intel,Intel,Intel,Intel,Intel,Intel', 'MacBookPro14,3,MacBookPro14,3,MacBookPro14,3,MacBookPro14,3,MacBookPro14,3,MacBookPro14,3,MacBookPro14,3,MacBookPro14,3', '256,256,256,256,256,256,256,256', '16384', '3641', '256', '0', '8', '1.8.0_171', '/Library/Java/JavaVirtualMachines/jdk1.8.0_171.jdk/Contents/Home/jre', '/Volumes/data/develop/code/IntellijIdea/lazydsr-web-template', '52.0', null, '2018-04-23 21:00:34', null, '2018-04-23 21:00:34', '0');
INSERT INTO `sys_systeminfo` VALUES ('7BW8YP7WBAQ8J8TKYUEV6NPWN45TM4JC', 'Administrator', 'DESKTOP-QEKTKOJ', 'DESKTOP-QEKTKOJ', 'eth6', '192.168.2.100', 'B0:25:AA:1C:06:9A', '192.168.2.100', 'amd64', 'Windows 10', '10.0', '2494,2494,2494,2494,2494,2494,2494,2494', 'Intel,Intel,Intel,Intel,Intel,Intel,Intel,Intel', 'Core(TM) i7-4710MQ CPU @ 2.50GHz,Core(TM) i7-4710MQ CPU @ 2.50GHz,Core(TM) i7-4710MQ CPU @ 2.50GHz,Core(TM) i7-4710MQ CPU @ 2.50GHz,Core(TM) i7-4710MQ CPU @ 2.50GHz,Core(TM) i7-4710MQ CPU @ 2.50GHz,Core(TM) i7-4710MQ CPU @ 2.50GHz,Core(TM) i7-4710MQ CPU @ 2.50GHz', '-1,-1,-1,-1,-1,-1,-1,-1', '8079.0390625', '1796', '128', '0', '8', '1.8.0_151', 'F:\\Program Files\\Java\\jdk8\\jre', 'E:\\code\\intellijidea\\lazydsr-web-template', '52.0', null, '2018-05-14 09:17:03', null, '2018-05-14 09:17:03', '0');
INSERT INTO `sys_systeminfo` VALUES ('7JWVUVGJZWU4DRXK2FN4RTJ7DXXDJ6VF', 'Administrator', 'DESKTOP-QEKTKOJ', 'DESKTOP-QEKTKOJ', 'eth6', '192.168.2.100', 'B0:25:AA:1C:06:9A', '192.168.2.100', 'amd64', 'Windows 10', '10.0', '2494,2494,2494,2494,2494,2494,2494,2494', 'Intel,Intel,Intel,Intel,Intel,Intel,Intel,Intel', 'Core(TM) i7-4710MQ CPU @ 2.50GHz,Core(TM) i7-4710MQ CPU @ 2.50GHz,Core(TM) i7-4710MQ CPU @ 2.50GHz,Core(TM) i7-4710MQ CPU @ 2.50GHz,Core(TM) i7-4710MQ CPU @ 2.50GHz,Core(TM) i7-4710MQ CPU @ 2.50GHz,Core(TM) i7-4710MQ CPU @ 2.50GHz,Core(TM) i7-4710MQ CPU @ 2.50GHz', '-1,-1,-1,-1,-1,-1,-1,-1', '8079.0390625', '1796', '128', '0', '8', '1.8.0_151', 'F:\\Program Files\\Java\\jdk8\\jre', 'E:\\code\\intellijidea\\lazydsr-web-template', '52.0', null, '2018-05-16 16:17:08', null, '2018-05-16 16:17:08', '0');
INSERT INTO `sys_systeminfo` VALUES ('8VVRUBV3QMK7DSKKS5T84HCDVVM3J1QJ', 'Administrator', 'DESKTOP-QEKTKOJ', 'DESKTOP-QEKTKOJ', 'eth6', '192.168.2.100', 'B0:25:AA:1C:06:9A', '192.168.2.100', 'amd64', 'Windows 10', '10.0', '2494,2494,2494,2494,2494,2494,2494,2494', 'Intel,Intel,Intel,Intel,Intel,Intel,Intel,Intel', 'Core(TM) i7-4710MQ CPU @ 2.50GHz,Core(TM) i7-4710MQ CPU @ 2.50GHz,Core(TM) i7-4710MQ CPU @ 2.50GHz,Core(TM) i7-4710MQ CPU @ 2.50GHz,Core(TM) i7-4710MQ CPU @ 2.50GHz,Core(TM) i7-4710MQ CPU @ 2.50GHz,Core(TM) i7-4710MQ CPU @ 2.50GHz,Core(TM) i7-4710MQ CPU @ 2.50GHz', '-1,-1,-1,-1,-1,-1,-1,-1', '8079.0390625', '1796', '128', '0', '8', '1.8.0_151', 'F:\\Program Files\\Java\\jdk8\\jre', 'E:\\code\\intellijidea\\lazydsr-web-template', '52.0', null, '2018-05-16 15:58:15', null, '2018-05-16 15:58:15', '0');
INSERT INTO `sys_systeminfo` VALUES ('95WXTWHF73AYJ97KXFY7HVB3KEDQJ4V4', 'Administrator', 'DESKTOP-QEKTKOJ', 'DESKTOP-QEKTKOJ', 'eth6', '192.168.2.100', 'B0:25:AA:1C:06:9A', '192.168.2.100', 'amd64', 'Windows 10', '10.0', '2494,2494,2494,2494,2494,2494,2494,2494', 'Intel,Intel,Intel,Intel,Intel,Intel,Intel,Intel', 'Core(TM) i7-4710MQ CPU @ 2.50GHz,Core(TM) i7-4710MQ CPU @ 2.50GHz,Core(TM) i7-4710MQ CPU @ 2.50GHz,Core(TM) i7-4710MQ CPU @ 2.50GHz,Core(TM) i7-4710MQ CPU @ 2.50GHz,Core(TM) i7-4710MQ CPU @ 2.50GHz,Core(TM) i7-4710MQ CPU @ 2.50GHz,Core(TM) i7-4710MQ CPU @ 2.50GHz', '-1,-1,-1,-1,-1,-1,-1,-1', '8079.0390625', '1796', '128', '0', '8', '1.8.0_151', 'F:\\Program Files\\Java\\jdk8\\jre', 'E:\\code\\intellijidea\\lazydsr-web-template', '52.0', null, '2018-05-16 16:09:43', null, '2018-05-16 16:09:43', '0');
INSERT INTO `sys_systeminfo` VALUES ('9RUJFTBZHDD8GS1J2VE5UWER5HWHMPKV', 'Administrator', 'DESKTOP-QEKTKOJ', 'DESKTOP-QEKTKOJ', 'eth6', '192.168.2.100', 'B0:25:AA:1C:06:9A', '192.168.2.100', 'amd64', 'Windows 10', '10.0', '2494,2494,2494,2494,2494,2494,2494,2494', 'Intel,Intel,Intel,Intel,Intel,Intel,Intel,Intel', 'Core(TM) i7-4710MQ CPU @ 2.50GHz,Core(TM) i7-4710MQ CPU @ 2.50GHz,Core(TM) i7-4710MQ CPU @ 2.50GHz,Core(TM) i7-4710MQ CPU @ 2.50GHz,Core(TM) i7-4710MQ CPU @ 2.50GHz,Core(TM) i7-4710MQ CPU @ 2.50GHz,Core(TM) i7-4710MQ CPU @ 2.50GHz,Core(TM) i7-4710MQ CPU @ 2.50GHz', '-1,-1,-1,-1,-1,-1,-1,-1', '8079.0390625', '1796', '128', '0', '8', '1.8.0_151', 'F:\\Program Files\\Java\\jdk8\\jre', 'E:\\code\\intellijidea\\lazydsr-web-template', '52.0', null, '2018-05-16 16:23:59', null, '2018-05-16 16:23:59', '0');
INSERT INTO `sys_systeminfo` VALUES ('BNU4VQDA8XCGSTYJMPPMRMMSE4AJNFGG', 'Administrator', 'DESKTOP-QEKTKOJ', 'DESKTOP-QEKTKOJ', 'eth6', '192.168.2.100', 'B0:25:AA:1C:06:9A', '192.168.2.100', 'amd64', 'Windows 10', '10.0', '2494,2494,2494,2494,2494,2494,2494,2494', 'Intel,Intel,Intel,Intel,Intel,Intel,Intel,Intel', 'Core(TM) i7-4710MQ CPU @ 2.50GHz,Core(TM) i7-4710MQ CPU @ 2.50GHz,Core(TM) i7-4710MQ CPU @ 2.50GHz,Core(TM) i7-4710MQ CPU @ 2.50GHz,Core(TM) i7-4710MQ CPU @ 2.50GHz,Core(TM) i7-4710MQ CPU @ 2.50GHz,Core(TM) i7-4710MQ CPU @ 2.50GHz,Core(TM) i7-4710MQ CPU @ 2.50GHz', '-1,-1,-1,-1,-1,-1,-1,-1', '8079.0390625', '1796', '128', '0', '8', '1.8.0_151', 'F:\\Program Files\\Java\\jdk8\\jre', 'E:\\code\\intellijidea\\lazydsr-web-template', '52.0', null, '2018-05-16 17:13:39', null, '2018-05-16 17:13:39', '0');
INSERT INTO `sys_systeminfo` VALUES ('CATJ9K7K78SJSBAJJUBPDXD2YQ32JX2A', 'Administrator', 'DESKTOP-QEKTKOJ', 'DESKTOP-QEKTKOJ', 'eth6', '192.168.2.100', 'B0:25:AA:1C:06:9A', '192.168.2.100', 'amd64', 'Windows 10', '10.0', '2494,2494,2494,2494,2494,2494,2494,2494', 'Intel,Intel,Intel,Intel,Intel,Intel,Intel,Intel', 'Core(TM) i7-4710MQ CPU @ 2.50GHz,Core(TM) i7-4710MQ CPU @ 2.50GHz,Core(TM) i7-4710MQ CPU @ 2.50GHz,Core(TM) i7-4710MQ CPU @ 2.50GHz,Core(TM) i7-4710MQ CPU @ 2.50GHz,Core(TM) i7-4710MQ CPU @ 2.50GHz,Core(TM) i7-4710MQ CPU @ 2.50GHz,Core(TM) i7-4710MQ CPU @ 2.50GHz', '-1,-1,-1,-1,-1,-1,-1,-1', '8079.0390625', '1796', '128', '0', '8', '1.8.0_151', 'F:\\Program Files\\Java\\jdk8\\jre', 'E:\\code\\intellijidea\\lazydsr-web-template', '52.0', null, '2018-05-16 15:58:53', null, '2018-05-16 15:58:53', '0');
INSERT INTO `sys_systeminfo` VALUES ('D6UAEZY9WCBTGB8J7Q66AS67Q986N8GR', 'Administrator', 'DESKTOP-QEKTKOJ', 'DESKTOP-QEKTKOJ', 'eth6', '192.168.2.100', 'B0:25:AA:1C:06:9A', '192.168.2.100', 'amd64', 'Windows 10', '10.0', '2494,2494,2494,2494,2494,2494,2494,2494', 'Intel,Intel,Intel,Intel,Intel,Intel,Intel,Intel', 'Core(TM) i7-4710MQ CPU @ 2.50GHz,Core(TM) i7-4710MQ CPU @ 2.50GHz,Core(TM) i7-4710MQ CPU @ 2.50GHz,Core(TM) i7-4710MQ CPU @ 2.50GHz,Core(TM) i7-4710MQ CPU @ 2.50GHz,Core(TM) i7-4710MQ CPU @ 2.50GHz,Core(TM) i7-4710MQ CPU @ 2.50GHz,Core(TM) i7-4710MQ CPU @ 2.50GHz', '-1,-1,-1,-1,-1,-1,-1,-1', '8079.0390625', '1796', '128', '0', '8', '1.8.0_151', 'F:\\Program Files\\Java\\jdk8\\jre', 'E:\\code\\intellijidea\\lazydsr-web-template', '52.0', null, '2018-05-16 16:16:26', null, '2018-05-16 16:16:26', '0');
INSERT INTO `sys_systeminfo` VALUES ('DUU6P8ZKVEMKMU2JE3YSWXYYQPT8JV64', 'Administrator', 'DESKTOP-QEKTKOJ', 'DESKTOP-QEKTKOJ', 'eth6', '192.168.2.100', 'B0:25:AA:1C:06:9A', '192.168.2.100', 'amd64', 'Windows 10', '10.0', '2494,2494,2494,2494,2494,2494,2494,2494', 'Intel,Intel,Intel,Intel,Intel,Intel,Intel,Intel', 'Core(TM) i7-4710MQ CPU @ 2.50GHz,Core(TM) i7-4710MQ CPU @ 2.50GHz,Core(TM) i7-4710MQ CPU @ 2.50GHz,Core(TM) i7-4710MQ CPU @ 2.50GHz,Core(TM) i7-4710MQ CPU @ 2.50GHz,Core(TM) i7-4710MQ CPU @ 2.50GHz,Core(TM) i7-4710MQ CPU @ 2.50GHz,Core(TM) i7-4710MQ CPU @ 2.50GHz', '-1,-1,-1,-1,-1,-1,-1,-1', '8079.0390625', '1796', '128', '0', '8', '1.8.0_151', 'F:\\Program Files\\Java\\jdk8\\jre', 'E:\\code\\intellijidea\\lazydsr-web-template', '52.0', null, '2018-05-11 17:54:17', null, '2018-05-11 17:54:17', '0');
INSERT INTO `sys_systeminfo` VALUES ('DVWC6WAADTUAQB3K7CXA2QTVGMV1JRBM', 'root', 'if.founder.com', null, 'eth3', '172.25.60.118', '00:50:56:81:10:27', '172.25.60.118', 'amd64', 'Linux', '4.1.12-37.4.1.el6uek.x86_64', '2397,2397,2397,2397', 'Intel,Intel,Intel,Intel', 'Xeon,Xeon,Xeon,Xeon', '30720,30720,30720,30720', '15790.24609375', '3509.5', '248', '0', '4', '1.8.0_151', '/usr/local/jdk1.8.0_151/jre', '/root', '52.0', null, '2018-05-14 02:41:20', null, '2018-05-14 02:41:20', '0');
INSERT INTO `sys_systeminfo` VALUES ('DWTM483312BRGUKJTQEV9E9EBHBHM2GC', 'Administrator', 'DESKTOP-QEKTKOJ', 'DESKTOP-QEKTKOJ', 'eth6', '192.168.2.100', 'B0:25:AA:1C:06:9A', '192.168.2.100', 'amd64', 'Windows 10', '10.0', '2494,2494,2494,2494,2494,2494,2494,2494', 'Intel,Intel,Intel,Intel,Intel,Intel,Intel,Intel', 'Core(TM) i7-4710MQ CPU @ 2.50GHz,Core(TM) i7-4710MQ CPU @ 2.50GHz,Core(TM) i7-4710MQ CPU @ 2.50GHz,Core(TM) i7-4710MQ CPU @ 2.50GHz,Core(TM) i7-4710MQ CPU @ 2.50GHz,Core(TM) i7-4710MQ CPU @ 2.50GHz,Core(TM) i7-4710MQ CPU @ 2.50GHz,Core(TM) i7-4710MQ CPU @ 2.50GHz', '-1,-1,-1,-1,-1,-1,-1,-1', '8079.0390625', '1796', '128', '0', '8', '1.8.0_151', 'F:\\Program Files\\Java\\jdk8\\jre', 'E:\\code\\intellijidea\\lazydsr-web-template', '52.0', null, '2018-05-16 17:12:28', null, '2018-05-16 17:12:28', '0');
INSERT INTO `sys_systeminfo` VALUES ('FDTJ9GBNXPNVQVBJR23SBT96PNXTNH66', 'Administrator', 'DESKTOP-QEKTKOJ', 'DESKTOP-QEKTKOJ', 'eth6', '192.168.2.100', 'B0:25:AA:1C:06:9A', '192.168.2.100', 'amd64', 'Windows 10', '10.0', '2494,2494,2494,2494,2494,2494,2494,2494', 'Intel,Intel,Intel,Intel,Intel,Intel,Intel,Intel', 'Core(TM) i7-4710MQ CPU @ 2.50GHz,Core(TM) i7-4710MQ CPU @ 2.50GHz,Core(TM) i7-4710MQ CPU @ 2.50GHz,Core(TM) i7-4710MQ CPU @ 2.50GHz,Core(TM) i7-4710MQ CPU @ 2.50GHz,Core(TM) i7-4710MQ CPU @ 2.50GHz,Core(TM) i7-4710MQ CPU @ 2.50GHz,Core(TM) i7-4710MQ CPU @ 2.50GHz', '-1,-1,-1,-1,-1,-1,-1,-1', '8079.0390625', '1796', '128', '0', '8', '1.8.0_151', 'F:\\Program Files\\Java\\jdk8\\jre', 'E:\\code\\intellijidea\\lazydsr-web-template', '52.0', null, '2018-05-16 17:55:44', null, '2018-05-16 17:55:44', '0');
INSERT INTO `sys_systeminfo` VALUES ('GKVXCGQPYBDBSWEKYESABUESQ7WYMMVH', 'lazy', 'lazyMac.local', null, 'en0', '192.168.2.171', '8C:85:90:A8:10:05', '192.168.2.171', 'x86_64', 'Mac OS X', '10.13.4', '2800,2800,2800,2800,2800,2800,2800,2800', 'Intel,Intel,Intel,Intel,Intel,Intel,Intel,Intel', 'MacBookPro14,3,MacBookPro14,3,MacBookPro14,3,MacBookPro14,3,MacBookPro14,3,MacBookPro14,3,MacBookPro14,3,MacBookPro14,3', '256,256,256,256,256,256,256,256', '16384', '3641', '256', '0', '8', '1.8.0_171', '/Library/Java/JavaVirtualMachines/jdk1.8.0_171.jdk/Contents/Home/jre', '/Volumes/data/develop/code/IntellijIdea/lazydsr-web-template', '52.0', null, '2018-05-12 17:20:50', null, '2018-05-12 17:20:50', '0');
INSERT INTO `sys_systeminfo` VALUES ('HXV472ESEEBABDMKAPQSJ6BKB857JAZZ', 'Administrator', 'DESKTOP-QEKTKOJ', 'DESKTOP-QEKTKOJ', 'eth6', '192.168.2.100', 'B0:25:AA:1C:06:9A', '192.168.2.100', 'amd64', 'Windows 10', '10.0', '2494,2494,2494,2494,2494,2494,2494,2494', 'Intel,Intel,Intel,Intel,Intel,Intel,Intel,Intel', 'Core(TM) i7-4710MQ CPU @ 2.50GHz,Core(TM) i7-4710MQ CPU @ 2.50GHz,Core(TM) i7-4710MQ CPU @ 2.50GHz,Core(TM) i7-4710MQ CPU @ 2.50GHz,Core(TM) i7-4710MQ CPU @ 2.50GHz,Core(TM) i7-4710MQ CPU @ 2.50GHz,Core(TM) i7-4710MQ CPU @ 2.50GHz,Core(TM) i7-4710MQ CPU @ 2.50GHz', '-1,-1,-1,-1,-1,-1,-1,-1', '8079.0390625', '1796', '128', '0', '8', '1.8.0_151', 'F:\\Program Files\\Java\\jdk8\\jre', 'E:\\code\\intellijidea\\lazydsr-web-template', '52.0', null, '2018-05-16 16:29:49', null, '2018-05-16 16:29:49', '0');
INSERT INTO `sys_systeminfo` VALUES ('J5UPTQYKZ4Y2DX7JEEP73SNNDNU2NCCZ', 'Administrator', 'DESKTOP-QEKTKOJ', 'DESKTOP-QEKTKOJ', 'eth6', '192.168.2.100', 'B0:25:AA:1C:06:9A', '192.168.2.100', 'amd64', 'Windows 10', '10.0', '2494,2494,2494,2494,2494,2494,2494,2494', 'Intel,Intel,Intel,Intel,Intel,Intel,Intel,Intel', 'Core(TM) i7-4710MQ CPU @ 2.50GHz,Core(TM) i7-4710MQ CPU @ 2.50GHz,Core(TM) i7-4710MQ CPU @ 2.50GHz,Core(TM) i7-4710MQ CPU @ 2.50GHz,Core(TM) i7-4710MQ CPU @ 2.50GHz,Core(TM) i7-4710MQ CPU @ 2.50GHz,Core(TM) i7-4710MQ CPU @ 2.50GHz,Core(TM) i7-4710MQ CPU @ 2.50GHz', '-1,-1,-1,-1,-1,-1,-1,-1', '8079.0390625', '1796', '128', '0', '8', '1.8.0_151', 'F:\\Program Files\\Java\\jdk8\\jre', 'E:\\code\\intellijidea\\lazydsr-web-template', '52.0', null, '2018-05-16 16:13:32', null, '2018-05-16 16:13:32', '0');
INSERT INTO `sys_systeminfo` VALUES ('JEW2JETXCC66SEVKWM3YG121NCETMKY6', 'Administrator', 'DESKTOP-QEKTKOJ', 'DESKTOP-QEKTKOJ', 'eth6', '192.168.2.100', 'B0:25:AA:1C:06:9A', '192.168.2.100', 'amd64', 'Windows 10', '10.0', '2494,2494,2494,2494,2494,2494,2494,2494', 'Intel,Intel,Intel,Intel,Intel,Intel,Intel,Intel', 'Core(TM) i7-4710MQ CPU @ 2.50GHz,Core(TM) i7-4710MQ CPU @ 2.50GHz,Core(TM) i7-4710MQ CPU @ 2.50GHz,Core(TM) i7-4710MQ CPU @ 2.50GHz,Core(TM) i7-4710MQ CPU @ 2.50GHz,Core(TM) i7-4710MQ CPU @ 2.50GHz,Core(TM) i7-4710MQ CPU @ 2.50GHz,Core(TM) i7-4710MQ CPU @ 2.50GHz', '-1,-1,-1,-1,-1,-1,-1,-1', '8079.0390625', '1796', '128', '0', '8', '1.8.0_151', 'F:\\Program Files\\Java\\jdk8\\jre', 'E:\\code\\intellijidea\\lazydsr-web-template', '52.0', null, '2018-05-16 17:40:40', null, '2018-05-16 17:40:40', '0');
INSERT INTO `sys_systeminfo` VALUES ('JNT2YRBWSMVCQXFJKWDTV2KG93E5MX3B', 'Administrator', 'DESKTOP-QEKTKOJ', 'DESKTOP-QEKTKOJ', 'eth6', '192.168.2.100', 'B0:25:AA:1C:06:9A', '192.168.2.100', 'amd64', 'Windows 10', '10.0', '2494,2494,2494,2494,2494,2494,2494,2494', 'Intel,Intel,Intel,Intel,Intel,Intel,Intel,Intel', 'Core(TM) i7-4710MQ CPU @ 2.50GHz,Core(TM) i7-4710MQ CPU @ 2.50GHz,Core(TM) i7-4710MQ CPU @ 2.50GHz,Core(TM) i7-4710MQ CPU @ 2.50GHz,Core(TM) i7-4710MQ CPU @ 2.50GHz,Core(TM) i7-4710MQ CPU @ 2.50GHz,Core(TM) i7-4710MQ CPU @ 2.50GHz,Core(TM) i7-4710MQ CPU @ 2.50GHz', '-1,-1,-1,-1,-1,-1,-1,-1', '8079.0390625', '1796', '128', '0', '8', '1.8.0_151', 'F:\\Program Files\\Java\\jdk8\\jre', 'E:\\code\\intellijidea\\lazydsr-web-template', '52.0', null, '2018-05-16 16:10:23', null, '2018-05-16 16:10:23', '0');
INSERT INTO `sys_systeminfo` VALUES ('K1V2M8BS8E9FEXNKJK2GU9K5USP9NXEP', 'lazy', 'lazydeMBP', null, 'en0', '192.168.2.171', '8C:85:90:A8:10:05', '192.168.2.171', 'x86_64', 'Mac OS X', '10.13.4', '2800,2800,2800,2800,2800,2800,2800,2800', 'Intel,Intel,Intel,Intel,Intel,Intel,Intel,Intel', 'MacBookPro14,3,MacBookPro14,3,MacBookPro14,3,MacBookPro14,3,MacBookPro14,3,MacBookPro14,3,MacBookPro14,3,MacBookPro14,3', '256,256,256,256,256,256,256,256', '16384', '3641', '256', '0', '8', '1.8.0_171', '/Library/Java/JavaVirtualMachines/jdk1.8.0_171.jdk/Contents/Home/jre', '/Volumes/data/develop/code/IntellijIdea/lazydsr-web-template', '52.0', null, '2018-04-23 19:59:45', null, '2018-04-23 19:59:45', '0');
INSERT INTO `sys_systeminfo` VALUES ('KCW67ZTNPYU1GEUKJH5TEVJJE23XNXWQ', 'Administrator', 'DESKTOP-QEKTKOJ', 'DESKTOP-QEKTKOJ', 'eth6', '192.168.2.100', 'B0:25:AA:1C:06:9A', '192.168.2.100', 'amd64', 'Windows 10', '10.0', '2494,2494,2494,2494,2494,2494,2494,2494', 'Intel,Intel,Intel,Intel,Intel,Intel,Intel,Intel', 'Core(TM) i7-4710MQ CPU @ 2.50GHz,Core(TM) i7-4710MQ CPU @ 2.50GHz,Core(TM) i7-4710MQ CPU @ 2.50GHz,Core(TM) i7-4710MQ CPU @ 2.50GHz,Core(TM) i7-4710MQ CPU @ 2.50GHz,Core(TM) i7-4710MQ CPU @ 2.50GHz,Core(TM) i7-4710MQ CPU @ 2.50GHz,Core(TM) i7-4710MQ CPU @ 2.50GHz', '-1,-1,-1,-1,-1,-1,-1,-1', '8079.0390625', '1796', '128', '0', '8', '1.8.0_151', 'F:\\Program Files\\Java\\jdk8\\jre', 'E:\\code\\intellijidea\\lazydsr-web-template', '52.0', null, '2018-05-16 16:13:56', null, '2018-05-16 16:13:56', '0');
INSERT INTO `sys_systeminfo` VALUES ('MKVCC8RQYYBMPYEKFGP1MKC851DYJCDZ', 'root', 'if.founder.com', null, 'eth3', '172.25.60.118', '00:50:56:81:10:27', '172.25.60.118', 'amd64', 'Linux', '4.1.12-37.4.1.el6uek.x86_64', '2397,2397,2397,2397', 'Intel,Intel,Intel,Intel', 'Xeon,Xeon,Xeon,Xeon', '30720,30720,30720,30720', '15790.24609375', '3509.5', '248', '0', '4', '1.8.0_151', '/usr/local/jdk1.8.0_151/jre', '/root', '52.0', null, '2018-05-15 23:30:01', null, '2018-05-15 23:30:01', '0');
INSERT INTO `sys_systeminfo` VALUES ('NQT6XP5VJH6ZSYGJ5TMG39MC9XBRNQJF', 'lazy', 'lazydeMBP', null, 'en0', '192.168.2.171', '8C:85:90:A8:10:05', '192.168.2.171', 'x86_64', 'Mac OS X', '10.13.4', '2800,2800,2800,2800,2800,2800,2800,2800', 'Intel,Intel,Intel,Intel,Intel,Intel,Intel,Intel', 'MacBookPro14,3,MacBookPro14,3,MacBookPro14,3,MacBookPro14,3,MacBookPro14,3,MacBookPro14,3,MacBookPro14,3,MacBookPro14,3', '256,256,256,256,256,256,256,256', '16384', '3641', '256', '0', '8', '1.8.0_171', '/Library/Java/JavaVirtualMachines/jdk1.8.0_171.jdk/Contents/Home/jre', '/Volumes/data/develop/code/IntellijIdea/lazydsr-web-template', '52.0', null, '2018-04-23 21:01:39', null, '2018-04-23 21:01:39', '0');
INSERT INTO `sys_systeminfo` VALUES ('R3VZ4D1XRAG5Q1PK26U2BCUB76S6MP8J', 'Administrator', 'DESKTOP-QEKTKOJ', 'DESKTOP-QEKTKOJ', 'eth6', '192.168.2.100', 'B0:25:AA:1C:06:9A', '192.168.2.100', 'amd64', 'Windows 10', '10.0', '2494,2494,2494,2494,2494,2494,2494,2494', 'Intel,Intel,Intel,Intel,Intel,Intel,Intel,Intel', 'Core(TM) i7-4710MQ CPU @ 2.50GHz,Core(TM) i7-4710MQ CPU @ 2.50GHz,Core(TM) i7-4710MQ CPU @ 2.50GHz,Core(TM) i7-4710MQ CPU @ 2.50GHz,Core(TM) i7-4710MQ CPU @ 2.50GHz,Core(TM) i7-4710MQ CPU @ 2.50GHz,Core(TM) i7-4710MQ CPU @ 2.50GHz,Core(TM) i7-4710MQ CPU @ 2.50GHz', '-1,-1,-1,-1,-1,-1,-1,-1', '8079.0390625', '1796', '128', '0', '8', '1.8.0_151', 'F:\\Program Files\\Java\\jdk8\\jre', 'E:\\code\\intellijidea\\lazydsr-web-template', '52.0', null, '2018-05-16 17:56:27', null, '2018-05-16 17:56:27', '0');
INSERT INTO `sys_systeminfo` VALUES ('SCVTK6XZFRQDQHBKFG26DHXGMFVJKCDP', 'Administrator', 'DESKTOP-QEKTKOJ', 'DESKTOP-QEKTKOJ', 'eth6', '192.168.2.100', 'B0:25:AA:1C:06:9A', '192.168.2.100', 'amd64', 'Windows 10', '10.0', '2494,2494,2494,2494,2494,2494,2494,2494', 'Intel,Intel,Intel,Intel,Intel,Intel,Intel,Intel', 'Core(TM) i7-4710MQ CPU @ 2.50GHz,Core(TM) i7-4710MQ CPU @ 2.50GHz,Core(TM) i7-4710MQ CPU @ 2.50GHz,Core(TM) i7-4710MQ CPU @ 2.50GHz,Core(TM) i7-4710MQ CPU @ 2.50GHz,Core(TM) i7-4710MQ CPU @ 2.50GHz,Core(TM) i7-4710MQ CPU @ 2.50GHz,Core(TM) i7-4710MQ CPU @ 2.50GHz', '-1,-1,-1,-1,-1,-1,-1,-1', '8079.0390625', '1796', '128', '0', '8', '1.8.0_151', 'F:\\Program Files\\Java\\jdk8\\jre', 'E:\\code\\intellijidea\\lazydsr-web-template', '52.0', null, '2018-05-16 16:26:49', null, '2018-05-16 16:26:49', '0');
INSERT INTO `sys_systeminfo` VALUES ('TFVPY4D278S7C2CK6G3B91FDVF3YKRW6', 'Administrator', 'DESKTOP-QEKTKOJ', 'DESKTOP-QEKTKOJ', 'eth6', '192.168.2.100', 'B0:25:AA:1C:06:9A', '192.168.2.100', 'amd64', 'Windows 10', '10.0', '2494,2494,2494,2494,2494,2494,2494,2494', 'Intel,Intel,Intel,Intel,Intel,Intel,Intel,Intel', 'Core(TM) i7-4710MQ CPU @ 2.50GHz,Core(TM) i7-4710MQ CPU @ 2.50GHz,Core(TM) i7-4710MQ CPU @ 2.50GHz,Core(TM) i7-4710MQ CPU @ 2.50GHz,Core(TM) i7-4710MQ CPU @ 2.50GHz,Core(TM) i7-4710MQ CPU @ 2.50GHz,Core(TM) i7-4710MQ CPU @ 2.50GHz,Core(TM) i7-4710MQ CPU @ 2.50GHz', '-1,-1,-1,-1,-1,-1,-1,-1', '8079.0390625', '1796', '128', '0', '8', '1.8.0_151', 'F:\\Program Files\\Java\\jdk8\\jre', 'E:\\code\\intellijidea\\lazydsr-web-template', '52.0', null, '2018-05-16 17:39:18', null, '2018-05-16 17:39:18', '0');
INSERT INTO `sys_systeminfo` VALUES ('VKTMGG2EX78VB3EJ89AXQAN9YQZ9K9SA', 'root', 'if.founder.com', null, 'eth3', '172.25.60.118', '00:50:56:81:10:27', '172.25.60.118', 'amd64', 'Linux', '4.1.12-37.4.1.el6uek.x86_64', '2397,2397,2397,2397', 'Intel,Intel,Intel,Intel', 'Xeon,Xeon,Xeon,Xeon', '30720,30720,30720,30720', '15790.24609375', '3509.5', '248', '0', '4', '1.8.0_151', '/usr/local/jdk1.8.0_151/jre', '/root', '52.0', null, '2018-05-16 17:58:17', null, '2018-05-16 17:58:17', '0');
INSERT INTO `sys_systeminfo` VALUES ('X4TZQN6VVDPWBMQJDDT6SCAD1BVNMUBJ', 'root', 'if.founder.com', null, 'eth3', '172.25.60.118', '00:50:56:81:10:27', '172.25.60.118', 'amd64', 'Linux', '4.1.12-37.4.1.el6uek.x86_64', '2397,2397,2397,2397', 'Intel,Intel,Intel,Intel', 'Xeon,Xeon,Xeon,Xeon', '30720,30720,30720,30720', '15790.24609375', '3509.5', '248', '0', '4', '1.8.0_151', '/usr/local/jdk1.8.0_151/jre', '/root', '52.0', null, '2018-05-13 21:28:20', null, '2018-05-13 21:28:20', '0');
INSERT INTO `sys_systeminfo` VALUES ('YMUMUFQ6AFY2AMYJFAY4YN6WFFZKJCTM', 'Administrator', 'DESKTOP-QEKTKOJ', 'DESKTOP-QEKTKOJ', 'eth6', '192.168.2.100', 'B0:25:AA:1C:06:9A', '192.168.2.100', 'amd64', 'Windows 10', '10.0', '2494,2494,2494,2494,2494,2494,2494,2494', 'Intel,Intel,Intel,Intel,Intel,Intel,Intel,Intel', 'Core(TM) i7-4710MQ CPU @ 2.50GHz,Core(TM) i7-4710MQ CPU @ 2.50GHz,Core(TM) i7-4710MQ CPU @ 2.50GHz,Core(TM) i7-4710MQ CPU @ 2.50GHz,Core(TM) i7-4710MQ CPU @ 2.50GHz,Core(TM) i7-4710MQ CPU @ 2.50GHz,Core(TM) i7-4710MQ CPU @ 2.50GHz,Core(TM) i7-4710MQ CPU @ 2.50GHz', '-1,-1,-1,-1,-1,-1,-1,-1', '8079.0390625', '1796', '128', '0', '8', '1.8.0_151', 'F:\\Program Files\\Java\\jdk8\\jre', 'E:\\code\\intellijidea\\lazydsr-web-template', '52.0', null, '2018-05-14 09:40:51', null, '2018-05-14 09:40:51', '0');
INSERT INTO `sys_systeminfo` VALUES ('YSUR3WJRPJFSM41JQS1E5WSVB9YEJZ1N', 'lazy', 'lazydeMBP', null, 'en0', '192.168.2.171', '8C:85:90:A8:10:05', '192.168.2.171', 'x86_64', 'Mac OS X', '10.13.4', '2800,2800,2800,2800,2800,2800,2800,2800', 'Intel,Intel,Intel,Intel,Intel,Intel,Intel,Intel', 'MacBookPro14,3,MacBookPro14,3,MacBookPro14,3,MacBookPro14,3,MacBookPro14,3,MacBookPro14,3,MacBookPro14,3,MacBookPro14,3', '256,256,256,256,256,256,256,256', '16384', '3641', '256', '0', '8', '1.8.0_171', '/Library/Java/JavaVirtualMachines/jdk1.8.0_171.jdk/Contents/Home/jre', '/Volumes/data/develop/code/IntellijIdea/lazydsr-web-template', '52.0', null, '2018-04-22 21:56:15', null, '2018-04-22 21:56:15', '0');
INSERT INTO `sys_systeminfo` VALUES ('ZRUA6QNZ5NB6MN1JME6QBBX2BE9AKFC8', 'Administrator', 'DESKTOP-QEKTKOJ', 'DESKTOP-QEKTKOJ', 'eth6', '192.168.2.100', 'B0:25:AA:1C:06:9A', '192.168.2.100', 'amd64', 'Windows 10', '10.0', '2494,2494,2494,2494,2494,2494,2494,2494', 'Intel,Intel,Intel,Intel,Intel,Intel,Intel,Intel', 'Core(TM) i7-4710MQ CPU @ 2.50GHz,Core(TM) i7-4710MQ CPU @ 2.50GHz,Core(TM) i7-4710MQ CPU @ 2.50GHz,Core(TM) i7-4710MQ CPU @ 2.50GHz,Core(TM) i7-4710MQ CPU @ 2.50GHz,Core(TM) i7-4710MQ CPU @ 2.50GHz,Core(TM) i7-4710MQ CPU @ 2.50GHz,Core(TM) i7-4710MQ CPU @ 2.50GHz', '-1,-1,-1,-1,-1,-1,-1,-1', '8079.0390625', '1796', '128', '0', '8', '1.8.0_151', 'F:\\Program Files\\Java\\jdk8\\jre', 'E:\\code\\intellijidea\\lazydsr-web-template', '52.0', null, '2018-05-16 16:14:45', null, '2018-05-16 16:14:45', '0');

-- ----------------------------
-- Table structure for sys_user
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user` (
  `id` varchar(32) NOT NULL,
  `name` varchar(100) NOT NULL,
  `username` varchar(255) DEFAULT NULL,
  `password` varchar(100) DEFAULT NULL,
  `workcode` varchar(255) DEFAULT NULL,
  `sum_password_wrong` int(11) DEFAULT NULL,
  `password_lock` int(11) DEFAULT NULL,
  `old_password1` varchar(255) DEFAULT NULL,
  `old_password2` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `mobile` varchar(255) DEFAULT NULL,
  `telphone` varchar(255) DEFAULT NULL,
  `organization` varchar(255) DEFAULT NULL,
  `company` varchar(255) DEFAULT NULL,
  `department` varchar(255) DEFAULT NULL,
  `id_card` varchar(255) DEFAULT NULL,
  `current_login_date` varchar(19) DEFAULT NULL,
  `last_login_date` varchar(19) DEFAULT NULL,
  `order_num` double DEFAULT NULL,
  `account_type` int(11) DEFAULT NULL,
  `creator` varchar(32) DEFAULT NULL,
  `create_date` varchar(19) DEFAULT NULL,
  `modifier` varchar(32) DEFAULT NULL,
  `modify_date` varchar(19) DEFAULT NULL,
  `status` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of sys_user
-- ----------------------------
INSERT INTO `sys_user` VALUES ('DKT6B56QC6VVBUEJUV48PBU3PRD1JJKQ', '管理员', 'admin', '21232F297A57A5A743894A0E4A801FC3', null, '0', '1', null, null, null, '1111', null, null, null, null, null, '2018-05-16 17:58:26', '2018-05-15 23:32:06', '1000', '0', null, '2018-03-26 13:49:55', null, '2018-03-26 13:49:55', '0');

-- ----------------------------
-- Table structure for sys_user_login_record
-- ----------------------------
DROP TABLE IF EXISTS `sys_user_login_record`;
CREATE TABLE `sys_user_login_record` (
  `id` varchar(32) NOT NULL,
  `user_id` varchar(255) DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL,
  `ip` varchar(255) DEFAULT NULL,
  `date` varchar(19) DEFAULT NULL,
  `type` int(11) NOT NULL,
  `login_status` int(11) NOT NULL,
  `creator` varchar(32) DEFAULT NULL,
  `create_date` varchar(19) DEFAULT NULL,
  `modifier` varchar(32) DEFAULT NULL,
  `modify_date` varchar(19) DEFAULT NULL,
  `status` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of sys_user_login_record
-- ----------------------------
INSERT INTO `sys_user_login_record` VALUES ('11UVKPFDEC88N55JAMS4NY4DTJKKNAYH', 'DKT6B56QC6VVBUEJUV48PBU3PRD1JJKQ', 'admin', '127.0.0.1', '2018-03-31 00:49:44', '0', '1', null, '2018-03-31 00:49:44', null, '2018-03-31 00:49:44', '0');
INSERT INTO `sys_user_login_record` VALUES ('18WJ6RHHCPGVJN9K4YWN95T53J5YM743', 'DKT6B56QC6VVBUEJUV48PBU3PRD1JJKQ', 'admin', '127.0.0.1', '2018-03-31 01:11:22', '0', '1', null, '2018-03-31 01:11:22', null, '2018-03-31 01:11:22', '0');
INSERT INTO `sys_user_login_record` VALUES ('1UWXFNZ3Y8T8H52K9B7RFZ4C92Z7K9TR', 'DKT6B56QC6VVBUEJUV48PBU3PRD1JJKQ', 'admin', '127.0.0.1', '2018-03-27 18:12:11', '0', '0', null, '2018-03-27 18:12:11', null, '2018-03-27 18:12:11', '0');
INSERT INTO `sys_user_login_record` VALUES ('1ZU6529T28ANRN5JX2FJYP4HCYF7MM6C', 'DKT6B56QC6VVBUEJUV48PBU3PRD1JJKQ', 'admin', '127.0.0.1', '2018-03-26 14:50:25', '0', '1', null, '2018-03-26 14:50:25', null, '2018-03-26 14:50:25', '0');
INSERT INTO `sys_user_login_record` VALUES ('24T8RYBNKH28PPQJKAB7YUEHNCPXJETT', 'DKT6B56QC6VVBUEJUV48PBU3PRD1JJKQ', 'admin', '127.0.0.1', '2018-04-22 21:22:54', '0', '0', null, '2018-04-22 21:22:54', null, '2018-04-22 21:22:54', '0');
INSERT INTO `sys_user_login_record` VALUES ('25VGQ9AREH9VF6QKS3EEE35Z8KGDM1PC', 'DKT6B56QC6VVBUEJUV48PBU3PRD1JJKQ', 'admin', '127.0.0.1', '2018-03-26 14:50:26', '0', '1', null, '2018-03-26 14:50:26', null, '2018-03-26 14:50:26', '0');
INSERT INTO `sys_user_login_record` VALUES ('28UZKGZYERQWFP9JMZUQTC8V4GQTKF52', 'DKT6B56QC6VVBUEJUV48PBU3PRD1JJKQ', 'admin', '127.0.0.1', '2018-03-26 15:15:22', '0', '1', null, '2018-03-26 15:15:22', null, '2018-03-26 15:15:22', '0');
INSERT INTO `sys_user_login_record` VALUES ('28VPVCAKVUYSRPSK2VH7YABEGBB7MP3W', 'DKT6B56QC6VVBUEJUV48PBU3PRD1JJKQ', 'admin', '127.0.0.1', '2018-04-01 20:46:51', '0', '0', null, '2018-04-01 20:46:51', null, '2018-04-01 20:46:51', '0');
INSERT INTO `sys_user_login_record` VALUES ('2PWCXGQTQNF7FPZKV7WSKPT19Y47M383', 'DKT6B56QC6VVBUEJUV48PBU3PRD1JJKQ', 'admin', '59.108.152.242', '2018-05-13 21:28:58', '0', '0', null, '2018-05-13 21:28:58', null, '2018-05-13 21:28:58', '0');
INSERT INTO `sys_user_login_record` VALUES ('2TVVZDHVS31BKPJKDNNR4KMVA6M1KUYF', 'DKT6B56QC6VVBUEJUV48PBU3PRD1JJKQ', 'admin', '127.0.0.1', '2018-03-29 00:12:51', '0', '0', null, '2018-03-29 00:12:51', null, '2018-03-29 00:12:51', '0');
INSERT INTO `sys_user_login_record` VALUES ('3HV8VP6RBQVNG6DK6G7WCDHCSFU5NRW8', 'DKT6B56QC6VVBUEJUV48PBU3PRD1JJKQ', 'admin', '127.0.0.1', '2018-03-30 22:04:20', '0', '0', null, '2018-03-30 22:04:53', null, '2018-03-30 22:04:53', '0');
INSERT INTO `sys_user_login_record` VALUES ('3KV233RR67THC6EKCYQW8N61T5MEJU4Z', 'DKT6B56QC6VVBUEJUV48PBU3PRD1JJKQ', 'admin', '127.0.0.1', '2018-05-11 17:02:05', '0', '0', null, '2018-05-11 17:02:05', null, '2018-05-11 17:02:05', '0');
INSERT INTO `sys_user_login_record` VALUES ('3TT8TCG4MSQQMPJJJ6TZF7SUVBN2NERJ', 'DKT6B56QC6VVBUEJUV48PBU3PRD1JJKQ', 'admin', '127.0.0.1', '2018-04-01 00:34:43', '0', '0', null, '2018-04-01 00:34:43', null, '2018-04-01 00:34:43', '0');
INSERT INTO `sys_user_login_record` VALUES ('3WTP4SWEHC5EJ6KJXGZZCEUQEJ6JNMDN', 'DKT6B56QC6VVBUEJUV48PBU3PRD1JJKQ', 'admin', '127.0.0.1', '2018-03-27 13:42:34', '0', '0', null, '2018-03-27 13:42:34', null, '2018-03-27 13:42:34', '0');
INSERT INTO `sys_user_login_record` VALUES ('3YWZB2147CTFM64K2HBJUWDZUGNXK6WA', 'DKT6B56QC6VVBUEJUV48PBU3PRD1JJKQ', 'admin', '127.0.0.1', '2018-03-27 13:45:16', '0', '0', null, '2018-03-27 13:45:16', null, '2018-03-27 13:45:16', '0');
INSERT INTO `sys_user_login_record` VALUES ('47U28965VBBAH78JHSN6UK3E982CMW1F', 'DKT6B56QC6VVBUEJUV48PBU3PRD1JJKQ', 'admin', '127.0.0.1', '2018-03-31 00:58:41', '0', '1', null, '2018-03-31 00:58:41', null, '2018-03-31 00:58:41', '0');
INSERT INTO `sys_user_login_record` VALUES ('4ATXVDTDN8BCJQAJUC1ZG8W7NAT1NJUN', 'DKT6B56QC6VVBUEJUV48PBU3PRD1JJKQ', 'admin', '127.0.0.1', '2018-03-28 22:33:52', '0', '0', null, '2018-03-28 22:33:52', null, '2018-03-28 22:33:52', '0');
INSERT INTO `sys_user_login_record` VALUES ('4EVAC3974G4WMQCKHE11MAF8J9HZMDV5', 'DKT6B56QC6VVBUEJUV48PBU3PRD1JJKQ', 'admin', '127.0.0.1', '2018-04-22 21:04:45', '0', '0', null, '2018-04-22 21:04:45', null, '2018-04-22 21:04:45', '0');
INSERT INTO `sys_user_login_record` VALUES ('4FUPH34GN5Z1D7VJKQ5CQ9W2915FMXZQ', 'DKT6B56QC6VVBUEJUV48PBU3PRD1JJKQ', 'admin', '127.0.0.1', '2018-03-27 13:34:49', '0', '0', null, '2018-03-27 13:34:49', null, '2018-03-27 13:34:49', '0');
INSERT INTO `sys_user_login_record` VALUES ('4MWEVJXUT45NPQYKXTDNHBWERTEEJM2U', 'DKT6B56QC6VVBUEJUV48PBU3PRD1JJKQ', 'admin', '127.0.0.1', '2018-03-31 00:34:05', '0', '1', null, '2018-03-31 00:34:05', null, '2018-03-31 00:34:05', '0');
INSERT INTO `sys_user_login_record` VALUES ('4VWVTS9CUFAKEQ3KR79MNFSEQ737J18S', 'DKT6B56QC6VVBUEJUV48PBU3PRD1JJKQ', 'admin', '127.0.0.1', '2018-03-31 00:51:00', '0', '0', null, '2018-03-31 00:51:00', null, '2018-03-31 00:51:00', '0');
INSERT INTO `sys_user_login_record` VALUES ('52TAHNPFF94AQQPJ6GGE27XJGP61JRDD', 'DKT6B56QC6VVBUEJUV48PBU3PRD1JJKQ', 'admin', '127.0.0.1', '2018-03-31 00:38:44', '0', '1', null, '2018-03-31 00:38:44', null, '2018-03-31 00:38:44', '0');
INSERT INTO `sys_user_login_record` VALUES ('56UV6F9MC7MFHQ8JSJTVGCVPCGP5JHEJ', 'DKT6B56QC6VVBUEJUV48PBU3PRD1JJKQ', 'admin', '127.0.0.1', '2018-04-01 20:47:58', '0', '0', null, '2018-04-01 20:47:58', null, '2018-04-01 20:47:58', '0');
INSERT INTO `sys_user_login_record` VALUES ('6AW6DYJSQPMSBRTKUXZX2G7JT14ZKJMN', 'DKT6B56QC6VVBUEJUV48PBU3PRD1JJKQ', 'admin', '127.0.0.1', '2018-03-31 02:12:45', '0', '0', null, '2018-03-31 02:12:45', null, '2018-03-31 02:12:45', '0');
INSERT INTO `sys_user_login_record` VALUES ('6QVPFCM2RFP6D8GK99DTPS59KCGVK99B', 'DKT6B56QC6VVBUEJUV48PBU3PRD1JJKQ', 'admin', '127.0.0.1', '2018-03-31 00:42:00', '0', '0', null, '2018-03-31 00:42:00', null, '2018-03-31 00:42:00', '0');
INSERT INTO `sys_user_login_record` VALUES ('7RUAX88KTRAWRR1J7BKE96H3329HK8TE', 'DKT6B56QC6VVBUEJUV48PBU3PRD1JJKQ', 'admin', '127.0.0.1', '2018-05-14 09:17:33', '0', '0', null, '2018-05-14 09:17:33', null, '2018-05-14 09:17:33', '0');
INSERT INTO `sys_user_login_record` VALUES ('7TUZHGG43TASRR2JN2U2PY9XC5MWNF6J', 'DKT6B56QC6VVBUEJUV48PBU3PRD1JJKQ', 'admin', '127.0.0.1', '2018-03-29 00:06:54', '0', '0', null, '2018-03-29 00:06:54', null, '2018-03-29 00:06:54', '0');
INSERT INTO `sys_user_login_record` VALUES ('7XWXNHU2MCK3NR4KHNETXCDAKRJPMWFC', 'DKT6B56QC6VVBUEJUV48PBU3PRD1JJKQ', 'admin', '127.0.0.1', '2018-04-15 15:52:44', '0', '0', null, '2018-04-15 15:52:44', null, '2018-04-15 15:52:44', '0');
INSERT INTO `sys_user_login_record` VALUES ('89VT528CHVCHK9SKC5XQR3N2JPDCJUQ4', 'DKT6B56QC6VVBUEJUV48PBU3PRD1JJKQ', 'admin', '127.0.0.1', '2018-03-31 01:03:04', '0', '1', null, '2018-03-31 01:03:04', null, '2018-03-31 01:03:04', '0');
INSERT INTO `sys_user_login_record` VALUES ('8RVXDSWZPZHYASHK2CMS4UH9CNVQNPBY', 'DKT6B56QC6VVBUEJUV48PBU3PRD1JJKQ', 'admin', '127.0.0.1', '2018-03-31 00:36:44', '0', '0', null, '2018-03-31 00:36:44', null, '2018-03-31 00:36:44', '0');
INSERT INTO `sys_user_login_record` VALUES ('8TVAXGSSB2DQRSJKYR2DRGUPBZJKKMH6', 'DKT6B56QC6VVBUEJUV48PBU3PRD1JJKQ', 'admin', '127.0.0.1', '2018-03-31 00:01:25', '0', '0', null, '2018-03-31 00:01:25', null, '2018-03-31 00:01:25', '0');
INSERT INTO `sys_user_login_record` VALUES ('9ETCC2USRGM6ASCJR78V5AZW1MD8K1RS', 'DKT6B56QC6VVBUEJUV48PBU3PRD1JJKQ', 'admin', '127.0.0.1', '2018-03-31 01:03:57', '0', '1', null, '2018-03-31 01:03:57', null, '2018-03-31 01:03:57', '0');
INSERT INTO `sys_user_login_record` VALUES ('9RU6VPKKA6MAQS1JH14D5MEMUDDKJWN7', 'DKT6B56QC6VVBUEJUV48PBU3PRD1JJKQ', 'admin', '127.0.0.1', '2018-04-01 00:47:08', '0', '0', null, '2018-04-01 00:47:08', null, '2018-04-01 00:47:08', '0');
INSERT INTO `sys_user_login_record` VALUES ('A2URUDGKJA5JBA6JPS9NUYKNGMJFNZ19', 'DKT6B56QC6VVBUEJUV48PBU3PRD1JJKQ', 'admin', '127.0.0.1', '2018-04-01 16:34:44', '0', '0', null, '2018-04-01 16:34:44', null, '2018-04-01 16:34:44', '0');
INSERT INTO `sys_user_login_record` VALUES ('A8U2268BS8N9PA9JQKEPFK33UDNBNZEC', 'DKT6B56QC6VVBUEJUV48PBU3PRD1JJKQ', 'admin', '127.0.0.1', '2018-03-31 00:57:06', '0', '0', null, '2018-03-31 00:57:06', null, '2018-03-31 00:57:06', '0');
INSERT INTO `sys_user_login_record` VALUES ('AFWEAMFB9T7AJTVK29GSPGYTHPVUM6SW', 'DKT6B56QC6VVBUEJUV48PBU3PRD1JJKQ', 'admin', '127.0.0.1', '2018-03-31 00:53:23', '0', '1', null, '2018-03-31 00:53:23', null, '2018-03-31 00:53:23', '0');
INSERT INTO `sys_user_login_record` VALUES ('AGWV5KE7JJFERAWKW2U52K1ZB7RQMK62', 'DKT6B56QC6VVBUEJUV48PBU3PRD1JJKQ', 'admin', '127.0.0.1', '2018-03-26 15:06:38', '0', '1', null, '2018-03-26 15:06:38', null, '2018-03-26 15:06:38', '0');
INSERT INTO `sys_user_login_record` VALUES ('AKVJGAZNJUTXFTEK4VFNBPET4XXBJQ3V', 'DKT6B56QC6VVBUEJUV48PBU3PRD1JJKQ', 'admin', '127.0.0.1', '2018-03-31 01:03:05', '0', '0', null, '2018-03-31 01:03:05', null, '2018-03-31 01:03:05', '0');
INSERT INTO `sys_user_login_record` VALUES ('AYT8ZABV6E7XNTMJMVY441PNF3T3MF3M', 'DKT6B56QC6VVBUEJUV48PBU3PRD1JJKQ', 'admin', '127.0.0.1', '2018-04-01 23:20:26', '0', '0', null, '2018-04-01 23:20:26', null, '2018-04-01 23:20:26', '0');
INSERT INTO `sys_user_login_record` VALUES ('B3V45MQZV2W7ATPK6KTAWBPFFM6VM8EJ', 'DKT6B56QC6VVBUEJUV48PBU3PRD1JJKQ', 'admin', '127.0.0.1', '2018-04-15 15:46:16', '0', '0', null, '2018-04-15 15:46:16', null, '2018-04-15 15:46:16', '0');
INSERT INTO `sys_user_login_record` VALUES ('BDURVNYCEXRYJTUJ5UT9MXXSP6UBM7J2', 'DKT6B56QC6VVBUEJUV48PBU3PRD1JJKQ', 'admin', '127.0.0.1', '2018-03-31 01:13:46', '0', '0', null, '2018-03-31 01:13:46', null, '2018-03-31 01:13:46', '0');
INSERT INTO `sys_user_login_record` VALUES ('BHVVESA7MZUKETDKJXU21QXX7HGANE4J', 'DKT6B56QC6VVBUEJUV48PBU3PRD1JJKQ', 'admin', '127.0.0.1', '2018-03-31 00:06:41', '0', '0', null, '2018-03-31 00:06:41', null, '2018-03-31 00:06:41', '0');
INSERT INTO `sys_user_login_record` VALUES ('BQU6GGZUWH86BTZJWABF1G848JMHJKTT', 'DKT6B56QC6VVBUEJUV48PBU3PRD1JJKQ', 'admin', '127.0.0.1', '2018-03-31 00:38:41', '0', '1', null, '2018-03-31 00:38:41', null, '2018-03-31 00:38:41', '0');
INSERT INTO `sys_user_login_record` VALUES ('BVWMCX35JB31MA3KERDGPN5MZ8YSMC1B', 'DKT6B56QC6VVBUEJUV48PBU3PRD1JJKQ', 'admin', '127.0.0.1', '2018-04-15 15:46:52', '0', '0', null, '2018-04-15 15:46:52', null, '2018-04-15 15:46:52', '0');
INSERT INTO `sys_user_login_record` VALUES ('CZTZJYXFE2Z9BBNJEJ71DUGZ6GY8JCX8', 'DKT6B56QC6VVBUEJUV48PBU3PRD1JJKQ', 'admin', '127.0.0.1', '2018-03-31 00:57:02', '0', '1', null, '2018-03-31 00:57:02', null, '2018-03-31 00:57:02', '0');
INSERT INTO `sys_user_login_record` VALUES ('DBUVDN2EB67SDUTJH8G6GG8WQUKNKDSD', 'DKT6B56QC6VVBUEJUV48PBU3PRD1JJKQ', 'admin', '127.0.0.1', '2018-03-28 23:47:48', '0', '0', null, '2018-03-28 23:47:48', null, '2018-03-28 23:47:48', '0');
INSERT INTO `sys_user_login_record` VALUES ('DKVVTE1UMQ2ZJUEK355P6YQPDQ9AN67Q', 'DKT6B56QC6VVBUEJUV48PBU3PRD1JJKQ', 'admin', '127.0.0.1', '2018-03-26 15:17:52', '0', '1', null, '2018-03-26 15:17:52', null, '2018-03-26 15:17:52', '0');
INSERT INTO `sys_user_login_record` VALUES ('DWU6BF9589WNEU3J65FWJ7RJBZYBM87V', 'DKT6B56QC6VVBUEJUV48PBU3PRD1JJKQ', 'admin', '127.0.0.1', '2018-03-26 15:01:14', '0', '1', null, '2018-03-26 15:01:14', null, '2018-03-26 15:01:14', '0');
INSERT INTO `sys_user_login_record` VALUES ('ECV83D954ARBRCBKQZSCQ3GJKPMUJG5H', 'DKT6B56QC6VVBUEJUV48PBU3PRD1JJKQ', 'admin', '127.0.0.1', '2018-03-28 23:05:25', '0', '0', null, '2018-03-28 23:05:26', null, '2018-03-28 23:05:26', '0');
INSERT INTO `sys_user_login_record` VALUES ('ESWPAS9SHWA5QV1KVQH93JBJV6RSK3ZW', 'DKT6B56QC6VVBUEJUV48PBU3PRD1JJKQ', 'admin', '127.0.0.1', '2018-04-14 11:42:44', '0', '0', null, '2018-04-14 11:42:44', null, '2018-04-14 11:42:44', '0');
INSERT INTO `sys_user_login_record` VALUES ('EVT6UTK4S3QEGCKJ7YD4W2XCUWV2N84B', 'DKT6B56QC6VVBUEJUV48PBU3PRD1JJKQ', 'admin', '127.0.0.1', '2018-03-31 00:34:02', '0', '1', null, '2018-03-31 00:34:02', null, '2018-03-31 00:34:02', '0');
INSERT INTO `sys_user_login_record` VALUES ('F3URVW5NYZAERV6J3BMXC86XT3QJJ6AF', 'DKT6B56QC6VVBUEJUV48PBU3PRD1JJKQ', 'admin', '127.0.0.1', '2018-04-02 22:08:16', '0', '0', null, '2018-04-02 22:08:16', null, '2018-04-02 22:08:16', '0');
INSERT INTO `sys_user_login_record` VALUES ('F8TJ4U5Q1AGAFCSJ529PGW2F6X49JQ6S', 'DKT6B56QC6VVBUEJUV48PBU3PRD1JJKQ', 'admin', '127.0.0.1', '2018-03-27 18:07:34', '0', '0', null, '2018-03-27 18:07:34', null, '2018-03-27 18:07:34', '0');
INSERT INTO `sys_user_login_record` VALUES ('FCVXETCE9726JCBKP6AV6KWZ18GKNGRA', 'DKT6B56QC6VVBUEJUV48PBU3PRD1JJKQ', 'admin', '127.0.0.1', '2018-04-22 21:57:37', '0', '0', null, '2018-04-22 21:57:37', null, '2018-04-22 21:57:37', '0');
INSERT INTO `sys_user_login_record` VALUES ('FDVVSXUYAYQAEVBK7RQCYM2NZR8TKR1G', 'DKT6B56QC6VVBUEJUV48PBU3PRD1JJKQ', 'admin', '127.0.0.1', '2018-03-31 01:03:58', '0', '0', null, '2018-03-31 01:03:58', null, '2018-03-31 01:03:58', '0');
INSERT INTO `sys_user_login_record` VALUES ('FRWEZ9DPANZ3GC1KMBMUEU2CVJD3NYAY', 'DKT6B56QC6VVBUEJUV48PBU3PRD1JJKQ', 'admin', '127.0.0.1', '2018-04-23 21:51:26', '0', '0', null, '2018-04-23 21:51:26', null, '2018-04-23 21:51:26', '0');
INSERT INTO `sys_user_login_record` VALUES ('FZUTKWZDDFNWGC5JA7ZKCJ3ZQAR3KTR5', 'DKT6B56QC6VVBUEJUV48PBU3PRD1JJKQ', 'admin', '127.0.0.1', '2018-04-15 15:40:10', '0', '0', null, '2018-04-15 15:40:10', null, '2018-04-15 15:40:10', '0');
INSERT INTO `sys_user_login_record` VALUES ('G3TPY9NZZRH1EWPJD6GP284A21TBMBRD', 'DKT6B56QC6VVBUEJUV48PBU3PRD1JJKQ', 'admin', '127.0.0.1', '2018-03-31 01:11:58', '0', '1', null, '2018-03-31 01:11:58', null, '2018-03-31 01:11:58', '0');
INSERT INTO `sys_user_login_record` VALUES ('G6WJ3K86D3C9AD8KNPSVJQCW5RPWJFZH', 'DKT6B56QC6VVBUEJUV48PBU3PRD1JJKQ', 'admin', '127.0.0.1', '2018-04-15 15:49:34', '0', '0', null, '2018-04-15 15:49:34', null, '2018-04-15 15:49:34', '0');
INSERT INTO `sys_user_login_record` VALUES ('G8UPQH7RNU17HD9J58T8NQUWRKUGMQSJ', 'DKT6B56QC6VVBUEJUV48PBU3PRD1JJKQ', 'admin', '127.0.0.1', '2018-03-31 00:50:56', '0', '1', null, '2018-03-31 00:50:56', null, '2018-03-31 00:50:56', '0');
INSERT INTO `sys_user_login_record` VALUES ('GXVTR3QGYDMEPDMKQUCPFW5RTW6PNZJB', 'DKT6B56QC6VVBUEJUV48PBU3PRD1JJKQ', 'admin', '127.0.0.1', '2018-03-26 15:14:58', '0', '1', null, '2018-03-26 15:14:58', null, '2018-03-26 15:14:58', '0');
INSERT INTO `sys_user_login_record` VALUES ('H2WXB6NHNK8HMD6KTTTV437HHPB4KJJJ', 'DKT6B56QC6VVBUEJUV48PBU3PRD1JJKQ', 'admin', '127.0.0.1', '2018-03-31 00:49:50', '0', '0', null, '2018-03-31 00:49:50', null, '2018-03-31 00:49:50', '0');
INSERT INTO `sys_user_login_record` VALUES ('HATRC1QYEQ4UDDAJN18222AE89BVMYNS', 'DKT6B56QC6VVBUEJUV48PBU3PRD1JJKQ', 'admin', '127.0.0.1', '2018-03-27 14:25:35', '0', '0', null, '2018-03-27 14:25:35', null, '2018-03-27 14:25:35', '0');
INSERT INTO `sys_user_login_record` VALUES ('HBWCS74FS5FKNWTKDBVZ8QYHTUBEKUAK', 'DKT6B56QC6VVBUEJUV48PBU3PRD1JJKQ', 'admin', '127.0.0.1', '2018-03-31 00:53:28', '0', '0', null, '2018-03-31 00:53:28', null, '2018-03-31 00:53:28', '0');
INSERT INTO `sys_user_login_record` VALUES ('HCTJ5KVBN4QHEDBJ4JH5UWEZ5Q9HJQXW', 'DKT6B56QC6VVBUEJUV48PBU3PRD1JJKQ', 'admin', '127.0.0.1', '2018-03-26 14:50:22', '0', '1', null, '2018-03-26 14:50:22', null, '2018-03-26 14:50:22', '0');
INSERT INTO `sys_user_login_record` VALUES ('HMVME4D9A5MHJDFK2KKX5Y5Z1RKCK6XE', 'DKT6B56QC6VVBUEJUV48PBU3PRD1JJKQ', 'admin', '127.0.0.1', '2018-04-01 18:37:57', '0', '0', null, '2018-04-01 18:37:57', null, '2018-04-01 18:37:57', '0');
INSERT INTO `sys_user_login_record` VALUES ('HUVXWXNDCWMCNWJKMWXW5MVRGWFDJYK4', 'DKT6B56QC6VVBUEJUV48PBU3PRD1JJKQ', 'admin', '127.0.0.1', '2018-03-27 18:17:04', '0', '0', null, '2018-03-27 18:17:04', null, '2018-03-27 18:17:04', '0');
INSERT INTO `sys_user_login_record` VALUES ('JMVX6JQPNQNPPEFKY83E3FPVEKHBNM9P', 'DKT6B56QC6VVBUEJUV48PBU3PRD1JJKQ', 'admin', '127.0.0.1', '2018-03-27 13:28:56', '0', '0', null, '2018-03-27 13:28:56', null, '2018-03-27 13:28:56', '0');
INSERT INTO `sys_user_login_record` VALUES ('JPVAK8P21TX6SEGKKT9NXZPAPK8MME29', 'DKT6B56QC6VVBUEJUV48PBU3PRD1JJKQ', 'admin', '127.0.0.1', '2018-04-15 18:17:21', '0', '0', null, '2018-04-15 18:17:21', null, '2018-04-15 18:17:21', '0');
INSERT INTO `sys_user_login_record` VALUES ('JRVTMWPC5ZHJPEHK97FNSBM9QMHMJ98V', 'DKT6B56QC6VVBUEJUV48PBU3PRD1JJKQ', 'admin', '127.0.0.1', '2018-04-15 15:57:18', '0', '0', null, '2018-04-15 15:57:18', null, '2018-04-15 15:57:18', '0');
INSERT INTO `sys_user_login_record` VALUES ('KBUAVRHNZBNVCXTJQXADG6T5D1AQMGMT', 'DKT6B56QC6VVBUEJUV48PBU3PRD1JJKQ', 'admin', '127.0.0.1', '2018-03-27 18:08:33', '0', '0', null, '2018-03-27 18:08:33', null, '2018-03-27 18:08:33', '0');
INSERT INTO `sys_user_login_record` VALUES ('KGUR2TFU4Y14FEWJ51UG4E5KH6QDN75J', 'DKT6B56QC6VVBUEJUV48PBU3PRD1JJKQ', 'admin', '127.0.0.1', '2018-04-02 23:48:04', '0', '0', null, '2018-04-02 23:48:04', null, '2018-04-02 23:48:04', '0');
INSERT INTO `sys_user_login_record` VALUES ('KNU6BWVF9TCGQXYJPEKTVJ9MKCJUJGVE', 'DKT6B56QC6VVBUEJUV48PBU3PRD1JJKQ', 'admin', '127.0.0.1', '2018-03-26 15:01:07', '0', '1', null, '2018-03-26 15:01:07', null, '2018-03-26 15:01:07', '0');
INSERT INTO `sys_user_login_record` VALUES ('KPWG9YAR8NEWJEZKJB6BYEXY1E2WKXA8', 'DKT6B56QC6VVBUEJUV48PBU3PRD1JJKQ', 'admin', '127.0.0.1', '2018-04-09 19:34:29', '0', '0', null, '2018-04-09 19:34:30', null, '2018-04-09 19:34:30', '0');
INSERT INTO `sys_user_login_record` VALUES ('KZUJSDJ57UMFKE5JGRNNWEVG2N34JD1Y', 'DKT6B56QC6VVBUEJUV48PBU3PRD1JJKQ', 'admin', '127.0.0.1', '2018-04-23 20:50:11', '0', '0', null, '2018-04-23 20:50:11', null, '2018-04-23 20:50:11', '0');
INSERT INTO `sys_user_login_record` VALUES ('MDTR2RQ39J7AHYBJYT3A5SZAMVJ1MM2P', 'DKT6B56QC6VVBUEJUV48PBU3PRD1JJKQ', 'admin', '127.0.0.1', '2018-03-31 00:11:31', '0', '0', null, '2018-03-31 00:11:31', null, '2018-03-31 00:11:31', '0');
INSERT INTO `sys_user_login_record` VALUES ('MJWVDNAGSRWDGFXKNZY1ABTJ23ECMF54', 'DKT6B56QC6VVBUEJUV48PBU3PRD1JJKQ', 'admin', '127.0.0.1', '2018-03-30 23:55:49', '0', '0', null, '2018-03-30 23:55:49', null, '2018-03-30 23:55:49', '0');
INSERT INTO `sys_user_login_record` VALUES ('MPUMFMPHDCARDFZJ1HQA371F1CYCK5WG', 'DKT6B56QC6VVBUEJUV48PBU3PRD1JJKQ', 'admin', '127.0.0.1', '2018-03-31 01:12:00', '0', '1', null, '2018-03-31 01:12:00', null, '2018-03-31 01:12:00', '0');
INSERT INTO `sys_user_login_record` VALUES ('MUU2FR8VX2NVGY2JQCPGRHDZSCCGJGBG', 'DKT6B56QC6VVBUEJUV48PBU3PRD1JJKQ', 'admin', '127.0.0.1', '2018-04-01 02:11:41', '0', '0', null, '2018-04-01 02:11:41', null, '2018-04-01 02:11:41', '0');
INSERT INTO `sys_user_login_record` VALUES ('N9W89GFGZWH9DY9KC5HXKP6VTVK6NU7D', 'DKT6B56QC6VVBUEJUV48PBU3PRD1JJKQ', 'admin', '127.0.0.1', '2018-04-02 23:50:48', '0', '0', null, '2018-04-02 23:50:48', null, '2018-04-02 23:50:48', '0');
INSERT INTO `sys_user_login_record` VALUES ('NHU8SJV96TUWPYWJY4MND33PDVR7MMQY', 'DKT6B56QC6VVBUEJUV48PBU3PRD1JJKQ', 'admin', '127.0.0.1', '2018-04-03 20:34:41', '0', '0', null, '2018-04-03 20:34:41', null, '2018-04-03 20:34:41', '0');
INSERT INTO `sys_user_login_record` VALUES ('NUT8W517RJKRAYJJ38VG9RX6CNSXJPSK', 'DKT6B56QC6VVBUEJUV48PBU3PRD1JJKQ', 'admin', '127.0.0.1', '2018-03-31 01:22:32', '0', '0', null, '2018-03-31 01:22:32', null, '2018-03-31 01:22:32', '0');
INSERT INTO `sys_user_login_record` VALUES ('PJTGTR3A4BCKNGEJM78TFND8XV24NYRS', 'DKT6B56QC6VVBUEJUV48PBU3PRD1JJKQ', 'admin', '127.0.0.1', '2018-03-30 22:05:12', '0', '0', null, '2018-03-30 22:05:18', null, '2018-03-30 22:05:18', '0');
INSERT INTO `sys_user_login_record` VALUES ('PTWV121WX9RCMG2KGHEGSW6CEPYFJWDC', 'DKT6B56QC6VVBUEJUV48PBU3PRD1JJKQ', 'admin', '127.0.0.1', '2018-04-09 19:32:16', '0', '0', null, '2018-04-09 19:32:16', null, '2018-04-09 19:32:16', '0');
INSERT INTO `sys_user_login_record` VALUES ('Q1TX9VJPJG1REZNJV5DQYF2JMZPCK37U', 'DKT6B56QC6VVBUEJUV48PBU3PRD1JJKQ', 'admin', '127.0.0.1', '2018-05-11 16:08:45', '0', '0', null, '2018-05-11 16:08:45', null, '2018-05-11 16:08:45', '0');
INSERT INTO `sys_user_login_record` VALUES ('Q1V8TSWFJ2XQEZNK45EK4M8UH1AVJ7QV', 'DKT6B56QC6VVBUEJUV48PBU3PRD1JJKQ', 'admin', '127.0.0.1', '2018-03-31 00:41:51', '0', '1', null, '2018-03-31 00:41:51', null, '2018-03-31 00:41:51', '0');
INSERT INTO `sys_user_login_record` VALUES ('Q6W8PJ97JFSXSG8KZC2ZKZCT8RPXNNBP', 'DKT6B56QC6VVBUEJUV48PBU3PRD1JJKQ', 'admin', '127.0.0.1', '2018-03-30 21:56:44', '0', '0', null, '2018-03-30 21:56:44', null, '2018-03-30 21:56:44', '0');
INSERT INTO `sys_user_login_record` VALUES ('QMUXRQGSRSBVJGYJ1WWZCU8XDZHVN53K', 'DKT6B56QC6VVBUEJUV48PBU3PRD1JJKQ', 'admin', '127.0.0.1', '2018-03-27 13:55:11', '0', '0', null, '2018-03-27 13:55:11', null, '2018-03-27 13:55:11', '0');
INSERT INTO `sys_user_login_record` VALUES ('QSURMFVH4BASRZ1JM3VF9NTMKU9CKYP3', 'DKT6B56QC6VVBUEJUV48PBU3PRD1JJKQ', 'admin', '127.0.0.1', '2018-03-31 01:11:27', '0', '0', null, '2018-03-31 01:11:27', null, '2018-03-31 01:11:27', '0');
INSERT INTO `sys_user_login_record` VALUES ('QTTARNGHGC6FMGJJ2WEAMVTCF3CQM6KC', 'DKT6B56QC6VVBUEJUV48PBU3PRD1JJKQ', 'admin', '127.0.0.1', '2018-04-22 21:24:38', '0', '0', null, '2018-04-22 21:24:38', null, '2018-04-22 21:24:38', '0');
INSERT INTO `sys_user_login_record` VALUES ('QWWEHNFUGGZ6PZ3KVC23DTNXD6DVMKB6', 'DKT6B56QC6VVBUEJUV48PBU3PRD1JJKQ', 'admin', '127.0.0.1', '2018-04-01 19:37:35', '0', '0', null, '2018-04-01 19:37:35', null, '2018-04-01 19:37:35', '0');
INSERT INTO `sys_user_login_record` VALUES ('QZV8J91PU3F1PGNKRK7E8R9AHZFGM1XR', 'DKT6B56QC6VVBUEJUV48PBU3PRD1JJKQ', 'admin', '127.0.0.1', '2018-03-27 18:10:22', '0', '0', null, '2018-03-27 18:10:22', null, '2018-03-27 18:10:22', '0');
INSERT INTO `sys_user_login_record` VALUES ('RBVGZM3ET8UYS1AKZMM7HY9E3WNUKNFY', 'DKT6B56QC6VVBUEJUV48PBU3PRD1JJKQ', 'admin', '127.0.0.1', '2018-03-27 14:24:21', '0', '0', null, '2018-03-27 14:24:21', null, '2018-03-27 14:24:21', '0');
INSERT INTO `sys_user_login_record` VALUES ('RJUVWKRBBQNPJHXJGA6RBKH9J7VHNDAR', 'DKT6B56QC6VVBUEJUV48PBU3PRD1JJKQ', 'admin', '127.0.0.1', '2018-03-30 23:46:23', '0', '0', null, '2018-03-30 23:46:23', null, '2018-03-30 23:46:23', '0');
INSERT INTO `sys_user_login_record` VALUES ('RKTJPA9SPEBKH1EJR71M3KYTK4KYJ18N', 'DKT6B56QC6VVBUEJUV48PBU3PRD1JJKQ', 'admin', '127.0.0.1', '2018-03-30 22:01:20', '0', '0', null, '2018-03-30 22:01:20', null, '2018-03-30 22:01:20', '0');
INSERT INTO `sys_user_login_record` VALUES ('RPUM5QDHMATHBHZJ8454SRHHBXG4KS7Q', 'DKT6B56QC6VVBUEJUV48PBU3PRD1JJKQ', 'admin', '127.0.0.1', '2018-04-14 10:59:38', '0', '0', null, '2018-04-14 10:59:38', null, '2018-04-14 10:59:38', '0');
INSERT INTO `sys_user_login_record` VALUES ('S7UJDHRKZMC5S18JWVTVEZ582QPENKKJ', 'DKT6B56QC6VVBUEJUV48PBU3PRD1JJKQ', 'admin', '127.0.0.1', '2018-04-09 19:29:56', '0', '1', null, '2018-04-09 19:29:56', null, '2018-04-09 19:29:56', '0');
INSERT INTO `sys_user_login_record` VALUES ('S9TR9H2SD3VAE1SJX841ZRPQ4WWMNMS7', 'DKT6B56QC6VVBUEJUV48PBU3PRD1JJKQ', 'admin', '127.0.0.1', '2018-04-23 19:59:48', '0', '0', null, '2018-04-23 19:59:48', null, '2018-04-23 19:59:48', '0');
INSERT INTO `sys_user_login_record` VALUES ('SGUTPSBN449AEHWJB2HJ1AD1VTN6NA6D', 'DKT6B56QC6VVBUEJUV48PBU3PRD1JJKQ', 'admin', '127.0.0.1', '2018-04-01 22:59:13', '0', '0', null, '2018-04-01 22:59:13', null, '2018-04-01 22:59:13', '0');
INSERT INTO `sys_user_login_record` VALUES ('SUUM376N82N6H12J9Q2XBDVM5ZWQK9GP', 'DKT6B56QC6VVBUEJUV48PBU3PRD1JJKQ', 'admin', '127.0.0.1', '2018-03-31 00:52:08', '0', '0', null, '2018-03-31 00:52:08', null, '2018-03-31 00:52:08', '0');
INSERT INTO `sys_user_login_record` VALUES ('TMWCSP7R9D2KDJYKCUPS6R9VKT2BNUJZ', 'DKT6B56QC6VVBUEJUV48PBU3PRD1JJKQ', 'admin', '127.0.0.1', '2018-03-30 21:56:54', '0', '0', null, '2018-03-30 21:56:54', null, '2018-03-30 21:56:54', '0');
INSERT INTO `sys_user_login_record` VALUES ('TQVXDNYUXD4XD2GKGNM7UEG23133MWFY', 'DKT6B56QC6VVBUEJUV48PBU3PRD1JJKQ', 'admin', '172.25.80.23', '2018-05-11 16:07:47', '0', '0', null, '2018-05-11 16:07:47', null, '2018-05-11 16:07:47', '0');
INSERT INTO `sys_user_login_record` VALUES ('TVTMPACWJHJXFJKJTPUSMF8U4Z59JJZ2', 'DKT6B56QC6VVBUEJUV48PBU3PRD1JJKQ', 'admin', '127.0.0.1', '2018-04-14 11:40:46', '0', '0', null, '2018-04-14 11:40:46', null, '2018-04-14 11:40:46', '0');
INSERT INTO `sys_user_login_record` VALUES ('TVWTPWEQAQMEGJ3K56TX5C63M78BMQRJ', 'DKT6B56QC6VVBUEJUV48PBU3PRD1JJKQ', 'admin', '127.0.0.1', '2018-03-31 00:51:47', '0', '1', null, '2018-03-31 00:51:47', null, '2018-03-31 00:51:47', '0');
INSERT INTO `sys_user_login_record` VALUES ('U2U65ZCZPE2QSJ6J9EFRG5W5WBB7KSVC', 'DKT6B56QC6VVBUEJUV48PBU3PRD1JJKQ', 'admin', '127.0.0.1', '2018-03-30 23:07:59', '0', '0', null, '2018-03-30 23:07:59', null, '2018-03-30 23:07:59', '0');
INSERT INTO `sys_user_login_record` VALUES ('U4TGUKEZ48KSCJQJC1242S1ADH1SKUNP', 'DKT6B56QC6VVBUEJUV48PBU3PRD1JJKQ', 'admin', '127.0.0.1', '2018-04-15 19:00:28', '0', '0', null, '2018-04-15 19:00:28', null, '2018-04-15 19:00:28', '0');
INSERT INTO `sys_user_login_record` VALUES ('U7WZU22F6D4FA28KW8G1G1Q3DSXWKKSW', 'DKT6B56QC6VVBUEJUV48PBU3PRD1JJKQ', 'admin', '127.0.0.1', '2018-03-26 15:16:16', '0', '1', null, '2018-03-26 15:16:16', null, '2018-03-26 15:16:16', '0');
INSERT INTO `sys_user_login_record` VALUES ('UFVA7QSK1A7KD2CKZU658WMA53NFK5J8', 'DKT6B56QC6VVBUEJUV48PBU3PRD1JJKQ', 'admin', '127.0.0.1', '2018-03-30 23:00:39', '0', '0', null, '2018-03-30 23:00:39', null, '2018-03-30 23:00:39', '0');
INSERT INTO `sys_user_login_record` VALUES ('UPWG9K2RSS5HDJZKPV2RNKCDMQR1NGKP', 'DKT6B56QC6VVBUEJUV48PBU3PRD1JJKQ', 'admin', '127.0.0.1', '2018-04-02 21:32:24', '0', '0', null, '2018-04-02 21:32:24', null, '2018-04-02 21:32:24', '0');
INSERT INTO `sys_user_login_record` VALUES ('V5T8NVCPBQ8JQ3QJTR22QTCYT82CMJHP', 'DKT6B56QC6VVBUEJUV48PBU3PRD1JJKQ', 'admin', '221.218.215.247', '2018-05-13 13:09:27', '0', '0', null, '2018-05-13 13:09:27', null, '2018-05-13 13:09:27', '0');
INSERT INTO `sys_user_login_record` VALUES ('V8TVR1NRN7BUQKSJZRMU3JP2GFK2JNHY', 'DKT6B56QC6VVBUEJUV48PBU3PRD1JJKQ', 'admin', '127.0.0.1', '2018-03-31 00:49:46', '0', '1', null, '2018-03-31 00:49:46', null, '2018-03-31 00:49:46', '0');
INSERT INTO `sys_user_login_record` VALUES ('VBVE6X46MK7EB3AK4GKGJN4SE98FJQWE', 'DKT6B56QC6VVBUEJUV48PBU3PRD1JJKQ', 'admin', '127.0.0.1', '2018-03-27 14:22:41', '0', '0', null, '2018-03-27 14:22:41', null, '2018-03-27 14:22:41', '0');
INSERT INTO `sys_user_login_record` VALUES ('VJVARS1EKV6GAKEKDJPNFB5BSX8KKBEZ', 'DKT6B56QC6VVBUEJUV48PBU3PRD1JJKQ', 'admin', '127.0.0.1', '2018-04-15 15:50:34', '0', '0', null, '2018-04-15 15:50:34', null, '2018-04-15 15:50:34', '0');
INSERT INTO `sys_user_login_record` VALUES ('VJVJXZT4BRMCKKEK4UW943YM32EGM723', 'DKT6B56QC6VVBUEJUV48PBU3PRD1JJKQ', 'admin', '127.0.0.1', '2018-03-31 01:12:02', '0', '0', null, '2018-03-31 01:12:02', null, '2018-03-31 01:12:02', '0');
INSERT INTO `sys_user_login_record` VALUES ('VYVXQ518CT6YB3MKZJ97ND4EWABSJNX9', 'DKT6B56QC6VVBUEJUV48PBU3PRD1JJKQ', 'admin', '127.0.0.1', '2018-03-31 01:49:51', '0', '0', null, '2018-03-31 01:49:51', null, '2018-03-31 01:49:51', '0');
INSERT INTO `sys_user_login_record` VALUES ('W8T4PHB5P3CACKSJ7NW7VHFU56AVK8Y3', 'DKT6B56QC6VVBUEJUV48PBU3PRD1JJKQ', 'admin', '127.0.0.1', '2018-04-15 14:41:14', '0', '0', null, '2018-04-15 14:41:14', null, '2018-04-15 14:41:14', '0');
INSERT INTO `sys_user_login_record` VALUES ('WDVPKZ6QBZWJJ3BKYP7F6BF538AKNMZ8', 'DKT6B56QC6VVBUEJUV48PBU3PRD1JJKQ', 'admin', '127.0.0.1', '2018-03-31 00:34:06', '0', '0', null, '2018-03-31 00:34:06', null, '2018-03-31 00:34:06', '0');
INSERT INTO `sys_user_login_record` VALUES ('WFVCJEHVW41VM3CKQK7QMGRWR3R9MZX8', 'DKT6B56QC6VVBUEJUV48PBU3PRD1JJKQ', 'admin', '127.0.0.1', '2018-04-23 21:19:08', '0', '0', null, '2018-04-23 21:19:08', null, '2018-04-23 21:19:08', '0');
INSERT INTO `sys_user_login_record` VALUES ('WZU45JDAE1NHPK5J8EJCU8TRQTRZJSCE', 'DKT6B56QC6VVBUEJUV48PBU3PRD1JJKQ', 'admin', '127.0.0.1', '2018-04-09 19:30:01', '0', '0', null, '2018-04-09 19:30:01', null, '2018-04-09 19:30:01', '0');
INSERT INTO `sys_user_login_record` VALUES ('X1W4VRCGJVPSP45K9VQCTZD7D5FPJS3G', 'DKT6B56QC6VVBUEJUV48PBU3PRD1JJKQ', 'admin', '127.0.0.1', '2018-03-26 15:20:55', '0', '0', null, '2018-03-26 15:20:55', null, '2018-03-26 15:20:55', '0');
INSERT INTO `sys_user_login_record` VALUES ('X3WP41G83YNTE46KWTAAFRMWGJF7NKJA', 'DKT6B56QC6VVBUEJUV48PBU3PRD1JJKQ', 'admin', '127.0.0.1', '2018-03-26 15:22:07', '0', '0', null, '2018-03-26 15:22:07', null, '2018-03-26 15:22:07', '0');
INSERT INTO `sys_user_login_record` VALUES ('X4UEPX87N5W5AM7JVZ59EJM33R2JKK57', 'DKT6B56QC6VVBUEJUV48PBU3PRD1JJKQ', 'admin', '127.0.0.1', '2018-04-09 19:35:48', '0', '0', null, '2018-04-09 19:35:48', null, '2018-04-09 19:35:48', '0');
INSERT INTO `sys_user_login_record` VALUES ('XNUPTZ8W7BFXD4YJ2M23FS8QXJTHMPF6', 'DKT6B56QC6VVBUEJUV48PBU3PRD1JJKQ', 'admin', '127.0.0.1', '2018-03-31 00:38:45', '0', '0', null, '2018-03-31 00:38:45', null, '2018-03-31 00:38:45', '0');
INSERT INTO `sys_user_login_record` VALUES ('XTWM6E7HVWMRGM2KYJK8YENB1VFFNMXE', 'DKT6B56QC6VVBUEJUV48PBU3PRD1JJKQ', 'admin', '127.0.0.1', '2018-04-03 19:54:46', '0', '0', null, '2018-04-03 19:54:46', null, '2018-04-03 19:54:46', '0');
INSERT INTO `sys_user_login_record` VALUES ('XXTEDDH5992BEMMJG4EN6RV3XJA4JDQV', 'DKT6B56QC6VVBUEJUV48PBU3PRD1JJKQ', 'admin', '59.108.152.242', '2018-05-15 23:32:06', '0', '0', null, '2018-05-15 23:32:06', null, '2018-05-15 23:32:06', '0');
INSERT INTO `sys_user_login_record` VALUES ('XYW2T6177Z4ZR44KGJCMT72ZF5YBMDEB', 'DKT6B56QC6VVBUEJUV48PBU3PRD1JJKQ', 'admin', '127.0.0.1', '2018-05-11 17:54:32', '0', '0', null, '2018-05-11 17:54:33', null, '2018-05-11 17:54:33', '0');
INSERT INTO `sys_user_login_record` VALUES ('YVUJ72FF55ZBNM3JDTHUB9JEX81JNB2W', 'DKT6B56QC6VVBUEJUV48PBU3PRD1JJKQ', 'admin', '172.25.80.23', '2018-05-16 17:58:26', '0', '0', null, '2018-05-16 17:58:26', null, '2018-05-16 17:58:26', '0');
INSERT INTO `sys_user_login_record` VALUES ('YYTXUNBMC746E4MJHUXEJGU6Z6UWKWJM', 'DKT6B56QC6VVBUEJUV48PBU3PRD1JJKQ', 'admin', '127.0.0.1', '2018-04-23 20:49:44', '0', '0', null, '2018-04-23 20:49:44', null, '2018-04-23 20:49:44', '0');
INSERT INTO `sys_user_login_record` VALUES ('ZPWVNUT8ZD3DMNZKWYNC5XNMR31RN34F', 'DKT6B56QC6VVBUEJUV48PBU3PRD1JJKQ', 'admin', '127.0.0.1', '2018-03-27 17:50:35', '0', '0', null, '2018-03-27 17:50:35', null, '2018-03-27 17:50:35', '0');

-- ----------------------------
-- Table structure for sys_user_role
-- ----------------------------
DROP TABLE IF EXISTS `sys_user_role`;
CREATE TABLE `sys_user_role` (
  `id` varchar(32) NOT NULL,
  `u_id` varchar(255) DEFAULT NULL,
  `r_id` varchar(255) DEFAULT NULL,
  `creator` varchar(32) DEFAULT NULL,
  `create_date` varchar(19) DEFAULT NULL,
  `modifier` varchar(32) DEFAULT NULL,
  `modify_date` varchar(19) DEFAULT NULL,
  `status` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of sys_user_role
-- ----------------------------
