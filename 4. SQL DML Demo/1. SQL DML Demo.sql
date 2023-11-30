-- A. INSERT
-- Sử dụng bảng dữ liệu mẫu. Thực hiện thêm dữ liệu vào cơ sở dữ liệu cho table
-- + Mathang
-- + LoaiHang
-- + Sử dụng shopping refresh data.sql để refresh data

-- ======================= REFRESH DATA =======================
-- DISABLE FOREIGN KEY
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
-- Truy vấn lồng: thực thi câu lệnh truy vấn con trước, được kết quả thực thi câu lệnh cha
SELECT *
  FROM item
 WHERE ITEM_GROUP_ID IN (SELECT ID FROM item_group WHERE `NAME` = 'Thắt lưng');
 -- Truy vấn lồng song song:
 -- duyệt từng phần tử bên bảng cha: lấy ra các phần tử ở bảng cha khi dòng hiện tại thỏa mãn đk trong bảng con
 -- Mệnh đề SELECT trong bảng con k quan trọng, SELECT bất kỳ column nào
SELECT *
  FROM item
 WHERE EXISTS (SELECT * FROM item_group WHERE `NAME` = 'Quần' AND item.ITEM_GROUP_ID = item_group.ID);
 
-- Top 5 mặt hàng có giá bán cao nhất
SELECT * 
  FROM item_detail 
 ORDER BY SALES_PRICE DESC, AMOUNT DESC
 LIMIT 5;
-- Nếu TH mặt hàng giá bán cao thứ 5 có giá trùng với các mặt hàng khác, thì lấy hết
WITH CTE_TOP_5_SALES_PRICE AS
(
	SELECT * 
	  FROM item_detail 
	 ORDER BY SALES_PRICE DESC, AMOUNT DESC
	 LIMIT 5
)
SELECT *
  FROM item_detail
 WHERE EXISTS (SELECT *
				 FROM CTE_TOP_5_SALES_PRICE top5
				WHERE item_detail.SALES_PRICE = top5.SALES_PRICE)
 ORDER BY SALES_PRICE DESC;
 
-- 2. Đơn hàng
    -- Được bán trong ngày 15/02/2023
-- default pattern yyyy-mm-dd
-- 15-02-2023 -> varchar
-- 2023-02-15 -> date
-- cast(CREATED_AT AS DATE) = str_to_date('15/02/2023', '%d/%m/%Y')
SELECT *
  FROM `order`
 WHERE cast(CREATED_AT AS DATE) = '2023-02-15';
  
    -- Được bán từ ngày 01/08/2023 đến ngày 30/09/2023
SELECT *
  FROM `order`
 WHERE cast(CREATED_AT AS DATE) BETWEEN '2023-08-01' AND '2023-09-30';

    -- Được bán trong tháng 7/2023
SELECT *
  FROM `order`
 WHERE month(CREATED_AT) = 7
   AND year(CREATED_AT) = 2023;
 
    -- Được giao hàng tại Hòa Khánh
-- 3. Giá của toàn bộ các mặt hàng sau khi được khuyến mãi 21%, làm tròn 2 chữ số thập phân
SELECT *,
		round(SALES_PRICE * 0.79 , 2) PROMOTION_PRICE
  FROM item_detail;

-- 4. Giảm giá 20% tất cả các mặt hàng trong ngày 15/02/2023
SELECT ID FROM `order` WHERE cast(CREATED_AT AS DATE) = '2023-02-15';	-- [4, 5]
SELECT order_detail.ITEM_DETAIL_ID FROM order_detail WHERE ORDER_ID IN (4, 5);	-- [11,41,46,69,5,24,39,56]
SELECT * FROM item_detail WHERE ID IN (11,41,46,69,5,24,39,56);

SELECT *, 
		round(SALES_PRICE * 0.8, 2) ROUNDED_PROMOTION_PRICE 
  FROM item_detail 
 WHERE item_detail.ID IN (SELECT order_detail.ITEM_DETAIL_ID 
							FROM order_detail 
						   WHERE order_detail.ORDER_ID IN (SELECT od.ID 
															 FROM `order` od
															WHERE cast(od.CREATED_AT AS DATE) = '2023-02-15')
						);
                        
-- 5. Liệt kê tất cả các màu sắc của sản phẩm có bán trong cửa hàng.
SELECT COLOR FROM item GROUP BY COLOR;

