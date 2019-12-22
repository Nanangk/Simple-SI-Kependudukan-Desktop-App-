-- phpMyAdmin SQL Dump
-- version 4.8.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 15 Apr 2019 pada 05.44
-- Versi server: 10.1.33-MariaDB
-- Versi PHP: 7.2.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `penduduk`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `data`
--

CREATE TABLE `data` (
  `NIK` varchar(25) NOT NULL,
  `FullName` varchar(10) NOT NULL,
  `umur` int(11) NOT NULL,
  `jenis-kelamin` varchar(9) NOT NULL DEFAULT '',
  `agama` varchar(10) NOT NULL,
  `status` varchar(14) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `data`
--

INSERT INTO `data` (`NIK`, `FullName`, `umur`, `jenis-kelamin`, `agama`, `status`) VALUES
('113232334', 'bung', 34, 'Laki-Laki', 'Budha', 'Menikah'),
('12122', 'nanang', 21, 'Laki-Laki', 'Islam', 'Belum Menikah'),
('23444', 'bayu', 23, 'Laki-Laki', 'Islam', 'Menikah'),
('32324343', 'santi', 11, 'perempuan', 'Islam', 'Menikah'),
('swsa', 'sasas', 11, 'Laki-Laki', 'Hindu', 'Belum Menikah');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `data`
--
ALTER TABLE `data`
  ADD PRIMARY KEY (`NIK`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
