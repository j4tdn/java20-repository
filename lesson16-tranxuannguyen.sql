-- Đề bài: Xây dựng cơ sở dữ liệu quản lý công ty để theo dõi các thông tin liên quan tới nhân viên,
-- phòng ban và dự án, chi tiết được mô tả như sau:
-- Công ty được tổ chức thành các phòng ban chức năng. Mỗi phòng ban có một tên duy nhất, một mã
-- số duy nhất, một nhân viên cụ thể quản lý phòng đó.
-- Việc nhân viên quản lý phòng ban được ghi lại bằng ngày nhân viên đó bắt đầu quản lý và được gọi
-- là trưởng phòng. Ta ghi nhận lại ngày nhận chức của trưởng phòng.
-- Công ty sẽ có nhiều dự án, một dự án có một tên duy nhất, một mã số duy nhất, ngày bắt đầu, ngày
-- kết thúc(hoàn thành dự án), số tiền thu được(đơn vị VNĐ) từ dự án đó.
-- Dự án được thực hiện bởi một hoặc nhiều nhân viên, có một nhân viên duy nhất làm quản lý dự án.
-- Với mỗi nhân viên chúng ta lưu giữ lại các thông tin bao gồm họ tên, mã số duy nhất, địa chỉ,
-- lương, giới tính, ngày sinh, ngày vào công ty
-- Một nhân viên chỉ làm việc cho một phòng ban nhưng có thể làm việc cho nhiều dự án.
-- Chúng ta lưu giữ lại số giờ làm việc của mỗi nhân viên trên dự án mà nhân viên đó tham gia. Mỗi
-- nhân viên có thể có một người quản lý giám sát trực tiếp, người đó cũng là một nhân viên, nhân
-- viên và quản lý/giám sát của nhân viên có thể tham gia cùng/khác dự án.


CREATE DATABASE LESSON16_EXAM CHAR SET utf8mb4;
USE LESSON16_EXAM;
-- Phần A. Viết các lệnh để xây dựng mô hình thực thể kết hợp (ER) dựa vào mô tả trên
-- Tạo bảng "Nhân viên"
CREATE TABLE NhanVien (
  MaNhanVien INT,
  HoTen VARCHAR(255) NOT NULL,
  DiaChi VARCHAR(255) NOT NULL,
  Luong DECIMAL(10, 2) NOT NULL,
  GioiTinh VARCHAR(10) NOT NULL,
  NgaySinh DATE NOT NULL,
  NgayVaoCongTy DATE NOT NULL,
  MaPhongBan INT NOT NULL,
  MaNhanVienQuanLy INT NOT NULL,
  PRIMARY KEY (MaNhanVien));
  ALTER TABLE NhanVien
  ADD CONSTRAINT FK_NhanVien_PhongBan FOREIGN KEY (MaPhongBan) REFERENCES PhongBan(MaPhongBan);
  ALTER TABLE NhanVien
  ADD CONSTRAINT FK_NhanVien_NhanVienQuanLy FOREIGN KEY (MaNhanVienQuanLy) REFERENCES NhanVien(MaNhanVien);

-- Tạo bảng "Phòng ban"
CREATE TABLE PhongBan (
  MaPhongBan INT,
  TenPhongBan VARCHAR(255) NOT NULL,
  MaNhanVienQuanLy INT NOT NULL,
  PRIMARY KEY (MaPhongBan),
  CONSTRAINT FK_PhongBan_NhanVien FOREIGN KEY (MaNhanVienQuanLy) REFERENCES NhanVien(MaNhanVien)
);

-- Tạo bảng "Dự án"
CREATE TABLE DuAn (
  MaDuAn INT,
  TenDuAn VARCHAR(255) NOT NULL,
  NgayBatDau DATE NOT NULL,
  NgayKetThuc DATE NOT NULL,
  PRIMARY KEY (MaDuAn),
  SoTienThuDuoc DECIMAL(15, 2)
);

-- Tạo bảng "Quản lý dự án"
CREATE TABLE QuanLyDuAn (
  MaDuAn INT,
  MaNhanVienQuanLy INT,
  CONSTRAINT FK_QuanLyDuAn_DuAn FOREIGN KEY (MaDuAn) REFERENCES DuAn(MaDuAn),
  CONSTRAINT FK_QuanLyDuAn_NhanVien FOREIGN KEY (MaNhanVienQuanLy) REFERENCES NhanVien(MaNhanVien),
  PRIMARY KEY (MaDuAn, MaNhanVienQuanLy)
);

