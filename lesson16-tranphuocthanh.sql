-- CREATE DATABASE lesson16_tranphuocthanh CHARSET UTF8;
SET FOREIGN_KEY_CHECKS = 1;
-- Phần A. Viết các lệnh để xây dựng mô hình thực thể kết hợp (ER) dựa vào mô tả trên
DROP TABLE IF EXISTS DEPARTMENT;
CREATE TABLE IF NOT EXISTS DEPARTMENT
(
	ID INT,
    `NAME` VARCHAR(100) NOT NULL,
    PRIMARY KEY (ID)
);

DROP TABLE IF EXISTS EMPLOYEE;
CREATE TABLE IF NOT EXISTS EMPLOYEE 
(
	ID INT,
    `NAME` VARCHAR(100) NOT NULL,
    ADDRESS TEXT NOT NULL,
    SALARY FLOAT NOT NULL,
    GENDER BIT NOT NULL,
    DATE_OF_BIRTH DATETIME NOT NULL,
    DATE_JOINED DATETIME NOT NULL,
    DEPARTMENT_ID INT NOT NULL,
    PRIMARY KEY (ID),
    CONSTRAINT FK_EMPLOYEE_DEPARTMENT FOREIGN KEY (DEPARTMENT_ID) REFERENCES DEPARTMENT (ID)
);


DROP TABLE IF EXISTS DEPARTMENT_MANAGER;
CREATE TABLE IF NOT EXISTS DEPARTMENT_MANAGER
(
	ID INT,
    EMLOYLEE_ID INT NOT NULL,
    DEPARTMENT_ID INT NOT NULL,
    DATE_APPOINTED DATETIME NOT NULL,
    PRIMARY KEY (ID),
    CONSTRAINT FK_DEPARTMENT_MANAGER_EMPLOYEE FOREIGN KEY (EMLOYLEE_ID) REFERENCES EMPLOYEE (ID),
    CONSTRAINT FK_DEPARTMENT_MANAGER_DEPARTMENT FOREIGN KEY (DEPARTMENT_ID) REFERENCES DEPARTMENT (ID),
    CONSTRAINT UNQ_EMLOYEE_DEPARMENT UNIQUE(EMLOYLEE_ID,DEPARTMENT_ID)
); 

DROP TABLE IF EXISTS PROJECT;
CREATE TABLE IF NOT EXISTS PROJECT 
(
	ID INT,
    `NAME` VARCHAR(100) NOT NULL,
    START_DATE DATETIME NOT NULL,
    END_DATE DATETIME NOT NULL,
    REVENUE FLOAT NOT NULL,
    PRIMARY KEY (ID)
);

DROP TABLE IF EXISTS PROJECT_DETAIL;
CREATE TABLE IF NOT EXISTS PROJECT_DETAIL 
(
	ID INT,
    EMPLOYEE_ID INT NOT NULL,
    PROJECT_ID INT NOT NULL,
    WORKING_HOURS FLOAT NOT NULL,
    PRIMARY KEY (ID),
    CONSTRAINT FK_PROJECT_DETAIL_EMPOYLEE FOREIGN KEY (EMPLOYEE_ID) REFERENCES EMPLOYEE (ID),
    CONSTRAINT FK_PROJECT_DETAIL_PROJECT FOREIGN KEY (PROJECT_ID) REFERENCES PROJECT (ID),
    CONSTRAINT UNQ_EMPLOYEE_PROJECT UNIQUE (EMPLOYEE_ID, PROJECT_ID)
);

DROP TABLE IF EXISTS EMPLOYEE_MANAGER;
CREATE TABLE IF NOT EXISTS EMPLOYEE_MANAGER
(
	ID INT,
    EMPLOYEE_ID INT NOT NULL,
    MANAGER_ID INT NOT NULL,
    PRIMARY KEY(ID),
    CONSTRAINT FK_MANAGER_EMPLOYEE FOREIGN KEY (EMPLOYEE_ID) REFERENCES EMPLOYEE(ID),
	CONSTRAINT FK_MANAGER_EMPLOYEE_MANAGER FOREIGN KEY (MANAGER_ID) REFERENCES EMPLOYEE(ID),
    CONSTRAINT UNQ_EMPLOYEE_MANAGER UNIQUE(EMPLOYEE_ID, MANAGER_ID)
); 

