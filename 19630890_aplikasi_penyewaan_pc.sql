-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 03 Jan 2022 pada 05.08
-- Versi server: 10.4.19-MariaDB
-- Versi PHP: 8.0.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `19630890_aplikasi_penyewaan_pc`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `komputer`
--

CREATE TABLE `komputer` (
  `no_komputer` varchar(5) NOT NULL,
  `nama_komputer` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `komputer`
--

INSERT INTO `komputer` (`no_komputer`, `nama_komputer`) VALUES
('001', 'PC ASUS 234'),
('002', 'PC Lenovo ASAD'),
('004', 'PC Lenovo QWE'),
('003', 'PC Lenovo 124');

-- --------------------------------------------------------

--
-- Struktur dari tabel `pelanggan`
--

CREATE TABLE `pelanggan` (
  `nama_user` varchar(8) NOT NULL,
  `nama` varchar(30) NOT NULL,
  `alamat` varchar(50) NOT NULL,
  `telp` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `pelanggan`
--

INSERT INTO `pelanggan` (`nama_user`, `nama`, `alamat`, `telp`) VALUES
('BOBI', 'Bobi Agustiawan', 'Jl Borneo No 12', '0877193656326'),
('NEXT', 'Anjasmara', 'Jl Bobo No 10', '0872554698'),
('123', 'Putri Cantik', 'Jl Angsa no 90', '0879654123625'),
('Anjas', 'Anjas 123', 'Jl Borneo No 01', '087712365966');

-- --------------------------------------------------------

--
-- Struktur dari tabel `transaksi`
--

CREATE TABLE `transaksi` (
  `no_transaksi` varchar(6) NOT NULL,
  `tanggal_transaksi` text NOT NULL,
  `nama_user` varchar(15) NOT NULL,
  `nama_komputer` varchar(15) NOT NULL,
  `mulai` text NOT NULL,
  `selesai` text NOT NULL,
  `durasi` int(11) NOT NULL,
  `bayar` decimal(15,0) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `transaksi`
--

INSERT INTO `transaksi` (`no_transaksi`, `tanggal_transaksi`, `nama_user`, `nama_komputer`, `mulai`, `selesai`, `durasi`, `bayar`) VALUES
('004', '31-12-2021 15:21', 'Anjas', 'PC-003', '12-12-21', '14-12-21', 2, '240000'),
('005', '31-12-2021 15:21', 'bobi', 'PC-006', '12-12-21', '14-12-21', 2, '240000'),
('006', '01-01-2022 11:09', 'Joni', 'PC-012', '12-12-20', '16-12-20', 4, '480000'),
('003', '01-01-2022 12:21', 'Ratu', 'PC-007', '12-12-21', '16-12-21', 4, '480000');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
