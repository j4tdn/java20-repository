-- Patches to creating tables
-- ITEM_GROUP, ITEM, SIZE, ITEM_DETAIL

USE java20_shopping;

-- create table ITEM_GROUP
drop table if exists ITEM_GROUP;
create table ITEM_GROUP
(
	ID int,
    `NAME` varchar(100) not null,
    primary key (ID) -- không nên/cần đặt tên cho ràng buộc khóa chính
);

-- create table ITEM
DROP TABLE IF EXISTS ITEM;
CREATE TABLE ITEM
(
	ID INT,
    MATERIAL VARCHAR(100) NOT NULL,
    BUY_PRICE FLOAT NOT NULL,
    COLOR VARCHAR(50) NOT NULL,
    ITEM_GROUP_ID INT NOT NULL, -- khóa ngoại không bắt buộc phải khác null
    PRIMARY KEY (ID),
    CONSTRAINT FK_ITEM_ITEM_GROUP FOREIGN KEY (ITEM_GROUP_ID) REFERENCES ITEM_GROUP(ID)
);
-- ALTER TABLE ITEM ADD PRIMARY KEY (ID);