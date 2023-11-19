-- create database
CREATE DATABASE java20_shopping CHAR SET utf8mb4;

-- Để chạy câu lệnh
-- 1.Bôi đậm đoạn code cần chạy --> nhấn nút execute
-- 2. Để chạy 1 lệnh(từ bắt đầu đến ;) -- > đặt trỏ chuột vào dòng lệnh muốn chạy --> ctrl enter
-- Patches to creating tables
-- ITEM_GROUP, ITEM, SIZE, ITEM_DETAIL

USE java20_shopping;
-- create table ITEM_GROUP
DROP TABLE IF EXISTS ITEM_GROUP;
CREATE TABLE ITEM_GROUP (
    ID INT ,
    `NAME` VARCHAR(100) NOT NULL,
    PRIMARY KEY (ID) -- Không cần thiết đặt tên cho ràng buộc primary CONSTRAINT PK_ITEM_GROUP 
);

-- create table ITEM
DROP TABLE IF EXISTS ITEM;
CREATE TABLE ITEM
(
	ID			 	INT,
    MATERIAL	 	VARCHAR(100) NOT NULL,
    BUY_PRICE	 	FLOAT NOT NULL,
    COLOR 		 	VARCHAR(50) NOT NULL,
    ITEM_GROUP_ID	INT NOT NULL,  -- khóa ngoại không bắt buộc phải not null
    PRIMARY KEY (ID),
    CONSTRAINT FK_ITEM_ITEM_GROUP FOREIGN KEY (ITEM_GROUP_ID) REFERENCES ITEM_GROUP(ID)
);

-- create table size 
CREATE TABLE SIZE 
(
	ID INT,
    `KEY` VARCHAR(10) NOT NULL,
    GENDER BIT NOT NULL,
    `DESC` TEXT NOT NULL,
    PRIMARY KEY(ID),
    CONSTRAINT CHECK_SIZE_KEY CHECK( `KEY` IN ('S', 'M' , 'L', 'XL', 'XXL', 'XXXL')),
    CONSTRAINT CHECK_GENDER CHECK(`GENDER` IN (0,1))
);

-- create table 
CREATE TABLE ITEM_DETAIL
(
	ID INT,
    ITEM_ID INT NOT NULL,
    SIZE_ID INT NOT NULL,
    AMOUNT INT NOT NULL,
    SALE_PRICE FLOAT NOT NULL,
    PRIMARY KEY (ID),
    CONSTRAINT UNQ_ITEM_SIZE UNIQUE (ITEM_ID,SIZE_ID),
    CONSTRAINT FK_ITEM_DETAIL_ITEM FOREIGN KEY (ITEM_ID) REFERENCES ITEM(ID),
    CONSTRAINT FK_ITEM_DETAIL_SIZE FOREIGN KEY (SIZE_ID) REFERENCES SIZE(ID)
    
    
);

ALTER TABLE ITEM_DETAIL
ADD CONSTRAINT FK_ITEM_DETAIL_ITEM FOREIGN KEY (ITEM_ID) REFERENCES ITEM(ID);

CREATE TABLE CUSTOMER
(
	ID INT,
    `NAME`VARCHAR(100) NOT NULL,
    EMAIL VARCHAR(100) NOT NULL,
    ADDRESS VARCHAR(100),
    PHONE VARCHAR(10),
    `PASSWORD` VARCHAR(100) NOT NULL,
    PRIMARY KEY(ID)
);
 
CREATE TABLE DEPARTMENT
(	
	ID INT NOT NULL,
    `NAME` VARCHAR(100),
    PRIMARY KEY(ID) 
);

CREATE TABLE EMPLOYEE
(
	ID INT,
    DEPARTMENT_ID  INT NOT NULL,
    `NAME` VARCHAR(100),
    PHONE VARCHAR(10),
    ADDRESS VARCHAR(100),
    PRIMARY KEY(ID),
    CONSTRAINT FK_EMPLOYEE_DEPARTMENT FOREIGN KEY (DEPARTMENT_ID) REFERENCES DEPARTMENT(ID)
	
);

CREATE TABLE PAYMENT_METHOD
(
	ID INT NOT NULL,
    `NAME` VARCHAR(100),
    PRIMARY KEY(ID)

);
CREATE TABLE ORDER_STATUS
(
	ID INT NOT NULL,
    `NAME` VARCHAR(100),
    PRIMARY KEY(ID)
);

CREATE TABLE `ORDER`
(
	ID INT NOT NULL,
    PAYMENT_METHOD_ID INT,
    EMPLOYEE_ID INT,
    CUSTOMER_ID INT,
    DELIVERY_FEE DECIMAL(10,2),
    CREATE_AT DATE,
    PRIMARY KEY(ID),
    CONSTRAINT FK_ORDER_PAYMENT_METHOD FOREIGN KEY(PAYMENT_METHOD_ID) REFERENCES PAYMENT_METHOD(ID),
    CONSTRAINT FK_ORDER_EMPLOYEE FOREIGN KEY(EMPLOYEE_ID) REFERENCES EMPLOYEE(ID),
    CONSTRAINT FK_ORDER_CUSTOMER FOREIGN KEY(CUSTOMER_ID) REFERENCES CUSTOMER(ID)
);

CREATE TABLE BILL
(
	ID INT NOT NULL,
    ORDER_ID INT NOT NULL,
    CREATE_AT DATE,
    TOTAL_OF_MONEY DECIMAL(10,2),
    PRIMARY KEY(ID),
    CONSTRAINT FK_BILL_ORDER FOREIGN KEY(ORDER_ID) REFERENCES `ORDER`(ID)
);

CREATE TABLE ORDER_DETAIL
(
	ID INT NOT NULL,
    ORDER_ID INT,
    ITEM_DETAIL_ID INT,
    AMOUNT INT,
    PRIMARY KEY(ID),
    CONSTRAINT FK_ORDER_DETAIL_ORDER FOREIGN KEY(ORDER_ID) REFERENCES `ORDER`(ID),
    CONSTRAINT FK_ORDER_DETAIL_ITEM_DETAIL FOREIGN KEY(ITEM_DETAIL_ID) REFERENCES ITEM_DETAIL(ID)
);

CREATE TABLE ORDER_STATUS_DETAIL
(
	ID INT NOT NULL,
    ORDER_ID INT NOT NULL,
    ORDER_STATUS_ID INT NOT NULL,
    EMPLOYEE_ID INT NOT NULL,
    UPDATE_AT DATETIME,
    PRIMARY KEY(ID),
    CONSTRAINT FK_ORDER_STATUS_DETAIL_ORDER FOREIGN KEY(ORDER_ID) REFERENCES `ORDER`(ID),
    CONSTRAINT FK_ORDER_STATUS_DETAIL_ORDER_STATUS FOREIGN KEY(ORDER_STATUS_ID) REFERENCES ORDER_STATUS(ID),
    CONSTRAINT FK_ORDER_STATUS_DETAIL_EMPLOYEE FOREIGN KEY (EMPLOYEE_ID) REFERENCES EMPLOYEE(ID) 
);
-- ALTER TABLE ITEM_DETAIL
-- CONSTRAINT FK_ITEM_DETAIL_SIZE FOREIGN KEY (SIZE_ID) REFERENCES SIZE(ID)

-- chưa học - thử
TRUNCATE SIZE;
DELETE FROM SIZE;
SELECT * FROM SIZE;
INSERT INTO SIZE VALUES(1, 'S', 0,'Nữ cân nặng bé hơn 40 kg');
----------





