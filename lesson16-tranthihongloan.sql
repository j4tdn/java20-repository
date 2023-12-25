/* 
Đề bài: Xây dựng cơ sở dữ liệu quản lý công ty để theo dõi các thông tin liên quan tới nhân viên,
phòng ban và dự án, chi tiết được mô tả như sau:
Công ty được tổ chức thành các phòng ban chức năng. Mỗi phòng ban có một tên duy nhất, một mã
số duy nhất, một nhân viên cụ thể quản lý phòng đó.
Việc nhân viên quản lý phòng ban được ghi lại bằng ngày nhân viên đó bắt đầu quản lý và được gọi
là trưởng phòng. Ta ghi nhận lại ngày nhận chức của trưởng phòng.
Công ty sẽ có nhiều dự án, một dự án có một tên duy nhất, một mã số duy nhất, ngày bắt đầu, ngày
kết thúc(hoàn thành dự án), số tiền thu được(đơn vị VNĐ) từ dự án đó.
Dự án được thực hiện bởi một hoặc nhiều nhân viên, có một nhân viên duy nhất làm quản lý dự án.
Với mỗi nhân viên chúng ta lưu giữ lại các thông tin bao gồm họ tên, mã số duy nhất, địa chỉ,
lương, giới tính, ngày sinh, ngày vào công ty
Một nhân viên chỉ làm việc cho một phòng ban nhưng có thể làm việc cho nhiều dự án.
Chúng ta lưu giữ lại số giờ làm việc của mỗi nhân viên trên dự án mà nhân viên đó tham gia. Mỗi
nhân viên có thể có một người quản lý giám sát trực tiếp, người đó cũng là một nhân viên, nhân
viên và quản lý/giám sát của nhân viên có thể tham gia cùng/khác dự án.
*/

/*Phần A. Viết các lệnh để xây dựng mô hình thực thể kết hợp (ER) dựa vào mô tả trên*/
--
-- Tạo bảng cho Phòng Ban
CREATE TABLE PhongBan (
    MaPhongBan INT PRIMARY KEY,
    TenPhongBan VARCHAR(255) NOT NULL,
    MaNhanVienTruong INT,
    FOREIGN KEY (MaNhanVienTruong) REFERENCES NhanVien(MaNhanVien)
);

-- Tạo bảng cho Nhân Viên
CREATE TABLE NhanVien (
    MaNhanVien INT PRIMARY KEY,
    HoTen VARCHAR(255) NOT NULL,
    DiaChi VARCHAR(255),
    Luong INT,
    GioiTinh VARCHAR(10),
    NgaySinh DATE,
    NgayVaoCongTy DATE,
    MaPhongBan INT,
    MaNhanVienQuanLy INT,
    FOREIGN KEY (MaPhongBan) REFERENCES PhongBan(MaPhongBan),
    FOREIGN KEY (MaNhanVienQuanLy) REFERENCES NhanVien(MaNhanVien)
);

-- Tạo bảng cho Dự Án
CREATE TABLE DuAn (
    MaDuAn INT PRIMARY KEY,
    TenDuAn VARCHAR(255) NOT NULL,
    NgayBatDau DATE,
    NgayKetThuc DATE,
    SoTienThuDuoc INT,
    MaNhanVienQuanLy INT,
    FOREIGN KEY (MaNhanVienQuanLy) REFERENCES NhanVien(MaNhanVien)
);

-- Tạo bảng cho Tham Gia Dự Án
CREATE TABLE ThamGiaDuAn (
    MaNhanVien INT,
    MaDuAn INT,
    SoGioThamGia INT,
    ThoiGianThamGia DATETIME DEFAULT CURRENT_TIMESTAMP,
    PRIMARY KEY (MaNhanVien, MaDuAn),
    FOREIGN KEY (MaNhanVien) REFERENCES NhanVien(MaNhanVien),
    FOREIGN KEY (MaDuAn) REFERENCES DuAn(MaDuAn)
);

-- Tạo bảng cho Log Số Giờ Tham Gia
CREATE TABLE LogSoGioThamGia (
    MaNhanVien INT,
    MaDuAn INT,
    SoGioCu INT,
    SoGioMoi INT,
    ThoiGianCapNhat DATETIME DEFAULT CURRENT_TIMESTAMP,
    PRIMARY KEY (MaNhanVien, MaDuAn, ThoiGianCapNhat),
    FOREIGN KEY (MaNhanVien, MaDuAn) REFERENCES ThamGiaDuAn(MaNhanVien, MaDuAn)
);

--
/*Phần B. Viết các lệnh để tạo dữ liệu kiểm thử cho dự án
Yêu cầu: Ít nhất 5 dòng cho mỗi bảng dữ liệu*/
--
-- Insert dữ liệu cho Phòng Ban
INSERT INTO PhongBan (MaPhongBan, TenPhongBan, MaNhanVienTruong) VALUES
(1, 'Phòng A', 101),
(2, 'Phòng B', 102),
(3, 'Phòng C', 103),
(4, 'Phòng D', 104),
(5, 'Phòng E', 105);

