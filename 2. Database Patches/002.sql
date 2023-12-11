-- Patches to creating tables
-- CUSTOMER

USE java20_shopping;

-- create table CUSTOMER
drop table if exists CUSTOMER;
create table IF NOT EXISTS CUSTOMER
(
	ID int,
    `NAME` 		varchar(100) not null,
    `EMAIL` 	varchar(100) not null,
    `ADDRESS`  	text not null,
    `PHONE` 	varchar(20) not null,
    `PASSWORD`	varchar(300) not null,
    primary key (ID) -- không nên/cần đặt tên cho ràng buộc khóa chính
);
