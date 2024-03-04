Use java1920_shopping;

CREATE TABLE provider
(
	ID INT,
    `NAME` VARCHAR(100) NOT NULL,
    TAX_CODE VARCHAR(20),
    ADDRESS TEXT,
    PHONE VARCHAR(20),
    PRIMARY KEY (ID) 
);


ALTER TABLE item
	ADD COLUMN IMAGE_01 varchar(100);
ALTER TABLE item
	ADD COLUMN IMAGE_02 varchar(100);
ALTER TABLE item
	ADD COLUMN LAST_UPDATE_AT DATETIME;

ALTER TABLE item
	ADD COLUMN PROVIDER_ID INT,
	ADD CONSTRAINT FK_ITEM_PROVIDER FOREIGN KEY (PROVIDER_ID) REFERENCES provider(ID);
    
-- 1. Liệt kê các mặt hàng được bán trong ngày bất kỳ. Với ngày bán là tham số truyền vào.
SELECT it.ID,
	   it.`NAME`,
	   time(od.CREATED_AT) AS CREATE_TIME
	FROM item it
	JOIN item_detail itd
		ON it.ID =itd.ITEM_ID
	JOIN order_detail odt
		ON itd.ID = odt.ITEM_DETAIL_ID
	JOIN `order` od
		ON od.ID =odt.ORDER_ID
	 WHERE cast(od.CREATED_AT AS DATE) = str_to_date('07/09/2023', '%d/%m/%Y');
     
-- 2. Thống kê số lượng mặt hàng đang tồn kho của mỗi loại hàng
SELECT itg.ID,
	   itg.`NAME`,
       SUM(itd.AMOUNT) 'SL MAT HANG'
  FROM item_group itg
  JOIN item it 
    ON itg.ID = it.ITEM_GROUP_ID
  JOIN item_detail itd
    ON it.ID = itd.ITEM_ID
 GROUP BY itg.ID, itg.`NAME`;
 
    
SELECT it.*, itg.*
FROM item it
JOIN item_group itg ON it.ITEM_GROUP_ID = itg.ID
ORDER BY it.ITEM_GROUP_ID;
  

