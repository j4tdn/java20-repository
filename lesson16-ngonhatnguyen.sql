-- Phần A. Viết các lệnh để xây dựng mô hình thực thể kết hợp (ER) dựa vào mô tả trên
-- DEPARTMENT, EMPLOYEE, PROJECT, PROJECT_MEMBERS, 

-- create database java20_company
CREATE DATABASE JAVA20_COMPANY CHAR SET utf8mb4;
USE JAVA20_COMPANY;

-- create table DEPARTMENT
DROP TABLE IF EXISTS DEPARTMENT;
CREATE TABLE IF NOT EXISTS DEPARTMENT
(
	ID INT,
    `NAME` VARCHAR(200) NOT NULL,
    PRIMARY KEY (ID)
);

-- create table EMPLOYEE
DROP TABLE IF EXISTS EMPLOYEE;
CREATE TABLE IF NOT EXISTS EMPLOYEE
(
	ID INT,
    `NAME` VARCHAR(200) NOT NULL,
    DOB DATE NOT NULL,
    GENDER BIT NOT NULL,
    ADDRESS VARCHAR(500) NOT NULL,
    JOINING_COMPANY_DATE DATE NOT NULL,
    SALARY FLOAT NOT NULL,
    DEPARTMENT_ID INT NOT NULL,
    PRIMARY KEY (ID),
    CONSTRAINT FK_EMPLOYEE_DEPARTMENT FOREIGN KEY (DEPARTMENT_ID) REFERENCES DEPARTMENT(ID)
);

-- create table DEPARTMENT_MANAGER
DROP TABLE IF EXISTS DEPARTMENT_MANAGER;
CREATE TABLE IF NOT EXISTS DEPARTMENT_MANAGER
(
	ID INT,
    DEPARTMENT_ID INT NOT NULL,
	MANAGER_ID INT NOT NULL UNIQUE,
    TAKING_OFFICE_DATE DATE NOT NULL,
    PRIMARY KEY (ID),
    CONSTRAINT UNQ_DEPARTMENT_MANAGER UNIQUE (DEPARTMENT_ID, MANAGER_ID)
);
ALTER TABLE DEPARTMENT_MANAGER
ADD CONSTRAINT FK_DEPARTMENT_MANAGER_DEPARTMENT FOREIGN KEY (DEPARTMENT_ID) REFERENCES DEPARTMENT(ID);
ALTER TABLE DEPARTMENT_MANAGER
ADD CONSTRAINT FK_DEPARTMENT_MANAGER_EMPLOYEE FOREIGN KEY (MANAGER_ID) REFERENCES EMPLOYEE(ID);

-- Create table PROJECT
DROP TABLE IF EXISTS PROJECT;
CREATE TABLE IF NOT EXISTS PROJECT
(
	ID INT,
    `NAME` VARCHAR(500) NOT NULL,
    STARTED_AT DATETIME NOT NULL,
    FINISHED_AT DATETIME NOT NULL,
    INCOME FLOAT NOT NULL,
    PROJECT_MANAGER_ID INT NOT NULL,
    PRIMARY KEY (ID),
    CONSTRAINT FK_PROJECT_EMPLOYEE FOREIGN KEY (PROJECT_MANAGER_ID) REFERENCES EMPLOYEE(ID)
);

-- create table PROJECT_MEMBERS
DROP TABLE IF EXISTS PROJECT_MEMBERS;
CREATE TABLE IF NOT EXISTS PROJECT_MEMBERS
(
	ID INT,
    PROJECT_ID INT NOT NULL,
    EMPLOYEE_ID INT NOT NULL,
    WORK_HOURS FLOAT NOT NULL,
    SUPERVISOR_ID INT NULL,
    PRIMARY KEY (ID),
    CONSTRAINT UNQ_PROJECT_EMPLOYEE UNIQUE (PROJECT_ID, EMPLOYEE_ID)
);
ALTER TABLE PROJECT_MEMBERS
ADD CONSTRAINT FK_PROJECT_MEMBERS_PROJECT FOREIGN KEY (PROJECT_ID) REFERENCES PROJECT(ID);
ALTER TABLE PROJECT_MEMBERS
ADD CONSTRAINT FK_PROJECT_MEMBERS_EMPLOYEE FOREIGN KEY (EMPLOYEE_ID) REFERENCES EMPLOYEE(ID);
ALTER TABLE PROJECT_MEMBERS
ADD CONSTRAINT FK_PROJECT_MEMBERS_EMPLOYEE_SUPERVISOR FOREIGN KEY (SUPERVISOR_ID) REFERENCES EMPLOYEE(ID);

