-- Đề bài: 
-- Xây dựng cơ sở dữ liệu quản lý công ty để theo dõi các thông tin liên quan tới nhân viên,
-- phòng ban và dự án, chi tiết được mô tả như sau:

-- Công ty được tổ chức thành các phòng ban chức năng. Mỗi phòng ban có một tên duy nhất, một mã
-- số duy nhất, 'một nhân viên cụ thể quản lý phòng' đó.
-- Việc nhân viên quản lý phòng ban được ghi lại bằng ngày nhân viên đó bắt đầu quản lý và được gọi
-- là 'trưởng phòng'. Ta ghi nhận lại 'ngày nhận chức' của trưởng phòng.

-- >>> NHAN VIEN tham gia moi quan he TRUONG-PHONG voi PHONG BAN
-- NHAN VIEN có thể làm trưởng phòng của 1 PHONG BAN
-- PHONG BAN chỉ có duy nhất 1 trưởng phòng

-- Công ty sẽ có nhiều dự án, một dự án có một tên duy nhất, một mã số duy nhất, ngày bắt đầu, ngày
-- kết thúc(hoàn thành dự án), số tiền thu được(đơn vị VNĐ) từ dự án đó.

-- Dự án được thực hiện bởi một hoặc nhiều nhân viên, có một nhân viên duy nhất làm quản lý dự án.

-- > DUAN tham gia quan hệ QUANLY với NHANVIEN

-- Với mỗi nhân viên chúng ta lưu giữ lại các thông tin bao gồm họ tên, mã số duy nhất, địa chỉ,
-- lương, giới tính, ngày sinh, ngày vào công ty

-- Một nhân viên chỉ làm việc cho một phòng ban nhưng có thể làm việc cho nhiều dự án.
-- Chúng ta lưu giữ lại số giờ làm việc của mỗi nhân viên trên dự án mà nhân viên đó tham gia. 

-- Mỗi nhân viên có thể có một người quản lý giám sát trực tiếp, người đó cũng là một nhân viên, nhân
-- viên và quản lý/giám sát của nhân viên có thể tham gia cùng/khác dự án.

-- Phần A. Viết các lệnh để xây dựng cơ sở dữ liệu dựa vào mô tả phía trên
-- Database: lesson16_exam_company_manager
DROP DATABASE IF EXISTS lesson16_exam_company_manager;

CREATE DATABASE lesson16_exam_company_manager CHAR SET utf8mb4;
USE lesson16_exam_company_manager;

-- DEPARTMENT(ID, NAME, MANAGER_ID, TAKING_DATE)
-- > MANAGER_ID: FK --> EMPLOYEE(ID)
CREATE TABLE DEPARTMENT
(
	ID INT PRIMARY KEY,
    `NAME` VARCHAR(200) NOT NULL,
    MANAGER_ID INT NOT NULL,
    TAKING_DATE DATE NOT NULL,
    CONSTRAINT UNQ_MANAGER UNIQUE(`MANAGER_ID`),
    CONSTRAINT UNQ_NAME UNIQUE(`NAME`)
);

-- EMPLOYEE(ID, NAME, ADDRESS, SALARY, GENDER, DATE_OF_BIRTH, STARTED_DATE_AT_COMPANY, DEPARTMENT_ID, MANAGER_ID)
-- > DEPARTMENT_ID: FK --> DEPARTMENT(ID)
-- > MANAGER_ID: FK --> EMPLOYEE(ID) --> SELF FOREIGN KEY
CREATE TABLE EMPLOYEE
(
	ID INT PRIMARY KEY,
    `NAME` VARCHAR(200) NOT NULL,
    `ADDRESS` TEXT NOT NULL,
    SALARY DOUBLE NOT NULL,
    GENDER BIT NOT NULL,
    DATE_OF_BIRTH DATE NOT NULL,
    STARTED_DATE_AT_COMPANY DATE NOT NULL,
    DEPARTMENT_ID INT NOT NULL,
    MANAGER_ID INT NOT NULL,
    CONSTRAINT FK_MANAGER_EMPLOYEE FOREIGN KEY(MANAGER_ID) REFERENCES EMPLOYEE(ID)
);

ALTER TABLE DEPARTMENT 
ADD CONSTRAINT FK_DEPARTMENT_EMPLOYEE FOREIGN KEY(MANAGER_ID) REFERENCES EMPLOYEE(ID);

