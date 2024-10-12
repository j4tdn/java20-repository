-- Câu 1: Tạo đầy đủ lược đồ cơ sở dữ liệu quan hệ như mô tả ở trên. Sinh viên tự định nghĩa kiểu dữ liệu cho các cột
DROP DATABASE java20_karaoke;
CREATE DATABASE java20_karaoke;
USE java20_karaoke;

-- KHACHHANG
CREATE TABLE IF NOT EXISTS KHACHHANG
(
	MaKH VARCHAR(50) PRIMARY KEY,
    TenKH VARCHAR(100) NOT NULL,
    DiaChi VARCHAR(100),
    SoDT INT NOT NULL CHECK (SoDT > 0),
    MaSoThue INT CHECK (MaSoThue > 0) NOT NULL    
);

-- MUCTIENGIO
CREATE TABLE IF NOT EXISTS MUCTIENGIO
(
	MaTienGio VARCHAR(50) PRIMARY KEY,
    DonGia INT NOT NULL,
    MoTa VARCHAR(100)
);

-- PHONG
CREATE TABLE IF NOT EXISTS PHONG
(
	MaPhong VARCHAR(50) PRIMARY KEY,
    SoKhachToiDa INT NOT NULL CHECK (SoKhachToiDa > 0),
    TrangThai VARCHAR(100) NOT NULL DEFAULT 'Duoc su dung',
    MoTa VARCHAR(100)
);

-- DICHVU
CREATE TABLE IF NOT EXISTS DICHVU
(
	MaDV VARCHAR(50) PRIMARY KEY,
    TenDV VARCHAR(100) NOT NULL,
    DonViTinh VARCHAR(50) NOT NULL,
    DonGia INT NOT NULL
);

-- HOADON
CREATE TABLE IF NOT EXISTS HOADON
(
	MaHD VARCHAR(50) PRIMARY KEY,
    MaKH VARCHAR(50) NOT NULL,
    MaPhong VARCHAR(50) NOT NULL,
    MaTienGio VARCHAR(50) NOT NULL,
    ThoiGianBatDauSD DATETIME NOT NULL,
    ThoiGianKetThucSD DATETIME NOT NULL,
    TrangThaiHD VARCHAR(100) NOT NULL,
    CONSTRAINT FK_HOADON_KHACHHANG FOREIGN KEY (MaKH) REFERENCES KHACHHANG(MaKH),
    CONSTRAINT FK_HOADON_PHONG FOREIGN KEY (MaPHong) REFERENCES PHONG(MaPhong),
    CONSTRAINT FK_HOADON_MUCTIENGIO FOREIGN KEY (MaTienGio) REFERENCES MUCTIENGIO(MaTienGio)
    -- Thếu UNIQUE CONSTRAINT cho (MaKH, MaPhong, MaTienGio)
);

-- CHITIET_SUDUNGDV
CREATE TABLE IF NOT EXISTS CHITIET_SUDUNGDV
(
	MaHD VARCHAR(50),
	MaDV VARCHAR(50),
    SoLuong INT NOT NULL,
    PRIMARY KEY (MaHD, MaDV),
    CONSTRAINT FK_CHITIET_SUDUNGDV_HOADON FOREIGN KEY (MaHD) REFERENCES HOADON(MaHD),
    CONSTRAINT FK_CHITIET_SUDUNGDV_DICHVU FOREIGN KEY (MaDV) REFERENCES DICHVU(MaDV)
);

-- Câu 2: Chèn tối thiểu 2 dòng dữ liệu mẫu cho mỗi bảng đã được minh họa ở trên vào tất cảcác bảng một cách chính xác
INSERT INTO KHACHHANG(MaKH,TenKH,DiaChi,SoDT,MaSoThue) VALUES
	('KH001', 'Tran Van Nam', 'Hai Chau', 0905123456, 12345678),
    ('KH002', 'Nguyen Mai Anh', 'Lien Chieu', 0905123457, 12345679),
    ('KH003', 'Phan Hoai Lan Khue', 'Hoa Vang', 0905123458, 12345680),
    ('KH004', 'Nguyen Hoai Nguyen', 'Hoa Cam', 0905123459, 12345681),
    ('KH005', 'Le Truong Ngoc Anh', 'Hai Chau', 0905123460, 12345682);
SELECT * FROM KHACHHANG;

