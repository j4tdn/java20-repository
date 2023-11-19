-- PAYMENT_METHOD, PITCH_STATUS

use java20_football;

-- create table PAYMENT_METHOD
drop table if exists PAYMENT_METHOD;
create table PAYMENT_METHOD
(
	ID int,
    `DESC` varchar(100) not null,
    primary key (ID)
);

-- create table PITCH_STATUS
drop table if exists PITCH_STATUS;
create table PITCH_STATUS
(
	ID int,
    `STATUS` varchar(100) not null,
    primary key (ID)
);
