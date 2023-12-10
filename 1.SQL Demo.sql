-- A. INSERT
-- Sử dụng bảng dữ liệu mẫu. Thực hiện thêm dữ liệu vào cơ sở dữ liệu cho table
-- + Mathang
-- + LoaiHang
-- + Sử dụng shopping refresh data.sql để refresh data

-- ======================= REFRESH DATA =======================
-- -- DISABLE FOREIGN KEY
-- B. DELETE
-- 1. Xóa nhân viên có tên 'abcxyz' trong hệ thống
-- 2. Xóa bộ phận giao hàng trong hệ thống
-- 3. Xóa tất cả các mặt hàng thuộc loại hàng là mũ
-- 4. Xóa tất cả các mặt hàng trong hệ thống
-- 5. Vì hệ thống bị lỗi. Hủy tất cả các đơn hàng ngày 23/11/2019
--    Thực hiện xóa các đơn hàng bị lỗi

-- ======================= REFRESH DATA =======================
-- C. UPDATE
-- 1. Cập nhật tên mới cho phòng ban có MaPB = 2 thành 'Bộ phận quản lý'
-- 2. Cập nhật ghi chú của đơn hàng 01 thành 'Giao hàng sau 10H sáng'
-- 3. Đơn hàng 01 đã được giao hàng thành công. Thực hiện cập nhật
--    MaTT = 03, TrangThai = 'Đã giao', ThoiGian = Thời gian hiện tại
-- 4. Cập nhật số tiền cần thanh toán trong bảng hóa đơn thành 890 cho đơn hàng 01
-- 5. Cập nhật tất cả các mặt hàng thuộc loại hàng là 'Mũ' với giá bán là 199K

-- ======================= REFRESH DATA - DEMO SELECT 1 TABLE =======================
-- D. SELECT - SLIDE 25-44
-- 1. Toàn bộ thông tin các loại hàng
SELECT * FROM item_group;
--     -- Mặt hàng thuộc loại hàng là 'Thắt lưng'
-- Truy vấn lồng - tương quan
SELECT * FROM item;
SELECT *
	FROM item
    WHERE ITEM_GROUP_ID IN (SELECT ID 
								FROM item_group 
                                WHERE `NAME` = 'Thắt lưng');
-- Truy vấn lồng song song
SELECT *
	FROM item
    WHERE EXISTS (SELECT *
					FROM item_group
					WHERE `NAME` = 'Thắt lưng'
                    AND item_group.ID = item.ITEM_GROUP_ID);
--     -- Top 5 mặt hàng có giá bán cao nhất
SELECT *
	FROM item_detail
    ORDER BY SALES_PRICE DESC, AMOUNT DESC
    LIMIT 5;
    
-- Nếu trường mặt hàng giá bán cao thứ 5 có giá trùng với các mặt hàng khác, lấy hết
WITH CTE_TOP_5_SALES_PRICE AS
(
	SELECT SALES_PRICE
    FROM item_detail
    ORDER BY SALES_PRICE DESC, AMOUNT DESC
    LIMIT 5
)
SELECT *
	FROM item_detail
    WHERE SALES_PRICE IN (SELECT SALES_PRICE
							FROM CTE_TOP_5_SALES_PRICE)
	ORDER BY SALES_PRICE;
-- 2. Đơn hàng
--     -- Được bán trong ngày 28/11/2019
SELECT *
	FROM `order`
    WHERE CAST(CREATED_AT AS DATE) = '2023-02-15'; -- str_to_date('15/02/2023', '%d/%m/%Y')
--     -- Được bán từ ngày 28/11/2019 đến ngày 02/12/2019
SELECT *
	FROM `order`
    WHERE CAST(CREATED_AT AS DATE) BETWEEN '2023-08-01' AND '2023-09-30'; -- str_to_date('15/02/2023', '%d/%m/%Y')
--     -- Được bán trong tháng 2/2023
SELECT * 
	FROM `order`
    WHERE MONTH(CREATED_AT) = 9
	AND YEAR(CREATED_AT) = 2023;
--     -- Được giao hàng tại Hòa Khánh
-- Doesn't work
SELECT *
	FROM `order`
    WHERE DELIVERY_ADDRESS = 'Hòa Khánh';
-- 3. Giá của toàn bộ các mặt hàng sau khi được khuyến mãi 20%, làm tròn 2 chữ số thập phân
SELECT *,
	(SALES_PRICE * 0.8) PROMOTION_PRICE
    FROM item_detail;
