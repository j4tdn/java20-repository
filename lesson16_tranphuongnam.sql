-- Phần A. Viết các lệnh để xây dựng mô hình thực thể kết hợp (ER) dựa vào mô tả trên
-- Create DATABASE
DROP DATABASE IF EXISTS lesson16_tranphuongnam; 
CREATE DATABASE lesson16_tranphuongnam CHAR SET utf8mb4;
USE lesson16_tranphuongnam;

DROP TABLE department;
DROP TABLE department_manager;
DROP TABLE employee;
DROP TABLE project;
DROP TABLE project_detail;

CREATE TABLE IF NOT EXISTS department (
	ID INT,
    `NAME` VARCHAR(100),
     PRIMARY KEY (ID) 
);

CREATE TABLE IF NOT EXISTS employee (
	ID INT,
    FULL_NAME VARCHAR(100),
    ADDRESS TEXT,
    SALARY DOUBLE,
    GENDER VARCHAR(5),
    DATE_OF_BIRTH DATE,
    JOINING_DATE DATE,
    MANAGER_ID INT,
    DEPARTMENT_ID INT,
    PRIMARY KEY (ID),
    CONSTRAINT FK_EMPLOYEE_EMPLOYEE FOREIGN KEY (MANAGER_ID) REFERENCES employee(ID),
    CONSTRAINT FK_EMPLOYEE_DEPARTMENT FOREIGN KEY (DEPARTMENT_ID) REFERENCES department(ID)
);

CREATE TABLE IF NOT EXISTS department_manager (
	ID INT,
    EMPLOYEE_ID INT,
    DEPARTMENT_ID INT,
	DATE_TAKING_OFFICER DATE,
    PRIMARY KEY (ID),
    CONSTRAINT FK_DEPARTMANAGER_EMPLOYEE FOREIGN KEY (EMPLOYEE_ID) REFERENCES employee(ID),
    CONSTRAINT FK_DEPARTMANAGER_DEPARTMENT FOREIGN KEY (DEPARTMENT_ID) REFERENCES department(ID),
    CONSTRAINT UNQ_DEPARTMENT_EMPLOYEE UNIQUE (DEPARTMENT_ID, EMPLOYEE_ID)
);


CREATE TABLE IF NOT EXISTS project (
	ID INT,
    `NAME` VARCHAR(100),
    DAY_START DATE,
    DAY_END DATE,
    REVENUE INT,
    MANAGER_ID INT,
    PRIMARY KEY (ID),
    CONSTRAINT FK_PROJECT_EMPLOYEE FOREIGN KEY (MANAGER_ID) REFERENCES employee(ID)
);

CREATE TABLE IF NOT EXISTS project_detail (
	ID INT,
    PROJECT_ID INT,
    EMPLOYEE_ID INT,
    WORKING_HOUR INT,
    JOINING_DATE DATE,
    PRIMARY KEY (ID),
    CONSTRAINT FK_PROJECT_DETAIL_EMPLOYEE FOREIGN KEY (EMPLOYEE_ID) REFERENCES employee(ID),
    CONSTRAINT FK_PROJECT_DETAIL_PROJECT FOREIGN KEY (PROJECT_ID) REFERENCES project(ID),
    CONSTRAINT UNQ_DEPARTMENT_EMPLOYEE UNIQUE (PROJECT_ID, EMPLOYEE_ID)
);

-- Phần B. Viết các lệnh để tạo dữ liệu kiểm thử cho dự án
-- Yêu cầu: Ít nhất 5 dòng cho mỗi bảng dữ liệu
-- DEPARTMENT
INSERT INTO department(ID,`NAME`)
VALUES  (1, 'Phòng nhân sự'),
		(2, 'Phòng xây dựng'),
        (3, 'Phòng IT'),
		(4, 'Phòng quản lý'),
		(5, 'Phòng kế toán');

