CREATE DATABASE java20_test_sql CHAR SET utf8mb4;
USE java20_test_sql;
-- cau 1
CREATE TABLE KhachHang (
	MaKH VARCHAR(255) PRIMARY KEY,
    TenKH VARCHAR(200) ,
    DiaChi VARCHAR(200),
    SoDT VARCHAR(200),
    MaSoThue VARCHAR(200)
    
);
CREATE TABLE MucTienGio (
	MaTienGio VARCHAR(255) PRIMARY KEY,
    DonGia  BIGINT,
    MoTa VARCHAR(255)
);
CREATE TABLE DichVu (
	MaDV VARCHAR(255) PRIMARY KEY,
    TenDV VARCHAR(255),
    DonViTinh VARCHAR(255),
    DonGia BIGINT
);
CREATE TABLE Phong (
	MaPhong VARCHAR(100) PRIMARY KEY,
    SoKhachToiDa INT,
    TrangThai VARCHAR(200),
    MoTa VARCHAR(255)
);
CREATE TABLE HoaDon (
	MaHD VARCHAR(255) PRIMARY KEY,
    MaKH  VARCHAR(255) ,
    MaPhong VARCHAR(100),
    MaTienGio VARCHAR(255),
    ThoiGianBatDauSD TIMESTAMP,
    ThoiGianKetThucSD TIMESTAMP,
    TrangThaiHD VARCHAR(255),
    CONSTRAINT FK_KH FOREIGN KEY (MaKH) REFERENCES KhachHang(MaKH),
	CONSTRAINT FK_PHong FOREIGN KEY (MaPhong) REFERENCES Phong(MaPhong),
	CONSTRAINT FK_MATIENGIO FOREIGN KEY (MaTienGio) REFERENCES MucTienGio(MaTienGio)
);

CREATE TABLE CHITIET_SUDUNGDV (
	MaHD VARCHAR(255) ,
    MaDV VARCHAR(255),
    SoLuong VARCHAR(255),
    CONSTRAINT PK_CTDH PRIMARY KEY (MaHD,MaDV),
    CONSTRAINT FK_DonHang FOREIGN KEY (MaHD) REFERENCES HoaDon(MaHD),
    CONSTRAINT FK_DichVu FOREIGN KEY (MaDV) REFERENCES DichVu(MaDV)
);
-- cau 2
INSERT INTO KhachHang(MaKH,TenKH,DiaChi,SoDT,MaSoThue) 
VALUES
("KH001","Tran Van Nam","Hai Chau", "0905123456","12345678"),
("KH002","Nguyen Mai Anh","Lien Chieu", "0905123457","12345679"),
("KH003","Phan Hoai Lan Khue","Hoa Vang", "0905123458","12345680"),
("KH004","Nguyen Hoai Lan Khue","Hoa Cam", "0905123459","12345681");

INSERT INTO Phong (MaPhong, SoKhachToiDa, TrangThai, MoTa)
VALUES
("VIP01", 5, 'Duoc Su Dung', 'Phong vip'),
("P02", 10, 'Duoc Su Dung', 'Phong binh thuong'),
("P03", 15, 'Duoc Su Dung','Phong binh thuong'),
("VIP04", 20, 'Duoc Su Dung', 'Phong vip');

INSERT INTO DichVu (MaDV, TenDV, DonViTinh, DonGia)
VALUES
("DV01", 'Hat Dua', 'Bao', 5000),
("DV02", 'Trai Cay', 'Dia', 30000),
("DV03", 'Bia', 'Lon', 35000),
("DV04", 'Nuoc Ngot', 'Chai', 10000);

INSERT INTO MucTienGio (MaTienGio, DonGia, MoTa)
VALUES
("MT01", 60000, 'Ap dung tu 6 gio den 17 gio'),
("MT02", 80000, 'Ap dung sau 17 gio den 22 gio'),
("MT03", 100000, 'Ap dung tu sau 22 gio den 6 gio sang	');

