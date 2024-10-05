INSERT INTO `khachhang` (MaKH, TenKH, DiaChi, SoDT, MaSoThue) VALUES
('KH001', 'Nguyen Van A', '123 Le Loi, Hanoi', '0981234567', '0101234567'),
('KH002', 'Le Thi B', '456 Hoang Hoa Tham, HCMC', '0931234568', '0301234568'),
('KH003', 'Tran Van C', '789 Phan Dinh Phung, Da Nang', '0912345679', '0501234569');

INSERT INTO `muctiengio` (MaTienGio, DonGia, MoTa) VALUES
('TG01', 150000, '1 hour rate'),
('TG02', 250000, '2 hours rate'),
('TG03', 350000, '3 hours rate');

INSERT INTO `muctiengio` (MaTienGio, DonGia, MoTa) VALUES
('MT01', 150000, '1 hour rate'),
('MT02', 250000, '2 hours rate'),
('MT03', 350000, '3 hours rate');

INSERT INTO `phong` (MaPhong, SoKhachToiDa, TrangThai, MoTa) VALUES
('VIP01', 4, 'Duoc su dung', 'Phong VIP'),
('P01', 2, 'Duoc su dung', 'Phong binh thuong'),
('VIP02', 6, 'Duoc su dung', 'Phong binh thuong');

INSERT INTO `dichvu` (MaDV, TenDV, DonViTinh, DonGia) VALUES
('DV01', 'Hat Dua', 'Bao', 30000),
('DV02', 'Trai cay', 'Dia', 20000),
('DV03', 'Bia', 'Lon', 120000);

INSERT INTO `hoadon` (MaHD, MaKH, MaPhong, MaTienGio, ThoiGianBatDauSD, ThoiGianKetThucSD, TrangThaiSD) VALUES
('HD001', 'KH001', 'VIP01', 'MT01', '2024-10-01 14:00:00', '2024-10-01 16:00:00', 'Chua thanh toan'),
('HD002', 'KH002', 'P01', 'MT02', '2024-10-02 10:00:00', '2024-10-02 11:00:00', 'Da thanh toan'),
('HD003', 'KH003', 'VIP02', 'MT03', '2024-10-03 12:00:00', '2024-10-03 15:00:00', 'Da thanh toan');

INSERT INTO `chitiet_sudungdv` (MaHD, MaDV, SoLuong) VALUES
('HD001', 'DV01', 2),
('HD001', 'DV02', 3),
('HD002', 'DV01', 1),
('HD002', 'DV03', 1),
('HD003', 'DV02', 5);
