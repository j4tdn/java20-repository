CREATE DATABASE `java23-final-test` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci;
USE `java23-final-test`;

CREATE TABLE `khachhang`(
	MaKH CHAR(5) PRIMARY KEY,
    TenKH VARCHAR(50),
    DiaChi TEXT,
    SoDT VARCHAR(15),
    MaSoThue VARCHAR(20)
);

CREATE TABLE `muctiengio` (
	MaTienGio CHAR(4) PRIMARY KEY,
    DonGia FLOAT,
    MoTa TEXT
);

CREATE TABLE `phong` (
	MaPhong VARCHAR(5) PRIMARY KEY,
    SoKhachToiDa INT,
    TrangThai VARCHAR(20),
    MoTa TEXT
);

CREATE TABLE `dichvu` (
	MaDV CHAR(4) PRIMARY KEY,
    TenDV VARCHAR(30),
    DonViTinh VARCHAR(20),
    DonGia FLOAT
);

CREATE TABLE `hoadon` (
	MaHD CHAR(5) PRIMARY KEY,
    MaKH CHAR(5) ,
    MaPhong VARCHAR(5),
    MaTienGio CHAR(4),
    ThoiGianBatDauSD DATETIME,
    ThoiGianKetThucSD DATETIME,
    TrangThaiSD VARCHAR(20)
);

ALTER TABLE `hoadon`
ADD CONSTRAINT FOREIGN KEY(`MaKH`) REFERENCES `khachhang`(MaKH);

ALTER TABLE `hoadon`
ADD CONSTRAINT FOREIGN KEY(`MaPhong`) REFERENCES `phong`(MaPhong);


ALTER TABLE `hoadon`
ADD CONSTRAINT FOREIGN KEY(`MaTienGio`) REFERENCES `muctiengio`(MaTienGio);

CREATE TABLE `chitiet_sudungdv` (
	MaHD CHAR(5),
    MaDV CHAR(4),
    SoLuong INT,
    PRIMARY KEY(MaHD, MaDV),
    CONSTRAINT UNIQUE (MaHD, MaDV)
);

ALTER TABLE `chitiet_sudungdv`
ADD CONSTRAINT FOREIGN KEY(`MaHD`) REFERENCES `hoadon`(MaHD);

ALTER TABLE `chitiet_sudungdv`
ADD CONSTRAINT FOREIGN KEY(`MaDV`) REFERENCES `dichvu`(MaDV);