ALTER TABLE EMPLOYEE
ADD CONSTRAINT FK_EMPLOYEE_DEPARTMENT FOREIGN KEY(DEPARTMENT_ID) REFERENCES DEPARTMENT(ID);

-- PROJECT(ID, NAME, DATE_FROM, DATE_UNTIL, BUDGET, MANAGER_ID)
-- > MANAGER_ID: FK --> EMPLOYEE(ID)
CREATE TABLE PROJECT
(
	ID INT PRIMARY KEY, 
	`NAME` VARCHAR(200) NOT NULL,
    DATE_FROM DATE NOT NULL,
    DATE_UNTIL DATE NOT NULL,
    BUDGET INT NOT NULL,
    MANAGER_ID INT NOT NULL,
    CONSTRAINT FK_PROJECT_EMPLOYEE FOREIGN KEY(MANAGER_ID) REFERENCES EMPLOYEE(ID)
);

-- PROJECT_EMPLOYEE_ASSIGNMENT(ID, PROJECT_ID, EMPLOYEE_ID, WORKING_HOURS)
-- > PROJECT_ID: FK --> PROJECT(ID)
-- > EMPLOYEE_ID: FK --> EMPLOYEE(ID)
CREATE TABLE PROJECT_EMPLOYEE_ASSIGNMENT
(
	ID INT PRIMARY KEY,
    PROJECT_ID INT NOT NULL,
    EMPLOYEE_ID INT NOT NULL,
    WORKING_HOURS INT NOT NULL,
    CONSTRAINT UNQ_PROJECT_EMPLOYEE UNIQUE(PROJECT_ID, EMPLOYEE_ID),
    CONSTRAINT FK_ASM_PROJECT FOREIGN KEY(PROJECT_ID) REFERENCES PROJECT(ID),
    CONSTRAINT FK_ASM_EMPLOYEE FOREIGN KEY(EMPLOYEE_ID) REFERENCES EMPLOYEE(ID)
);

-- Phần B. Viết các lệnh để tạo dữ liệu kiểm thử cho dự án
-- Yêu cầu: Ít nhất 5 dòng cho mỗi bảng dữ liệu
SELECT STR_TO_DATE('16.7.2023', '%d.%m.%Y');

SET FOREIGN_KEY_CHECKS = 0;
SET FOREIGN_KEY_CHECKS = 1;

INSERT INTO DEPARTMENT(ID,`NAME`,MANAGER_ID ,TAKING_DATE)
VALUES(1, 'Phong Ban A 1',	1,	STR_TO_DATE('16.7.2023', '%d.%m.%Y')),
	  (2, 'Phong Ban B 2',	2,	STR_TO_DATE('31.12.2023', '%d.%m.%Y')),
	  (3, 'Phong Ban C 3',	3,	STR_TO_DATE('31.12.2023', '%d.%m.%Y')),
      (4, 'Phong Ban D 4',	4,	STR_TO_DATE('31.12.2023', '%d.%m.%Y')),
      (5, 'Phong Ban E 5',	5,	STR_TO_DATE('31.12.2023', '%d.%m.%Y'));

INSERT INTO EMPLOYEE(ID,`NAME`,ADDRESS,SALARY,GENDER,DATE_OF_BIRTH,STARTED_DATE_AT_COMPANY,DEPARTMENT_ID,MANAGER_ID)
VALUES
(1,	'Nhan Vien A 1',	'Da Nang',	    	2000,	1,	STR_TO_DATE('15.09.1990', '%d.%m.%Y'),	STR_TO_DATE('1.1.2020', '%d.%m.%Y'),	1,	1),
(2,	'Nhan Vien B 2',	'Quang Nam',		1800,	0,	STR_TO_DATE('25.12.2003', '%d.%m.%Y'),	STR_TO_DATE('25.12.2022', '%d.%m.%Y'),	2,	1),
(3,	'Nhan Vien C 3',	'Quang Binh',	    2400,	0,	STR_TO_DATE('14.10.1987', '%d.%m.%Y'),	STR_TO_DATE('17.11.2020', '%d.%m.%Y'),	3,	2),
(4,	'Nhan Vien D 4',	'Thua Thien Hue',	1600,	1,	STR_TO_DATE('23.12.2000', '%d.%m.%Y'),	STR_TO_DATE('22.12.2021', '%d.%m.%Y'),	4,	2),
(5,	'Nhan Vien E 5',	'Quang Tri',		3000,	1,	STR_TO_DATE('18.06.1997', '%d.%m.%Y'),	STR_TO_DATE('15.8.2020', '%d.%m.%Y'),	5,	2),
(6,	'Nhan Vien F 6',	'Quang Tri',		800	,	1,	STR_TO_DATE('15.09.1990', '%d.%m.%Y'),	STR_TO_DATE('22.12.2021', '%d.%m.%Y'),	3,	2),
(7,	'Nhan Vien G 7',	'Quang Nam',		2400,	1,	STR_TO_DATE('25.12.2003', '%d.%m.%Y'),	STR_TO_DATE('17.11.2020', '%d.%m.%Y'),	3,	1),
(8,	'Nhan Vien H 8',	'Quang Nam',		1200,	0,	STR_TO_DATE('14.10.1987', '%d.%m.%Y'),	STR_TO_DATE('22.12.2021', '%d.%m.%Y'),	2,	1),
(9,	'Nhan Vien I 9',	'Da Nang',			1000,	0,	STR_TO_DATE('23.12.2000', '%d.%m.%Y'),	STR_TO_DATE('17.11.2020', '%d.%m.%Y'),	1,	3),
(10,'Nhan Vien K 10',	'Quang Binh',		800	,	1,	STR_TO_DATE('18.06.1997', '%d.%m.%Y'),	STR_TO_DATE('1.1.2022', '%d.%m.%Y'),	4,	3);