-- Phần B. Viết các lệnh để tạo dữ liệu kiểm thử cho dự án
-- Yêu cầu: Ít nhất 5 dòng cho mỗi bảng dữ liệu
-- insert table department
SET FOREIGN_KEY_CHECKS = 1;

INSERT INTO DEPARTMENT(ID, `NAME`)
VALUES(1,	'Nhân sự'),
	  (2,	'Tài chính'),
	  (3,	'Kế hoạch'),
	  (4,	'Kinh doanh'),
	  (5,	'Kỹ thuật');

INSERT INTO EMPLOYEE(ID, `NAME`, DOB, GENDER, ADDRESS, JOINING_COMPANY_DATE, SALARY, DEPARTMENT_ID)
VALUES(1,	'Ngô Văn A',		str_to_date('25/7/2000', '%d/%m/%Y'),	0,	'Đà Nẵng',	str_to_date('5/8/2019', '%d/%m/%Y'),	4500,	1),
	  (2,	'Nguyễn Văn B',		str_to_date('30/10/1999', '%d/%m/%Y'),	0,	'Đà Nẵng',	str_to_date('25/7/2018', '%d/%m/%Y'),	4200,	1),
	  (3,	'Trần Thị Anh',		str_to_date('7/9/1998', '%d/%m/%Y'),	1,	'Đà Nẵng',	str_to_date('19/9/2018', '%d/%m/%Y'),	4700,	3),
	  (4,	'Nguyễn Kim Hoa',	str_to_date('5/8/1989', '%d/%m/%Y'),	1,	'Đà Nẵng',	str_to_date('20/2/2016', '%d/%m/%Y'),	5500,	2),
	  (5,	'Nguyễn Minh Khôi',	str_to_date('7/7/1999', '%d/%m/%Y'),	0,	'Đà Nẵng',	str_to_date('25/5/2020', '%d/%m/%Y'),	4000,	5),
      (6,	'Ngô Văn Tèo',		str_to_date('25/7/2000', '%d/%m/%Y'),	0,	'Đà Nẵng',	str_to_date('5/8/2019', '%d/%m/%Y'),	4500,	4),
	  (7,	'Nguyễn Văn Tí',	str_to_date('30/10/1999', '%d/%m/%Y'),	0,	'Đà Nẵng',	str_to_date('25/7/2018', '%d/%m/%Y'),	4950,	4),
	  (8,	'Trần Thị Vân',		str_to_date('7/9/1998', '%d/%m/%Y'),	1,	'Đà Nẵng',	str_to_date('19/9/2018', '%d/%m/%Y'),	4100,	3),
	  (9,	'Nguyễn Kim Anh',	str_to_date('5/8/1989', '%d/%m/%Y'),	1,	'Đà Nẵng',	str_to_date('20/2/2016', '%d/%m/%Y'),	5000,	2),
	  (10,	'Nguyễn Minh Thành',str_to_date('7/7/1999', '%d/%m/%Y'),	0,	'Đà Nẵng',	str_to_date('25/5/2020', '%d/%m/%Y'),	3900,	5);

INSERT INTO DEPARTMENT_MANAGER(ID, DEPARTMENT_ID, MANAGER_ID, TAKING_OFFICE_DATE)
VALUES(1,	1,	1,	str_to_date('1/8/2021', '%d/%m/%Y')),
	  (2,	2,	4,	str_to_date('5/2/2020', '%d/%m/%Y')),
	  (3,	3,	3,	str_to_date('12/5/2020', '%d/%m/%Y')),
	  (4,	4,	7,	str_to_date('1/10/2022', '%d/%m/%Y')),
	  (5,	5,	5,	str_to_date('25/4/2021', '%d/%m/%Y'));

