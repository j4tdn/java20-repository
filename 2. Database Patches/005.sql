USE	java20_shopping;
DROP TABLE IF EXISTS `ORDER`;
CREATE TABLE `ORDER`
(
	ID INT,
    `DELIVERY_FEE` FLOAT NOT NULL,
	`CREATED_AT` DATETIME NOT NULL,
    `PAYMENT_METHOD_ID` INT NOT NULL,
    `EMPLOYEE_ID` INT NOT NULL,
    `CUSTOMER_ID` INT NOT NULL,
    PRIMARY KEY(ID),
    CONSTRAINT FK_ORDER_PAYMENT_METHOD FOREIGN KEY (PAYMENT_METHOD_ID) REFERENCES PAYMENT_METHOD(ID),
    CONSTRAINT FK_ORDER_EMPLOYEE FOREIGN KEY (EMPLOYEE_ID) REFERENCES EMPLOYEE(ID),
    CONSTRAINT FK_ORDER_CUSTOMER FOREIGN KEY (CUSTOMER_ID) REFERENCES CUSTOMER(ID)
);

DROP TABLE IF EXISTS BILL;
CREATE TABLE BILL
(
	ID INT,
	`CREATED_AT` DATETIME NOT NULL,
    `TOTAL_OF_MONEY` FLOAT NOT NULL,
    `ORDER_ID` INT NOT NULL,
    PRIMARY KEY(ID),
    CONSTRAINT FK_BILL_ORDER FOREIGN KEY (ORDER_ID) REFERENCES `ORDER`(ID)
);

DROP TABLE IF EXISTS ORDER_DETAIL;
CREATE TABLE ORDER_DETAIL
(
	ID INT,
    `AMOUNT` INT,
    `ORDER_ID` INT NOT NULL,
	`ITEM_DETAIL_ID` INT NOT NULL,
	PRIMARY KEY(ID),
    CONSTRAINT FK_ORDER_DETAIL_ORDER FOREIGN KEY (ORDER_ID) REFERENCES `ORDER`(ID),
    CONSTRAINT FK_ORDER_DETAIL_ITEM_DETAIL FOREIGN KEY (ITEM_DETAIL_ID) REFERENCES ITEM_DETAIL(ID),
    CONSTRAINT UNQ_ORDER_ITEM_DETAIL UNIQUE (ORDER_ID, ITEM_DETAIL_ID)
);

DROP TABLE IF EXISTS ORDER_STATUS_DETAIL;
CREATE TABLE ORDER_STATUS_DETAIL
(
	ID INT,
    `UPDATED_AT` DATETIME NOT NULL,
    `ORDER_ID` INT NOT NULL,
    `ORDER_STATUS_ID` INT NOT NULL,
    `EMPLOYEE_ID` INT NOT NULL,
    PRIMARY KEY(ID),
    CONSTRAINT FK_ORDER_STATUS_DETAIL_ORDER FOREIGN KEY (ORDER_ID) REFERENCES `ORDER`(ID),
    CONSTRAINT FK_ORDER_STATUS_DETAIL_ORDER_STATUS FOREIGN KEY (ORDER_STATUS_ID) REFERENCES ORDER_STATUS(ID),
    CONSTRAINT FK_ORDER_STATUS_DETAIL_EMPLOYEE FOREIGN KEY (EMPLOYEE_ID) REFERENCES EMPLOYEE(ID),
    CONSTRAINT UNQ_ORDER_ORDER_STATUS UNIQUE (ORDER_ID, ORDER_STATUS_ID)
);