/*
SQLyog Ultimate v11.11 (64 bit)
MySQL - 5.5.5-10.1.21-MariaDB : Database - cds
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`cds` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `cds`;

/*Table structure for table `caste` */

DROP TABLE IF EXISTS `caste`;

CREATE TABLE `caste` (
  `books` varchar(12) NOT NULL,
  `roll_no` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`books`),
  UNIQUE KEY `books` (`books`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `caste` */

insert  into `caste`(`books`,`roll_no`) values ('DBMS','16cs11'),('Mit','16cs13'),('OOP','16cs13');

/*Table structure for table `names` */

DROP TABLE IF EXISTS `names`;

CREATE TABLE `names` (
  `name` varchar(12) NOT NULL,
  `picture` longblob,
  PRIMARY KEY (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `names` */

insert  into `names`(`name`,`picture`) values ('name',NULL);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
