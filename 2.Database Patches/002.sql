-- 002.sql
-- --> CUSTOMER

-- create table CUSTOMER
DROP TABLE IF EXISTS CUSTOMER;
CREATE TABLE IF NOT EXISTS CUSTOMER
(
	ID INT,
    `NAME`     VARCHAR(100) NOT NULL,
    EMAIL      VARCHAR(100) NOT NULL,
    ADDRESS    TEXT NOT NULL,
    PHONE      VARCHAR(20) NOT NULL,
    `PASSWORD` VARCHAR(300) NOT NULL,
    PRIMARY KEY (ID)
);