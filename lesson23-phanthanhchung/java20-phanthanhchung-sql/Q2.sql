USE KARAOKE_SERVICE;

-- Câu 2
INSERT INTO KHACHHANG (MaKH, TenKH, DiaChi, SoDT, MaSoThue)
VALUES ('KH001', 'Tran Van Nam', 'Hai Chau', '0905132458', '12345678'),
('KH002', 'Nguyen Mai Anh', 'Lien Chieu', '0905132457', '12345679'),
('KH003', 'Pham Hoai Lan Khue', 'Hoa Vang',  '0905132456', '12345680'),
('KH004', 'Nguyen Hoai Nguyen', 'Hoa Cam',  '0905132459', '12345681'),
('KH005', 'Le Truong Ngoc Anh', 'Hai Chau',  '0905132460', '12345682'),
('KH006', 'Ho Hoai Anh', 'Hai Chau',  '0905132461', '12345683'),
('KH007', 'Pham Thi Huong', 'Son Tra',  '0905132462', '12345684'),
('KH008', 'Chau Trinh Tri', 'Hai Chau',  '0905132463', '12345685'),
('KH009', 'Phan Nhu Thao', 'Hoa Khanh',  '0905132464', '12345686'),
('KH010', 'Tran Thi To Tam', 'Son Tra',  '0905132465', '12345687');

INSERT INTO PHONG (MaPhong, SoKhachToiDa, TrangThai, MoTa)
VALUES ('VIP01', 5, 'Duoc su dung', 'phong vip'),
('P02', 10, 'Duoc su dung', 'phong binh thuong'),
('P03', 15, 'Duoc su dung', 'phong binh thuong'),
('VIP04', 20, 'Duoc su dung', 'phong vip'),
('P05', 25, 'Duoc su dung', 'phong binh thuong'),
('P06', 30, 'Duoc su dung', 'phong binh thuong'),
('VIP07', 35, 'Duoc su dung', 'phong vip'),
('P08', 40, 'Duoc su dung', 'phong binh thuong'),
('VIP09', 45, 'Duoc su dung', 'phong vip'),
('P10', 50, 'Duoc su dung', 'phong binh thuong');

INSERT INTO DICHVU (MaDV, TenDV, DonViTinh, DonGia)
VALUES ('DV01', 'Hat Dua', 'Bao', 5000),
('DV02', 'Trai cay', 'Dia', 30000),
('DV03', 'Bia', 'Lon', 35000),
('DV04', 'Nuoc Ngot', 'Chai', 10000),
('DV05', 'Ruou', '', 200000);

INSERT INTO MUCTIENGIO (MaTienGio, DonGia, MoTa)
VALUES ('MT01', 60000, 'Ap dung tu 6 gio den 17 gio'),
('MT02', 80000, 'Ap dung sau 17 gio den 22 gio'),
('MT03', 100000, 'Ap dung tu sau 22 gio den 6 gio sang');

