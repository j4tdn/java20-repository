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
-- Mặt hàng thuộc loại hàng là 'Thắt lưng'

-- truy vấn lồng 
-- thực thi lệnh con trc, đc kq chạy cha
-- oracle: limit in IN clause 1000 values
SELECT * 
  FROM item
 WHERE ITEM_GROUP_ID IN (SELECT ID 
						   FROM item_group 
						  WHERE `NAME` = 'Thắt lưng');

SELECT * 
  FROM item it
  JOIN item_group itg
    ON it.ITEM_GROUP_ID = itg.ID
 WHERe itg.NAME LIKE '%Thắt lưng%';

-- truy vấn lồng song song
-- duyệt từng ptu bên bảng cha
-- lấy ra các ptu bên bảng cha khi dòng hiện tại thỏa mãn đk bên bảng con
-- mệnh đề SELECT bên bảng con khôg qtr, SELECT tùy ý
SELECT * 
  FROM item
 WHERE EXISTS (SELECT 10
				 FROM item_group
			    WHERE `NAME` = 'Thắt lưng'
                  AND item_group.ID = item.ITEM_GROUP_ID);
-- Top 5 mặt hàng có giá bán cao nhất
SELECT *
  FROM item_detail
 ORDER BY SALES_PRICE DESC, AMOUNT DESC
 LIMIT 5;
-- nếu trường hợp mặt hàng có giá bán cao thứ 5 trùng với các mặt hàng khác
WITH CTE_TOP_5_SALES_PRICE AS
(
	SELECT SALES_PRICE
	  FROM item_detail
	 ORDER BY SALES_PRICE DESC
	 LIMIT 5
)
SELECT *
  FROM item_detail
 -- WHERE SALES_PRICE IN ( SELECT * 
						 -- FROM CTE_TOP_5_SALES_PRICE)
  WHERE EXISTS ( SELECT * 
				   FROM CTE_TOP_5_SALES_PRICE top5
				  WHERE item_detail.SALES_PRICE = top5.SALES_PRICE)
 ORDER BY SALES_PRICE;
 
-- 2. Đơn hàng
-- Được bán trong ngày 28/11/2019
SELECT *
  FROM `order`
 WHERE date(CREATED_AT) = '2023-02-15';
-- Được bán từ ngày 28/11/2019 đến ngày 02/12/2019
SELECT *
  FROM `order`
 WHERE date(CREATED_AT) BETWEEN '2023-07-07' AND '2023-09-07';
 
-- Được bán trong tháng 11/2019
SELECT *
  FROM `order`
 WHERE month(CREATED_AT) = 9 
   AND year(CREATED_AT) = 2023;

-- Được giao hàng tại Hòa Khánh
-- 3. Giá của toàn bộ các mặt hàng sau khi được khuyến mãi 20%, làm tròn 2 chữ số thập phân
SELECT *,
	   round(SALES_PRICE * 0.812, 2) PROMOTION_PRICE
  FROM item_detail;
  
-- 4. Giảm giá 20% tất cả các mặt hàng trong ngày 25/11/2019
SELECT * FROM `order` WHERE date(CREATED_AT) = '2023-02-15'; -- 4, 5
SELECT * FROM order_detail WHERE ORDER_ID IN (4, 5); -- item(5,11,24,39,41,46,56,69)
SELECT * FROM item_detail WHERE ID BETWEEN 13 AND 20;

SELECT *,
	   cast(SALES_PRICE * 0.8 as decimal(10, 2)) PROMOTION_PRICE
  FROM item_detail itd
 WHERE itd.ID IN (SELECT odd.ITEM_DETAIL_ID
					FROM order_detail odd
				   WHERE odd.ORDER_ID IN (SELECT od.ID
											FROM `order` od
										   WHERE date(od.CREATED_AT) = '2023-02-15'));

SELECT *,				   
		cast(SALES_PRICE * 0.8 as decimal(10, 2)) PROMOTION_PRICE
  FROM item_detail itd
  JOIN order_detail odd
    ON itd.ID = odd.ITEM_DETAIL_ID
  JOIN `order` od
    ON od.ID = odd.ORDER_ID
 WHERE date(od.CREATED_AT) = '2023-02-15';

-- 5. Liệt kê tất cả các màu sắc của sản phẩm có bán trong cửa hàng.
SELECT DISTINCT COLOR
  FROM item;
  