-- 7. Liệt kê tất cả các mặt hàng (MaMH, TenMH, ThoiGianDatHang) được bán trong ngày 23/11/2019


-- 8. Liệt kê các mặt hàng có giá bán từ 100 - 300
SELECT * 
  FROM item 
 WHERE EXISTS (SELECT * 
				 FROM item_detail itd 
				WHERE itd.SALES_PRICE 
			  BETWEEN 100 AND 300 
				  AND itd.ITEM_ID = item.ID);

-- 9. Liệt kê tất cả các mặt hàng thuộc loại hàng là 'Mũ' và 'Thắt lưng'
SELECT *
  FROM item
 WHERE ITEM_GROUP_ID IN (SELECT ID 
						   FROM item_group 
						  WHERE `NAME` = 'Thắt lưng'
                             OR `NAME` = 'Mũ');

-- 10. Liệt kê các đơn hàng được đặt trong ngày (6/9/2023, 7/9/2023)
SELECT *
  FROM `order`
 WHERE cast(CREATED_AT AS DATE) = '2023-09-06'
    OR cast(CREATED_AT AS DATE) = '2023-09-07';

-- ======================= REFRESH DATA - DEMO MULTI TABLES AND GROUPING =======================
-- 11. Sắp xếp các mặt hàng với giá bán tăng dần
SELECT it.ID ITEM_ID,
	   it.`NAME`,
       itd.ID ITEM_DETAIL_ID,
       itd.SIZE_ID SIZE,
       itd.SALES_PRICE
  FROM item it
  JOIN item_detail itd
	ON it.ID = itd.ITEM_ID
 ORDER BY itd.SALES_PRICE;

-- 11b. Tương tự như 11 nhưng Sắp xếp giảm dần và mỗi mặt hàng chỉ lấy kích thước có giá bán lớn nhất
SELECT it.ID ITEM_ID,
	   it.NAME,
       max(SALES_PRICE) MAX_SALES_PRICE
  FROM item it
  JOIN item_detail itd
	ON it.ID = itd.ITEM_ID
 GROUP BY it.ID, it.NAME
 ORDER BY MAX_SALES_PRICE DESC;

-- 12. Sắp xếp các mặt hàng với giá mua giảm dần
SELECT *
  FROM item
 ORDER BY BUY_PRICE DESC;

-- 13. Sắp xếp các mặt hàng với giá bán tăng dần, giá mua giảm dần
SELECT it.ID ITEM_ID,
	   it.`NAME`,
       itd.SALES_PRICE,
       it.BUY_PRICE
  FROM item it
  JOIN item_detail itd
	ON it.ID = itd.ITEM_ID
 ORDER BY itd.SALES_PRICE ASC, it.BUY_PRICE DESC;

-- 14. Đếm số lượng các mặt hàng trong hệ thống
SELECT COUNT(*) AMOUNT_OF_ITEMS 
  FROM item;

-- 15. Số lượng Giày được bán trong ngày 15/02/2023
SELECT 'giày' ITEM,
	   SUM(odd.AMOUNT) TOTAL_AMOUNT_OF_SALES_ITEM
  FROM `order` od
  JOIN order_detail odd
    ON od.ID = odd.ORDER_ID
  JOIN item_detail itd
    ON itd.ID = odd.ITEM_DETAIL_ID
  JOIN item it
    ON it.ID = itd.ITEM_ID
 WHERE CAST(od.CREATED_AT AS DATE) = '2023-02-15'
   AND it.NAME LIKE '%giày%';

-- 16. Đếm số lượng các mặt hàng theo từng loại hàng
--     MaLoai  TenLoai SoLuong
-- 	1       Giày    20
-- 	2       Áo      28
SELECT itg.ID, 
	   itg.NAME,
       SUM(itd.AMOUNT) TOTAL_OF_ITEMS
  FROM item_group itg
  JOIN item it
    ON itg.ID = it.ITEM_GROUP_ID
  JOIN item_detail itd
    ON itd.ITEM_ID = it.ID
 GROUP BY itg.ID, itg.NAME;

-- 17. Tìm mặt hàng có giá bán cao nhất trong loại hàng 'Giày'
SELECT itg.NAME ITEM_GROUP_NAME,
	   it.ID ITEM_ID,
	   it.NAME,
       itd.SIZE_ID,
       itd.SALES_PRICE SALES_PRICE_MAX
  FROM item_group itg
  JOIN item it
    ON itg.ID = it.ITEM_GROUP_ID
  JOIN item_detail itd
    ON itd.ITEM_ID = it.ID
 WHERE itg.NAME LIKE '%Giày%'
 ORDER BY itd.SALES_PRICE DESC
 LIMIT 1;

