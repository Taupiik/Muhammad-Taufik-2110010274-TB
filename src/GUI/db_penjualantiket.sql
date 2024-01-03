-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 03, 2024 at 08:42 AM
-- Server version: 10.4.25-MariaDB
-- PHP Version: 8.1.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_penjualantiket`
--

-- --------------------------------------------------------

--
-- Table structure for table `jadwal`
--

CREATE TABLE `jadwal` (
  `id_jadwal` char(6) NOT NULL,
  `id_pesawat` char(6) NOT NULL,
  `kota_awal` varchar(20) NOT NULL,
  `kota_tujuan` varchar(20) NOT NULL,
  `jam_berangkat` time NOT NULL,
  `jam_sampai` time NOT NULL,
  `harga` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `jadwal`
--

INSERT INTO `jadwal` (`id_jadwal`, `id_pesawat`, `kota_awal`, `kota_tujuan`, `jam_berangkat`, `jam_sampai`, `harga`) VALUES
('JD001', 'P005', 'Palembang', 'Palangkaraya', '10:00:00', '12:00:00', 450000),
('JD002', 'P001', 'Banjarmasin', 'Palembang', '12:00:00', '14:00:00', 250000),
('JD003', 'P002', 'Bandung', 'Surabaya', '12:00:00', '15:00:00', 150000),
('JD004', 'P006', 'Banjarmasin', 'Bandung', '08:00:00', '11:00:00', 400000),
('JD005', 'P003', 'Pontianak', 'Jakarta', '16:00:00', '19:00:00', 300000),
('JD006', 'P005', 'Samarinda', 'Surabaya', '07:00:00', '11:00:00', 400000),
('JD007', 'P007', 'Yogyakarta', 'Banjarmasin', '13:00:00', '16:00:00', 450000),
('JD008', 'P006', 'Samarinda', 'Banjarmasin', '09:00:00', '11:00:00', 200000),
('JD009', 'P004', 'Palangkaraya', 'Jakarta', '12:00:00', '16:00:00', 350000),
('JD010', 'P002', 'Surabaya', 'Bandung', '14:00:00', '17:00:00', 350000),
('JD011', 'P006', 'Pontianak', 'Jakarta', '13:00:00', '16:00:00', 450000),
('JD012', 'P007', 'Surabaya', 'Banjarmasin', '13:00:00', '15:00:00', 500000),
('JD013', 'P005', 'Semarang', 'Banjarmasin', '14:00:00', '17:00:00', 450000),
('JD014', 'P007', 'Palembang', 'Banjarmasin', '12:00:00', '14:00:00', 350000),
('JD015', 'P006', 'Pontianak', 'Semarang', '10:00:00', '12:00:00', 500000),
('JD016', 'P004', 'Banjarmasin', 'Jakarta', '12:00:00', '14:00:00', 300000),
('JD017', 'P007', 'Samarinda', 'Palangkaraya', '10:00:00', '13:00:00', 400000),
('JD018', 'P003', 'Jakarta', 'Banjarmasin', '09:00:00', '12:00:00', 450000),
('JD019', 'P001', 'Banjarmasin', 'Surabaya', '12:00:00', '13:30:00', 300000),
('JD020', 'P008', 'Banjarmasin', 'Banten', '09:00:00', '12:00:00', 350000);

-- --------------------------------------------------------

--
-- Table structure for table `kota`
--

CREATE TABLE `kota` (
  `id_kota` char(6) NOT NULL,
  `nama_kota` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `kota`
--

INSERT INTO `kota` (`id_kota`, `nama_kota`) VALUES
('KT001', 'Banjarmasin'),
('KT002', 'Bandung'),
('KT003', 'Palangkaraya'),
('KT004', 'Palembang'),
('KT005', 'Surabaya'),
('KT006', 'Jakarta'),
('KT007', 'Yogyakarta'),
('KT008', 'Pontianak'),
('KT009', 'Samarinda'),
('KT010', 'Semarang'),
('KT011', 'Banten');

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `id_user` int(11) NOT NULL,
  `user` varchar(20) NOT NULL,
  `pass` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`id_user`, `user`, `pass`) VALUES
(1, 'admin', 'admin');

-- --------------------------------------------------------

--
-- Table structure for table `pesawat`
--

CREATE TABLE `pesawat` (
  `id_pesawat` char(6) NOT NULL,
  `nama_pesawat` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `pesawat`
--

INSERT INTO `pesawat` (`id_pesawat`, `nama_pesawat`) VALUES
('P001', 'Lion Air'),
('P002', 'Nusantara Air'),
('P003', 'Batik Air'),
('P004', 'Asialink'),
('P005', 'Pelita Air'),
('P006', 'Garuda Indonesia'),
('P007', 'Sriwijaya Air'),
('P008', 'AirLine');

-- --------------------------------------------------------

--
-- Table structure for table `transaksi`
--

CREATE TABLE `transaksi` (
  `id_transaksi` char(6) NOT NULL,
  `tgl_transaksi` date NOT NULL,
  `id_jadwal` char(6) NOT NULL,
  `id_pesawat` char(6) NOT NULL,
  `kota_awal` varchar(30) NOT NULL,
  `kota_tujuan` varchar(30) NOT NULL,
  `jam_terbang` varchar(30) NOT NULL,
  `nik` varchar(20) NOT NULL,
  `nama` varchar(30) NOT NULL,
  `telepon` varchar(30) NOT NULL,
  `jumlah` int(11) NOT NULL,
  `jenis` varchar(20) NOT NULL,
  `total` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `transaksi`
--

INSERT INTO `transaksi` (`id_transaksi`, `tgl_transaksi`, `id_jadwal`, `id_pesawat`, `kota_awal`, `kota_tujuan`, `jam_terbang`, `nik`, `nama`, `telepon`, `jumlah`, `jenis`, `total`) VALUES
('TR001', '2024-01-02', 'JD002', 'P001', 'Banjarmasin', 'Palembang', '12:00:00 - 14:00:00', '2110010273', 'Muhammad Rafli', '083143625134', 2, 'Bisnis', 1000000),
('TR002', '2024-01-02', 'JD012', 'P007', 'Surabaya', 'Banjarmasin', '13:00:00 - 15:00:00', '2110010271', 'Muhammad Akbar', '082134784824', 1, 'Ekonomi', 500000),
('TR003', '2024-01-03', 'JD016', 'P004', 'Banjarmasin', 'Jakarta', '12:00:00 - 14:00:00', '211010274', 'Muhammad Taufik', '083143793256', 1, 'Bisnis', 600000),
('TR004', '2024-01-03', 'JD020', 'P008', 'Banjarmasin', 'Banten', '09:00:00 - 12:00:00', '2110102742', 'Muhammad Ihsan', '0832157346', 1, 'Bisnis', 700000);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `jadwal`
--
ALTER TABLE `jadwal`
  ADD PRIMARY KEY (`id_jadwal`),
  ADD KEY `id_pesawat` (`id_pesawat`);

--
-- Indexes for table `kota`
--
ALTER TABLE `kota`
  ADD PRIMARY KEY (`id_kota`);

--
-- Indexes for table `login`
--
ALTER TABLE `login`
  ADD PRIMARY KEY (`id_user`);

--
-- Indexes for table `pesawat`
--
ALTER TABLE `pesawat`
  ADD PRIMARY KEY (`id_pesawat`);

--
-- Indexes for table `transaksi`
--
ALTER TABLE `transaksi`
  ADD PRIMARY KEY (`id_transaksi`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `login`
--
ALTER TABLE `login`
  MODIFY `id_user` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `jadwal`
--
ALTER TABLE `jadwal`
  ADD CONSTRAINT `fk_id_pesawat` FOREIGN KEY (`id_pesawat`) REFERENCES `pesawat` (`id_pesawat`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