INSERT INTO PROJECT(ID,NAME,DATE_FROM,DATE_UNTIL,BUDGET,MANAGER_ID)
VALUES
(1,	'Du An A 1',	STR_TO_DATE('1.1.2021', '%d.%m.%Y'),	STR_TO_DATE('1.6.2021', '%d.%m.%Y'),	100000,	1),
(2,	'Du An B 2',	STR_TO_DATE('12.12.2022', '%d.%m.%Y'),	STR_TO_DATE('14.08.2023', '%d.%m.%Y'),	80000,	2),
(3,	'Du An C 3',	STR_TO_DATE('5.5.2022', '%d.%m.%Y'),	STR_TO_DATE('7.8.2022', '%d.%m.%Y'),	200000,	1),
(4,	'Du An D 4',	STR_TO_DATE('22.8.2023', '%d.%m.%Y'),	STR_TO_DATE('22.11.2023', '%d.%m.%Y'),	150000,	3),
(5,	'Du An E 5',	STR_TO_DATE('17.2.2021', '%d.%m.%Y'),	STR_TO_DATE('17.08.2022', '%d.%m.%Y'),	300000,	2);

INSERT INTO PROJECT_EMPLOYEE_ASSIGNMENT
VALUES
(1,		1,	1,	40),
(2,		1,	2,	15),
(3,		1,	8,	20),
(4,		2,	2,	80),
(5,		2,	6,	60),
(6,		2,	7,	15),
(7,		2,	9,	48),
(8,		3,	1,	60),
(9,		3,	2,	60),
(10,	4,	3,	50),
(11,	4,	5,	23),
(12,	4,	10,	42),
(13,	5,	2,	18),
(14,	5,	4,	12);


-- Phần C. Thực hiện truy vấn
-- 1. Liệt kê các dự án diễn ra trong năm *?* có số tiền thu được trên *?* triệu VND
--

-- 2. Liệt kê các nhân viên đã tham gia hơn ?*? giờ trong các dự án, hiển thị chi tiết số giờ trong mỗi
-- dự án mà nhân viên tham gia
--
-- 3. Liệt kê các nhân viên có mức lương >= mức lương của người giám sát/quản lý trực tiếp nhân
-- viên đó
--
-- 4. Liệt kê các phòng ban có số lượng nhân viên lớn hơn *?*
--
-- 5. Liệt kê các nhân viên đã làm việc cho công ty hơn ?*? năm
--
-- 6. Liệt kê các nhân viên vừa là trưởng phòng ban, và là quản lý dự án
--
-- 7. Liệt kê các nhân viên quản lý nhiều hơn 1 dự án
--
-- 8. Mỗi khi nhân viên tham gia vào dự án chúng ta cần lưu lại thông tin hay còn được gọi là log để
-- biết nhân viên đó tham gia vào dự án vào thời gian nào
-- Mỗi khi nhân viên cập nhật số giờ tham gia dự án, ta cần lưu lại thông tin thời gian cập nhật khi
-- nào, số giờ tham gia cũ, số giờ tham gia mới
-- Công việc được thực hiện tự động