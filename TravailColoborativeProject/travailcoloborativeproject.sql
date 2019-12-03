-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 04, 2019 at 12:39 AM
-- Server version: 10.4.6-MariaDB
-- PHP Version: 7.3.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `travailcoloborativeproject`
--

-- --------------------------------------------------------

--
-- Table structure for table `abonnes`
--

CREATE TABLE `abonnes` (
  `idAbonne` int(50) NOT NULL,
  `NomAbonne` varchar(50) COLLATE utf8_bin NOT NULL,
  `PrenomAbonne` varchar(50) COLLATE utf8_bin NOT NULL,
  `AdresseAbonne` varchar(50) COLLATE utf8_bin NOT NULL,
  `TelAbonne` int(50) NOT NULL,
  `EmailAbonne` varchar(50) COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Table structure for table `sessform`
--

CREATE TABLE `sessform` (
  `idSess` int(50) NOT NULL,
  `date_Debut` date NOT NULL,
  `date_Fin` date NOT NULL,
  `date_LimiteInscription` date NOT NULL,
  `capacite` decimal(50,0) NOT NULL,
  `type` varchar(50) COLLATE utf8_bin NOT NULL,
  `lieu` varchar(50) COLLATE utf8_bin NOT NULL,
  `adresse` varchar(50) COLLATE utf8_bin NOT NULL,
  `cible` varchar(50) COLLATE utf8_bin NOT NULL,
  `prix` decimal(50,0) NOT NULL,
  `description` varchar(50) COLLATE utf8_bin NOT NULL,
  `sujet` varchar(50) COLLATE utf8_bin NOT NULL,
  `programme` varchar(50) COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