-- Insert dữ liệu cho Nhân Viên
INSERT INTO NhanVien (MaNhanVien, HoTen, DiaChi, Luong, GioiTinh, NgaySinh, NgayVaoCongTy, MaPhongBan, MaNhanVienQuanLy) VALUES
(101, 'Trần Thị Hồng Loan', '12 Đường Trần Cao Vân', 5000000, 'Nữ', '2003-01-01', '2010-01-01', 1, NULL),
(102, 'Ngô Nhật Nguyên', '6 Đường Ngô Quyền', 6000000, 'Nữ', '2003-05-05', '2012-01-01', 2, 101),
(103, 'Nguyễn Hồng Ly', '9 Đường Điện Biên Phủ', 7000000, 'Nữ', '2003-12-10', '2015-01-01', 1, NULL),
(104, 'Nguyễn Thị Ánh Nga', '1 Đường Bạch Đằng', 5500000, 'Nữ', '2003-07-20', '2014-01-01', 3, 102),
(105, 'Nguyễn Thị Thu Hiền', '2 Đường Hồ Quý Ly', 8000000, 'Nữ', '2003-09-15', '2018-01-01', 4, NULL);

-- Insert dữ liệu cho Dự Án
INSERT INTO DuAn (MaDuAn, TenDuAn, NgayBatDau, NgayKetThuc, SoTienThuDuoc, MaNhanVienQuanLy) VALUES
(201, 'Dự Án A', '2023-01-01', '2023-06-30', 10000000, 101),
(202, 'Dự Án B', '2023-02-01', '2023-08-31', 15000000, 102),
(203, 'Dự Án C', '2023-03-01', '2023-09-30', 12000000, 103),
(204, 'Dự Án D', '2023-04-01', '2023-10-31', 18000000, 105),
(205, 'Dự Án E', '2023-05-01', '2023-11-30', 9000000, 104);

-- Insert dữ liệu cho Tham Gia Dự Án
INSERT INTO ThamGiaDuAn (MaNhanVien, MaDuAn, SoGioThamGia) VALUES
(101, 201, 50),
(102, 201, 40),
(103, 202, 60),
(104, 203, 45),
(105, 204, 55);

-- Insert dữ liệu cho Log Số Giờ Tham Gia
INSERT INTO LogSoGioThamGia (MaNhanVien, MaDuAn, SoGioCu, SoGioMoi) VALUES
(101, 201, 50, 55),
(102, 201, 40, 45),
(103, 202, 60, 65),
(104, 203, 45, 50),
(105, 204, 55, 60);

--

/*Phần C. Thực hiện truy vấn
1. Liệt kê các dự án diễn ra trong năm *?* có số tiền thu được trên *?* triệu VND*/
DELIMITER $$
CREATE PROCEDURE ListProjectsByYearAndRevenue(IN targetYear INT, IN minRevenue INT)
BEGIN
    SELECT * FROM DuAn
    WHERE YEAR(NgayBatDau) = targetYear AND SoTienThuDuoc > minRevenue * 1000000;
END $$

CALL ListProjectsByYearAndRevenue(2023, 10);
-- 
/*2. Liệt kê các nhân viên đã tham gia hơn ?*? giờ trong các dự án, hiển thị chi tiết số giờ trong mỗi
dự án mà nhân viên tham gia*/
DELIMITER $$
CREATE PROCEDURE ListEmployeesWithTotalHours(IN minHours INT)
BEGIN
    SELECT NV.*, TDA.MaDuAn, TDA.SoGioThamGia
    FROM NhanVien NV
    JOIN ThamGiaDuAn TDA ON NV.MaNhanVien = TDA.MaNhanVien
    WHERE TDA.SoGioThamGia > minHours;
END $$

CALL ListEmployeesWithTotalHours(50);
--
/*3. Liệt kê các nhân viên có mức lương >= mức lương của người giám sát/quản lý trực tiếp nhân
viên đó*/
SELECT NV.* FROM NhanVien NV
	JOIN NhanVien NVQuanLy ON NV.MaNhanVienQuanLy = NVQuanLy.MaNhanVien
	WHERE NV.Luong >= NVQuanLy.Luong;
--
/*4. Liệt kê các phòng ban có số lượng nhân viên lớn hơn *?**/
--
/*5. Liệt kê các công ty đã làm việc cho công ty hơn ?*? năm*/
--
/*6. Liệt kê các nhân viên vừa là trưởng phòng ban, và là quản lý dự án*/
SELECT NV.* FROM NhanVien NV
	JOIN PhongBan PB ON NV.MaPhongBan = PB.MaPhongBan
	JOIN DuAn DA ON NV.MaNhanVien = DA.MaNhanVienQuanLy
	WHERE NV.MaNhanVien = PB.MaNhanVienTruong;
--
/*7. Liệt kê các nhân viên quản lý nhiều hơn 1 dự án*/
SELECT NV.*, COUNT(DA.MaDuAn) AS SoLuongDuAnQuanLy FROM NhanVien NV
	JOIN DuAn DA ON NV.MaNhanVien = DA.MaNhanVienQuanLy
	GROUP BY NV.MaNhanVien
	HAVING SoLuongDuAnQuanLy > 1;
--
/*8. Mỗi khi nhân viên tham gia vào dự án chúng ta cần lưu lại thông tin hay còn được gọi là log để
biết nhân viên đó tham gia vào dự án vào thời gian nào
Mỗi khi nhân viên cập nhật số giờ tham gia dự án, ta cần lưu lại thông tin thời gian cập nhật khi
nào, số giờ tham gia cũ, số giờ tham gia mới
Công việc được thực hiện tự động khi dự dữ liệu được thêm, cập nhật*/