-- EMPLOYEE
INSERT INTO employee(ID,FULL_NAME,ADDRESS,SALARY,GENDER,DATE_OF_BIRTH,JOINING_DATE,MANAGER_ID, DEPARTMENT_ID)
VALUES (1, 'Trần Phương Nam', 'Đà Nẵng', 2000000, 'Nam', '2003-10-17', '2023-11-10', null, 1),
	   (2, 'Trần Phương ', 'Huế', 5000000, 'Nam', '2003-10-18', '2023-12-07', 1, 1),
       (3, 'Trần Phương Toàn', 'Quảng Ngãi', 3000000, 'Nam', '2003-09-17', '2023-12-12', 2, 2),
       (4, 'Trần  Nam', 'Đà Nẵng', 7000000, 'Nam', '2003-08-11', '2023-05-05', 2, 2),
       (5, 'Trần Phương Huy', 'Đà Nẵng', 10000000, 'Nam', '2003-07-11', '2023-03-02', 3, 2),
       (6, 'Dương Văn Huy', 'Quảng Nam', 15000000, 'Nam', '2003-08-19', '2023-03-02', 3, 3),
       (7, 'Trần Văn Phú', 'Đà Nẵng', 20000000, 'Nam', '2000-06-01', '2023-03-02', 3, 4),
	   (8, 'Trần Văn Hiền', 'Quảng Nam', 25000000, 'Nam', '1990-01-12', '2023-03-02', 1, 5);

-- department_manager
INSERT INTO department_manager(ID,EMPLOYEE_ID,DEPARTMENT_ID,DATE_TAKING_OFFICER)
VALUES  (1,1,1,'2023-12-30'),
		(2,2,2,'2024-12-30'),
        (3,3,3,'2025-12-30'),
        (4,4,4,'2026-12-30'),
        (5,5,5,'2027-12-30');
        
-- project
INSERT INTO project(ID,`NAME`,DAY_START,DAY_END,REVENUE, MANAGER_ID)
VALUE   (1, 'Làm web shoppe', '2020-10-10', '2023-06-05', 20000000, 1),
		(2, 'Xây dựng cầu đường', '2020-10-10', '2024-12-01', 30000000, 2),
        (3, 'Làm web tính tiền', '2020-10-10', '2023-11-01', 40000000, 3),
        (4, 'Làm app mobile', '2022-01-10', '2025-12-14', 50000000, 4),
        (5, 'Dự án siêu tính toán', '2021-10-10', '2023-12-12', 60000000, 5);
        
-- project_detail
INSERT INTO project_detail(ID,PROJECT_ID,EMPLOYEE_ID,WORKING_HOUR, JOINING_DATE)
VALUES  (1, 1, 1, 20, '2020-10-10'),
		(2, 2, 2, 25, '2021-11-11'),
		(3, 3, 2, 20, '2022-12-12'),
		(4, 4, 3, 10, '2023-09-09'),
		(5, 5, 4, 30, '2019-05-05');
        
-- Phần C. Thực hiện truy vấn
-- 1. Liệt kê các dự án diễn ra trong năm *?* có số tiền thu được trên *?* triệu VND
SELECT * 
  FROM project p
 WHERE year(p.DAY_START) IN (2020)
   AND REVENUE > 20000000; -- 20 triệu
   
-- 2. Liệt kê các nhân viên đã tham gia hơn ?*? giờ trong các dự án, hiển thị chi tiết số giờ trong mỗi
-- dự án mà nhân viên tham gia
SELECT e.*, pd.WORKING_HOUR
  FROM employee e
  JOIN project_detail pd
    ON e.ID = pd.EMPLOYEE_ID
 WHERE pd.WORKING_HOUR > 20;
 
-- 3. Liệt kê các nhân viên có mức lương >= mức lương của người giám sát/quản lý trực tiếp nhân viên đó
WITH CTE_SALARY_OF_MANAGER AS ( -- Tìm mức lương từng người quản lý
	SELECT DISTINCT e1.ID MANAGER_ID, e1.SALARY MANAGER_SALARY
	  FROM employee e1
	  JOIN employee e2
        ON e1.ID = e2.MANAGER_ID
) SELECT e1.* -- Tìm những người nhân viên có mức lương cao hơn quản lý của họ
	FROM employee e1
    JOIN employee e2
      ON e1.MANAGER_ID = e2.ID
	JOIN CTE_SALARY_OF_MANAGER
      ON e1.SALARY > CTE_SALARY_OF_MANAGER.MANAGER_SALARY
	 AND e1.MANAGER_ID = CTE_SALARY_OF_MANAGER.MANAGER_ID;