-- 4. Giảm giá 20% tất cả các mặt hàng trong ngày 15/02/2023
SELECT *
	FROM item_detail itd
    WHERE itd.ID IN (SELECT odd.ITEM_DETAIL_ID
						FROM order_detail odd
                        WHERE odd.ORDER_ID IN (SELECT od.ID
												FROM `order` od
                                                WHERE CAST(CREATED_AT as DATE) = '2023-02-15'));
-- 5. Liệt kê tất cả các màu sắc của sản phẩm có bán trong cửa hàng.
SELECT DISTINCT item.COLOR 
	FROM item;
-- 7. Liệt kê tất cả các mặt hàng (MaMH, TenMH, ThoiGianDatHang) được bán trong ngày 23/11/2019
-- TESTING
SELECT item.ID, item.`NAME`, `order`.CREATED_AT 
	FROM item 
    JOIN order_detail ON item.ID = order_detail.ITEM_DETAIL_ID
    JOIN `order` ON order_detail.ORDER_ID = `order`.ID
    WHERE CAST(`order`.CREATED_AT as DATE) = '2023-02-15'; 
-- 8. Liệt kê các mặt hàng có giá bán từ 100 - 300
SELECT *
	FROM item_detail
    WHERE item_detail.SALES_PRICE BETWEEN 100 AND 300;
-- 9. Liệt kê tất cả các mặt hàng thuộc loại hàng là 'Mũ' và 'Thắt lưng'
-- TESTING
SELECT *
	FROM item
    WHERE item.ITEM_GROUP_ID IN (SELECT ID 
									FROM item_group
                                    WHERE `NAME` IN ('Mũ', 'Thắt lưng'));
    
-- 10. Liệt kê các đơn hàng được đặt trong ngày (28/11/2023, 14/12/2023)
SELECT *
	FROM `order`
    WHERE CAST(CREATED_AT as DATE) = '2023-09-07'
		OR CAST(CREATED_AT as DATE) = '2023-02-15';
-- ======================= REFRESH DATA - DEMO MULTI TABLES AND GROUPING =======================
-- 11. Sắp xếp các mặt hàng với giá bán tăng dần
-- TESTING
SELECT *
	FROM `item_detail`
    ORDER BY SALES_PRICE ASC;
    
-- FIX
SELECT  itd.ID ITEM_DETAIL_ID,
		it.ID ITEM_ID, 
		it.`NAME` ITEM_NAME,
        itd.SIZE_ID,
        itd.SALES_PRICE
	FROM item_detail itd
    JOIN item it
	  ON itd.ITEM_ID = it.ID
	ORDER BY SALES_PRICE DESC;

-- 11.1 Tìm kích thước có giá bán lớn nhất trong mỗi mặt hàng.
--      Sắp xếp giá bán giảm dần
SELECT  ITEM_ID,
		it.NAME,
		MAX(SALES_PRICE) MAX_SALES_PRICE
	FROM item_detail itd
    JOIN item it
	  ON it.ID = itd.ITEM_ID
    GROUP BY it.ID, it.`NAME`	
    ORDER BY MAX_SALES_PRICE DESC;
    
-- 12. Sắp xếp các mặt hàng với giá mua giảm dần
-- TESTING
SELECT *
	FROM `item`
    ORDER BY BUY_PRICE DESC;
-- 13. Sắp xếp các mặt hàng với giá bán tăng dần, giá mua giảm dần
-- TESTING
SELECT *
	FROM `item`, `item_detail`
    ORDER BY SALES_PRICE ASC, BUY_PRICE DESC;
    
-- FIX
SELECT  ITEM_ID,
		it.NAME,
		itd.SALES_PRICE,
        it.BUY_PRICE
	FROM item_detail itd
    JOIN item it
	  ON it.ID = itd.ITEM_ID
    ORDER BY itd.SALES_PRICE ASC, it.BUY_PRICE DESC;
-- 14. Đếm số lượng các mặt hàng trong hệ thống
SELECT ITEM_ID, SUM(AMOUNT)
	FROM `item_detail`
    GROUP BY `item_detail`.ITEM_ID;
    
-- FIX
SELECT COUNT(*) AMOUNT_OF_ITEMS
	FROM item;
-- 15. Số lượng 'Giày da Nam' được bán trong ngày 15/02/2023
SELECT 'Giày' ITEM, 
		SUM(odd.AMOUNT) TOTAL_AMOUNT_OF_SALES_ITEMS
	FROM `order` od
    JOIN `order_detail` odd
      ON od.ID = odd.ORDER_ID
	JOIN `item_detail` itd
      ON itd.ID = odd.ITEM_DETAIL_ID
	JOIN `item` it
      ON itd.ITEM_ID = it.ID
	WHERE cast(od.CREATED_AT as DATE) = '2023-02-15'
		AND it.NAME LIKE '%giày%';
