-- -->	PAYMENT_METHOD, ORDER_STATUS
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