-- Tạo bảng "Tham gia dự án"
CREATE TABLE ThamGiaDuAn (
  MaDuAn INT,
  MaNhanVien INT,
  SoGioLamViec DECIMAL(5, 2) NOT NULL,
  CONSTRAINT FK_ThamGiaDuAn_DuAn FOREIGN KEY (MaDuAn) REFERENCES DuAn(MaDuAn),
  CONSTRAINT FK_ThamGiaDuAn_NhanVien FOREIGN KEY (MaNhanVien) REFERENCES NhanVien(MaNhanVien),
  PRIMARY KEY (MaDuAn, MaNhanVien)
);
-- Phần B. Viết các lệnh để tạo dữ liệu kiểm thử cho dự án
-- Yêu cầu: Ít nhất 5 dòng cho mỗi bảng dữ liệu
-- Thêm dữ liệu vào bảng "Phòng ban"
SET FOREIGN_KEY_CHECKS= 0;
INSERT INTO PhongBan (MaPhongBan, TenPhongBan, MaNhanVienQuanLy)
VALUES
    (1, 'Phòng Nhân sự', 101),
    (2, 'Phòng Kế toán', 102),
    (3, 'Phòng Kỹ thuật', 103),
    (4, 'Phòng Kinh doanh', 104),
    (5, 'Phòng Quản lý', 105);

-- Thêm dữ liệu vào bảng "Nhân viên"
INSERT INTO NhanVien (MaNhanVien, HoTen, DiaChi, Luong, GioiTinh, NgaySinh, NgayVaoCongTy, MaPhongBan, MaNhanVienQuanLy)
VALUES
    (101, 'Nguyen Van A', '123 Đường ABC, Quận 1, TP.HCM', 5000, 'Nam', '1990-01-01', '2010-01-01', 1, 104),
    (102, 'Tran Thi B', '456 Đường XYZ, Quận 2, TP.HCM', 6000, 'Nữ', '1992-05-10', '2012-03-15', 2, 101),
    (103, 'Pham Van C', '789 Đường DEF, Quận 3, TP.HCM', 5500, 'Nam', '1988-12-05', '2008-06-20', 1, 101),
    (104, 'Hoang Thi D', '567 Đường MNO, Quận 4, TP.HCM', 7000, 'Nữ', '1995-09-20', '2014-11-10', 3, 103),
    (105, 'Le Van E', '234 Đường GHI, Quận 5, TP.HCM', 4500, 'Nam', '1991-08-15', '2011-07-03', 1, 101);

-- Thêm dữ liệu vào bảng "Dự án"
INSERT INTO DuAn (MaDuAn, TenDuAn, NgayBatDau, NgayKetThuc, SoTienThuDuoc)
VALUES
    (1, 'Dự án A', '2022-01-01', '2022-06-30', 100000),
    (2, 'Dự án B', '2023-03-15', '2023-12-31', 250000),
    (3, 'Dự án C', '2023-07-01', '2024-02-28', 180000),
    (4, 'Dự án D', '2022-09-10', '2023-11-30', 300000),
    (5, 'Dự án E', '2023-01-15', '2023-07-31', 150000);

-- Thêm dữ liệu vào bảng "Quản lý dự án"
INSERT INTO QuanLyDuAn (MaNhanVienQuanLy, MaDuAn)
VALUES
    (101, 1),
    (103, 2),
    (104, 3),
    (102, 4),
    (105, 5);

-- Thêm dữ liệu vào bảng "Tham gia dự án"
INSERT INTO ThamGiaDuAn (MaNhanVien, MaDuAn, SoGioLamViec)
VALUES
    (101, 1, 120),
    (102, 1, 100),
    (103, 2, 90),
    (104, 2, 80),
    (105, 3, 110);