-- 16. Tổng số lượng các mặt hàng còn lại theo từng loại hàng
--     MaLoai  TenLoai SoLuong
-- 	1       Giày    20
-- 	2       Áo      28
SELECT itg.ID,
	   itg.NAME,
       group_concat(concat(it.ID, '-' , it.NAME,'-' , itd.SIZE_ID, '-', itd.AMOUNT) SEPARATOR ', ') DETAIL_INFO,
       SUM(itd.AMOUNT) TOTAL_OF_ITEMS
	FROM item_group itg
    JOIN item it
      ON itg.ID = it.ITEM_GROUP_ID
	JOIN item_detail itd
	  ON itd.ITEM_ID = it.ID
	GROUP BY itg.ID, itg.NAME;
-- 17. Tìm mặt hàng có giá bán cao nhất trong loại hàng 'Giày'
SELECT    *
	 FROM item it
     JOIN item_detail itd
	   ON it.ID = itd.ITEM_ID
	 JOIN item_group itg
	   ON it.ITEM_GROUP_ID = itg.ID
	WHERE itg.`NAME` LIKE '%Giày%'
    ORDER BY itd.SALES_PRICE DESC
    LIMIT 1;
    
-- 18. Tìm mặt hàng có giá bán cao nhất của mỗi loại hàng
SELECT  itg.ID   ITEM_GROUP_ID,
		itg.NAME ITEM_GROUP_NAME,
        MAX(itd.SALES_PRICE) MAX_ITEM_SALES_PRICE
   FROM item it
   JOIN item_detail itd
     ON it.ID = itd.ITEM_ID
   JOIN item_group itg
     ON itg.ID = it.ITEM_GROUP_ID
   GROUP BY itg.ID, itg.NAME;
-- 20. Hiển thị tổng số lượng mặt hàng của mỗi loại hàng trong hệ thống
--     Điều kiện tổng số lượng > 20 mặt hàng >> HAVING
-- ==============================================================
-- 21. Hiển thị mặt hàng có số lượng nhiều nhất trong mỗi loại hàng
CREATE VIEW ITEM_SUM_AMOUNT AS 
SELECT  DISTINCT it.`NAME` ITEM_NAME,
		itg.`NAME`         ITEM_GROUP_NAME,
		SUM(itd.AMOUNT)    ITEM_AMOUNT
   FROM item it
   JOIN item_detail itd ON it.ID = itd.ITEM_ID
   JOIN item_group itg ON itg.ID = it.ITEM_GROUP_ID
   GROUP BY it.ID;
   
SELECT * FROM ITEM_SUM_AMOUNT;

SELECT t1.ITEM_NAME, t1.ITEM_GROUP_NAME, t1.ITEM_AMOUNT
FROM ITEM_SUM_AMOUNT AS t1
JOIN (
    SELECT ITEM_GROUP_NAME, MAX(ITEM_AMOUNT) AS MaxAmount
    FROM ITEM_SUM_AMOUNT
    GROUP BY ITEM_GROUP_NAME
) AS t2
ON t1.ITEM_GROUP_NAME = t2.ITEM_GROUP_NAME AND t1.ITEM_AMOUNT = t2.MaxAmount;
-- 22. Hiển thị giá bán trung bình của mỗi loại hàng
WITH ITEM_SALES_PRICE AS(
SELECT  item.`ID`,
		item_detail.`SIZE_ID`,
        item_group.`NAME` AS GROUP_NAME,
        item_detail.`SALES_PRICE`
  FROM item  
  JOIN item_detail ON item.ID = item_detail.ITEM_ID
  JOIN item_group ON item.ITEM_GROUP_ID = item_group.ID
)    SELECT t1.GROUP_NAME AS 'GROUP_NAME',
	  	    ROUND(AVG(SALES_PRICE)) AS AVERAGE_SALES_PRICE
     FROM ITEM_SALES_PRICE t1
	 GROUP BY GROUP_NAME;
-- 23. In ra 3 loại hàng có số lượng hàng còn lại nhiều nhất ở thời điểm hiện tại
-- Dùng VIEW ITEM_SUM_AMOUNT từ câu 21.
CREATE VIEW IN_STOCK AS (
   SELECT ITEM_GROUP_NAME,
		  SUM(ITEM_AMOUNT) AS 'STOCK_NUMBER'
   FROM ITEM_SUM_AMOUNT
   GROUP BY ITEM_GROUP_NAME
);