-- 4. Liệt kê các phòng ban có số lượng nhân viên lớn hơn *?*
SELECT dpm.*, COUNT(e.ID)
  FROM department dpm
  JOIN employee e
    ON e.DEPARTMENT_ID = dpm.ID 
  GROUP BY dpm.ID, dpm.`NAME`
  HAVING COUNT(e.ID) > 1;

-- 5. Liệt kê các nhân viên đã làm việc cho công ty hơn ?*? năm
SELECT *
  FROM employee e
  WHERE year(now()) - year(JOINING_DATE) >= 1;
-- Do dữ liệu em nhập có hơi không lớn bằng năm nên không ra nhân viên nào, anh có thể chỉnh lại now() = '2025-12-12' để test ạ

-- 6. Liệt kê các nhân viên vừa là trưởng phòng ban, và là quản lý dự án
SELECT e.*
  FROM employee e
  JOIN department_manager dpmm  
    ON e.ID = dpmm.EMPLOYEE_ID -- Trưởng phòng
  JOIN project p
    ON e.ID = p.MANAGER_ID; -- quản lý dự án


-- 7. Liệt kê các nhân viên quản lý nhiều hơn 1 dự án
SELECT GROUP_CONCAT(CONCAT(e1.ID,'-',e1.`FULL_NAME`,'-',e1.ADDRESS,'-',e1.SALARY,'-',e1.GENDER)) THONG_TIN_NHAN_VIEN
  FROM employee e1
  JOIN project p 
    ON  e1.ID = p.MANAGER_ID
 GROUP BY e1.ID
HAVING COUNT(p.MANAGER_ID) > 1;

-- 8. Mỗi khi nhân viên tham gia vào dự án chúng ta cần lưu lại thông tin hay còn được gọi là log để 
-- biết nhân viên đó tham gia vào dự án vào thời gian nào
CREATE TABLE IF NOT EXISTS employee_project_log (
    LOG_ID INT AUTO_INCREMENT,
    EMPLOYEE_ID INT,
    PROJECT_ID INT,
    JOINING_DATE DATE,
    PRIMARY KEY (LOG_ID)
);

DELIMITER $$
CREATE TRIGGER after_project_detail_insert
AFTER INSERT ON project_detail
FOR EACH ROW
BEGIN
    INSERT INTO employee_project_log (EMPLOYEE_ID, PROJECT_ID, JOINING_DATE)
    VALUES (NEW.EMPLOYEE_ID, NEW.PROJECT_ID, NEW.JOINING_DATE);
END $$;
DELIMITER ;

-- Mỗi khi nhân viên cập nhật số giờ tham gia dự án, ta cần lưu lại thông tin thời gian cập nhật khi
-- nào, số giờ tham gia cũ, số giờ tham gia mới
-- Công việc được thực hiện tự động khi dự dữ liệu được thêm, cập nhật
CREATE TABLE IF NOT EXISTS project_hours_log (
    LOG_ID INT AUTO_INCREMENT PRIMARY KEY,
    EMPLOYEE_ID INT,
    PROJECT_ID INT,
    OLD_WORKING_HOURS INT,
    NEW_WORKING_HOURS INT
);

DELIMITER $$
CREATE TRIGGER after_project_detail_update
AFTER UPDATE ON project_detail
FOR EACH ROW
BEGIN
    IF NEW.WORKING_HOUR != OLD.WORKING_HOUR THEN
        INSERT INTO project_hours_log (EMPLOYEE_ID, PROJECT_ID, OLD_WORKING_HOURS, NEW_WORKING_HOURS)
        VALUES (NEW.EMPLOYEE_ID, NEW.PROJECT_ID, OLD.WORKING_HOUR, NEW.WORKING_HOUR);
    END IF;
END $$;
DELIMITER ;

