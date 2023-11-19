-- TEAM, CUSTOMER, EMPLOYEE

use java20_football;

-- create table TEAM
drop table if exists TEAM;
create table TEAM
(
	ID int,
    `NAME` varchar(100) not null,
    MEMBERS int not null,
    primary key (ID)
);

-- create table CUSTOMER
drop table if exists CUSTOMER;
create table CUSTOMER
(
	ID int,
    `NAME` varchar(100) not null,
    ADDRESS varchar(300) not null,
    PHONE varchar(11) not null,
    EMAIL varchar(100) not null,
    TEAM_ID int,
    `PASSWORD` varchar(100) not null,
    primary key (ID),
    constraint FK_CUSTOMER_TEAM foreign key (TEAM_ID) references TEAM(ID)
);

-- create table EMPLOYEE
drop table if exists EMPLOYEE;
create table EMPLOYEE
(
	ID int,
    `NAME` varchar(100) not null,
    ADDRESS varchar(300) not null,
    PHONE varchar(11) not null,
    EMAIL varchar(100) not null,
    `PASSWORD` varchar(100) not null,
    primary key (ID)
);
