CREATE DATABASE lesson16_exam;
USE lesson16_exam;

-- Phần A. Viết các lệnh để xây dựng mô hình thực thể kết hợp (ER) dựa vào mô tả trên

CREATE TABLE EMPLOYEE 
(
    ID      		   INT PRIMARY KEY,
    `NAME`  		   VARCHAR(255) NOT NULL,
    ADDRESS 		   VARCHAR(255),
    SALARY  		   DOUBLE,
    GENDER    		   BIT,
    BIRTHDAY           DATE,
    START_WORKING_DATE DATE,
    DEPARTMENT_ID      INT,
    SUPERVISOR 		   INT,
    HEAD			   BOOLEAN,
    INAUGURATION_DATE  DATE,
    CONSTRAINT FK_EMPLOYEE_DEPARTMENT FOREIGN KEY (DEPARTMENT_ID) REFERENCES DEPARTMENT(ID),
    CONSTRAINT FK_EMPLOYEE_EMPLOYEE   FOREIGN KEY (SUPERVISOR) REFERENCES EMPLOYEE(ID)
);

CREATE TABLE DEPARTMENT 
(
    ID 	   INT PRIMARY KEY,
    `NAME` VARCHAR(255) UNIQUE
);

CREATE TABLE PROJECT
(	
	ID 	  	   		INT PRIMARY KEY,
	`NAME` 	   		VARCHAR(255) UNIQUE,
    START_DATE 		DATE,
    END_DATE   		DATE,
    PROFIT 	   		DOUBLE,
	PROJECT_MANAGER INT,
    CONSTRAINT FK_PROJECT_EMPLOYEE FOREIGN KEY (PROJECT_MANAGER) REFERENCES EMPLOYEE(ID)
);

CREATE TABLE PROJECT_DETAIL
(
	ID 	  	      INT PRIMARY KEY,
    PROJECT_ID    INT UNIQUE,
    EMPLOYEE_ID   INT UNIQUE,
    WORKING_HOURS INT,
    CONSTRAINT FK_PROJECT_DETAIL_PROJECT  FOREIGN KEY (PROJECT_ID)	REFERENCES PROJECT(ID),
    CONSTRAINT FK_PROJECT_DETAIL_EMPLOYEE FOREIGN KEY (EMPLOYEE_ID) REFERENCES EMPLOYEE(ID)
);

-- Phần B. Viết các lệnh để tạo dữ liệu kiểm thử cho dự án
-- Yêu cầu: Ít nhất 5 dòng cho mỗi bảng dữ liệu

INSERT INTO department(ID, `NAME`)
VALUES (1, 'Phong tai chinh'),
	   (2, 'Phong marketing'),
	   (3, 'Phong nhan su'),
	   (4, 'Phong nghien cuu va phat trien'),
	   (5, 'Phong ky thuat - cong nghe');

INSERT INTO employee(ID, `NAME`, ADDRESS, SALARY, GENDER, BIRTHDAY, START_WORKING_DATE, DEPARTMENT_ID, SUPERVISOR, HEAD, INAUGURATION_DATE)
VALUES (1, 'Nguyen Trung Nghia', 'Da Nang', 100000, 1, '2003-11-02', '2024-01-01', 5, NULL, TRUE,  '2023-12-31'),
	   (2, 'Nguyen A', 	         'Da Nang', 200000, 1, '2003-12-03', '2024-01-01', 1, 1,    FALSE, NULL),
       (3, 'Le B', 				 'Da Nang', 300000, 0, '2003-03-04', '2024-01-01', 2, 3,    TRUE,  '2023-12-31'),
       (4, 'Tran C', 			 'Da Nang', 400000, 1, '2003-05-05', '2024-01-01', 2, 4,    FALSE, NULL),
       (5, 'Nguyen Teo',         'Hue',     500000, 0, '2003-07-06', '2024-01-01', 2, 5,    FALSE, NULL);
       
SELECT * FROM employee;


