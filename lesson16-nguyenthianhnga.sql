-- Phần A. Viết các lệnh để xây dựng mô hình thực thể kết hợp (ER) dựa vào mô tả trên
drop database JAVA20_COMPANY_MANAGEMENT;
CREATE DATABASE IF NOT EXISTS JAVA20_COMPANY_MANAGEMENT CHARACTER SET utf8mb4;

USE JAVA20_COMPANY_MANAGEMENT;
SET FOREIGN_KEY_CHECKS = 0;
DROP TABLE IF EXISTS department;
CREATE TABLE IF NOT EXISTS department
(
	DEPARTMENT_ID INT ,
    DEPARTMENT_NAME VARCHAR(50) NOT NULL UNIQUE,
    MANAGER_ID INT,
    START_DATE DATETIME NOT NULL DEFAULT current_timestamp(),
    PRIMARY KEY (DEPARTMENT_ID),
    CONSTRAINT FK_DEPARTMENT_MANAGER
		FOREIGN KEY (MANAGER_ID) REFERENCES employee (EMPLOYEE_ID)
);

DROP TABLE IF EXISTS employee;
CREATE TABLE IF NOT EXISTS employee
(
	EMPLOYEE_ID INT ,
    EMPLOYEE_NAME VARCHAR(50) NOT NULL,
    ADDRESS TEXT NOT NULL, 
    SALARY FLOAT NOT NULL,
    GENDER CHAR(1),
    DAY_OF_BIRTH DATETIME NOT NULL DEFAULT current_timestamp(),
    HIRE_DATE DATETIME NOT NULL DEFAULT current_timestamp(),
    DEPARTMENT_ID INT,
    SUPERVISOR_ID INT,
    PRIMARY KEY (EMPLOYEE_ID),
    CONSTRAINT FK_EMPLOYEE_DEPARTMENT
		FOREIGN KEY (DEPARTMENT_ID) REFERENCES department (DEPARTMENT_ID),
	CONSTRAINT FK_EMPLOYEE_SUPERVISOR
		FOREIGN KEY (SUPERVISOR_ID) REFERENCES employee (EMPLOYEE_ID)
);

DROP TABLE IF EXISTS project;
CREATE TABLE IF NOT EXISTS project
(
	PROJECT_ID INT ,
    PROJECT_NAME VARCHAR(50) UNIQUE,
    START_DATE DATETIME NOT NULL DEFAULT current_timestamp(),
    END_DATE DATETIME NOT NULL DEFAULT current_timestamp(),
    REVENUE FLOAT,
    PROJECT_MANAGER_ID INT,
    PRIMARY KEY (PROJECT_ID),
    CONSTRAINT FK_PROJECT_MANAGER
		FOREIGN KEY (PROJECT_MANAGER_ID) REFERENCES employee (EMPLOYEE_ID)
);

DROP TABLE IF EXISTS project_participation;
CREATE TABLE IF NOT EXISTS project_participation
(
	EMPLOYEE_ID INT,
    PROJECT_ID INT,
    WORKING_HOURS INT,
    PRIMARY KEY (EMPLOYEE_ID, PROJECT_ID),
    CONSTRAINT FK_PROJECT_PARTICIPATION_EMPLOYEE
		FOREIGN KEY (EMPLOYEE_ID) REFERENCES employee (EMPLOYEE_ID),
    CONSTRAINT FK_PROJECT_PARTICIPATION_PROJECT
		FOREIGN KEY (PROJECT_ID) REFERENCES project (PROJECT_ID)
);
SET FOREIGN_KEY_CHECKS = 1;

-- Phần B. Viết các lệnh để tạo dữ liệu kiểm thử cho dự án
INSERT INTO department (DEPARTMENT_ID,DEPARTMENT_NAME, MANAGER_ID, START_DATE)
VALUES
  (1,'Phòng Kế toán', 1, '2022-01-01'),
  (2,'Phòng Kỹ thuật', 2, '2022-02-01'),
  (3,'Phòng Nhân sự', 3, '2022-03-01'),
  (4,'Phòng Marketing', 4, '2022-04-01'),
  (5,'Phòng Quản lý', 5, '2022-05-01');

INSERT INTO employee (EMPLOYEE_ID, EMPLOYEE_NAME, ADDRESS, SALARY, GENDER, DAY_OF_BIRTH, HIRE_DATE, DEPARTMENT_ID, SUPERVISOR_ID)
VALUES
  (1, 'An Nhiên', 'Đà Nẵng', 5000.00, 'M', '1990-01-01', '2022-01-01', 1, NULL),
  (2, 'Tịnh Nhiên', 'Quảng Nam', 6000.00, 'F', '1995-02-15', '2022-02-01', 1, 1),
  (3, 'Hồng Linh', 'Huế', 5500.00, 'M', '1992-06-10', '2022-03-01', 2, 1),
  (4, 'Thanh Hà', 'Đà Nẵng', 7000.00, 'F', '1988-12-05', '2022-04-01', 2, 2),
  (5, 'Mẫn Nhi', 'Đà Nẵng', 4500.00, 'M', '1998-09-20', '2022-05-01', 2, 1);
  
  INSERT INTO project (PROJECT_ID, PROJECT_NAME, START_DATE, END_DATE, REVENUE, PROJECT_MANAGER_ID)
