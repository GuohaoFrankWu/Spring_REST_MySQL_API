
CREATE DATABASE IF NOT EXISTS `Fortune500`;
USE `Fortune500`;
--
-- Table structure for table `Company`
--
DROP TABLE IF EXISTS `company`;
CREATE TABLE `company` (
  `orders` int(7) NOT NULL AUTO_INCREMENT,
  `rank` int(3) DEFAULT NULL, 
  `conpany` varchar(150) DEFAULT NULL,
  `revenue` float(7,3) DEFAULT NULL,
  `profit` float(7,3) DEFAULT NULL,
  `Year` int(4) DEFAULT NULL,
  PRIMARY KEY (`orders`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

INSERT INTO `company` values
(0, 0, 'Pyramid Consulting', 4.6, 1.1, 2020);