-- 7. Liệt kê tất cả các mặt hàng (MaMH, TenMH, ThoiGianDatHang) được bán trong ngày 23/11/2019
SELECT *
  FROM item
 WHERE item.ID IN (SELECT ITEM_ID
					 FROM item_detail itd
					WHERE ID IN(SELECT ITEM_DETAIL_ID
								  FROM order_detail oddt
								 WHERE ID IN (SELECT ID
												FROM `order`
											   WHERE date(CREATED_AT) = '2023-02-15')));
  
-- 8. Liệt kê các mặt hàng có giá bán từ 100 - 300
SELECT *
  FROM item_detail 
 WHERE SALES_PRICE BETWEEN 100 AND 300;

-- 9. Liệt kê tất cả các mặt hàng thuộc loại hàng là 'Mũ' và 'Thắt lưng'
SELECT it.*,
	   ig.`NAME` `GROUP`
  FROM item it, item_group ig
 WHERE it.ITEM_GROUP_ID = ig.ID
   AND ig.`NAME` LIKE '%Mũ%' or ig.`NAME` LIKE '%Thắt lưng%';


-- 10. Liệt kê các đơn hàng được đặt trong ngày (28/11/2019, 14/12/2019)
SELECT *
  FROM `order`
 WHERE date(CREATED_AT) IN ('2023-02-15', '2023-09-07');
 
-- ======================= REFRESH DATA - DEMO MULTI TABLES AND GROUPING =======================
-- 11. Sắp xếp các mặt hàng với giá bán tăng dần
SELECT it.*,
	   s.*,
       idt.SALES_PRICE
  FROM size s
  JOIN item_detail idt
    ON s.ID = idt.SIZE_ID
  JOIN item it
    ON idt.ITEM_ID = it.ID
 ORDER BY idt.SALES_PRICE;


-- 11 Tìm kích thước có giá bán lớn nhất trong mỗi mặt hàng
-- sắp xếp giá bán giảm dần
SELECT it.ID,
	   it.`NAME`,
       itd.SALES_PRICE
  FROM item_detail itd
  JOIN item it
    ON itd.ITEM_ID = it.ID
 GROUP BY itd.ID, it.`NAME`
 ORDER BY itd.SALES_PRICE DESC;

SELECT * from item_detail; 
 
-- 12. Sắp xếp các mặt hàng với giá mua giảm dần
SELECT it.*,
	   s.*,
       idt.SALES_PRICE
  FROM size s
  JOIN item_detail idt
    ON s.ID = idt.SIZE_ID
  JOIN item it
    ON idt.ITEM_ID = it.ID
 ORDER BY idt.SALES_PRICE DESC;

-- 13. Sắp xếp các mặt hàng với giá bán tăng dần, giá mua giảm dần
SELECT it.ID,
	   it.`NAME`,
       it.BUY_PRICE,
       itd.SALES_PRICE
  FROM item_detail itd
  JOIN item it
    ON itd.ITEM_ID = it.ID
 ORDER BY itd.SALES_PRICE ASC, it.BUY_PRICE DESC;

-- 14. Đếm số lượng các mặt hàng trong hệ thống
SELECT COUNT(*) NUMBER_OF_ITEMS
  FROM item;

-- 15. Số lượng 'Giày 3' được bán trong ngày 15/02/2023
SELECT 'giày' ITEM,
	   sum(odd.AMOUNT) TOTAL_AMOUNT_OF_SALES_ITEMS
  FROM `order` od
  JOIN order_detail odd
    ON od.ID = odd.ORDER_ID
  JOIN item_detail itd
    ON odd.ITEM_DETAIL_ID = itd.ID
  JOIN item it
    ON it.ID = itd.ITEM_ID
 WHERE date(od.CREATED_AT) = '2023-02-15'
   AND it.NAME LIKE '%giày%';

-- 16. Tổng số lượng các mặt hàng còn lại theo từng loại hàng
--     MaLoai  TenLoai SoLuong
-- 		1       Giày    20
-- 		2       Áo      28
SELECT ig.ID,
	   ig.`NAME`,
       group_concat(concat(it.ID, '-', it.NAME, '-', itd.SIZE_ID, '-', itd.AMOUNT) separator ',') DETAIL_INFO,
       sum(itd.AMOUNT) TOTAL_OF_ITEMS
  FROM item_group ig
  JOIN item it
    ON ig.ID = it.ITEM_GROUP_ID
  JOIN item_detail itd
    ON itd.ITEM_ID = it.ID
 GROUP BY ig.`ID`, ig.NAME;