SET FOREIGN_KEY_CHECKS = 1;
-- Phần C. Thực hiện truy vấn
-- 1. Liệt kê các dự án diễn ra trong năm *?* có số tiền thu được trên *?* triệu VND
SELECT *
FROM DuAn
WHERE YEAR(NgayBatDau) = 2023 AND SoTienThuDuoc > 160000;
-- 2. Liệt kê các nhân viên đã tham gia hơn ?*? giờ trong các dự án, hiển thị chi tiết số giờ trong mỗi
-- dự án mà nhân viên tham gia
SELECT NV.HoTen, TG.MaDuAn, TG.SoGioLamViec
FROM NhanVien NV
JOIN ThamGiaDuAn TG ON NV.MaNhanVien = TG.MaNhanVien
WHERE TG.SoGioLamViec > 90
-- 3. Liệt kê các nhân viên có mức lương >= mức lương của người giám sát/quản lý trực tiếp nhân
-- viên đó
SELECT NV1.HoTen AS NhanVien, NV1.Luong AS LuongNhanVien, NV2.HoTen AS QuanLy, NV2.Luong AS LuongQuanLy
FROM NhanVien NV1
JOIN NhanVien NV2 ON NV1.MaNhanVienQuanLy = NV2.MaNhanVien
WHERE NV1.Luong >= NV2.Luong
-- 4. Liệt kê các phòng ban có số lượng nhân viên lớn hơn *?*
SELECT PB.MaPhongBan, PB.TenPhongBan, COUNT(NV.MaNhanVien) AS SoLuongNhanVien
FROM PhongBan PB
JOIN NhanVien NV ON PB.MaPhongBan = NV.MaPhongBan
GROUP BY PB.MaPhongBan, PB.TenPhongBan
HAVING COUNT(NV.MaNhanVien) > 0
-- 5. Liệt kê các nhân viên đã làm việc cho công ty hơn ?*? năm
SELECT MaNhanVien, HoTen
FROM NhanVien
WHERE DATE_ADD(NgayVaoCongTy, INTERVAL 14 YEAR) < CURDATE()
-- 6. Liệt kê các nhân viên vừa là trưởng phòng ban, và là quản lý dự án
SELECT NV.HoTen, PB.TenPhongBan, DA.TenDuAn
FROM NhanVien NV
JOIN PhongBan PB ON NV.MaNhanVien = PB.MaNhanVienQuanLy
JOIN QuanLyDuAn QL ON NV.MaNhanVien = QL.MaNhanVienQuanLy
JOIN DuAn DA ON QL.MaDuAn = DA.MaDuAn
-- 7. Liệt kê các nhân viên quản lý nhiều hơn 1 dự án
SELECT NV.MaNhanVien, NV.HoTen, COUNT(QL.MaDuAn) AS SoLuongDuAn
FROM NhanVien NV
JOIN QuanLyDuAn QL ON NV.MaNhanVien = QL.MaNhanVienQuanLy
GROUP BY NV.MaNhanVien, NV.HoTen
HAVING COUNT(QL.MaDuAn) > 1
-- 8. Mỗi khi nhân viên tham gia vào dự án chúng ta cần lưu lại thông tin hay còn được gọi là log để
-- biết nhân viên đó tham gia vào dự án vào thời gian nào
-- Mỗi khi nhân viên cập nhật số giờ tham gia dự án, ta cần lưu lại thông tin thời gian cập nhật khi
-- nào, số giờ tham gia cũ, số giờ tham gia mới
-- Công việc được thực hiện tự động khi dự dữ liệu được thêm, cập nhật

CREATE TABLE LogThamGiaDuAn (
  LogID INT AUTO_INCREMENT,
  MaNhanVien INT,
  MaDuAn INT,
  ThoiGianThamGia DATETIME,
  PRIMARY KEY (LogID),
  CONSTRAINT FK_LogThamGiaDuAn_NhanVien FOREIGN KEY (MaNhanVien) REFERENCES NhanVien(MaNhanVien),
  CONSTRAINT FK_LogThamGiaDuAn_DuAn FOREIGN KEY (MaDuAn) REFERENCES DuAn(MaDuAn)
);

CREATE TABLE LogCapNhatGioThamGia (
  LogID INT,
  SoGioThamGiaCu DECIMAL(10, 2),
  SoGioThamGiaMoi DECIMAL(10, 2),
  ThoiGianCapNhat DATETIME,
  CONSTRAINT FK_LogCapNhatGioThamGia_LogThamGiaDuAn FOREIGN KEY (LogID) REFERENCES LogThamGiaDuAn(LogID)
);

DELIMITER $$

CREATE TRIGGER tr_Log_ThamGiaDuAn AFTER INSERT ON QuanLyDuAn
FOR EACH ROW
BEGIN
  INSERT INTO LogThamGiaDuAn (MaNhanVien, MaDuAn, ThoiGianThamGia)
  VALUES (NEW.MaNhanVienQuanLy, NEW.MaDuAn, NOW());
END$$

DELIMITER ;

DELIMITER $$

CREATE TRIGGER tr_Log_CapNhatGioThamGia AFTER UPDATE ON LogThamGiaDuAn
FOR EACH ROW
BEGIN
  INSERT INTO LogCapNhatGioThamGia (LogID, SoGioThamGiaCu, SoGioThamGiaMoi, ThoiGianCapNhat)
  VALUES (OLD.LogID, OLD.SoGioThamGia, NEW.SoGioThamGia, NOW());
END$$

DELIMITER ;
-- Hình thức nộp bài
-- Nhánh nộp bài: lesson16-exam
-- File nộp bài: lesson16-hoten.sql → copy đề và thực hiện các lệnh sql ngay phía dưới từng câu hỏi
-- Thời gian làm bài: 120 phút