-- 18. Tìm mặt hàng có giá bán cao nhất của mỗi loại hàng
SELECT itg.ID ITEM_GROUP_ID,
	   itg.NAME ITEM_GROUP_NAME,
       max(itd.SALES_PRICE) MAX_SALES_PRICE
  FROM item it
  JOIN item_detail itd
    ON it.ID = itd.ITEM_ID
  JOIN item_group itg
    ON itg.ID = it.ITEM_GROUP_ID
 GROUP BY itg.ID, itg.NAME;

-- 19. Hiển thị tổng số lượng mặt hàng của mỗi loại hàng trong hệ thống >> 16
-- 20. Hiển thị tổng số lượng mặt hàng của mỗi loại hàng trong hệ thống
--     Điều kiện tổng số lượng > 1500 mặt hàng >> HAVING
SELECT itg.ID, 
	   itg.NAME,
       SUM(itd.AMOUNT) TOTAL_OF_ITEMS
  FROM item_group itg
  JOIN item it
    ON itg.ID = it.ITEM_GROUP_ID
  JOIN item_detail itd
    ON itd.ITEM_ID = it.ID
 GROUP BY itg.ID, itg.NAME
HAVING TOTAL_OF_ITEMS > 1500;

-- ==============================================================
UPDATE item_detail SET AMOUNT = 530 WHERE ID = 67;
UPDATE item_detail SET AMOUNT = 830 WHERE ID = 33;
UPDATE item_detail SET AMOUNT = 430 WHERE ID = 26;
-- 21. Hiển thị mặt hàng có số lượng nhiều nhất trong mỗi loại hàng
SELECT *
  FROM item_group itg
  JOIN item it
    ON itg.ID = it.ITEM_GROUP_ID
  JOIN item_detail itd
    ON itd.ITEM_ID = it.ID;
 
SELECT itg.ID        ITEM_GROUP_ID,
	   itg.NAME      ITEM_GROUP_NAME,
	   it.ID         ITEM_ID,
	   it.NAME       ITEM_NAME,
	   itd.ID        ITEM_DETAIL_ID,
	   itd.SIZE_ID   SIZE,
	   itd.AMOUNT    AMOUNT
  FROM item_group itg
  JOIN item it
    ON itg.ID = it.ITEM_GROUP_ID
  JOIN item_detail itd
	ON it.ID = itd.ITEM_ID;


WITH CTE_ITEM_GROUP_DETAIL AS
(
	SELECT itg.ID        ITEM_GROUP_ID,
           itg.NAME      ITEM_GROUP_NAME,
           it.ID         ITEM_ID,
           it.NAME       ITEM_NAME,
           itd.ID        ITEM_DETAIL_ID,
           itd.SIZE_ID   SIZE,
           itd.AMOUNT    AMOUNT
	  FROM item_group itg
	  JOIN item it
		ON itg.ID = it.ITEM_GROUP_ID
	  JOIN item_detail itd
		ON it.ID = itd.ITEM_ID
)
SELECT ITEM_GROUP_ID,
	   ITEM_GROUP_NAME,
	   MAX(AMOUNT) MAX_REMAINNING_ITEM_AMOUNT
  FROM CTE_ITEM_GROUP_DETAIL
  GROUP BY ITEM_GROUP_ID, ITEM_GROUP_NAME;



WITH CTE_ITEM_GROUP_DETAIL AS
(
	SELECT itg.ID        ITEM_GROUP_ID,
           itg.NAME      ITEM_GROUP_NAME,
           it.ID         ITEM_ID,
           it.NAME       ITEM_NAME,
           itd.ID        ITEM_DETAIL_ID,
           itd.SIZE_ID   SIZE,
           itd.AMOUNT    AMOUNT
	  FROM item_group itg
	  JOIN item it
		ON itg.ID = it.ITEM_GROUP_ID
	  JOIN item_detail itd
		ON it.ID = itd.ITEM_ID
),
CTE_ITEM_GROUP_MAX_AMOUNT AS 
(
	SELECT ITEM_GROUP_ID,
		   ITEM_GROUP_NAME,
		   MAX(AMOUNT) MAX_REMAINNING_ITEM_AMOUNT
	  FROM CTE_ITEM_GROUP_DETAIL
	  GROUP BY ITEM_GROUP_ID, ITEM_GROUP_NAME
)
SELECT *
  FROM CTE_ITEM_GROUP_DETAIL itg_d
  JOIN CTE_ITEM_GROUP_MAX_AMOUNT itg_max
    ON itg_d.ITEM_GROUP_ID = itg_max.ITEM_GROUP_ID
   AND itg_d.AMOUNT = itg_max.MAX_REMAINNING_ITEM_AMOUNT;
   
