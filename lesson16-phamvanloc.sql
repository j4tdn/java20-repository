CREATE DATABASE KIEMTRA16 CHAR SET utf8mb4;
USE KIEMTRA16;


-- create table Employee
DROP TABLE IF EXISTS `Employee`;
CREATE TABLE Employees (
    EmployeeID INT PRIMARY KEY,
    FullName VARCHAR(255),
    Address VARCHAR(255),
    Salary DECIMAL(10, 2),
    Gender VARCHAR(10),
    BirthDate DATE,
    JoinDate DATE,
    DepartmentID INT,
    ManagerID INT,
    CONSTRAINT FK_EMPLOYEE_DEPARTMENT FOREIGN KEY (DepartmentID) REFERENCES Departments(DepartmentID),
    CONSTRAINT FK_EMPLOYEE_MANAGER FOREIGN KEY (ManagerID) REFERENCES Employees(EmployeeID)
);

DROP TABLE IF EXISTS `Department`;
-- Tạo bảng Departments
CREATE TABLE Departments (
    DepartmentID INT PRIMARY KEY,
    DepartmentName VARCHAR(255),
    ManagerID INT,
    StartDate DATE
);



-- create table project
DROP TABLE IF EXISTS `Project`;
-- Tạo bảng Projects
CREATE TABLE Projects (
    ProjectID INT PRIMARY KEY,
    ProjectName VARCHAR(255),
    StartDate DATE,
    EndDate DATE,
    Revenue DECIMAL(15, 2),
    ManagerID INT,
    CONSTRAINT FK_PROJECT_MANAGER FOREIGN KEY (ManagerID) REFERENCES Employees(EmployeeID)
);

DROP TABLE IF EXISTS ` WorkHours`;
-- Tạo bảng WorkHours
CREATE TABLE WorkHours (
    WorkID INT PRIMARY KEY,
    EmployeeID INT,
    ProjectID INT,
    HoursWorked INT,
    CONSTRAINT FK_WORK_EMPLOYEE FOREIGN KEY (EmployeeID) REFERENCES Employees(EmployeeID),
    CONSTRAINT FK_WORK_PROJECT FOREIGN KEY (ProjectID) REFERENCES Projects(ProjectID)
);


-- Chèn dữ liệu kiểm thử cho bảng Departments
INSERT INTO Departments (DepartmentID, DepartmentName, ManagerID, StartDate)
VALUES
    (1, 'Bộ Phận Nhân Sự', 101, '2022-01-01'),
    (2, 'Bộ Phận Công Nghệ Thông Tin', 102, '2022-01-01'),
    (3, 'Bộ Phận Tài Chính', 103, '2022-01-01'),
    (4, 'Bộ Phận Tiếp Thị', 104, '2022-01-01'),
    (5, 'Bộ Phận Quản Lý Hoạt Động', 105, '2022-01-01');

-- Chèn dữ liệu kiểm thử cho bảng Employees
INSERT INTO Employees (EmployeeID, FullName, Address, Salary, Gender, BirthDate, JoinDate, DepartmentID, ManagerID)
VALUES
    (101, 'PHAM VAN LOC', '123 Đường LÊ DUẪN', 60000.00, 'Nam', '2001-01-15', '2020-01-01', 1, NULL),
    (102, 'HO SY THANH', '456 LÝ THÁI ', 70000.00, 'Nữ', '1985-05-20', '2020-01-01', 2, 101),
    (103, 'CAO BA QUAT', '789 Đường HÀ HUY TẬP', 80000.00, 'Nam', '1998-09-10', '2020-01-01', 3, 102),
    (104, 'HA ANH', '101 Đường VỀ', 75000.00, 'Nữ', '1999-03-25', '2020-01-01', 4, 103),
    (105, 'XUAN LE', '202 Đường NGUYỄN CÔNG TRỨ', 90000.00, 'Nam', '1999-11-30', '2020-01-01', 5, 104),
    (101, 'PHAM VAN LOC', '123 Đường LÊ DUẪN', 60000.00, 'Nam', '2001-01-15', '2020-01-01', 1, 105);
-- Chèn dữ liệu kiểm thử cho bảng Projects
INSERT INTO Projects (ProjectID, ProjectName, StartDate, EndDate, Revenue, ManagerID)
VALUES
    (201, 'Dự Án A', '2022-02-01', '2022-07-31', 100000.00, 101),
    (202, 'Dự Án B', '2022-03-15', '2022-09-30', 150000.00, 102),
    (203, 'Dự Án C', '2022-05-01', '2022-12-31', 120000.00, 103),
    (204, 'Dự Án D', '2022-06-10', '2023-02-28', 180000.00, 104),
    (205, 'Dự Án E', '2022-08-01', '2023-04-15', 200000.00, 105);

-- Chèn dữ liệu kiểm thử cho bảng WorkHours
INSERT INTO WorkHours (WorkID, EmployeeID, ProjectID, HoursWorked)
VALUES
    (301, 101, 201, 40),
    (302, 102, 201, 35),
    (303, 103, 202, 30),
    (304, 104, 202, 45),
    (305, 105, 203, 38);
    
    
-- EX1:  Liệt kê các dự án diễn ra trong năm *năm* có số tiền thu được trên *m triệu* VND
SELECT 
    ProjectName AS PROJECT_NAME,
    StartDate AS START_DATE,
    EndDate AS END_DATE,
    Revenue AS REVENUE_IN_VND
FROM 
    Projects
WHERE 
    YEAR(StartDate) = 2022 -- Thay 2022 bằng năm mong muốn
    AND Revenue > 100000.00; -- Thay 100000.00 bằng số tiền mong muốn (đơn vị triệu VND)
    
    -- EX3: Liệt kê các nhân viên có mức lương >= mức lương của người giám sát/quản lý trực tiếp
SELECT 
    e.EmployeeID AS EMPLOYEE_ID,
    e.FullName AS EMPLOYEE_NAME,
    e.Salary AS EMPLOYEE_SALARY,
    m.EmployeeID AS MANAGER_ID,
    m.FullName AS MANAGER_NAME,
    m.Salary AS MANAGER_SALARY
FROM 
    Employees e
JOIN 
    Employees m ON e.ManagerID = m.EmployeeID
WHERE 
    e.Salary >= m.Salary;
    
    
    -- EX5 Liệt kê các công ty đã làm việc cho công ty hơn ? năm
SELECT 
    c.CompanyID AS COMPANY_ID,
    c.CompanyName AS COMPANY_NAME,
    c.StartDate AS START_DATE,
    c.EndDate AS END_DATE
FROM 
    Companies c
WHERE 
    DATEDIFF(NOW(), c.StartDate) > 5; -- Thay 5 bằng số năm mong muốn

    
    
    







