-- ORDER, ORDER_DETAIL, MATCH, BILL, PITCH_STATUS_DETAIL

use java20_football;

-- create table ORDER
drop table if exists `ORDER`;
create table `ORDER`
(
	ID int,
    CUSTOMER_ID int not null,
    CREATED_AT datetime not null,
    EMPLOYEE_ID int not null,
    PAYMENT_METHOD_ID int not null,
    primary key (ID),
    constraint FK_ORDER_CUSTOMER foreign key (CUSTOMER_ID) references CUSTOMER(ID),
    constraint FK_ORDER_EMPLOYEE foreign key (EMPLOYEE_ID) references EMPLOYEE(ID),
    constraint FK_ORDER_PAYMENT_METHOD foreign key (PAYMENT_METHOD_ID) references PAYMENT_METHOD(ID)
);

-- create table ORDER_DETAIL
drop table if exists ORDER_DETAIL;
create table ORDER_DETAIL
(
	ID int,
    ORDER_ID int not null,
    PITCH_ID int not null,
    TIME_AMOUNT float not null,
    TIME_BEGIN datetime not null,
    primary key (ID),
    constraint UNQ_ORDER_PITCH unique (ORDER_ID, PITCH_ID)
);
ALTER TABLE ORDER_DETAIL
ADD CONSTRAINT FK_ORDER_DETAIL_ORDER FOREIGN KEY (ORDER_ID) REFERENCES `ORDER`(ID);
ALTER TABLE ORDER_DETAIL
ADD CONSTRAINT FK_ORDER_DETAIL_PITCH FOREIGN KEY (PITCH_ID) REFERENCES PITCH(ID);

-- create table MATCH
drop table if exists `MATCH`;
create table `MATCH`
(
	ID int,
    `NAME` varchar(100) not null,
    DATETIME_BEGIN datetime not null,
    TEAM_ID int,
    PITCH_ID int not null,
    ORDER_ID int not null,
    primary key (ID),
    constraint FK_MATCH_ORDER foreign key (ORDER_ID) references `ORDER`(ID),
    constraint FK_MATCH_TEAM foreign key (TEAM_ID) references TEAM(ID),
    constraint FK_MATCH_PITCH foreign key (PITCH_ID) references PITCH(ID)
);

-- create table BILL
drop table if exists BILL;
create table BILL
(
	ID int,
    CREATED_AT datetime not null,
    TOTAL_OF_MONEY float not null,
    ORDER_ID int not null,
    primary key (ID),
    constraint FK_BILL_ORDER foreign key (ORDER_ID) references `ORDER`(ID)
);

-- create table PITCH_STATUS_DETAIL
drop table if exists PITCH_STATUS_DETAIL;
create table PITCH_STATUS_DETAIL
(
	ID int,
    PITCH_ID int not null,
    PITCH_STATUS_ID int not null,
    ORDER_ID int not null,
    EMPLOYEE_ID int not null,
    `DATETIME` datetime not null,
    primary key (ID),
    constraint UNQ_PITCH_PITCH_STATUS_ORDER unique (PITCH_ID, PITCH_STATUS_ID, ORDER_ID)
);
ALTER TABLE PITCH_STATUS_DETAIL
ADD CONSTRAINT FK_PITCH_STATUS_DETAIL_PITCH FOREIGN KEY (PITCH_ID) REFERENCES PITCH(ID);
ALTER TABLE PITCH_STATUS_DETAIL
ADD CONSTRAINT FK_PITCH_STATUS_DETAIL_PITCH_STATUS FOREIGN KEY (PITCH_STATUS_ID) REFERENCES PITCH_STATUS(ID);
ALTER TABLE PITCH_STATUS_DETAIL
ADD CONSTRAINT FK_PITCH_STATUS_DETAIL_ORDER FOREIGN KEY (ORDER_ID) REFERENCES `ORDER`(ID);
ALTER TABLE PITCH_STATUS_DETAIL
ADD CONSTRAINT FK_PITCH_STATUS_DETAIL_EMPLOYEE FOREIGN KEY (EMPLOYEE_ID) REFERENCES EMPLOYEE(ID);
