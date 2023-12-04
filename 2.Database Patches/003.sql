-- Patches to create table
--  DEPARTMENT, EMPLOYEE
-- create table DEPARTMENT
DROP TABLE IF EXISTS DEPARTMENT;
CREATE TABLE IF NOT EXISTS DEPARTMENT
(
	ID INT, 
    `NAME` VARCHAR(100) NOT NULL,
    PRIMARY KEY (ID)
);

-- create table EMPLOYEE
DROP TABLE IF EXISTS EMPLOYEE;
CREATE TABLE IF NOT EXISTS EMPLOYEE
(
	ID INT, 
    `NAME`  VARCHAR(100) NOT NULL,
    PHONE   VARCHAR(100) NOT NULL,
    DIACHI VARCHAR(100) NOT NULL,
    DEPARTMENT_ID INT NOT NULL,
    PRIMARY KEY (ID),
    CONSTRAINT FK_EMPLOYEE_DEPARTMENT FOREIGN KEY (DEPARTMENT_ID) REFERENCES DEPARTMENT(ID)
);
-- RENAME COLUMN DIACHI TO ADDRESS TEXemployeeT NOT NULL
ALTER TABLE EMPLOYEE CHANGE DIACHI ADDRESS TEXT NOT NULL;