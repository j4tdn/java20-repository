-- Phần A. Viết các lệnh để xây dựng CSDL dựa vào mô tả trên
CREATE DATABASE JAVA1920_COMPANY CHAR SET utf8mb4;
USE JAVA1920_COMPANY;

DROP TABLE IF EXISTS DEPARTMENT;
CREATE TABLE IF NOT EXISTS DEPARTMENT
(
	ID INT,
    `NAME` VARCHAR(100) NOT NULL,
    PRIMARY KEY (ID)
);

DROP TABLE IF EXISTS MANAGER;
CREATE TABLE IF NOT EXISTS MANAGER
(
	ID INT,
    `NAME` VARCHAR(100) NOT NULL,
    DEPARTMENT_ID INT NOT NULL,
    PRIMARY KEY (ID),
    CONSTRAINT FK_MANAGER_DEPARTMENT FOREIGN KEY (DEPARTMENT_ID) REFERENCES DEPARTMENT(ID),
    CONSTRAINT UNQ_MANAGER UNIQUE (DEPARTMENT_ID)
);

DROP TABLE IF EXISTS EMPLOYEE;
CREATE TABLE IF NOT EXISTS EMPLOYEE
(
	ID INT,
    `NAME`	VARCHAR(100) NOT NULL,
    ADDRESS	VARCHAR(100) NOT NULL,
    SALARY	DOUBLE NOT NULL,
    GENDER  BIT NOT NULL,
    BIRTH_DAY DATE NOT NULL,
    DAY_IN DATE NOT NULL,
    DEPARTMENT_ID INT NOT NULL,
    MANAGER_ID INT,
    PRIMARY KEY (ID),
    CONSTRAINT FK_EMPLOYEE_DEPARTMENT FOREIGN KEY (DEPARTMENT_ID) REFERENCES DEPARTMENT(ID),
    CONSTRAINT FK_EMPLOYEE_MANAGER FOREIGN KEY (MANAGER_ID) REFERENCES MANAGER(ID),
    CONSTRAINT CHK_GENDER CHECK (`GENDER` IN (0,1))
);

DROP TABLE IF EXISTS PROJECT;
CREATE TABLE IF NOT EXISTS PROJECT
(
	ID INT,
    `NAME` VARCHAR(100) NOT NULL,
    DAY_START DATE NOT NULL,
    DAY_END DATE NOT NULL,
    SALES DOUBLE NOT NULL,
    PRIMARY KEY (ID)
);

DROP TABLE IF EXISTS PROJECT_DETAIL;
CREATE TABLE IF NOT EXISTS PROJECT_DETAIL
(
	ID INT,
    WORKING_HOURS INT NOT NULL,
    PROJECT_ID INT NOT NULL,
    EMPLOYEE_ID INT NOT NULL,
    PRIMARY KEY (ID),
    CONSTRAINT FK_PROJECT_DETAIL_PROJECT FOREIGN KEY (PROJECT_ID) REFERENCES PROJECT(ID),
    CONSTRAINT FK_PROJECT_DETAIL_EMPLOYEE FOREIGN KEY (EMPLOYEE_ID) REFERENCES EMPLOYEE(ID),
    CONSTRAINT UNQ_PROJECT_EMPLOYEE UNIQUE (PROJECT_ID, EMPLOYEE_ID)
);

-- Phần B. Viết các lệnh để tạo dữ liệu kiểm thử cho dự án
-- Yêu cầu: Ít nhất 5 dòng cho mỗi bảng dữ liệu
INSERT INTO DEPARTMENT(ID, `NAME`)
VALUES(1, 'Bộ phận nhân sự'),
	  (2, 'Bộ phận bán hàng'),
      (3, 'Bộ phận giao hàng'),
      (4, 'Bộ phận giám sát'),
      (5, 'Bộ phận quảng cáo');
      
INSERT INTO MANAGER(ID, `NAME`, DEPARTMENT_ID)
VALUES  (1,	'Nhân viên A', 1),
		(2, 'Nhân viên B', 2),
		(3,	'Nhân viên D', 3),
		(4,	'Nhân viên F', 4),
		(5,	'Nhân viên K', 5);