-- test
WITH DATA_AMOUNT_BY_ITEMS AS
(
SELECT it.ID ITEM_ID,
	   it.NAME ITEM_NAME,
       SUM(itd.AMOUNT) TOTAL_OF_ITEMS
  FROM item it
  JOIN item_detail itd
    ON itd.ITEM_ID = it.ID
 GROUP BY it.ID, it.NAME
 ORDER BY TOTAL_OF_ITEMS DESC
)
SELECT *
  FROM DATA_AMOUNT_BY_ITEMS dt
  JOIN item_group itg
    ON itg.ID = dt.ITEM_GROUP_ID
 GROUP BY itg.ID, itg.NAME;

-- 22. Hiển thị giá bán trung bình của mỗi loại hàng
SELECT itg.ID ITEM_GROUP_ID, 
	   itg.NAME ITEM_GROUP_NAME,
       round(avg(itd.SALES_PRICE), 2) AVG_SALES_PRICE
  FROM item_group itg
  JOIN item it
    ON itg.ID = it.ITEM_GROUP_ID
  JOIN item_detail itd
    ON itd.ITEM_ID = it.ID
 GROUP BY itg.ID, itg.NAME;

-- 23. In ra 3 loại hàng có số lượng hàng còn lại nhiều nhất ở thời điểm hiện tại
SELECT itg.ID,
	   itg.NAME,
       sum(itd.AMOUNT) AMOUNT_IN_STOCK,
       sum(odd.AMOUNT) AMOUNT_ORDER,
       sum(itd.AMOUNT) - sum(odd.AMOUNT) REMAINING_AMOUNT
  FROM item it
  JOIN item_group itg
    ON it.ITEM_GROUP_ID = itg.ID
  JOIN item_detail itd
    ON it.ID = itd.ITEM_ID
  JOIN order_detail odd
    ON odd.ITEM_DETAIL_ID = itd.ID
 GROUP BY itg.ID, itg.NAME
 ORDER BY REMAINING_AMOUNT DESC
 LIMIT 3;

-- 24. Liệt kê những mặt hàng có MaLoai = 2 và thuộc đơn hàng 100100
SELECT it.ID ITEM_ID,
	   it.NAME ITEM_NAME,
       it.ITEM_GROUP_ID,
       itd.SIZE_ID,
       odd.ORDER_ID ORDER_ID
  FROM item it
  JOIN item_detail itd
    ON it.ID = itd.ITEM_ID
  JOIN order_detail odd
    ON odd.ITEM_DETAIL_ID = itd.ID
 WHERE it.ITEM_GROUP_ID = 2
   AND odd.ORDER_ID = 4;

-- 25. Tìm những mặt hàng có Mã Loại = 2 và đã được bán trong ngày 7/9
SELECT it.ID ITEM_ID,
	   it.NAME ITEM_NAME,
       it.ITEM_GROUP_ID,
       odd.ORDER_ID ORDER_ID,
       od.CREATED_AT TIME_BUY
  FROM item it
  JOIN item_detail itd
    ON it.ID = itd.ITEM_ID
  JOIN order_detail odd
    ON odd.ITEM_DETAIL_ID = itd.ID
  JOIN `order` od
    ON od.ID = odd.ORDER_ID
 WHERE it.ITEM_GROUP_ID = 2
   AND cast(od.CREATED_AT AS DATE) = '2023-09-07';

-- 26. Liệt kê những mặt hàng là 'Mũ' không bán được trong ngày 07/09/2023
SELECT it.ID ITEM_ID,
	   it.NAME ITEM_NAME,
       it.ITEM_GROUP_ID,
       odd.ORDER_ID ORDER_ID,
       od.CREATED_AT TIME_BUY
  FROM item it
  JOIN item_group itg
    ON itg.ID = it.ITEM_GROUP_ID
  JOIN item_detail itd
    ON it.ID = itd.ITEM_ID
  JOIN order_detail odd
    ON odd.ITEM_DETAIL_ID = itd.ID
  JOIN `order` od
    ON od.ID = odd.ORDER_ID
 WHERE itg.NAME LIKE '%Mũ%'
   AND cast(od.CREATED_AT AS DATE) != '2023-09-07';

