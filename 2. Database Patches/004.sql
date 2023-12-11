-- PAYMENT_METHOD, ORDER_STATUS

use java20_shopping;

-- create table PAYMENT_METHOD
drop table if exists PAYMENT_METHOD;
create table IF NOT EXISTS PAYMENT_METHOD
(
	ID int,
    `DESC` TEXT not null,
    primary key (ID)
);

-- create table ORDER_STATUS
drop table if exists ORDER_STATUS;
create table IF NOT EXISTS ORDER_STATUS
(
	ID int,
    `DESC` TEXT not null,
    primary key (ID)
);