DROP TABLE IF EXISTS PROJECT_MANAGER;
CREATE TABLE IF NOT EXISTS PROJECT_MANAGER
(
	ID INT,
    PROJECT_ID INT NOT NULL,
    EMPLOYEE_ID INT NOT NULL,
    PRIMARY KEY (ID),
    CONSTRAINT FK_PM_PROJECT FOREIGN KEY (PROJECT_ID) REFERENCES PROJECT(ID),
    CONSTRAINT FK_PM_EMPLOYEE FOREIGN KEY (EMPLOYEE_ID) REFERENCES EMPLOYEE(ID),
    CONSTRAINT UNQ_EMPLOYEE_PROJECT UNIQUE(EMPLOYEE_ID, PROJECT_ID)
);
-- Phần B. Viết các lệnh để tạo dữ liệu kiểm thử cho dự án
-- Yêu cầu: Ít nhất 5 dòng cho mỗi bảng dữ liệu
INSERT INTO DEPARTMENT(ID, `NAME`)
VALUES (1, 'Phòng quản lý'),
	   (2, 'Phòng nhân sự'),
       (3, 'Phòng kế toán'),
       (4, 'Phòng điều hành'),
       (5, 'Phòng marketing');
       
INSERT INTO EMPLOYEE(ID, `NAME`, ADDRESS, SALARY, GENDER, DATE_OF_BIRTH, DATE_JOINED, DEPARTMENT_ID)
VALUES(1,'Lê Văn Tý', 'Đà Nẵng', 1000000, 1, '1999-10-20 00:00:00', '2022-10-01 00:00:00', 1),
	  (2,'Trần Thị Lý', 'Quảng Nam', 2000000, 0, '1989-03-20 00:00:00', '2020-10-01 00:00:00', 1),
      (3,'Lê Văn Hải', 'Đà Nẵng', 1300000, 1, '1995-11-20 00:00:00', '2021-07-01 00:00:00', 2),
      (4,'Nguyễn Thị Kim', 'Huế', 1500000, 0, '1993-10-20 00:00:00', '2019-10-01 00:00:00', 3),
      (5,'Ngô Văn Bắc', 'Quảng Trị', 1700000, 1, '2000-05-20 00:00:00', '2018-08-01 00:00:00', 5),
      (6,'Hà Văn Bắc', 'Quảng Trị', 1700000, 1, '2000-07-20 00:00:00', '2018-09-01 00:00:00', 4);

INSERT INTO department_manager(ID,EMLOYLEE_ID, DEPARTMENT_ID, DATE_APPOINTED)
VALUES(1, 1, 2, '2010-10-20 00:00:00'),
	  (2, 2, 4, '2013-10-20 00:00:00'),
      (3, 3, 5, '2016-10-20 00:00:00'),
      (4, 4, 3, '2018-10-20 00:00:00'),
      (5, 6, 1, '2019-10-20 00:00:00');
	
INSERT INTO project(ID, `NAME`, START_DATE, END_DATE, REVENUE)
VALUES(1, 'Hợp tác kĩ thuật', '2010-10-20 00:00:00', '2011-10-20 00:00:00', 100000000),
	  (2, 'Hợp tác kinh doang', '2012-10-20 00:00:00', '2014-10-20 00:00:00', 1020000000),
      (3, 'Hợp tác nghiên cứu, phát triển', '2020-10-20 00:00:00', '2022-10-20 00:00:00', 1500000000),
      (4, 'Dự án đào tạo, quản lý', '2016-10-20 00:00:00', '2017-10-20 00:00:00', 200000000),
      (5, 'Dự án hợp tác vốn vay ODA', '2018-10-20 00:00:00', '2023-10-20 00:00:00', 400000000);

