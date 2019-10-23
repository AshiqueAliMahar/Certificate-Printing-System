/*
SQLyog Ultimate v11.11 (64 bit)
MySQL - 5.5.5-10.1.21-MariaDB : Database - center
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`center` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `center`;

/*Table structure for table `attendence` */

DROP TABLE IF EXISTS `attendence`;

CREATE TABLE `attendence` (
  `attendenceId` int(11) NOT NULL AUTO_INCREMENT,
  `attendenceTime` datetime DEFAULT NULL,
  `batchId` int(11) DEFAULT NULL,
  `enrollId` int(11) DEFAULT NULL,
  PRIMARY KEY (`attendenceId`),
  KEY `FK_attendence_batchId` (`batchId`),
  KEY `FK_attendence_enrollId` (`enrollId`),
  CONSTRAINT `FK_attendence_batchId` FOREIGN KEY (`batchId`) REFERENCES `batch` (`batchId`),
  CONSTRAINT `FK_attendence_enrollId` FOREIGN KEY (`enrollId`) REFERENCES `enroll` (`enrollId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `attendence` */

/*Table structure for table `batch` */

DROP TABLE IF EXISTS `batch`;

CREATE TABLE `batch` (
  `batchId` int(11) NOT NULL AUTO_INCREMENT,
  `batchName` varchar(255) DEFAULT NULL,
  `batchTime` varchar(255) DEFAULT NULL,
  `description` longtext,
  `endDate` date DEFAULT NULL,
  `isRunning` varchar(255) DEFAULT NULL,
  `startDate` date DEFAULT NULL,
  `teacherShare` int(11) DEFAULT NULL,
  `subjectId` int(11) DEFAULT NULL,
  `teacherId` int(11) DEFAULT NULL,
  `yearId` int(11) DEFAULT NULL,
  PRIMARY KEY (`batchId`),
  UNIQUE KEY `batchName` (`batchName`),
  KEY `FK_batch_teacherId` (`teacherId`),
  KEY `FK_batch_yearId` (`yearId`),
  KEY `FK_batch_subjectId` (`subjectId`),
  CONSTRAINT `FK_batch_subjectId` FOREIGN KEY (`subjectId`) REFERENCES `subject` (`subjectId`),
  CONSTRAINT `FK_batch_teacherId` FOREIGN KEY (`teacherId`) REFERENCES `teacher` (`teacherId`),
  CONSTRAINT `FK_batch_yearId` FOREIGN KEY (`yearId`) REFERENCES `year` (`yearId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `batch` */

/*Table structure for table `enroll` */

DROP TABLE IF EXISTS `enroll`;

CREATE TABLE `enroll` (
  `enrollId` int(11) NOT NULL AUTO_INCREMENT,
  `admissionFees` int(11) DEFAULT NULL,
  `discountAmount` int(11) DEFAULT NULL,
  `discountReason` longtext,
  `Fees` int(11) DEFAULT NULL,
  `FeesType` varchar(255) DEFAULT NULL,
  `issuedCertificate` tinyint(1) DEFAULT '0',
  `joinDate` date DEFAULT NULL,
  `leavingDate` date DEFAULT NULL,
  `leavingReason` longtext,
  `rollNum` varchar(255) DEFAULT NULL,
  `batchId` int(11) DEFAULT NULL,
  `studentId` int(11) DEFAULT NULL,
  PRIMARY KEY (`enrollId`),
  KEY `FK_enroll_batchId` (`batchId`),
  KEY `FK_enroll_studentId` (`studentId`),
  CONSTRAINT `FK_enroll_batchId` FOREIGN KEY (`batchId`) REFERENCES `batch` (`batchId`),
  CONSTRAINT `FK_enroll_studentId` FOREIGN KEY (`studentId`) REFERENCES `student` (`studentId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `enroll` */

/*Table structure for table `expense` */

DROP TABLE IF EXISTS `expense`;

CREATE TABLE `expense` (
  `expenseId` int(11) NOT NULL AUTO_INCREMENT,
  `expenseName` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`expenseId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `expense` */

/*Table structure for table `fees` */

DROP TABLE IF EXISTS `fees`;

CREATE TABLE `fees` (
  `FeesId` int(11) NOT NULL AUTO_INCREMENT,
  `amount` int(11) DEFAULT NULL,
  `Month` varchar(255) DEFAULT NULL,
  `paymentDate` date DEFAULT NULL,
  `reason` longtext,
  `transcation` varchar(255) DEFAULT NULL,
  `transcationPhoto` longblob,
  `batchId` int(11) DEFAULT NULL,
  `enrollId` int(11) DEFAULT NULL,
  `expenseId` int(11) DEFAULT NULL,
  `teacherId` int(11) DEFAULT NULL,
  PRIMARY KEY (`FeesId`),
  KEY `FK_fees_batchId` (`batchId`),
  KEY `FK_fees_enrollId` (`enrollId`),
  KEY `FK_fees_teacherId` (`teacherId`),
  KEY `FK_fees_expenseId` (`expenseId`),
  CONSTRAINT `FK_fees_batchId` FOREIGN KEY (`batchId`) REFERENCES `batch` (`batchId`),
  CONSTRAINT `FK_fees_enrollId` FOREIGN KEY (`enrollId`) REFERENCES `enroll` (`enrollId`),
  CONSTRAINT `FK_fees_expenseId` FOREIGN KEY (`expenseId`) REFERENCES `expense` (`expenseId`),
  CONSTRAINT `FK_fees_teacherId` FOREIGN KEY (`teacherId`) REFERENCES `teacher` (`teacherId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `fees` */

/*Table structure for table `student` */

DROP TABLE IF EXISTS `student`;

CREATE TABLE `student` (
  `studentId` int(11) NOT NULL AUTO_INCREMENT,
  `birthDate` date DEFAULT NULL,
  `cnicNumber` varchar(255) DEFAULT NULL,
  `contactNumber` varchar(255) DEFAULT NULL,
  `country` varchar(255) DEFAULT NULL,
  `degreeName` longtext,
  `fatherName` varchar(255) DEFAULT NULL,
  `fingerPrint1` longblob,
  `fingerPrint2` longblob,
  `gender` varchar(255) DEFAULT NULL,
  `permanentAddress` longtext,
  `photo` longblob,
  `presentAddress` longtext,
  `studentName` varchar(255) DEFAULT NULL,
  `surname` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`studentId`),
  UNIQUE KEY `cnicNumber` (`cnicNumber`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `student` */

/*Table structure for table `subject` */

DROP TABLE IF EXISTS `subject`;

CREATE TABLE `subject` (
  `subjectId` int(11) NOT NULL AUTO_INCREMENT,
  `description` longtext,
  `duration` int(11) DEFAULT NULL,
  `monthlyFees` int(11) DEFAULT NULL,
  `packageFees` int(11) DEFAULT NULL,
  `subjectName` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`subjectId`),
  UNIQUE KEY `subjectName` (`subjectName`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `subject` */

/*Table structure for table `teacher` */

DROP TABLE IF EXISTS `teacher`;

CREATE TABLE `teacher` (
  `teacherId` int(11) NOT NULL AUTO_INCREMENT,
  `birthDate` date DEFAULT NULL,
  `contactNumber` varchar(255) DEFAULT NULL,
  `degreeName` longtext,
  `experience` varchar(255) DEFAULT NULL,
  `fatherName` varchar(255) DEFAULT NULL,
  `gender` varchar(255) DEFAULT NULL,
  `joiningDate` date DEFAULT NULL,
  `nic` varchar(255) DEFAULT NULL,
  `passingYear` int(11) DEFAULT NULL,
  `permanentAddress` longtext,
  `photo` longblob,
  `presentAddress` longtext,
  `subjectExpert` longtext,
  `surname` varchar(255) DEFAULT NULL,
  `teacherName` varchar(255) DEFAULT NULL,
  `universityName` longtext,
  PRIMARY KEY (`teacherId`),
  UNIQUE KEY `nic` (`nic`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `teacher` */

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `userId` int(11) NOT NULL AUTO_INCREMENT,
  `userName` varchar(255) DEFAULT NULL,
  `userPassword` varchar(255) DEFAULT NULL,
  `userRole` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`userId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `user` */

/*Table structure for table `year` */

DROP TABLE IF EXISTS `year`;

CREATE TABLE `year` (
  `yearId` int(11) NOT NULL AUTO_INCREMENT,
  `description` longtext,
  `year` int(11) DEFAULT NULL,
  PRIMARY KEY (`yearId`),
  UNIQUE KEY `year` (`year`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `year` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
