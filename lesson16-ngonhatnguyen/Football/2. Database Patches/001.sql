-- OWNER, SIZE, PITCH
CREATE DATABASE JAVA20_FOOTBALL;

USE JAVA20_FOOTBALL;

-- create table OWNER
DROP TABLE IF EXISTS `OWNER`;
CREATE TABLE `OWNER`
(
	ID INT,
    `NAME` VARCHAR(100) NOT NULL,
    `PHONE` VARCHAR(11) NOT NULL,
    `EMAIL` VARCHAR(100) NOT NULL,
    `PASSWORD` VARCHAR(100) NOT NULL,
    PRIMARY KEY (ID)
);

-- create table SIZE
drop table if exists SIZE;
create table SIZE
(
	ID int,
	`DESC` varchar(300),
    primary key (ID)
);

-- create table PITCH
drop table if exists PITCH;
create table PITCH
(
	ID int,
    `NAME` varchar(100) not null,
    `ADDRESS` varchar(300) not null,
    RENT_PRICE float not null,
    OWNER_ID int not null,
    SIZE_ID int not null,
    primary key (ID),
    constraint FK_PITCH_OWNER foreign key (OWNER_ID) references `OWNER`(ID),
    constraint FK_PITCH_SIZE foreign key (SIZE_ID) references SIZE(ID)
);