INSERT INTO HoaDon (MaHD, MaKH, MaPhong, MaTienGio, ThoiGianBatDauSD, ThoiGianKetThucSD, TrangThaiHD)
VALUES
("HD001", "KH001", "VIP01", "MT01", str_to_date('20/11/2015 8:15', '%d/%m/%Y %H:%i'), str_to_date('20/11/2015 12:30', '%d/%m/%Y %H:%i'), 'Da thanh toan'),
("HD002", "KH002", "P02", "MT01", str_to_date('12/12/2015 13:10', '%d/%m/%Y %H:%i'), str_to_date('12/12/2015 17:20', '%d/%m/%Y %H:%i'), 'Chưa thanh toan'),
("HD003", "KH001", "P02", "MT01", str_to_date('15/10/2014 12:12', '%d/%m/%Y %H:%i'), str_to_date('15/10/2014 16:30', '%d/%m/%Y %H:%i'), 'Da thanh toan'),
("HD004", "KH003", "VIP01", "MT02", str_to_date('20/9/2015 18:30', '%d/%m/%Y %H:%i'), str_to_date('20/9/2015 21:00', '%d/%m/%Y %H:%i'), 'Chưa thanh toan'),
("HD006", "KH002", "VIP01", "MT01", str_to_date('12/9/2014 9:20', '%d/%m/%Y %H:%i'), str_to_date('12/9/2014 10:45', '%d/%m/%Y %H:%i'), 'Da thanh toan');

INSERT INTO CHITIET_SUDUNGDV (MaHD, MaDV, SoLuong)
VALUES
("HD003", "DV04", 1),
("HD003", "DV03", 6),
("HD002", "DV02", 5),
("HD006", "DV01", 5),
("HD001", "DV01", 5),
("HD002", "DV01", 8),
("HD001", "DV02", 5),
("HD002", "DV03", 2);

-- cau 3
SELECT p.*, mp.ThgianSD AS thoigianSD
FROM Phong AS p
JOIN (SELECT MaPhong, sum(timediff(cast(ThoiGianKetThucSD AS DATETIME), cast(ThoiGianBatDauSD AS DATETIME))) AS ThgianSD
		FROM HoaDon
	   WHERE ThoiGianBatDauSD BETWEEN str_to_date('1/2/2014 00:00', '%d/%m/%Y %H:%i') AND str_to_date('28/2/2015 23:59', '%d/%m/%Y %H:%i')
	GROUP BY MaPhong
	  HAVING ThgianSD = (SELECT sum(timediff(cast(ThoiGianKetThucSD AS DATETIME), cast(ThoiGianBatDauSD AS DATETIME))) AS `time`
						FROM HoaDon
						WHERE ThoiGianBatDauSD BETWEEN str_to_date('1/2/2014 00:00', '%d/%m/%Y %H:%i') AND str_to_date('28/2/2015 23:59', '%d/%m/%Y %H:%i')
					GROUP BY MaPhong
					ORDER BY `time` DESC
					   LIMIT 1)) AS mp
ON p.MaPhong = mp.MaPhong;

-- cau4 
WITH ThgianSDMoiThang AS (
    SELECT  dv.MaDV, dv.TenDV,
			MONTH(CAST(hd.ThoiGianBatDauSD AS DATE)) AS thang, YEAR(CAST(hd.ThoiGianBatDauSD AS DATE)) AS nam,
			SUM(ctdv.SoLuong) AS SoLanSD
    FROM DichVu AS dv
    JOIN CHITIET_SUDUNGDV ctdv
	ON dv.MaDV = ctdv.MaDV
	JOIN HoaDon hd
	ON hd.MaHD = ctdv.MaHD
    WHERE ThoiGianBatDauSD BETWEEN str_to_date('1/1/2014 00:00', '%d/%m/%Y %H:%i') AND str_to_date('31/12/2015 23:59', '%d/%m/%Y %H:%i')
    GROUP BY dv.MaDV, thang, nam
),
XepHangDV AS (
    SELECT	thang, nam, MaDV, TenDV, SoLanSD,
			ROW_NUMBER() OVER (PARTITION BY thang ORDER BY SoLanSD DESC) AS `rank`
    FROM ThgianSDMoiThang
)
SELECT	thang, nam, MaDV, TenDV, SoLanSD
FROM XepHangDV
WHERE `rank` <= 2
ORDER BY thang, `rank`;

-- cau 5
SELECT *
FROM Phong 
WHERE MaPhong LIKE 'VIP%';
