CREATE DATABASE company;
USE company;

/*PART A*/
CREATE TABLE Project(
	ProjectID INT PRIMARY KEY,
    `Name` VARCHAR(50),
    Start_Date DATE,
    End_Date DATE,
    Total_Cash INT
);

CREATE TABLE Department(
	DepartmentID INT PRIMARY KEY,
    Name VARCHAR(50)
);

CREATE TABLE Employee(
	EmployeeID INT PRIMARY KEY,
    `Name` VARCHAR(50),
	`Address` VARCHAR(50),
    Salary INT,
    Gender VARCHAR(50) CHECK(Gender IN ('Nam','Nữ')),
    Date_Of_Birth DATE,
    EntryDate DATE,
    DepartmentID INT /*FOREIGN KEY*/,
    ManagerID INT,
    FOREIGN KEY (DepartmentID) REFERENCES Department(DepartmentID)
);

CREATE TABLE Department_Status(
	ID INT PRIMARY KEY,
    DepartmentID INT /*FOREIGN KEY*/,
    ManagerID INT /*FOREIGN KEY*/,
    Entry_Date DATE,
    FOREIGN KEY (DepartmentID) REFERENCES Department(DepartmentID),
    FOREIGN KEY (ManagerID) REFERENCES Employee(EmployeeID)
);

CREATE TABLE ProjectStatus(
	ID INT PRIMARY KEY,
	EmployeeID INT, /*FOREIGN KEY*/
    ProjectID INT, /*FOREIGN KEY*/
    Time_Spent INT,
    ProjectManagerID INT,
    FOREIGN KEY (EmployeeID) REFERENCES Employee(EmployeeID),
    FOREIGN KEY (ProjectID) REFERENCES Project(ProjectID),
    FOREIGN KEY (ProjectManagerID) REFERENCES Employee(EmployeeID)
);

/*Part B*/
INSERT INTO Department VALUES
	(1, 'Phòng nhân sự'),
    (2, 'Phòng tài chính'),
    (3, 'Phòng marketing'),
    (4, 'Phòng nghiên cứu-phát triển'),
    (5, 'Phòng marketing');
INSERT INTO Employee VALUES
	(1, 'Nguyen Van A', 'Đà Nẵng', 500000, 'Nam', '1980-01-01', '2020-01-01', 1, 1),
	(2, 'Tran Thi B', 'Quảng Nam', 600000, 'Nữ', '1985-02-02', '2020-02-02', 1, 1),
	(3, 'Le Van C', '789 Oak Dr', 600000, 'Nam', '1990-03-03', '2020-03-03', 2, 1),
	(4, 'Pham Thi D', 'Hà Nội', 800000, 'Nữ', '1995-04-04', '2020-04-04', 2, 1),
	(5, 'Hoang Van E', 'Hà Nội', 500000, 'Nam', '2000-05-05', '2020-05-05', 3, 5),
	(6, 'Nguyen Thi F', '987 Cedar Ct', 1000000, 'Nữ', '2005-06-06', '2020-06-06', 3, 5),
	(7, 'Tran Van G', 'TP Hồ Chí Minh', 700000, 'Nam', '2010-07-07', '2020-07-07', 4, 5),
	(8, 'Le Thi H', '246 Birch Pkwy', 1200000, 'Nữ', '2000-06-03', '2020-08-08', 4, 2),
	(9, 'Pham Van I', '369 Willow Blvd', 700000, 'Nam', '2000-09-09', '2020-09-09', 5, 2),
	(10, 'Hoang Thi J', '482 Poplar Rd', 800000, 'Nữ', '1995-10-10', '2020-10-10', 5, 2);
INSERT INTO Project VALUES
	(1, 'Project Alpha', '2020-01-01', '2022-12-31', 10000000),
	(2, 'Project Beta', '2023-01-01', '2023-12-31', 9500000),
	(3, 'Project Gamma', '2020-01-01', '2024-09-25', 7500000),
	(4, 'Project Delta', '2019-01-01', '2025-10-28', 11000000),
	(5, 'Project Epsilon', '2020-07-15', '2026-12-31', 4000000);
INSERT INTO Department_Status VALUES
	(1, 1, 3, '2017-05-07'),
    (2, 2, 6, '2017-05-07'),
    (3, 3, 5, '2018-03-08'),
    (4, 4, 10, '2019-09-11'),
    (5, 5, 1, '2016-08-14');
INSERT INTO ProjectStatus VALUES
	(1, 1, 1, 100, 1),
	(2, 2, 1, 150, 1),
	(3, 3, 2, 200, 5),
	(4, 4, 2, 170, 5),
	(5, 5, 3, 150, 6),
	(6, 6, 3, 200, 6),
	(7, 7, 4, 250, 2),
	(8, 8, 4, 230, 2),
	(9, 9, 5, 150, 10),
	(10, 10, 5, 120, 10);
    
/*Part C*/
-- 1: Liệt kê các dự án diễn ra trong năm *?* có số tiền thu được trên *?* triệu VND
DELIMITER $$
CREATE PROCEDURE Q1(`Project_year` INT, total_cash INT)
BEGIN
	SELECT *
    FROM Project
    WHERE year(Project.Start_Date) = Project_year AND total_cash > Project.Total_Cash;
END $$

CALL Q1(2020, 700000);
-- 2. Liệt kê các nhân viên đã tham gia hơn ?*? giờ trong các dự án, hiển thị chi tiết số giờ trong mỗi dự án mà nhân viên tham gia
DELIMITER $$
CREATE PROCEDURE Q2(`Hours` INT)
BEGIN
	SELECT Employee.EmployeeID, Employee.`Name`, Time_Spent
    FROM Employee
	INNER JOIN ProjectStatus ON Employee.EmployeeID = ProjectStatus.EmployeeID
    WHERE Time_Spent > `Hours`;
END $$

CALL Q2(170);
-- 3. Liệt kê các nhân viên có mức lương >= mức lương của người giám sát/quản lý trực tiếp nhân viên đó

-- 4. Liệt kê các phòng ban có số lượng nhân viên lớn hơn *?*

-- 5. Liệt kê các nhân viên đã làm việc cho công ty hơn ?*? năm

-- 6. Liệt kê các nhân viên vừa là trưởng phòng ban, và là quản lý dự án

-- 7. Liệt kê các nhân viên quản lý nhiều hơn 1 dự án
