-- Patches to create tables
-- DEPARTMENT, EMPLOYEE

-- CREATE TABLE DEPARTMENT 
DROP TABLE IF EXISTS `DEPARTMENT`;
CREATE TABLE `DEPARTMENT`
(
    `ID`            INT,
    `NAME`          VARCHAR(100) NOT NULL,
    CONSTRAINT PRIMARY KEY(`ID`)
);

-- CREATE TABLE EMPLOYEE
DROP TABLE IF EXISTS `EMPLOYEE`;
CREATE TABLE `EMPLOYEE`
(
	`ID`                INT, 
    `NAME`              VARCHAR(100) NOT NULL,
    `PHONE`             VARCHAR(20) NOT NULL,
    `ADDRESS`           VARCHAR(100) NOT NULL,
    `DEPARTMENT_ID`     INT NOT NULL,
    CONSTRAINT PRIMARY KEY(`ID`),
    CONSTRAINT FK_EMPLOYEE_DEPARTMENT FOREIGN KEY(`DEPARTMENT_ID`) REFERENCES DEPARTMENT(`ID`)
);
