INSERT INTO KHACHHANG (MaKH, TenKH, DiaChi, SoDT, MaSoThue) VALUES
('KH001', 'Tran Van Nam', 'Hai Chau', '0909123456', '123456789'),
('KH002', 'Nguyen Mai Anh', 'Lien Chieu', '0909876543', '987654321');

INSERT INTO MUCTIENGIO (MaTienGio, DonGia, MoTa) VALUES
('MTG01', 60000, 'Ap dung tu 6 den 17 gio'),
('MTG02', 80000, 'Ap dung tu 17 den 22 gio'),
('MTG03', 100000, 'Ap dung tu sau 22 gio den 6 gio sang');

INSERT INTO PHONG (MaPhong, SoKhachToiDa, TrangThai, MoTa) VALUES
('VIP01', 5, TRUE, 'Phòng VIP'),
('P02', 10, TRUE, 'Phòng thường');

INSERT INTO DICHVU (MaDV, TenDV, DonViTinh, DonGia) VALUES
('DV01', 'Bia', 'Lon', 10000),
('DV02', 'Trai Cay', 'Dia', 30000);

INSERT INTO HOADON (MaHD, MaKH, MaPhong, MaTienGio, ThoiGianBatDauSD, ThoiGianKetThucSD, TrangThaiHD) VALUES
('HD001', 'KH001', 'VIP01', 'MTG01', '2014-03-01 14:00:00', '2024-10-01 16:00:00', TRUE),
('HD002', 'KH002', 'P02', 'MTG02', '2015-03-02 18:00:00', '2024-10-02 20:00:00', FALSE);

INSERT INTO CHITIET_SUDUNGDV (MaHD, MaDV, SoLuong) VALUES
('HD001', 'DV01', 3),
('HD001', 'DV02', 2),
('HD002', 'DV01', 1),
('HD002', 'DV02', 4);