INSERT INTO HOADON (MaHD, MaKH, MaPhong, MaTienGio, ThoiGianBatDauSD, ThoiGianKetThucSD, TrangThaiHD)
VALUES
('HD001', 'KH001', 'VIP01', 'MT01', STR_TO_DATE('2015/11/20 08:15:00', '%Y/%m/%d %H:%i:%s'), STR_TO_DATE('2015/11/20 12:30:00', '%Y/%m/%d %H:%i:%s'), 'Da thanh toan'),
('HD002', 'KH002', 'P02', 'MT01', STR_TO_DATE('2015/12/12 13:10:00', '%Y/%m/%d %H:%i:%s'), STR_TO_DATE('2015/12/12 17:20:00', '%Y/%m/%d %H:%i:%s'), 'Chua thanh toan'),
('HD003', 'KH001', 'P02', 'MT01', STR_TO_DATE('2014/10/15 12:12:00', '%Y/%m/%d %H:%i:%s'), STR_TO_DATE('2014/10/15 16:30:00', '%Y/%m/%d %H:%i:%s'), 'Da thanh toan'),
('HD004', 'KH003', 'VIP01', 'MT02', STR_TO_DATE('2015/09/20 18:30:00', '%Y/%m/%d %H:%i:%s'), STR_TO_DATE('2015/09/20 21:00:00', '%Y/%m/%d %H:%i:%s'), 'Chua thanh toan'),
('HD005', 'KH001', 'P03', 'MT02', STR_TO_DATE('2014/11/25 20:00:00', '%Y/%m/%d %H:%i:%s'), STR_TO_DATE('2014/11/25 21:45:00', '%Y/%m/%d %H:%i:%s'), 'Thanh toan mot phan'),
('HD006', 'KH002', 'VIP01', 'MT01', STR_TO_DATE('2014/09/12 09:20:00', '%Y/%m/%d %H:%i:%s'), STR_TO_DATE('2014/09/12 10:45:00', '%Y/%m/%d %H:%i:%s'), 'Da thanh toan'),
('HD007', 'KH006', 'VIP04', 'MT01', STR_TO_DATE('2014/12/22 11:00:00', '%Y/%m/%d %H:%i:%s'), STR_TO_DATE('2014/12/22 14:20:00', '%Y/%m/%d %H:%i:%s'), 'Da thanh toan'),
('HD008', 'KH007', 'VIP04', 'MT02', STR_TO_DATE('2014/08/23 20:10:00', '%Y/%m/%d %H:%i:%s'), STR_TO_DATE('2014/08/23 22:00:00', '%Y/%m/%d %H:%i:%s'), 'Chua thanh toan'),
('HD009', 'KH006', 'P05', 'MT03', STR_TO_DATE('2015/12/20 22:30:00', '%Y/%m/%d %H:%i:%s'), STR_TO_DATE('2015/12/21 01:15:00', '%Y/%m/%d %H:%i:%s'), 'Chua thanh toan'),
('HD010', 'KH005', 'VIP01', 'MT03', STR_TO_DATE('2015/10/10 01:30:00', '%Y/%m/%d %H:%i:%s'), STR_TO_DATE('2015/10/10 03:15:00', '%Y/%m/%d %H:%i:%s'), 'Da thanh toan'),
('HD011', 'KH004', 'VIP07', 'MT03', STR_TO_DATE('2015/12/25 22:15:00', '%Y/%m/%d %H:%i:%s'), STR_TO_DATE('2015/12/26 02:00:00', '%Y/%m/%d %H:%i:%s'), 'Da thanh toan'),
('HD012', 'KH008', 'P06', 'MT03', STR_TO_DATE('2014/07/25 23:45:00', '%Y/%m/%d %H:%i:%s'), STR_TO_DATE('2015/07/26 02:15:00', '%Y/%m/%d %H:%i:%s'), 'Da thanh toan'),
('HD013', 'KH007', 'VIP07', 'MT02', STR_TO_DATE('2015/08/21 18:15:00', '%Y/%m/%d %H:%i:%s'), STR_TO_DATE('2015/08/21 20:45:00', '%Y/%m/%d %H:%i:%s'), 'Da thanh toan'),
('HD014', 'KH004', 'P06', 'MT02', STR_TO_DATE('2015/12/31 19:12:00', '%Y/%m/%d %H:%i:%s'), STR_TO_DATE('2015/12/31 21:15:00', '%Y/%m/%d %H:%i:%s'), 'Thanh toan mot phan'),
('HD015', 'KH001', 'P06', 'MT01', STR_TO_DATE('2014/06/24 13:00:00', '%Y/%m/%d %H:%i:%s'), STR_TO_DATE('2014/06/24 13:15:00', '%Y/%m/%d %H:%i:%s'), 'Thanh toan mot phan'),
('HD016', 'KH003', 'P08', 'MT01', STR_TO_DATE('2014/05/12 08:00:00', '%Y/%m/%d %H:%i:%s'), STR_TO_DATE('2014/05/12 10:45:00', '%Y/%m/%d %H:%i:%s'), 'Thanh toan mot phan'),
('HD017', 'KH003', 'VIP09', 'MT01', STR_TO_DATE('2015/11/20 12:15:00', '%Y/%m/%d %H:%i:%s'), STR_TO_DATE('2015/11/20 14:20:00', '%Y/%m/%d %H:%i:%s'), 'Da thanh toan'),
('HD018', 'KH001', 'P10', 'MT01', STR_TO_DATE('2015/04/12 14:45:00', '%Y/%m/%d %H:%i:%s'), STR_TO_DATE('2015/04/12 16:45:00', '%Y/%m/%d %H:%i:%s'), 'Da thanh toan'),
('HD019', 'KH002', 'VIP09', 'MT03', STR_TO_DATE('2015/11/12 22:12:00', '%Y/%m/%d %H:%i:%s'), STR_TO_DATE('2015/11/13 02:00:00', '%Y/%m/%d %H:%i:%s'), 'Da thanh toan'),
('HD020', 'KH004', 'VIP09', 'MT03', STR_TO_DATE('2014/02/25 01:15:00', '%Y/%m/%d %H:%i:%s'), STR_TO_DATE('2014/02/25 04:15:00', '%Y/%m/%d %H:%i:%s'), 'Chua thanh toan');

INSERT INTO CHITIET_SUDUNGDV(MaHD, MaDV, SoLuong)
VALUES
('HD001', 'DV01', 5),
('HD002', 'DV01', 8),
('HD002', 'DV02', 5),
('HD002', 'DV03', 2),
('HD003', 'DV04', 1),
('HD003', 'DV05', 6),
('HD004', 'DV01', 5),
('HD005', 'DV02', 3),
('HD005', 'DV03', 10),
('HD005', 'DV04', 2),
('HD006', 'DV01', 5),
('HD007', 'DV03', 8),
('HD007', 'DV04', 10),
('HD007', 'DV05', 4),
('HD013', 'DV02', 9),
('HD011', 'DV02', 8);
