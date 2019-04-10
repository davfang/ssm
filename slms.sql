# MySQL-Front 5.1  (Build 4.2)

/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE */;
/*!40101 SET SQL_MODE='STRICT_TRANS_TABLES,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES */;
/*!40103 SET SQL_NOTES='ON' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS */;
/*!40014 SET FOREIGN_KEY_CHECKS=0 */;


# Host: 127.0.0.1    Database: slms
# ------------------------------------------------------
# Server version 5.0.22-community-nt

CREATE DATABASE `slms` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `slms`;

#
# Source for table customer
#

CREATE TABLE `customer` (
  `cid` int(11) NOT NULL auto_increment,
  `ccode` varchar(255) default NULL,
  `cname` varchar(255) default NULL,
  `address` varchar(255) default NULL,
  `ctelephone` varchar(255) default NULL,
  `cemail` varchar(255) default NULL,
  PRIMARY KEY  (`cid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

#
# Dumping data for table customer
#

LOCK TABLES `customer` WRITE;
/*!40000 ALTER TABLE `customer` DISABLE KEYS */;
INSERT INTO `customer` VALUES (1,'1','吴显光','湖北省','15607149771','1062843283@qq.com');
/*!40000 ALTER TABLE `customer` ENABLE KEYS */;
UNLOCK TABLES;

#
# Source for table employee
#

CREATE TABLE `employee` (
  `eid` int(11) NOT NULL auto_increment,
  `ecode` varchar(255) default NULL,
  `ename` varchar(255) default NULL,
  `birthday` varchar(255) default NULL,
  `sex` varchar(255) default NULL,
  `etelephone` varchar(255) default NULL,
  `eemail` varchar(255) default NULL,
  PRIMARY KEY  (`eid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

#
# Dumping data for table employee
#

LOCK TABLES `employee` WRITE;
/*!40000 ALTER TABLE `employee` DISABLE KEYS */;
INSERT INTO `employee` VALUES (1,'1','郝焕霞','2017-10-10','女','15607149771','1062843283@qq.com');
/*!40000 ALTER TABLE `employee` ENABLE KEYS */;
UNLOCK TABLES;

#
# Source for table merchandise
#

CREATE TABLE `merchandise` (
  `mid` int(11) NOT NULL auto_increment,
  `mcode` varchar(255) default NULL,
  `mname` varchar(255) default NULL,
  `mprice` varchar(255) default NULL,
  PRIMARY KEY  (`mid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

#
# Dumping data for table merchandise
#

LOCK TABLES `merchandise` WRITE;
/*!40000 ALTER TABLE `merchandise` DISABLE KEYS */;
INSERT INTO `merchandise` VALUES (1,'1','香烟','20');
/*!40000 ALTER TABLE `merchandise` ENABLE KEYS */;
UNLOCK TABLES;

#
# Source for table orders
#

CREATE TABLE `orders` (
  `oid` int(11) NOT NULL auto_increment,
  `ocode` varchar(255) default NULL,
  `merchandisenumber` varchar(255) default NULL,
  `orderdata` varchar(255) default NULL,
  `customerid` int(50) default NULL,
  `merchandiseid` int(50) default NULL,
  `employeeid` int(50) default NULL,
  PRIMARY KEY  (`oid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

#
# Dumping data for table orders
#

LOCK TABLES `orders` WRITE;
/*!40000 ALTER TABLE `orders` DISABLE KEYS */;
INSERT INTO `orders` VALUES (1,NULL,'20','2017-10-22',1,1,1);
/*!40000 ALTER TABLE `orders` ENABLE KEYS */;
UNLOCK TABLES;

#
# Source for table stockin
#

CREATE TABLE `stockin` (
  `sid` int(11) NOT NULL auto_increment,
  `scode` varchar(255) default NULL,
  `amount` varchar(255) default NULL,
  `sprice` varchar(255) default NULL,
  `stockindate` varchar(255) default NULL,
  `customerid` int(50) default NULL,
  `merchandiseid` int(50) default NULL,
  `employeeid` int(50) default NULL,
  PRIMARY KEY  (`sid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

#
# Dumping data for table stockin
#

LOCK TABLES `stockin` WRITE;
/*!40000 ALTER TABLE `stockin` DISABLE KEYS */;
INSERT INTO `stockin` VALUES (1,NULL,'20','20','2017-10-22',1,1,1);
/*!40000 ALTER TABLE `stockin` ENABLE KEYS */;
UNLOCK TABLES;

#
# Source for table user
#

CREATE TABLE `user` (
  `Id` int(11) NOT NULL auto_increment,
  `username` varchar(255) default NULL,
  `password` varchar(255) default NULL,
  `usex` varchar(255) default NULL,
  `hobby` varchar(255) default NULL,
  PRIMARY KEY  (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

#
# Dumping data for table user
#

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (1,'wu','123','男','打球');
INSERT INTO `user` VALUES (2,'hao','123','女','旅游,写作');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;

/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