INSERT INTO EMPLOYEE(ID, `NAME`, ADDRESS, SALARY, GENDER, BIRTH_DAY, DAY_IN, DEPARTMENT_ID, MANAGER_ID)
VALUES  (1, 'Nhân viên A', 'Đà Nẵng', 10000000,	0, str_to_date('7/9/2000', '%d/%m/%Y'), str_to_date('7/9/2020', '%d/%m/%Y'), 1, 1 ),
		(2, 'Nhân viên B', 'Đà Nẵng', 12000000,	0, str_to_date('7/9/2000', '%d/%m/%Y'), str_to_date('7/9/2019', '%d/%m/%Y'), 2, 2 ),
		(3, 'Nhân viên C', 'Đà Nẵng', 11000000,	1, str_to_date('7/9/2000', '%d/%m/%Y'), str_to_date('7/9/2020', '%d/%m/%Y'), 2, NULL ),
		(4, 'Nhân viên D', 'Đà Nẵng', 15000000,	0, str_to_date('7/9/2000', '%d/%m/%Y'), str_to_date('7/9/2021', '%d/%m/%Y'), 3, 3 ),
		(5, 'Nhân viên E', 'Đà Nẵng', 20000000,	1, str_to_date('7/9/2000', '%d/%m/%Y'), str_to_date('7/9/2022', '%d/%m/%Y'), 5, NULL ),
		(6, 'Nhân viên F', 'Đà Nẵng', 30000000,	0, str_to_date('7/9/2000', '%d/%m/%Y'), str_to_date('7/9/2020', '%d/%m/%Y'), 4, 4 ),
		(7, 'Nhân viên G', 'Đà Nẵng', 16000000,	1, str_to_date('7/9/2000', '%d/%m/%Y'), str_to_date('7/9/2018', '%d/%m/%Y'), 1, NULL ),
		(8, 'Nhân viên K', 'Đà Nẵng', 9000000,	1, str_to_date('7/9/2000', '%d/%m/%Y'), str_to_date('7/9/2023', '%d/%m/%Y'), 5, 5 );
        
INSERT INTO PROJECT(ID, `NAME`, DAY_START, DAY_END, SALES)
VALUE (1, 'DỰ ÁN A', str_to_date('7/9/2010', '%d/%m/%Y'), str_to_date('7/9/2020', '%d/%m/%Y'), 100000000),
	  (2, 'DỰ ÁN B', str_to_date('7/9/2015', '%d/%m/%Y'), str_to_date('7/9/2022', '%d/%m/%Y'), 200000000),
	  (3, 'DỰ ÁN C', str_to_date('7/9/2016', '%d/%m/%Y'), str_to_date('7/9/2021', '%d/%m/%Y'), 500000000),
	  (4, 'DỰ ÁN D', str_to_date('7/9/2019', '%d/%m/%Y'), str_to_date('7/9/2023', '%d/%m/%Y'), 150000000),
	  (5, 'DỰ ÁN E', str_to_date('7/9/2020', '%d/%m/%Y'), str_to_date('7/9/2023', '%d/%m/%Y'), 120000000);

INSERT INTO PROJECT_DETAIL(ID, WORKING_HOURS, PROJECT_ID, EMPLOYEE_ID)
VALUE (1, 100, 1, 1),
      (2, 120, 1, 2),
      (3, 20, 2, 3),
      (4, 130, 2, 5),
      (5, 100, 3, 2),
      (6, 150, 4, 3),
      (7, 90, 4, 5),
      (8, 85, 4, 6),
      (9, 120, 5, 7),
      (10, 113, 5, 8);

SELECT * FROM department;
SELECT * FROM employee;
SELECT * FROM manager;
SELECT * FROM project;
SELECT * FROM project_detail;
-- Phần C. Thực hiện truy vấn
-- 1. Liệt kê các dự án diễn ra trong năm *?* có số tiền thu được trên 140000000 triệu VND
SELECT * 
  FROM project pr
 WHERE pr.SALES > 140000000;

-- 2. Liệt kê các nhân viên đã tham gia hơn 110 giờ trong các dự án, hiển thị chi tiết số giờ trong mỗi
-- dự án mà nhân viên tham gia
SELECT *
  FROM employee em
  JOIN project_detail pd
    ON em.ID = pd.EMPLOYEE_ID
 WHERE pd.WORKING_HOURS > 110;

-- 3. Liệt kê các nhân viên có mức lương >= mức lương của người giám sát/quản lý trực tiếp nhân
-- viên đó


-- 4. Liệt kê các phòng ban có số lượng nhân viên lớn hơn *?*
SELECT dp.ID ID_DEPARTMENT,
	   count(*) AMOUNT_EMPLOYEE
  FROM department dp
  JOIN employee em
    ON em.DEPARTMENT_ID = dp.ID
 GROUP BY dp.ID
HAVING AMOUNT_EMPLOYEE > 1;
  

-- --
-- 5. Liệt kê các nhân viên đã làm việc cho công ty hơn ?*? năm
-- --


-- 6. Liệt kê các nhân viên vừa là trưởng phòng ban, và là quản lý dự án
-- --
-- 7. Liệt kê các nhân viên quản lý nhiều hơn 1 dự án
-- --
-- 8. Mỗi khi nhân viên tham gia vào dự án chúng ta cần lưu lại thông tin hay còn được gọi là log để
-- biết nhân viên đó tham gia vào dự án vào thời gian nào
-- Mỗi khi nhân viên cập nhật số giờ tham gia dự án, ta cần lưu lại thông tin thời gian cập nhật khi
-- nào, số giờ tham gia cũ, số giờ tham gia mới
-- Công việc được thực hiện tự động khi dự dữ liệu được thêm, cập nhật