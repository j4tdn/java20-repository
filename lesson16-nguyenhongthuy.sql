-- Phần A. Viết các lệnh để xây dựng mô hình thực thể kết hợp (ER) dựa vào mô tả trên
CREATE DATABASE lesson16_company_management;

USE lesson16_company_management;
-- create table DEPARTMENT
DROP TABLE IF EXISTS DEPARTMENT;
CREATE TABLE DEPARTMENT
(
	ID INT,
    NAME VARCHAR(100) NOT NULL,
    PRIMARY KEY (ID)
);

-- create table DEPARTMENT
DROP TABLE IF EXISTS EMPLOYEE;
CREATE TABLE EMPLOYEE
(
	ID INT,
    NAME VARCHAR(100) NOT NULL,
    ADDRESS VARCHAR(100) NOT NULL,
    SALARY FLOAT NOT NULL,
    GENDER VARCHAR(10) NOT NULL,
    DAY_OF_BIRTH date NOT NULL,
    START_DATE DATE NOT NULL,
    DEPARTMENT_ID INT,
    PRIMARY KEY (ID),
    CONSTRAINT FK_EMPLOYEE_DEPARTMENT FOREIGN KEY(DEPARTMENT_ID) REFERENCES DEPARTMENT(ID),
    CONSTRAINT CK_GENDER CHECK (GENDER IN ('Nam', 'Nữ'))
);

DROP TABLE IF EXISTS PROJECT;
CREATE TABLE PROJECT
(
	ID INT,
    NAME VARCHAR(100) NOT NULL,
    START_DATE DATE NOT NULL,
    END_DATE DATE NOT NULL,
    REVENUE FLOAT NOT NULL,
    EMPLOYEE_ID INT NOT NULL,
    PRIMARY KEY (ID),
    CONSTRAINT FK_PROJECT_EMPLOYEE FOREIGN KEY(EMPLOYEE_ID) REFERENCES EMPLOYEE(ID)
);

DROP TABLE IF EXISTS PROJECT_TEAM_MEMBER;
CREATE TABLE PROJECT_TEAM_MEMBER
(
	ID INT,
    PROJECT_ID INT NOT NULL,
    EMPLOYEE_ID INT NOT NULL,
    CONTROLER_ID INT NOT NULL,
    PRIMARY KEY (ID),
    CONSTRAINT FK_PROJECT_TEAM_MEMBER_PROJECT FOREIGN KEY(PROJECT_ID) REFERENCES PROJECT(ID),
    CONSTRAINT FK_PROJECT_TEAM_MEMBER_EMPLOYEE FOREIGN KEY(EMPLOYEE_ID) REFERENCES EMPLOYEE(ID),
    CONSTRAINT FK_PROJECT_TEAM_MEMBER_EMPLOYEE_CONTROLER FOREIGN KEY(CONTROLER_ID) REFERENCES EMPLOYEE(ID),
    CONSTRAINT UNQ_EMPLOYEE UNIQUE(EMPLOYEE_ID, PROJECT_ID)
);

DROP TABLE IF EXISTS MANAGER;
CREATE TABLE MANAGER
(
	ID INT,
    EMPLOYEE_ID INT NOT NULL,
    DEPARTMENT_ID INT NOT NULL,
    SWEARING_IN_DAY DATE NOT NULL,
    PRIMARY KEY (ID),
    CONSTRAINT FK_MANAGER_EMPLOYEE FOREIGN KEY(EMPLOYEE_ID) REFERENCES EMPLOYEE(ID),
    CONSTRAINT FK_MANAGER_DEAPARTMENT FOREIGN KEY(DEPARTMENT_ID) REFERENCES DEPARTMENT(ID),
    CONSTRAINT UNQ_DEPARTMENT UNIQUE(DEPARTMENT_ID)
);


-- Phần B. Viết các lệnh để tạo dữ liệu kiểm thử cho dự án
-- Yêu cầu: Ít nhất 5 dòng cho mỗi bảng dữ liệu

INSERT INTO DEPARTMENT(ID, `NAME`)
VALUES(1, 'Bộ phận nhân sự'),
	  (2, 'Bộ phận bán hàng'),
      (3, 'Bộ phận giao hàng'),
      (4, 'Bộ phận giám sát'),
      (5, 'Bộ phận quảng cáo');

INSERT INTO EMPLOYEE(ID,`NAME`, ADDRESS, SALARY, GENDER, DAY_OF_BIRTH, START_DATE, DEPARTMENT_ID)
VALUES 	(1,	'Nhân viên A',	'Đà Nẵng',	15000000, 'Nam', str_to_date('7/9/2003 22:05', '%d/%m/%Y %H:%i'), str_to_date('7/9/2023 22:05', '%d/%m/%Y %H:%i'), 1),
		  (2,	'Nhân viên B',	'Quảng Nam',	10000000, 'Nam', str_to_date('1/1/2003 22:05', '%d/%m/%Y %H:%i'), str_to_date('7/10/2018 22:05', '%d/%m/%Y %H:%i'), 2),
		  (3,	'Nhân viên C',	'Huế',	15000000, 'Nam', str_to_date('5/5/2000 22:05', '%d/%m/%Y %H:%i'), str_to_date('4/9/2023 22:05', '%d/%m/%Y %H:%i'), 3),
		  (4,	'Nhân viên D',	'Quảng Ngãi',	8000000, 'Nữ', str_to_date('7/9/1999 22:05', '%d/%m/%Y %H:%i'), str_to_date('2/9/2019 22:05', '%d/%m/%Y %H:%i'), 1),
		  (5,	'Nhân viên E',	'Đà Nẵng',	7000000, 'Nam', str_to_date('1/9/1995 22:05', '%d/%m/%Y %H:%i'), str_to_date('7/9/2020 22:05', '%d/%m/%Y %H:%i'), 1),
		  (6,	'Nhân viên F',	'Đà Nẵng',	5000000, 'Nữ', str_to_date('7/8/1997 22:05', '%d/%m/%Y %H:%i'), str_to_date('15/9/2023 22:05', '%d/%m/%Y %H:%i'), 5),
		  (7,	'Nhân viên G',	'Hà Tĩnh',	3000000, 'Nữ', str_to_date('15/9/2003 22:05', '%d/%m/%Y %H:%i'), str_to_date('22/9/2021 22:05', '%d/%m/%Y %H:%i'), 4),
		  (8,	'Nhân viên H',	'Đà Nẵng',	1000000, 'Nam', str_to_date('7/1/2003 22:05', '%d/%m/%Y %H:%i'), str_to_date('27/9/2022 22:05', '%d/%m/%Y %H:%i'), 1);