-- 17. Tìm mặt hàng có giá bán cao nhất trong loại hàng 'Giày'
SELECT it.*,
	   itd.SALES_PRICE
  FROM item_group ig
  JOIN item it
    ON ig.ID = it.ITEM_GROUP_ID
  JOIN item_detail itd
    ON itd.ITEM_ID = it.ID
 WHERE ig.`NAME` LIKE '%Giày%'
 ORDER BY itd.SALES_PRICE DESC
 LIMIT 1;


-- 18. Tìm mặt hàng có giá bán cao nhất của mỗi loại hàng
SELECT *
  FROM item it
  JOIN item_detail itd
    ON it.ID = itd.ITEM_ID
 WHERE itd.SALES_PRICE IN (
							SELECT -- ig.ID,
							-- 	   ig.`NAME`,
								   max(itd.SALES_PRICE) MAX_ITEM_SALES_PRICE
							  FROM item_group ig
							  JOIN item it
								ON ig.ID = it.ITEM_GROUP_ID
							  JOIN item_detail itd
								ON itd.ITEM_ID = it.ID
							 GROUP BY ig.ID, ig.NAME);
 
-- 19. Hiển thị tổng số lượng mặt hàng của mỗi loại hàng trong hệ thống >> 16
SELECT ig.ID,
	   ig.`NAME`,
       count(*) AMOUNT
  FROM item_group ig
  JOIN item it
    ON ig.ID = it.ITEM_GROUP_ID
 GROUP BY ig.ID
HAVING count(*) > 2;

-- 20. Hiển thị tổng số lượng mặt hàng của mỗi loại hàng trong hệ thống
--     Điều kiện tổng số lượng > 20 mặt hàng >> HAVING
SELECT ig.ID,
	   ig.`NAME`,
       group_concat(concat(it.ID, '-', it.NAME, '-', itd.SIZE_ID, '-', itd.AMOUNT) SEPARATOR ', ') DETAIL_INFO,
       sum(itd.AMOUNT) TOTAL_OF_ITEMS
  FROM item_group ig
  JOIN item it
    ON ig.ID = it.ITEM_GROUP_ID
  JOIN item_detail itd
    ON itd.ITEM_ID = it.ID
 GROUP BY ig.`ID`, ig.NAME
HAVING TOTAL_OF_ITEMS > 1500;


-- ==============================================================
-- todo
UPDATE item_detail SET AMOUNT = 555 WHERE ID = 67;
UPDATE item_detail SET AMOUNT = 888 WHERE ID = 33;
UPDATE item_detail SET AMOUNT = 720 WHERE ID = 26;
UPDATE item_detail SET AMOUNT = 555 WHERE ID = 34;
-- 21. Hiển thị mặt hàng[kèm size] có số lượng nhiều nhất trong mỗi loại hàng
SELECT ig.ID,
	   max(itd.AMOUNT) AMOUNT
  FROM item it
  JOIN item_group ig
    ON it.ITEM_GROUP_ID = ig.ID
  JOIN item_detail itd
    ON itd.ITEM_ID = it.ID
 GROUP BY ig.ID;
--
WITH CTE_ITEM_GROUP_DETAIL AS
(
	SELECT itg.ID ITEM_GROUP_ID,
		   itg.NAME ITEM_GROUP_NAME,
           it.ID ITEM_ID,
           it.NAME ITEM_NAME,
           itd.ID ITEM_DETAIL_ID,
           itd.SIZE_ID SIZE,
           itd.AMOUNT AMOUNT
	  FROM item it
	  JOIN item_group itg
		ON it.ITEM_GROUP_ID = itg.ID
	  JOIN item_detail itd
		ON itd.ITEM_ID = it.ID
),
CTE_ITEM_GROUP_MAX_AMOUNT AS
(
	SELECT ITEM_GROUP_ID,
		   ITEM_GROUP_NAME,
		   max(AMOUNT) MAX_REMAINING_ITEM_AMOUNT
	  FROM CTE_ITEM_GROUP_DETAIL
	 GROUP BY ITEM_GROUP_ID, ITEM_GROUP_NAME
)
	SELECT *
      FROM CTE_ITEM_GROUP_DETAIL itg_d
      JOIN CTE_ITEM_GROUP_MAX_AMOUNT itg_max
        ON itg_d.AMOUNT = itg_max.MAX_REMAINING_ITEM_AMOUNT
	   AND itg_d.ITEM_GROUP_ID = itg_max.ITEM_GROUP_ID;
