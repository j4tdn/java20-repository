-- Patches to create table
--  ORDER, BILL, ORDER_DETAIL, ORDER_STATUS_DETAIL

-- create table ORDER
DROP TABLE IF EXISTS `ORDER`;
CREATE TABLE IF NOT EXISTS `ORDER`
(
	ID INT,
    DELIVERY_FEE 	  FLOAT,
    CREATED_AT  	  DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP(),
    PAYMENT_METHOD_ID INT NOT NULL,
    EMPLOYEE_ID       INT NOT NULL,
    CUSTOMER_ID 	  INT NOT NULL,
    PRIMARY KEY (ID),
    CONSTRAINT FK_ORDER_PAYMENT_METHOD FOREIGN KEY (PAYMENT_METHOD_ID) REFERENCES PAYMENT_METHOD(ID),
    CONSTRAINT FK_ORDER_EMPLOYEE       FOREIGN KEY (EMPLOYEE_ID)       REFERENCES EMPLOYEE(ID),
    CONSTRAINT FK_ORDER_CUSTEMER       FOREIGN KEY (CUSTOMER_ID)       REFERENCES CUSTOMER(ID)
);

-- create table BILL
DROP TABLE IF EXISTS BILL;
CREATE TABLE IF NOT EXISTS BILL
(
	ID INT, 
    CREATED_AT DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP(),
    TOTAL_OF_MONEY FLOAT NOT NULL,
    ORDER_ID INT NOT NULL,
    PRIMARY KEY (ID),
    CONSTRAINT FK_BILL_ORDER FOREIGN KEY (ORDER_ID) REFERENCES `ORDER`(ID)
);

-- create table ORDER_DETAIL
DROP TABLE IF EXISTS ORDER_DETAIL;
CREATE TABLE IF NOT EXISTS ORDER_DETAIL
(
	ID INT,
    ORDER_ID INT NOT NULL,
    AMOUNT   INT NOT NULL,
    ITEM_DETAIL_ID  INT NOT NULL,
    PRIMARY KEY(ID),
    CONSTRAINT UNQ_ORDER_ITEM_DETAIL 		UNIQUE (ORDER_ID, ITEM_DETAIL_ID),
    CONSTRAINT FK_ORDER_DETAIL_ORDER 		FOREIGN KEY (ORDER_ID) 		  REFERENCES `ORDER`(ID),
    CONSTRAINT FK_ORDER_DETAIL_ITEM_DETAIL  FOREIGN KEY (ITEM_DETAIL_ID)  REFERENCES ITEM_DETAIL(ID)
);

-- create table ORDER_STATUS_DETAIL
DROP TABLE IF EXISTS ORDER_STATUS_DETAIL;
CREATE TABLE IF NOT EXISTS ORDER_STATUS_DETAIL
(
	ID INT, 
    UPDATED_AT 		DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP(),
    ORDER_ID 		INT NOT NULL,
    ORDER_STATUS_ID INT NOT NULL,
    EMPLOYEE_ID 	INT NOT NULL,
    PRIMARY KEY(ID),
    CONSTRAINT UNQ_ORDER_STATUS              UNIQUE (ORDER_ID, ORDER_STATUS_ID),
    CONSTRAINT FK_ORDER_STATUS_DETAIL_ORDER        FOREIGN KEY (ORDER_ID)        REFERENCES `ORDER`(ID),
	CONSTRAINT FK_ORDER_STATUS_DETAIL_ORDER_STATUS FOREIGN KEY (ORDER_STATUS_ID) REFERENCES ORDER_STATUS(ID),
	CONSTRAINT FK_ORDER_STATUS_DETAIL_EMPLOYEE     FOREIGN KEY (EMPLOYEE_ID)     REFERENCES EMPLOYEE(ID)
);

-- In each Table
-- create index, partition(fast filtering)
-- create view 
-- create trigger (aop[aspect object programming]) : khi chạy câu lệnh a thì nó auto chạy câu b