INSERT INTO manager(ID, DEPARTMENT_ID, EMPLOYEE_ID, SWEARING_IN_DAY)
VALUES(1, 3, 2, str_to_date('27/9/2022', '%d/%m/%Y')),
		(2, 2, 3, str_to_date('7/9/2020', '%d/%m/%Y')),
		(3, 1, 5, str_to_date('27/10/2019', '%d/%m/%Y')),
		(4, 4, 8, str_to_date('12/5/2021', '%d/%m/%Y')),
		(5, 5, 1, str_to_date('2/10/2022', '%d/%m/%Y'));

INSERT INTO project(ID, NAME, START_DATE, END_DATE, REVENUE, EMPLOYEE_ID)
VALUES(1, 'Dự án 1', str_to_date('27/9/2021', '%d/%m/%Y'), str_to_date('01/02/2022', '%d/%m/%Y'), 200000000, 1),
		(2, 'Dự án 2',str_to_date('27/9/2021', '%d/%m/%Y'), str_to_date('01/02/2022', '%d/%m/%Y'), 230000000, 3),
		(3, 'Dự án 3',str_to_date('27/9/2021', '%d/%m/%Y'), str_to_date('01/02/2022', '%d/%m/%Y'), 300000000, 4),
		(4, 'Dự án 4',str_to_date('27/9/2021', '%d/%m/%Y'), str_to_date('01/02/2022', '%d/%m/%Y'), 400000000, 6),
		(5, 'Dự án 5',str_to_date('27/9/2021', '%d/%m/%Y'), str_to_date('01/02/2022', '%d/%m/%Y'), 243000000, 7);

INSERT INTO project_team_member(ID, PROJECT_ID, EMPLOYEE_ID, CONTROLER_ID)
VALUES(1, 1, 2, 3),
	(2, 1, 6, 5),
	(3, 1, 5, 4),
	(4, 1, 1, 3),
	(5, 1, 4, 2),
	(6, 2, 2, 1),
	(7, 2, 3, 7),
	(8, 3, 2, 6),
	(9, 4, 2, 8);

-- Phần C. Thực hiện truy vấn
-- 1. Liệt kê các dự án diễn ra trong năm *?* có số tiền thu được trên *?* triệu VND
SELECT *
	FROM project
    WHERE year(START_DATE) LIKE 2021 AND REVENUE = 200000000;

-- 2. Liệt kê các nhân viên đã tham gia hơn ?*? giờ trong các dự án, hiển thị chi tiết số giờ trong mỗi dự án mà nhân viên tham gia

-- 3. Liệt kê các nhân viên có mức lương >= mức lương của người giám sát/quản lý trực tiếp nhân viên đó
select *
	from employee e, project_team_member ptm
    where e.ID = ptm.EMPLOYEE_ID;

-- 4. Liệt kê các phòng ban có số lượng nhân viên lớn hơn *?*
SELECT d.*, count(d.ID) EMPLOYEE_COUNT
	FROM department d, employee e
	WHERE d.ID = e.DEPARTMENT_ID
	group by d.ID, d.NAME
    having EMPLOYEE_COUNT > 2;
-- 5. Liệt kê các nhân viên đã làm việc cho công ty hơn 2 năm
select *
	from employee
    where DATEDIFF(CURDATE(), START_DATE) > 2*365;

-- 6. Liệt kê các nhân viên vừa là trưởng phòng ban, và là quản lý dự án
select distinct e.*
from manager m, project p, employee e
where m.EMPLOYEE_ID =  m.EMPLOYEE_ID and m.EMPLOYEE_ID = e.ID;

-- 7. Liệt kê các nhân viên quản lý nhiều hơn 1 dự án
select e.ID, count(p.EMPLOYEE_ID) COUNT_PROJECT_MANAGEMENT
	from employee e, project p
    where e.ID = p.EMPLOYEE_ID
    group by e.ID
    having COUNT_PROJECT_MANAGEMENT > 1;
-- 8. Mỗi khi nhân viên tham gia vào dự án chúng ta cần lưu lại thông tin hay còn được gọi là log để
-- biết nhân viên đó tham gia vào dự án vào thời gian nào
-- Mỗi khi nhân viên cập nhật số giờ tham gia dự án, ta cần lưu lại thông tin thời gian cập nhật khi
-- nào, số giờ tham gia cũ, số giờ tham gia mới
-- Công việc được thực hiện tự động khi dự dữ liệu được thêm, cập nhật