-- 22. Hiển thị giá bán trung bình của mỗi loại hàng

SELECT ig.ID,
	   cast(avg(itd.SALES_PRICE) AS DECIMAL(10, 2)) GBTB
  FROM item_group ig
  JOIN item it
	ON ig.ID = it.ITEM_GROUP_ID
  JOIN item_detail itd
    ON itd.ITEM_ID = it.ID
 GROUP BY ig.ID;
 
-- 23. In ra 3 loại hàng có số lượng hàng còn lại nhiều nhất ở thời điểm hiện tại
SELECT it.ITEM_GROUP_ID,
	   sum(itd.AMOUNT) AMOUNT
  FROM item_detail itd
  JOIN item it
    ON itd.ITEM_ID = it.ID
 GROUP BY it.ITEM_GROUP_ID
 ORDER BY AMOUNT DESC
 LIMIT 3;

-- 24. Liệt kê những mặt hàng có MaLoai = 2 và thuộc đơn hàng 100100
SELECT it.*,
	   odd.ORDER_ID
  FROM order_detail odd
  JOIN item_detail itd
    ON odd.ITEM_DETAIL_ID = itd.ID
  JOIN item it
    ON it.ID = itd.ITEM_ID
 WHERE it.ITEM_GROUP_ID = 2 
   AND odd.ORDER_ID = 1;
   
-- 25. Tìm những mặt hàng có Mã Loại = 2 và đã được bán trong ngày 28/11
WITH SALES_ITEM AS (
SELECT ITEM_ID
  FROM item_detail itd
  JOIN order_detail odd
    ON odd.ITEM_DETAIL_ID = itd.ID
  JOIN `order` od
    ON od.ID = odd.ORDER_ID
 WHERE date(od.CREATED_AT)  = '2023-02-15'
)  
SELECT *,
	   '2023-02-15' SALESS_ITEM
  FROM item it
 WHERE EXISTS (	SELECT 1
                  FROM SALES_ITEM
				 WHERE it.ID = ITEM_ID);

SELECT *
  FROM item it
  JOIN item_detail itd
	ON it.ID = itd.ITEM_ID
  JOIN order_detail odd
    ON odd.ITEM_DETAIL_ID = itd.ID
  JOIN `order` od
    ON od.ID = odd.ORDER_ID
  WHERE date(od.CREATED_AT)  = '2023-02-15';

-- 26. Liệt kê những mặt hàng là 'Mũ' không bán được trong ngày 07/09/2023
WITH SALES_ITEM AS (
SELECT ITEM_ID
  FROM item_detail itd
  JOIN order_detail odd
    ON odd.ITEM_DETAIL_ID = itd.ID
  JOIN `order` od
    ON od.ID = odd.ORDER_ID
 WHERE date(od.CREATED_AT)  = '2023-02-15'
)  
SELECT *,
	   '2023-02-15' SALESS_ITEM
  FROM item it
 WHERE NOT EXISTS (SELECT 1 FROM SALES_ITEM WHERE it.ID = ITEM_ID)
   AND EXISTS (SELECT 1 FROM item_group WHERE it.ITEM_GROUP_ID = ID AND `NAME` LIKE '%Mu%');              ;
-- 27. Cập nhật giá bán của tất cả các mặt hàng thuộc loại hàng 'Áo' thành 199
UPDATE item_detail 
   SET SALES_PRICE = 199 
 WHERE ID IN (
			SELECT it.ID
			  FROM item it
			  JOIN item_group itg
				ON itg.ID = it.ITEM_GROUP_ID
			 WHERE itg.NAME LIKE '%Áo%');
 
SELECT * FROM item_detail;

-- 28. Backup data. Tạo table LoaiHang_SaoLuu(MaLoai, TenLoai)
--     Sao chép dữ liệu từ bảng LoaiHang sang LoaiHang_SaoLuu
CREATE TABLE item_group_backup(
	ID INT,
    `NAME` VARCHAR(100) NOT NULL,
    PRIMARY KEY (ID)
);

