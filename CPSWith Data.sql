/*
SQLyog Ultimate v11.11 (64 bit)
MySQL - 5.5.5-10.1.21-MariaDB : Database - cps
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`cps` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `cps`;

/*Table structure for table `applicantcertificate` */

DROP TABLE IF EXISTS `applicantcertificate`;

CREATE TABLE `applicantcertificate` (
  `issueCertificateId` int(11) NOT NULL AUTO_INCREMENT,
  `applicantAddress` varchar(100) DEFAULT NULL,
  `districtName` varchar(50) DEFAULT NULL,
  `issueCpsNumber` int(4) unsigned zerofill DEFAULT NULL,
  `issueCertificateDate` date DEFAULT NULL,
  `issueCertificateDetails` varchar(100) DEFAULT NULL,
  `issueCertificateName` varchar(100) DEFAULT NULL,
  `issueCertificateNumber` int(6) unsigned zerofill DEFAULT NULL,
  `recommendedBy` varchar(50) DEFAULT NULL,
  `recommendPerson` varchar(50) DEFAULT NULL,
  `talukaName` varchar(50) DEFAULT NULL,
  `wardNumber` int(11) DEFAULT NULL,
  `ApplicantId` int(11) DEFAULT NULL,
  PRIMARY KEY (`issueCertificateId`),
  UNIQUE KEY `issue certificate id` (`issueCertificateId`),
  KEY `FK_electrolCertificate` (`issueCertificateDetails`),
  KEY `FK_applicantcertificate` (`ApplicantId`),
  CONSTRAINT `FK_applicantcertificate` FOREIGN KEY (`ApplicantId`) REFERENCES `applicantdetails` (`ApplicantID`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

/*Data for the table `applicantcertificate` */

insert  into `applicantcertificate`(`issueCertificateId`,`applicantAddress`,`districtName`,`issueCpsNumber`,`issueCertificateDate`,`issueCertificateDetails`,`issueCertificateName`,`issueCertificateNumber`,`recommendedBy`,`recommendPerson`,`talukaName`,`wardNumber`,`ApplicantId`) values (1,'jamshro','Khairpur Mirus',0001,'2017-08-14','Block Code:1,Serial:1234,Family Tree:1,ElectrolArea:kotri,CensusYear:1997','electrol',000001,'Chairman','ash','Kingri',4,1),(2,'khi','Khairpur Mirus',0001,'2017-08-14','','character',000002,'Chairman','asg','Kingri',3,2),(3,'jam','khairpur',0002,'2017-08-19',NULL,'character',000003,'chairman','ashiqueali','bolhari',5,1);

/*Table structure for table `applicantdetails` */

DROP TABLE IF EXISTS `applicantdetails`;

CREATE TABLE `applicantdetails` (
  `ApplicantID` int(11) NOT NULL AUTO_INCREMENT,
  `ApplicantName` varchar(50) DEFAULT NULL,
  `ApplicantRelation` varchar(50) DEFAULT NULL,
  `ApplicantCNIC` varchar(15) DEFAULT NULL,
  `DateOfBirth` date DEFAULT NULL,
  `FatherName` varchar(50) DEFAULT NULL,
  `Gender` varchar(20) DEFAULT NULL,
  `HusbandCNIC` varchar(15) DEFAULT NULL,
  `HusbandName` varchar(50) DEFAULT NULL,
  `MaritalStatus` varchar(50) DEFAULT NULL,
  `Mobile` varchar(12) DEFAULT NULL,
  `OptionalCNIC` varchar(15) DEFAULT NULL,
  `SurName` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`ApplicantID`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

/*Data for the table `applicantdetails` */

insert  into `applicantdetails`(`ApplicantID`,`ApplicantName`,`ApplicantRelation`,`ApplicantCNIC`,`DateOfBirth`,`FatherName`,`Gender`,`HusbandCNIC`,`HusbandName`,`MaritalStatus`,`Mobile`,`OptionalCNIC`,`SurName`) values (1,'Ashique Ali','cousn','42401-8477229-3','2017-08-03','hakim Ali','Male','no','no','Single','03073670189','no','mahar'),(2,'Ishtiaq','friend','42401-8488229-3','2017-08-02','no','Male','no','no','Married','03003115234','no','sehto');

/*Table structure for table `certificate` */

DROP TABLE IF EXISTS `certificate`;

CREATE TABLE `certificate` (
  `certificateId` int(100) NOT NULL AUTO_INCREMENT,
  `CertificateName` enum('Residence Certificate','No Objection Certificate','Electoral Certificate','Income Cerificate') DEFAULT NULL,
  PRIMARY KEY (`certificateId`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

/*Data for the table `certificate` */

insert  into `certificate`(`certificateId`,`CertificateName`) values (1,'Electoral Certificate'),(2,'Income Cerificate');

/*Table structure for table `electrol certificate` */

DROP TABLE IF EXISTS `electrol certificate`;

CREATE TABLE `electrol certificate` (
  `census year` varchar(20) DEFAULT NULL,
  `block code` varchar(20) DEFAULT NULL,
  `serial` varchar(20) DEFAULT NULL,
  `electrol area` varchar(50) DEFAULT NULL,
  `family tree` varchar(50) DEFAULT NULL,
  `elc id` int(11) NOT NULL AUTO_INCREMENT,
  `issue certificate detail id` int(11) DEFAULT NULL,
  PRIMARY KEY (`elc id`),
  KEY `FK_electrol certificate` (`issue certificate detail id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `electrol certificate` */

/*Table structure for table `income certificate` */

DROP TABLE IF EXISTS `income certificate`;

CREATE TABLE `income certificate` (
  `income certid` int(11) NOT NULL AUTO_INCREMENT,
  `occupation` varchar(50) DEFAULT NULL,
  `per year salary` varchar(20) DEFAULT NULL,
  `issue certificate detailsid` int(11) DEFAULT NULL,
  PRIMARY KEY (`income certid`),
  KEY `FK_income certificate` (`issue certificate detailsid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `income certificate` */

/*Table structure for table `noc` */

DROP TABLE IF EXISTS `noc`;

CREATE TABLE `noc` (
  `noc id` int(11) NOT NULL AUTO_INCREMENT,
  `noc for` varchar(50) DEFAULT NULL,
  `issue certificate details id` int(11) DEFAULT NULL,
  PRIMARY KEY (`noc id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `noc` */

/*Table structure for table `rci` */

DROP TABLE IF EXISTS `rci`;

CREATE TABLE `rci` (
  `rci id` int(11) NOT NULL AUTO_INCREMENT,
  `Residence here since` varchar(20) DEFAULT NULL,
  `issue certificate details id` int(11) DEFAULT NULL,
  PRIMARY KEY (`rci id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `rci` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
