-- Patches to creating tables
-- CUSTOMER

USE java20_shopping;

-- create table CUSTOMER
drop table if exists CUSTOMER;
create table CUSTOMER
(
	ID int,
    `NAME` varchar(100) not null,
    `EMAIL` varchar(100) not null,
    `ADDRESS` varchar(300) not null,
    `PHONE` varchar(11) not null,
    `PASSWORD` varchar(100) not null,
    primary key (ID) -- không nên/cần đặt tên cho ràng buộc khóa chính
);