INSERT INTO PROJECT(ID, `NAME`, STARTED_AT, FINISHED_AT, INCOME, PROJECT_MANAGER_ID)
VALUES(1,	'Dự án 1',	str_to_date('7/8/2022 22:05', '%d/%m/%Y %H:%i'),		str_to_date('7/11/2022 22:05', '%d/%m/%Y %H:%i'),	60200,	1),
	  (2,	'Dự án 2',	str_to_date('7/9/2022 22:05', '%d/%m/%Y %H:%i'),		str_to_date('7/12/2022 22:05', '%d/%m/%Y %H:%i'),	74100,	1),
	  (3,	'Dự án 3',	str_to_date('7/10/2022 22:05', '%d/%m/%Y %H:%i'),		str_to_date('7/2/2023 22:05', '%d/%m/%Y %H:%i'),	47200,	3),
	  (4,	'Dự án 4',	str_to_date('20/10/2022 22:05', '%d/%m/%Y %H:%i'),		str_to_date('7/4/2023 22:05', '%d/%m/%Y %H:%i'),	87500,	2),
	  (5,	'Dự án 5',	str_to_date('10/11/2022 22:05', '%d/%m/%Y %H:%i'),		str_to_date('25/4/2023 22:05', '%d/%m/%Y %H:%i'),	119000,	5);

INSERT INTO PROJECT_MEMBERS(ID, PROJECT_ID, EMPLOYEE_ID, WORK_HOURS, SUPERVISOR_ID)
VALUES(1,	1,	1,	240.8,	2),
	  (2,	1,	6,	253,	2),
	  (3,	1,	7,	320,	8),
	  (4,	1,	5,	312.6,	9),
	  (5,	2,	2,	248.6,	9),
      (6,	2,	10,	129,	1),
	  (7,	2,	3,	331.2,	1),
	  (8,	3,	4,	285.6,	3),
	  (9,	4,	8,	227,	5),
	  (10,	4,	9,	365.7,	4);

INSERT INTO PROJECT_MEMBERS(ID, PROJECT_ID, EMPLOYEE_ID, WORK_HOURS, SUPERVISOR_ID)
VALUES(11,	2,	1,	240.8,	NULL),
	  (12,	3,	3,	253,	2),
	  (13,	4,	2,	320,	NULL);

-- Phần C. Thực hiện truy vấn
-- 1. Liệt kê các dự án diễn ra trong năm *?* có số tiền thu được trên *?* triệu VND
SELECT *
  FROM project
 WHERE YEAR(STARTED_AT) = '2022' AND INCOME > 70000;

-- 2. Liệt kê các nhân viên đã tham gia hơn ?*? giờ trong các dự án, hiển thị chi tiết số giờ trong mỗi
-- dự án mà nhân viên tham gia
SELECT e.ID, e.NAME, pm.PROJECT_ID, pm.WORK_HOURS
  FROM employee e
  JOIN project_members pm
    ON e.ID = pm.EMPLOYEE_ID
 WHERE pm.WORK_HOURS > 240
ORDER BY e.ID;

-- 3. Liệt kê các nhân viên có mức lương >= mức lương của người giám sát/quản lý trực tiếp nhân
-- viên đó

-- 4. Liệt kê các phòng ban có số lượng nhân viên lớn hơn *?*
SELECT d.ID, d.NAME, COUNT(e.ID) AS SOLUONG
  FROM department d
  JOIN employee e
    ON e.DEPARTMENT_ID = d.ID
 GROUP BY d.ID
 HAVING SOLUONG > 1;
-- 5. Liệt kê các công ty đã làm việc cho công ty hơn ?*? năm
--
-- 6. Liệt kê các nhân viên vừa là trưởng phòng ban, và là quản lý dự án
--
-- 7. Liệt kê các nhân viên quản lý nhiều hơn 1 dự án
--
-- 8. Mỗi khi nhân viên tham gia vào dự án chúng ta cần lưu lại thông tin hay còn được gọi là log để
-- biết nhân viên đó tham gia vào dự án vào thời gian nào
-- Mỗi khi nhân viên cập nhật số giờ tham gia dự án, ta cần lưu lại thông tin thời gian cập nhật khi
-- nào, số giờ tham gia cũ, số giờ tham gia mới
-- Công việc được thực hiện tự động khi dự dữ liệu được thêm, cập nhật
-- 