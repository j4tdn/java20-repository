-- PAYMENT_METHOD, ORDER_STATUS

use java20_shopping;

-- create table PAYMENT_METHOD
drop table if exists PAYMENT_METHOD;
create table PAYMENT_METHOD
(
	ID int,
    `DESC` varchar(100) not null,
    primary key (ID)
);

-- create table ORDER_STATUS
drop table if exists ORDER_STATUS;
create table ORDER_STATUS
(
	ID int,
    `DESC` varchar(100) not null,
    primary key (ID)
);