INSERT INTO project_detail(ID, EMPLOYEE_ID, PROJECT_ID, WORKING_HOURS)
VALUES(1, 1, 1, 40),
	  (2, 1, 4, 50),
      (3, 2, 1, 48),
      (4, 1, 2, 100),
      (5, 5, 1, 200);

INSERT INTO employee_manager(ID, EMPLOYEE_ID, MANAGER_ID)
VALUES(1, 1, 2),
	  (2, 2, 4),
      (3, 3, 5),
      (4, 4, 3),
      (5, 5, 2);

INSERT INTO project_manager(ID, PROJECT_ID, EMPLOYEE_ID)
VALUES(1, 1, 1),
	  (2, 2, 5),
      (3, 3, 3),
      (4, 4, 4),
      (5, 5, 2);
INSERT INTO project_manager(ID, PROJECT_ID, EMPLOYEE_ID)
VALUES(6, 1, 2);
-- Phần C. Thực hiện truy vấn
-- 1. Liệt kê các dự án diễn ra trong năm *?* có số tiền thu được trên *?* triệu VND
SELECT *
  FROM project
 WHERE YEAR(START_DATE) = 2020
   AND REVENUE > 1000000;
   
-- 2. Liệt kê các nhân viên đã tham gia hơn ?*? giờ trong các dự án, hiển thị chi tiết số giờ trong mỗi
-- dự án mà nhân viên tham gia
SELECT *
  FROM project_detail
 WHERE WORKING_HOURS > 50;
 
-- 3. Liệt kê các nhân viên có mức lương >= mức lương của người giám sát/quản lý trực tiếp nhân viên đó
WITH CTE_MANAGER_SALARY AS
(
SELECT  em.EMPLOYEE_ID,
		ep.ID MANAGER_ID,
		ep.SALARY 
   FROM employee_manager em
   JOIN employee ep
	 ON em.MANAGER_ID = ep.ID
)
SELECT *
  FROM employee ep
  JOIN CTE_MANAGER_SALARY ms
    ON ep.ID = ms.EMPLOYEE_ID
 WHERE ep.SALARY > ms.SALARY;
-- 4. Liệt kê các phòng ban có số lượng nhân viên lớn hơn *?*
SELECT *
  FROM DEPARTMENT
 WHERE ID IN (SELECT DEPARTMENT_ID
				FROM EMPLOYEE
			   GROUP BY DEPARTMENT_ID
			  HAVING COUNT(ID) >= 2);

-- 5. Liệt kê các nhân viên đã làm việc cho công ty hơn ?*? năm
SELECT *
  FROM employee
 WHERE (year(current_timestamp()) - year(DATE_JOINED)) > 3;
-- 6. Liệt kê các nhân viên vừa là trưởng phòng ban, và là quản lý dự án
SELECT ep.*
  FROM employee ep
  JOIN department_manager dm
    ON ep.ID = dm.EMLOYLEE_ID
  JOIN project_manager pm
    ON ep.ID = pm.EMPLOYEE_ID;

-- 7. Liệt kê các nhân viên quản lý nhiều hơn 1 dự án
SELECT *
  FROM employee
 WHERE ID IN(SELECT pm.EMPLOYEE_ID
			   FROM employee ep
               JOIN project_manager pm
                 ON ep.ID = pm.ID
			  GROUP BY pm.EMPLOYEE_ID
			 HAVING COUNT(pm.PROJECT_ID) > 1);
             
-- 8. Mỗi khi nhân viên tham gia vào dự án chúng ta cần lưu lại thông tin hay còn được gọi là log để
-- biết nhân viên đó tham gia vào dự án vào thời gian nào

-- Mỗi khi nhân viên cập nhật số giờ tham gia dự án, ta cần lưu lại thông tin thời gian cập nhật khi
-- nào, số giờ tham gia cũ, số giờ tham gia mới
-- Công việc được thực hiện tự động khi dự dữ liệu được thêm, cập nhật