INSERT INTO item_group_backup(ID, `NAME`)
SELECT ID, `NAME`
  FROM item_group;

SELECT * FROM item_group_backup;

-- 30. Liệt kê 2 sản phẩm (có số lượng tồn kho nhiều nhất) của loại hàng 'Áo' và 'Quần'
-- -- B1: Tìm số lượng hàng còn lại của mỗi mặt hàng thuộc loại hàng 'Áo', 'Quần'
-- -- B2: ORDER BY SoLuongTon DESC
-- -- B3: LIMIT 2
SELECT itg.ID ITEM_GROUP_ID,
		   itg.NAME ITEM_GROUP_NAME,
           it.ID ITEM_ID,
           it.NAME ITEM_NAME,
           itd.ID ITEM_DETAIL_ID,
           itd.SIZE_ID SIZE,
           itd.AMOUNT AMOUNT
  FROM item it
  JOIN item_group itg
	ON it.ITEM_GROUP_ID = itg.ID
  JOIN item_detail itd
	ON itd.ITEM_ID = it.ID
 WHERE itg.`NAME` LIKE '%Áo%' 
	OR itg.`NAME` LIKE '%Quần%'
 ORDER BY itd.AMOUNT DESC, itd.id DESC
 LIMIT 2;
	
-- cach 2
WITH CTE_ITEMS AS
(
	SELECT itg.ID ITEM_GROUP_ID,
		   itg.NAME ITEM_GROUP_NAME,
           it.ID ITEM_ID,
           it.NAME ITEM_NAME,
           itd.ID ITEM_DETAIL_ID,
           itd.SIZE_ID SIZE,
           itd.AMOUNT AMOUNT
	FROM item it
	JOIN item_group itg
	ON it.ITEM_GROUP_ID = itg.ID
	JOIN item_detail itd
	ON itd.ITEM_ID = it.ID
	WHERE itg.`NAME` LIKE '%Áo%' 
	OR itg.`NAME` LIKE '%Quần%'
),
CTE_TOP2_SHIRT AS 
(
	SELECT * FROM CTE_ITEMS WHERE ITEM_GROUP_NAME LIKE '%Áo%' ORDER BY AMOUNT DESC, ITEM_DETAIL_ID DESC LIMIT 2
),
CTE_TOP2_PANT AS
(
	SELECT * FROM CTE_ITEMS WHERE ITEM_GROUP_NAME LIKE '%Quần%' ORDER BY AMOUNT DESC, ITEM_DETAIL_ID DESC LIMIT 2
)
SELECT * FROM CTE_TOP2_SHIRT
UNION
SELECT * FROM CTE_TOP2_PANT;


-- 31. Tính tổng tiền cho đơn hàng 02
--     Với tổng tiền được tính bằng tổng các sản phẩm và số lượng của sản phẩm tương ứng
SELECT sum(odd.AMOUNT * itd.SALES_PRICE) TOTAL_OF_MONEY
  FROM order_detail odd
  JOIN item_detail itd
    ON odd.ITEM_DETAIL_ID = itd.ID
 WHERE odd.ORDER_ID = 2;
 
-- 32. Xuất thông tin hóa đơn của đơn hàng 02 với thông tin như sau.
-- 	SoDH 	ChiTietDonHang           TongTien
--    02   TenMH:GiaBan:SoLuong     100
SELECT odd.ORDER_ID,
	   group_concat(
       concat( it.NAME, '-',
			   itd.SIZE_ID, '-',
			   itd.SALES_PRICE, '-',
			   odd.AMOUNT, '-',
               (itd.SALES_PRICE *  odd.AMOUNT)) 
           )item_detail,
		sum( odd.AMOUNT * itd.SALES_PRICE) TOTAL_OF_MONEY
  FROM order_detail odd
  JOIN item_detail itd
    ON odd.ITEM_DETAIL_ID = itd.ID
  JOIN item it
    ON it.ID = itd.ITEM_ID
 WHERE odd.ORDER_ID = 2;

-- JDBC --
SELECT * FROM LoaiHang;

SELECT * FROM mathang WHERE TenMH LIKE 'A%' OR TenMH LIKE 'T%';
