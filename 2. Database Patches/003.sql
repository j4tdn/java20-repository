-- DEPARTMENT, EMPLOYEE
USE java20_shopping;

-- create table DEPARTMENT
drop table if exists DEPARTMENT;
create table IF NOT EXISTS DEPARTMENT
(
	ID int,
    `NAME` varchar(100) not null,
    primary key (ID) -- không nên/cần đặt tên cho ràng buộc khóa chính
);

-- create table EMPLOYEE
drop table if exists EMPLOYEE;
create table IF NOT EXISTS EMPLOYEE
(
	ID int,
    `NAME` varchar(100) not null,
    `PHONE` varchar(20) not null,
    `DIACHI` VARCHAR(100) not null,
    `DEPARTMENT_ID` int not null,
    primary key (ID), -- không nên/cần đặt tên cho ràng buộc khóa chính
    constraint FK_EMPLOYEE_DEPARTMENT foreign key (DEPARTMENT_ID) references DEPARTMENT(ID)
);

-- rename column DIACHI to ADDRESS TEXT NOT NULL
ALTER TABLE EMPLOYEE CHANGE DIACHI ADDRESS TEXT NOT NULL;
