
CREATE DATABASE IF NOT EXISTS `company_registry`;
USE `company_registry`;
--
-- Table structure for table `Company`
--
DROP TABLE IF EXISTS `company`;
CREATE TABLE `company` (
  `id` int(7) NOT NULL AUTO_INCREMENT,
  ##`rank` int(3) DEFAULT NULL, 
  `CName` varchar(150) DEFAULT NULL,
  `revenue` float(7,3) DEFAULT NULL,
  `profit` float(7,3) DEFAULT NULL,
  `year` int(4) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

INSERT INTO `company` values
(0, 'Pyramid Consulting', 4.6, 1.1, 2020),
(8, 'Delta Airline', 5.5, 2.2, 2021)