VALUES
  (1, 'Dự án 1', '2022-01-01', '2022-12-31', 1000000.00, 1),
  (2, 'Dự án 2', '2022-02-01', '2022-11-30', 800000.00, 2),
  (3, 'Dự án 3', '2022-03-01', '2022-10-31', 1200000.00, 3),
  (4, 'Dự án 4', '2022-04-01', '2022-09-30', 900000.00, 4),
  (5, 'Dự án 5', '2022-05-01', '2022-08-31', 1500000.00, 5);
  
INSERT INTO project_participation (EMPLOYEE_ID, PROJECT_ID, WORKING_HOURS)
VALUES
  (1, 1, 40),
  (2, 1, 35),
  (3, 2, 30),
  (4, 3, 25),
  (5, 3, 20);



-- Phần C. Thực hiện truy vấn
-- 1.Liệt kê các dự án diễn ra trong năm 2022 có số tiền thu được trên 1000000 triệu VND
SELECT *
FROM project
WHERE YEAR(START_DATE) = 2022
    AND REVENUE > 1000000;

-- 2.Liệt kê các nhân viên đã tham gia hơn 30 giờ trong các dự án, hiển thị chi tiết số giờ trong mỗi dự án mà nhân viên tham gia
SELECT epl.EMPLOYEE_NAME, prj.PROJECT_NAME, pp.WORKING_HOURS
FROM employee epl
JOIN project_participation pp
	ON epl.EMPLOYEE_ID = pp.EMPLOYEE_ID
JOIN project prj
	ON pp.PROJECT_ID = prj.PROJECT_ID
WHERE pp.WORKING_HOURS > 30;


SELECT e1.EMPLOYEE_NAME,
	   e1.SALARY, 
       e2.EMPLOYEE_NAME AS SUPERVISOR_NAME, 
       e2.SALARY AS SUPERVISOR_SALARY
	FROM employee e1
	JOIN employee e2 
		ON e1.SUPERVISOR_ID = e2.EMPLOYEE_ID
	WHERE e1.SALARY >= e2.SALARY;

-- 4.Liệt kê các phòng ban có số lượng nhân viên lớn hơn 3
SELECT department.DEPARTMENT_NAME, COUNT(employee.DEPARTMENT_ID) AS NUM_EMPLOYEES
	FROM department
	JOIN employee 
		ON department.DEPARTMENT_ID = employee.DEPARTMENT_ID
	GROUP BY department.DEPARTMENT_NAME
	HAVING COUNT(employee.DEPARTMENT_ID) > 2;

-- SÔ LƯỢNG NHÂN VIÊN CỦA MỖI PHÒNG BAN
SELECT department.DEPARTMENT_NAME, COUNT(employee.DEPARTMENT_ID) AS NUM_EMPLOYEES
	FROM department
	LEFT JOIN employee 
		ON department.DEPARTMENT_ID = employee.DEPARTMENT_ID
	GROUP BY department.DEPARTMENT_NAME;

-- 5.liệt kê cácNHÂN VIÊNđã làm việc cho công ty hơn 1 năm
SELECT employee.EMPLOYEE_NAME
	FROM employee
	WHERE YEAR(CURDATE()) - YEAR(employee.HIRE_DATE) >= 1;

-- 6. Liệt kê các nhân viên vừa là trưởng phòng ban, và là quản lý dự án
SELECT employee.EMPLOYEE_NAME
FROM employee
JOIN department 
	ON employee.DEPARTMENT_ID = department.DEPARTMENT_ID
JOIN project 
	ON employee.EMPLOYEE_ID = project.PROJECT_MANAGER_ID
WHERE employee.EMPLOYEE_ID = department.MANAGER_ID;

-- 7. Liệt kê các nhân viên quản lý nhiều hơn 1 dự án
SELECT employee.EMPLOYEE_NAME,employee.EMPLOYEE_ID
	FROM employee
	JOIN project 	
		ON employee.EMPLOYEE_ID = project.PROJECT_MANAGER_ID
	GROUP BY employee.EMPLOYEE_ID, employee.EMPLOYEE_NAME
	HAVING COUNT(project.PROJECT_ID) > 1;
    
    
    -- test: số dự án của mỗi nhân viên quản lý
		SELECT employee.EMPLOYEE_NAME, COUNT(project.PROJECT_ID) AS NUM_OF_PROJECTS
			FROM employee
			JOIN project 
				ON employee.EMPLOYEE_ID = project.PROJECT_MANAGER_ID
			GROUP BY employee.EMPLOYEE_ID, employee.EMPLOYEE_NAME;
	-- --------------------------------------------
    
    
-- 8. Mỗi khi nhân viên tham gia vào dự án chúng ta cần lưu lại thông tin hay còn được gọi là log để
-- biết nhân viên đó tham gia vào dự án vào thời gian nào
-- Mỗi khi nhân viên cập nhật số giờ tham gia dự án, ta cần lưu lại thông tin thời gian cập nhật khi
-- nào, số giờ tham gia cũ, số giờ tham gia mới
-- Công việc được thực hiện tự động khi dự dữ liệu được thêm, cập nhật