INSERT INTO MUCTIENGIO(MaTienGio,DonGia,MoTa) VALUES
	('MT01', 60000, 'Ap dung tu 6 gio den 17 gio'),
	('MT02', 80000, 'Ap dung tu 17 gio den 22 gio'),
	('MT03', 100000, 'Ap dung tu 22 gio den 6 gio sang');
SELECT * FROM MUCTIENGIO;

INSERT INTO PHONG(MaPhong,SoKhachToiDa,TrangThai,MoTa) VALUES
	('VIP01', 5, 'Duoc su dung', 'phong vip'),
	('P02', 10, 'Duoc su dung', 'phong binh thuong'),
	('P03', 15, 'Duoc su dung', 'phong binh thuong'),
	('VIP04', 20, 'Duoc su dung', 'phong vip'),
	('P05', 25, 'Duoc su dung', 'phong binh thuong');
SELECT * FROM PHONG;

INSERT INTO DICHVU(MaDV,TenDV,DonViTinh,DonGia) VALUES
	('DV01','Hat Dua','Bao',5000),
	('DV02','Trai Cay','Dia',30000),
	('DV03','Bia','Lon',35000),
	('DV04','Nuoc Ngot','Chai',10000),
	('DV05','Ruou','Chai',200000);
SELECT * FROM DICHVU;

INSERT INTO HOADON(MaHD,MaKH,MaPhong,MaTienGio,ThoiGianBatDauSD,ThoiGianKetThucSD,TrangThaiHD) VALUES
	('HD001', 'KH001', 'VIP01','MT01','2015-11-20 8:15','2015-11-20 12:30','Da Thanh Toan'),
	('HD002', 'KH002', 'P02','MT01','2015-11-20 13:10','2015-11-20 17:20','Chua Thanh Toan'),
	('HD003', 'KH001', 'P02','MT01','2015-10-15 12:12','2015-10-15 16:30','Da Thanh Toan'),
	('HD004', 'KH003', 'VIP01','MT02','2015-09-20 18:30','2015-09-20 21:30','Chua Thanh Toan'),
	('HD005', 'KH001', 'P03','MT02','2015-11-25 20:15','2015-11-25 21:45','Thanh Toan Mot Phan');
SELECT * FROM HOADON;

INSERT INTO CHITIET_SUDUNGDV(MaHD,MaDV,SoLuong) VALUES
	('HD001','DV01',5),
	('HD002','DV01',8),
	('HD002','DV02',5),
	('HD002','DV03',2),
	('HD003','DV04',1);
SELECT * FROM CHITIET_SUDUNGDV;

-- Câu 3: Liệt kê các phòng karaoke được sử dụng nhiều nhất từ 10.2015 đến 10.2016
SELECT 	p.MaPhong,
		p.MoTa,
		sec_to_time(sum(time_to_sec(timediff(hd.ThoiGianKetThucSD, hd.ThoiGianBatDauSD)))) TongThoiGianSuDung
FROM PHONG AS p
	JOIN HOADON hd 
		ON p.MaPhong = hd.MaPhong
WHERE hd.ThoiGianBatDauSD >= '2015-10-1 0:0' AND hd.ThoiGianKetThucSD <= '2016-10-1 0:0'
GROUP BY p.MaPhong
ORDER BY TongThoiGianSuDung DESC;

-- Câu 4: Liệt kê 2 dịch vụ được sử dụng nhiều nhất trong mỗi tháng từ 10.2015 đến 10.2016
SELECT 	dv.*, -- chưa được
		sec_to_time(sum(time_to_sec(timediff(hd.ThoiGianKetThucSD, hd.ThoiGianBatDauSD)))) TongThoiGianSuDung
FROM DICHVU AS dv
	JOIN CHITIET_SUDUNGDV AS ctsd
		ON dv.MaDV = ctsd.MaDV
	JOIN HOADON AS hd 
		ON hd.MaHD = ctsd.MaHD
WHERE hd.ThoiGianBatDauSD >= '2015-10-1 0:0' AND hd.ThoiGianKetThucSD <= '2016-10-1 0:0'
GROUP BY dv.MaDV -- theo đúng cú pháp và mode cho tất cả các HQT CSDL thì nếu câu lệnh có group by thì chỗ select chỉ select được
-- các column group by và hàm xử lý
ORDER BY TongThoiGianSuDung DESC
LIMIT 2;

-- Câu 5: Liệt kê thông tin của các phòng karaoke có mã phòng bắt đầu bằng cụm từ "VIP"
SELECT *
FROM PHONG
WHERE MaPhong LIKE 'VIP%';