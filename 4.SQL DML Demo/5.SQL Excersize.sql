-- 1.Liệt kê các mặt hàng được bán trong ngày 23-11-2019. Với ngày bán là 
-- tham số truyền vào kiểu dữ liệu LocalDate

DROP PROCEDURE P_GET_ITEM_BY_TIME;
DELIMITER &&
CREATE PROCEDURE P_GET_ITEM_BY_TIME(d DATE)
BEGIN
	WITH CTE_ITEM AS
	(
	SELECT itd.ITEM_ID ID,
		   itd.SIZE_ID SIZE,
           od.CREATED_AT TIME_ORDER
      FROM `order` od
      JOIN order_detail odd
        ON od.ID = odd.ORDER_ID
	  JOIN item_detail itd
        ON itd.ID = odd.ITEM_DETAIL_ID
	 WHERE date(od.CREATED_AT) = '2023-02-15'
	)
	SELECT it.*,
		   ci.SIZE,
		   time(ci.TIME_ORDER) TIME_ORDER
	  FROM CTE_ITEM ci
	  JOIN item it
		ON ci.ID = it.ID;
END &&

CALL P_GET_ITEM_BY_TIME('2023-07-07');

-- 2. Thống kê số lượng mặt hàng tồn kho của mỗi loại hàng
SELECT itg.ID,
	   itg.NAME,
       sum(itd.AMOUNT) AMOUNT
  FROM item it
  JOIN item_group itg
    ON it.ITEM_GROUP_ID = itg.ID
  JOIN item_detail itd
    ON itd.ITEM_ID = it.ID
 GROUP BY itg.ID, itg.NAME;

-- 3.Liệt kê top 3 mặt hàng được bán nhiều nhất năm 2020. Với năm là tham số truyền vào.
DROP PROCEDURE P_TOP_3_BEST_SELLING_ITEMS;
DELIMITER &&
CREATE PROCEDURE P_TOP_3_BEST_SELLING_ITEMS(y YEAR)
BEGIN
	WITH CTE_GET_ITEM_ID_BY_YEAR AS
    (
		SELECT itd.ITEM_ID ID,
               year(od.CREATED_AT) SELLING_YEAR
      FROM `order` od
      JOIN order_detail odd
        ON od.ID = odd.ORDER_ID
	  JOIN item_detail itd
        ON itd.ID = odd.ITEM_DETAIL_ID
	 WHERE year(od.CREATED_AT) = y
    )
    SELECT it.ID,
		   it.NAME,
           count(it.ID) AMOUNT
      FROM item it
      JOIN CTE_GET_ITEM_ID_BY_YEAR iy
        ON it.ID = iy.ID
	 GROUP BY it.ID
     ORDER BY AMOUNT DESC
     LIMIT 3;
      
END &&

CALL P_TOP_3_BEST_SELLING_ITEMS(2023);


-- 4.Liệt kê danh sách các mặt hàng của mỗi loại hàng
SELECT itg.*,
	   it.*
  FROM item it
  JOIN item_group itg
	ON it.ITEM_GROUP_ID = itg.ID
 ORDER BY itg.ID ;
