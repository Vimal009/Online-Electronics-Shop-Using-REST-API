-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Aug 31, 2022 at 09:28 AM
-- Server version: 10.4.24-MariaDB
-- PHP Version: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `webservices`
--

-- --------------------------------------------------------

--
-- Table structure for table `appliance`
--

CREATE TABLE `appliance` (
  `productid` int(11) NOT NULL,
  `productname` varchar(20) DEFAULT NULL,
  `producttype` varchar(20) DEFAULT NULL,
  `comapnyname` varchar(20) DEFAULT NULL,
  `productprice` varchar(20) DEFAULT NULL,
  `discountprice` varchar(20) DEFAULT NULL,
  `description` varchar(80) DEFAULT NULL,
  `stockavailable` varchar(20) DEFAULT NULL,
  `manufacturer` varchar(20) DEFAULT NULL,
  `productcode` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `appliance`
--

INSERT INTO `appliance` (`productid`, `productname`, `producttype`, `comapnyname`, `productprice`, `discountprice`, `description`, `stockavailable`, `manufacturer`, `productcode`) VALUES
(123456723, 'Samsung M42', 'Mobile', 'Samsung', '20999', '18999', '8GB RAM 256 ROM QUALCOMM SNAPDRAGON 750G', '20', '153204657', '45SM7896'),
(123458930, 'Canon 80D', 'Camera', 'Canon', '100099', '98999', '4K Recording 4K Image Caputring Ultra Wide Lens', '50', '142265729', '12CN1485'),
(456321785, 'OnePlus 10T', 'Mobile', 'OnePlus', '69899', '60999', '12GB RAM 1 TB ROM QUALCOMM SNAPDRAGON 868G', '50', '145326978', '32OP4563'),
(789653142, 'MacBook Pro', 'Laptop', 'Apple', '100799', '95999', '8GB RAM 512GB SSD M12 Chip', '50', '145236987', '36AP7896'),
(789654320, 'Nothing Phone 1', 'Phone', 'Nothing', '39999', '35999', '12GB RAM 256 ROM QUALCOMM SNAPDRAGON 778G', '20', '1532045697', '63NG7895'),
(1248963175, 'Lenovo Ideapad3', 'Laptop', 'Lenovo', '50999', '45999', '8GB RAM 512GB SSD AMD RYZEN 5', '60', '123654987', '896LN7852');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `appliance`
--
ALTER TABLE `appliance`
  ADD PRIMARY KEY (`productid`),
  ADD UNIQUE KEY `manufacturer` (`manufacturer`),
  ADD UNIQUE KEY `productcode` (`productcode`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