-- 27. Cập nhật giá bán của tất cả các mặt hàng thuộc loại hàng 'Áo' thành 199
UPDATE item_detail itd
  JOIN item it
    ON it.ID = itd.ITEM_ID
  JOIN item_group itg
    ON itg.ID = it.ITEM_GROUP_ID
   SET itd.SALES_PRICE = 199
 WHERE itg.NAME LIKE '%Áo%';
 
SELECT * FROM item_detail;

-- 28. Backup data. Tạo table LoaiHang_SaoLuu(MaLoai, TenLoai)
--     Sao chép dữ liệu từ bảng LoaiHang sang LoaiHang_SaoLuu
CREATE TABLE BACKUP_ITEM_GROUP(ID INT, `NAME` VARCHAR(100));
SELECT * FROM BACKUP_ITEM_GROUP;

INSERT INTO BACKUP_ITEM_GROUP(ID, `NAME`)
SELECT ID, `NAME` FROM item_group;

-- 30. Liệt kê 2 sản phẩm (có số lượng tồn kho nhiều nhất) của loại hàng 'Áo' và 'Quần'
-- B1: Tìm số lượng hàng còn lại của mỗi mặt hàng thuộc loại hàng 'Áo', 'Quần'
-- B2: ORDER BY SoLuongTon DESC
-- B3: LIMIT 2
WITH CTE_TOP2_SHIRTS AS
(
SELECT it.ID,
	   it.NAME,
       sum(itd.AMOUNT) - sum(odd.AMOUNT) REMAINING_AMOUNT
  FROM item it
  JOIN item_group itg
    ON it.ITEM_GROUP_ID = itg.ID
  JOIN item_detail itd
    ON it.ID = itd.ITEM_ID
  JOIN order_detail odd
    ON odd.ITEM_DETAIL_ID = itd.ID
 WHERE itg.NAME LIKE '%Áo%'
 GROUP BY it.ID, it.NAME
 ORDER BY REMAINING_AMOUNT DESC
 LIMIT 2
 ),
 CTE_TOP2_PANTS AS
 (
 SELECT it.ID,
	   it.NAME,
       sum(itd.AMOUNT) - sum(odd.AMOUNT) REMAINING_AMOUNT
  FROM item it
  JOIN item_group itg
    ON it.ITEM_GROUP_ID = itg.ID
  JOIN item_detail itd
    ON it.ID = itd.ITEM_ID
  JOIN order_detail odd
    ON odd.ITEM_DETAIL_ID = itd.ID
 WHERE itg.NAME LIKE '%Quần%'
 GROUP BY it.ID, it.NAME
 ORDER BY REMAINING_AMOUNT DESC
 LIMIT 2
 )
 SELECT * FROM CTE_TOP2_SHIRTS
 UNION
 SELECT * FROM CTE_TOP2_PANTS;

-- 31. Tính tổng tiền cho đơn hàng 02
    -- Với tổng tiền được tính bằng tổng các sản phẩm và số lượng của sản phẩm tương ứng
SELECT od.ID ORDER_ID,
	   sum(odd.AMOUNT * itd.SALES_PRICE) TOTAL_MONEY
  FROM `order` od
  JOIN order_detail odd
    ON od.ID = odd.ORDER_ID
  JOIN item_detail itd
    ON itd.ID = odd.ITEM_DETAIL_ID
 WHERE od.ID = 2;

-- 32. Xuất thông tin hóa đơn của đơn hàng 02 với thông tin như sau.
	-- SoDH ChiTietDonHang           TongTien
    -- 02   TenMH:GiaBan:SoLuong     100
SELECT od.ID ORDER_ID,
	   it.NAME ITEM_NAME,
       itd.SALES_PRICE,
       odd.AMOUNT,
       odd.AMOUNT * itd.SALES_PRICE TOTAL_MONEY
  FROM `order` od
  JOIN order_detail odd
    ON od.ID = odd.ORDER_ID
  JOIN item_detail itd
    ON itd.ID = odd.ITEM_DETAIL_ID
  JOIN item it
    ON it.ID = itd.ITEM_ID
 WHERE od.ID = 2;