WITH ITEM_SOLD AS (
   SELECT 
		ITEM_GROUP_ID,
		item_group.NAME AS 'GROUP_NAME',
        SUM(order_detail.AMOUNT) AS 'AMOUNT_SOLD'
   FROM order_detail
   JOIN item_detail ON order_detail.ITEM_DETAIL_ID = item_detail.ID
   JOIN item ON item_detail.ITEM_ID = item.ID
   JOIN item_group ON item.ITEM_GROUP_ID = item_group.ID
   GROUP BY ITEM_GROUP_ID, GROUP_NAME
) SELECT ITEM_GROUP_ID, GROUP_NAME, AMOUNT_SOLD, STOCK_NUMBER,
		 (STOCK_NUMBER - AMOUNT_SOLD) AS STOCK_NUMBER_CURRENT
	FROM ITEM_SOLD
    JOIN IN_STOCK ON IN_STOCK.ITEM_GROUP_NAME LIKE ITEM_SOLD.GROUP_NAME
    ORDER BY STOCK_NUMBER_CURRENT DESC
    LIMIT 3;
-- 24. Liệt kê những mặt hàng có MaLoai = 2 và thuộc đơn hàng có ID = 8 *(Sửa đề)
use `java1920_shopping`;
set @a := 0;

SELECT ORDER_ID, ITEM_ID, NAME, MATERIAL, BUY_PRICE, COLOR, ITEM_GROUP_ID
	FROM order_detail
    JOIN item_detail ON order_detail.ITEM_DETAIL_ID = item_detail.ID
    JOIN item ON ITEM_DETAIL.ITEM_ID = item.ID
    WHERE ITEM_GROUP_ID = 2 AND ORDER_ID = 8;

-- 25. Tìm những mặt hàng có Mã Loại = 2 và đã được bán trong ngày 28/11

-- 26. Liệt kê những mặt hàng là 'Mũ' không bán được trong ngày 14/02/2019

-- 27. Cập nhật giá bán của tất cả các mặt hàng thuộc loại hàng 'Áo' thành 199
WITH TEMP_TABLE AS(
SELECT *
	FROM item_detail
    JOIN item ON item_detail.ITEM_ID = item.ID
    JOIN item_group ON ITEM_GROUP_ID = item_group.ID
) UPDATE TEMP_TABLE
	SET SALES_PRICE = 199
    WHERE item_group.NAME = 'Áo';
-- 28. Backup data. Tạo table LoaiHang_SaoLuu(MaLoai, TenLoai)
--     Sao chép dữ liệu từ bảng LoaiHang sang LoaiHang_SaoLuu
CREATE TABLE item_group_copy (
  `ID` int NOT NULL,
  `NAME` varchar(100) NOT NULL,
  PRIMARY KEY (`ID`)
);

INSERT INTO `item_group_copy` 
SELECT *
FROM item_group;

SELECT * FROM item_group_copy;
-- 30. Liệt kê 2 sản phẩm (có số lượng tồn kho nhiều nhất) của loại hàng 'Áo' và 'Quần'
-- -- B1: Tìm số lượng hàng còn lại của mỗi mặt hàng thuộc loại hàng 'Áo', 'Quần'
-- -- B2: ORDER BY SoLuongTon DESC
-- -- B3: LIMIT 2

-- 31. Tính tổng tiền cho đơn hàng 02
--     Với tổng tiền được tính bằng tổng các sản phẩm và số lượng của sản phẩm tương ứng
WITH TEMP_TABLE AS(
	SELECT ITEM_DETAIL_ID, AMOUNT
		FROM order_detail
		WHERE order_detail.ORDER_ID = 2
) SELECT SUM(TEMP_TABLE.AMOUNT * SALES_PRICE) AS TOTAL_SUM
	FROM TEMP_TABLE
	JOIN item_detail ON TEMP_TABLE.ITEM_DETAIL_ID = item_detail.ID;
-- 32. Xuất thông tin hóa đơn của đơn hàng 02 với thông tin như sau.
-- 	SoDH ChiTietDonHang           TongTien
--     02   TenMH:GiaBan:SoLuong     100
SELECT ORDER_ID AS 'So DH',
	   concat_ws(' : ', it.`NAME`, itd.SALES_PRICE, order_detail.AMOUNT) AS 'Chi Tiet Don Hang',
       order_detail.AMOUNT * SALES_PRICE AS 'Tong Tien'
	FROM order_detail 
    JOIN item_detail itd ON itd.ID = order_detail.ITEM_DETAIL_ID
    JOIN item it ON itd.ITEM_ID = it.ID
    WHERE ORDER_ID = 2;

