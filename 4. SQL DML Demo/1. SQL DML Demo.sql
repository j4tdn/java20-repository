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
-- Truy vấn lồng
-- Thực hiện câu truy vấn con trước, được kết quả thực thi câu lệnh cha
-- Lồng tương quan
SELECT * FROM item
WHERE ITEM_GROUP_ID IN ( SELECT ID 
                           FROM item_group
						  WHERE `NAME` = 'Thắt lưng');

-- Lồng phân cấp
-- Duyệt từng phần tử bên bảng cha
-- Lấy ra các phần tử ở bảng cha khi dòng hiện tại thỏa mãn điều kiện trong bảng con
-- Mệnh đề SELECT trong bảng con không quan trọng, SELECT bất kỳ column nào
SELECT * 
  FROM item 
  WHERE EXISTS (SELECT * 
                  FROM item_group
                  WHERE `NAME` = 'Thắt lưng');
-- Top 5 mặt hàng có giá bán cao nhất
SELECT * FROM item_detail
ORDER BY SALES_PRICE DESC
LIMIT 5;

-- Nếu mặt hàng giá bán cao thứ 5 có giá trùng với các mặt hàng khác, lấy hết
WITH CTE_TOP_5_SALES_PRICE AS
(
	SELECT SALES_PRICE
      FROM item_detail
	 ORDER BY SALES_PRICE DESC, AMOUNT DESC
     LIMIT 5
)
SELECT *
  FROM item_detail
  WHERE EXISTS ( SELECT 43 
                   FROM CTE_TOP_5_SALES_PRICE top5
                   WHERE item_detail.SALES_PRICE = top5.SALES_PRICE)
  ORDER BY SALES_PRICE DESC;

-- 2. Đơn hàng
    -- Được bán trong ngày 28/11/2019
SELECT *
  FROM `order`
 WHERE cast(CREATED_AT AS DATE) = str_to_date('07/09/2023', '%d/%m/%Y');

    -- Được bán từ ngày 28/11/2019 đến ngày 02/12/2019
SELECT *
  FROM `order`
 WHERE date(CREATED_AT) BETWEEN str_to_date('01/08/2023', '%d/%m/%Y') AND str_to_date('08/09/2023', '%d/%m/%Y');
    -- Được bán trong tháng 11/2019
SELECT *
  FROM `order`
 WHERE month(CREATED_AT) = 08 
   AND year(CREATED_AT) = 2023;
 
    -- Được giao hàng tại Hòa Khánh
-- 3. Giá của toàn bộ các mặt hàng sau khi được khuyến mãi 20%, làm tròn 2 chữ số thập phân
select *, 
		ROUND(SALES_PRICE * 0.82, 2) GiaKhuyenMai,
        cast(SALES_PRICE * 0.82 as decimal(6,2)) GiaKhuyenMai
from  item_detail;
-- 4. Giảm giá 20% tất cả các mặt hàng trong ngày 25/11/2019
-- 4. Giảm giá 20% tất cả các mặt hàng trong ngày 25/11/2019
-- 5. Liệt kê tất cả các màu sắc của sản phẩm có bán trong cửa hàng.
-- 7. Liệt kê tất cả các mặt hàng (MaMH, TenMH, ThoiGianDatHang) được bán trong ngày 23/11/2019
-- 8. Liệt kê các mặt hàng có giá bán từ 100 - 300
-- 9. Liệt kê tất cả các mặt hàng thuộc loại hàng là 'Mũ' và 'Thắt lưng'
-- 10. Liệt kê các đơn hàng được đặt trong ngày (28/11/2019, 14/12/2019)
-- ======================= REFRESH DATA - DEMO MULTI TABLES AND GROUPING =======================
SELECT ITEM_GROUP_ID, concat(count(*), ' row(s)')
  FROM item
 GROUP BY ITEM_GROUP_ID;
 
 select * FROM item;
 SET GLOBAL sql_mode=(SELECT REPLACE(@@sql_mode,'ONLY_FULL_GROUP_BY',''));

SET GLOBAL sql_mode=(SELECT CONCAT(@@sql_mode, ',ONLY_FULL_GROUP_BY'));
-- 11. Sắp xếp các mặt hàng với giá bán tăng dần
SELECT * 
  FROM item_detail
 ORDER BY SALES_PRICE ASC;
 
select * from item_detail;

-- 11. Tìm kích thước có giá bán lớn nhất trong mỗi mặt hàng và sắp xếp giảm dần
SELECT it.ID,
	   it.`NAME`,
       MAX(SALES_PRICE) MAX_SP
  FROM item_detail itd
  JOIN item it
    ON it.ID = itd.ITEM_ID
  GROUP BY it.ID, it.`NAME`
  ORDER BY MAX_SP DESC;
 
-- 12. Sắp xếp các mặt hàng với giá mua giảm dần
SELECT *
  FROM item
 ORDER BY BUY_PRICE DESC;


-- 13. Sắp xếp các mặt hàng với giá bán tăng dần, giá mua giảm dần
SELECT * 
  FROM item
  JOIN item_detail 
    ON 	item.ID = item_detail.ITEM_ID  
 ORDER BY item_detail.SALES_PRICE ASC, item.BUY_PRICE DESC; 
  
  
-- 14. Đếm số lượng các mặt hàng trong hệ thống
SELECT COUNT(*) FROM item;
-- 15. Số lượng 'Giày da Nam' được bán trong ngày 23/11/2019
SELECT COUNT(*)
  FROM order_detail
  JOIN `order`
 WHERE ITEM_DETAIL_ID IN ( SELECT ITEM_ID 
							 FROM item_detail
							WHERE ITEM_ID IN ( SELECT ID FROM item 
												WHERE `NAME` = 'Giày 2'))
                                                
GROUP BY ITEM_DETAIL_ID;    

-- 16. Đếm số lượng các mặt hàng theo từng loại hàng
--     MaLoai  TenLoai SoLuong
-- 	1       Giày    20
-- 	2       Áo      28
SELECT item_group.ID, item_group.`NAME`, COUNT(*) 'SL mat hang' 
  FROM item
  JOIN item_group
    oN item.ITEM_GROUP_ID = item_group.ID
 GROUP BY item_group.ID, item_group.`NAME`;

-- 17. Tìm mặt hàng có giá bán cao nhất trong loại hàng 'Giày'
SELECT it.ID,
	   it.`NAME`,
       MAX(SALES_PRICE) MAX_SP
  FROM item_detail itd
  JOIN item it
    ON it.ID = itd.ITEM_ID
  GROUP BY it.ID, it.`NAME`
  ORDER BY MAX_SP DESC;
  
SELECT * 
  FROM item_group itg
  JOIN item it 
    ON itg.ID = it.ITEM_GROUP_ID
  JOIN item_detail itd
    ON it.ID = itd.ITEM_ID
 WHERE itg.`NAME` LIKE 'Quần'
 ORDER BY itd.SALES_PRICE DESC
 LIMIT 1;


-- 18. Tìm mặt hàng có giá bán cao nhất của mỗi loại hàng
SELECT itg.ID, MAX(itd.SALES_PRICE)
  FROM item_group itg
  JOIN item it 
    ON itg.ID = it.ITEM_GROUP_ID
  JOIN item_detail itd
    ON it.ID = itd.ITEM_ID
 GROUP BY itg.ID;


-- 19. Hiển thị tổng số lượng mặt hàng của mỗi loại hàng trong hệ thống >> 16
SELECT itg.ID,
	   itg.`NAME`,
       SUM(itd.AMOUNT) 'SL MAT HANG'
  FROM item_group itg
  JOIN item it 
    ON itg.ID = it.ITEM_GROUP_ID
  JOIN item_detail itd
    ON it.ID = itd.ITEM_ID
 GROUP BY itg.ID, itg.`NAME`
 HAVING SUM(itd.AMOUNT) > 1500;

-- 20. Hiển thị tổng số lượng mặt hàng của mỗi loại hàng trong hệ thống
--     Điều kiện tổng số lượng > 20 mặt hàng >> HAVING
-- ==============================================================
-- 21. Hiển thị mặt hàng có số lượng nhiều nhất trong mỗi loại hàng
-- Đầu tiên em tìm số lượng của mỗi mặt hàng trong loại hàng
-- Sau đó trong từng loại hàng tìm ra mặt hàng có SL lớn nhất
WITH CTE_MAX_AMOUNT_OF_EACH_ITEM AS
(
	SELECT it.ID IT_ID,
		   it.`NAME` IT_NAME, it.BUY_PRICE IT_BUY_PRICE, itg.ID ITEM_GROUP_ID,
		   SUM(AMOUNT) SO_LUONG_TON_KHO
	  FROM item_group itg
	  JOIN item it 
		ON itg.ID = it.ITEM_GROUP_ID
	  JOIN item_detail itd
		ON itd.ITEM_ID = it.ID
	 GROUP BY it.ID, it.`NAME`, it.BUY_PRICE, itg.ID
	 ORDER BY SO_LUONG_TON_KHO DESC
 ),
CTE_MAX_AMOUNT_OF_EACH_ITEM_GROUP AS
 (
	 SELECT ITEM_GROUP_ID, 
			MAX(SO_LUONG_TON_KHO) NEW_SL 
	   FROM CTE_MAX_AMOUNT_OF_EACH_ITEM
	  GROUP BY ITEM_GROUP_ID
)
SELECT CTE_MAX_AMOUNT_OF_EACH_ITEM.* FROM CTE_MAX_AMOUNT_OF_EACH_ITEM, CTE_MAX_AMOUNT_OF_EACH_ITEM_GROUP 
WHERE NEW_SL = SO_LUONG_TON_KHO AND CTE_MAX_AMOUNT_OF_EACH_ITEM_GROUP.ITEM_GROUP_ID = CTE_MAX_AMOUNT_OF_EACH_ITEM.ITEM_GROUP_ID;
 
SELECT * FROM item_detail;
-- 22. Hiển thị giá bán trung bình của mỗi loại hàng
SELECT itg.ID, itg.`NAME`, ROUND(AVG(itd.SALES_PRICE),2) 'Giá bán trung bình'
  FROM item_group itg
  JOIN item it
    ON itg.ID = it.ITEM_GROUP_ID
  JOIN item_detail itd
    ON itd.ITEM_ID = it.ID
 GROUP BY itg.ID, itg.`NAME`;

-- 23. In ra 3 loại hàng có số lượng hàng còn lại nhiều nhất ở thời điểm hiện tại
SELECT itg.ID, itg.`NAME`, SUM(itd.AMOUNT) 'Số lượng mặt hàng'
  FROM item_group itg
  JOIN item it
    ON itg.ID = it.ITEM_GROUP_ID
  JOIN item_detail itd
    ON itd.ITEM_ID = it.ID
 GROUP BY itg.ID, itg.`NAME`
 ORDER BY SUM(itd.AMOUNT) DESC
 LIMIT 3;

-- 24. Liệt kê những mặt hàng có MaLoai = 2 và thuộc đơn hàng 1
SELECT odd.ORDER_ID,
       GROUP_CONCAT(CONCAT(it.ID, '-',it.`NAME`,'-', it.MATERIAL,'-', it.BUY_PRICE,'-',it.COLOR) SEPARATOR ', ') 'Chi tiết mặt hàng'
  FROM order_detail odd
  JOIN item_detail itd
    ON odd.ITEM_DETAIL_ID = itd.ID
  JOIN item it
    ON it.ID = itd.ITEM_ID
 WHERE odd.ORDER_ID = 1
   AND it.ID = 1
 GROUP BY odd.ORDER_ID;

-- 25. Tìm những mặt hàng có Mã Loại = 1 và đã được bán trong ngày 07/09
SELECT odd.ORDER_ID,
       GROUP_CONCAT(CONCAT(it.ID, '-',it.`NAME`,'-', it.MATERIAL,'-', it.BUY_PRICE,'-',it.COLOR) SEPARATOR ', ') 'Chi tiết mặt hàng'
       -- it.*
  FROM order_detail odd
  JOIN item_detail itd
    ON odd.ITEM_DETAIL_ID = itd.ID
  JOIN item it
    ON it.ID = itd.ITEM_ID
  JOIN `order` od
    ON odd.ORDER_ID = od.ID
  JOIN item_group itg
    ON itg.ID = it.ITEM_GROUP_ID
 WHERE CAST(od.CREATED_AT AS DATE) = '2023-02-15'
   AND itg.ID = 1
 GROUP BY odd.ORDER_ID;
 
 WITH SALES_ITEM AS (
	SELECT ITEM_ID
	  FROM item_detail itd
	  JOIN order_detail odd
		ON itd.ID = odd.ITEM_DETAIL_ID
	  JOIN `order` od
		ON odd.ORDER_ID = od.ID
	 WHERE cast(od.CREATED_AT AS DATE) = '2023-02-15'
)
SELECT it.*,
       '2023-02-15' SALES_DATE
  FROM item it
-- WHERE ID IN (SELECT ITEM_ID FROM SALES_ITEM);
-- WHERE EXISTS (SELECT 1 FROM SALES_ITEM WHERE it.ID = ITEM_ID);
  JOIN SALES_ITEM sit
    ON it.ID = sit.ITEM_ID
  WHERE it.ITEM_GROUP_ID = 1;

-- 26. Liệt kê những mặt hàng là 'Mũ' không bán được trong ngày 07/09/2023

SELECT *
  FROM item
  WHERE item.`NAME` LIKE '%Mũ%' AND NOT EXISTS (SELECT it.ID -- Những ID mặt hàng mũ được bán trong ngày 07/09/2023
													   FROM `order` od
													   JOIN order_detail odd
														 ON od.ID = odd.ORDER_ID
													   JOIN item_detail itd
														 ON itd.ID = odd.ITEM_DETAIL_ID
													   JOIN item it
													  	 ON it.ID = itd.ITEM_ID
													  WHERE it.`NAME` LIKE '%Mũ%'
													    AND CAST(od.CREATED_AT AS DATE) = '2023-02-15'
                                                        AND item.ID = itd.ITEM_ID);

WITH SALES_ITEM AS (
	SELECT ITEM_ID
	  FROM item_detail itd
	  JOIN order_detail odd
		ON itd.ID = odd.ITEM_DETAIL_ID
	  JOIN `order` od
		ON odd.ORDER_ID = od.ID
	 WHERE cast(od.CREATED_AT AS DATE) = '2023-02-15'
)
SELECT it.*,
       '2023-02-15' SALES_DATE
  FROM item it
  WHERE NOT EXISTS (SELECT 1 FROM SALES_ITEM WHERE it.ID = ITEM_ID)
    AND     EXISTS (SELECT 1 FROM item_group WHERE `NAME` LIKE '%Mũ%' AND it.ITEM_GROUP_ID = ID);
-- 27. Cập nhật giá bán của tất cả các mặt hàng thuộc loại hàng 'Áo' thành 199
UPDATE item_detail itd
   SET itd.SALES_PRICE = 199
 WHERE itd.ITEM_ID IN ( SELECT ID 
	                      FROM item it
                          WHERE it.ITEM_GROUP_ID IN ( SELECT ID
														FROM item_group itg 
                                                        WHERE itg.`NAME` LIKE 'Áo'));
                                                        
-- 28. Backup data. Tạo table LoaiHang_SaoLuu(MaLoai, TenLoai)
--     Sao chép dữ liệu từ bảng LoaiHang sang LoaiHang_SaoLuu
INSERT INTO item_group_copy(ID,`NAME`)
SELECT ID,`NAME` 
  FROM item_group; 

-- 30. Liệt kê 2 sản phẩm (có số lượng tồn kho nhiều nhất) của loại hàng 'Áo' và 'Quần'
-- B1: Tìm số lượng hàng còn lại của mỗi mặt hàng thuộc loại hàng 'Áo', 'Quần'
-- B2: ORDER BY SoLuongTon DESC
-- B3: LIMIT 2
-- TH1: Các loại sản phẩm thuộc cùng 1 loại hàng cũng có thể được liệt kê nếu SL tồn kho lớn nhất
-- Ví dụ có 2 loại áo: Áo 1 và Áo 2 thuộc loại hàng Áo có giá cao nhất -> sẽ in ra 2 sản phẩm áo 1, áo 2
SELECT it.ID,
       it.`NAME`, it.BUY_PRICE, itg.ID ITEM_GROUP_ID,
       SUM(AMOUNT) SO_LUONG_TON_KHO
  FROM item_group itg
  JOIN item it 
    ON itg.ID = it.ITEM_GROUP_ID
  JOIN item_detail itd
    ON itd.ITEM_ID = it.ID
 WHERE itg.`NAME` LIKE 'Áo'
    OR itg.`NAME` LIKE 'Quần'
 GROUP BY it.ID, it.`NAME`, it.BUY_PRICE, itg.ID
 ORDER BY SO_LUONG_TON_KHO DESC;

-- TH2: Các loại sản phẩm thuộc cùng 1 loại hàng sẽ được xử lý để tìm ra sản phẩm tồn kho nhiều nhất
-- Ví dụ có 4 sản phẩm Áo 1, Áo 2, Quần 1, Quần 2 
-- Khi đó Áo 1, Áo 2 có SL lớn nhất -> Sẽ được xử lý để tìm ra Áo nào lớn nhất 
-- Tương tự đối với Quần 1 và Quần 2
-- Sau đó sẽ liệt kê sản phẩm có SL tồn kho lớn nhất của từng loại hàng
WITH CTE_MAX_AMOUNT_OF_EACH_ITEM AS
(
	SELECT it.ID IT_ID,
		   it.`NAME` IT_NAME, it.BUY_PRICE IT_BUY_PRICE, itg.ID ITEM_GROUP_ID,
		   SUM(AMOUNT) SO_LUONG_TON_KHO
	  FROM item_group itg
	  JOIN item it 
		ON itg.ID = it.ITEM_GROUP_ID
	  JOIN item_detail itd
		ON itd.ITEM_ID = it.ID
     WHERE itg.`NAME` LIKE 'Áo'
		OR itg.`NAME` LIKE 'Quần'   
	 GROUP BY it.ID, it.`NAME`, it.BUY_PRICE, itg.ID
	 ORDER BY SO_LUONG_TON_KHO DESC
 ),
CTE_MAX_AMOUNT_OF_EACH_ITEM_GROUP AS
 (
	 SELECT ITEM_GROUP_ID, 
			MAX(SO_LUONG_TON_KHO) NEW_SL 
	   FROM CTE_MAX_AMOUNT_OF_EACH_ITEM
	  GROUP BY ITEM_GROUP_ID
)
SELECT CTE_MAX_AMOUNT_OF_EACH_ITEM.* FROM CTE_MAX_AMOUNT_OF_EACH_ITEM, CTE_MAX_AMOUNT_OF_EACH_ITEM_GROUP 
WHERE NEW_SL = SO_LUONG_TON_KHO AND CTE_MAX_AMOUNT_OF_EACH_ITEM_GROUP.ITEM_GROUP_ID = CTE_MAX_AMOUNT_OF_EACH_ITEM.ITEM_GROUP_ID;

WITH CTE_TEMP_MAX AS (
SELECT     itg.ID        ITEM_GROUP_ID,
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
  WHERE itg.NAME LIKE '%Áo%' OR itg.NAME LIKE '%Quần%'
  ORDER BY itd.AMOUNT DESC, itd.ID DESC
  LIMIT 2
  ) SELECT item.*, item_detail.AMOUNT, item_detail.ID,item_detail.SIZE_ID from CTE_TEMP_MAX
       JOIN item_detail ON CTE_TEMP_MAX.AMOUNT = item_detail.AMOUNT 
       JOIN item ON item_detail.ITEM_ID = item.ID
        
       ORDER BY item_detail.AMOUNT DESC;
select * from item_detail;       
-- 31. Tính tổng tiền cho đơn hàng 02
    -- Với tổng tiền được tính bằng tổng các sản phẩm và số lượng của sản phẩm tương ứng
-- Đầu tiên tìm tổng số tiền của từng mặt hàng trong đơn hảng (em lấy SALES_PRICE * số lượng trong order_detail của từng mặt hàng)
-- Sau đó cộng chúng lại 
-- Câu dưới giống câu này nhưng em làm ngắn gọn hơn
WITH CTE_TOTAL_MONEY_OF_EACH_ITEM AS
(                        
	SELECT  SALES_PRICE * odd.AMOUNT TOTAL_MONEY_OF_EACH_ITEM
	  FROM `order` od    
	  JOIN order_detail odd
		ON od.ID = odd.ORDER_ID
	  JOIN item_detail itd
		ON odd.ITEM_DETAIL_ID = itd.ID
	 WHERE odd.ORDER_ID = 2
	 GROUP BY odd.ID, itd.ID
) 
SELECT od.ID,
	   SUM(TOTAL_MONEY_OF_EACH_ITEM) 'Tổng số tiền'
  FROM `order` od
  JOIN CTE_TOTAL_MONEY_OF_EACH_ITEM
 WHERE od.ID = 2
 GROUP BY od.ID; 
  

    
-- 32. Xuất thông tin hóa đơn của đơn hàng 02 với thông tin như sau.
	-- SoDH ChiTietDonHang           TongTien
    -- 02   TenMH:GiaBan:SoLuong     100
SELECT od.ID SoHD,
	   GROUP_CONCAT(CONCAT(it.`NAME`,'-',itd.SALES_PRICE,'-',odd.AMOUNT) SEPARATOR ', ') CHI_TIET_DON_HANG,
       SUM(odd.AMOUNT * itd.SALES_PRICE) TOTAL_OF_MONEY
  FROM `order` od
  JOIN order_detail odd 
    ON od.ID = odd.ORDER_ID
  JOIN item_detail itd
    ON itd.ID = odd.ITEM_DETAIL_ID
  JOIN item it
    ON itd.ITEM_ID = it.ID
 GROUP BY od.ID;
 
 
 -- Tìm nhân viên phụ trách tất cả các đơn hàng
 SELECT *
   FROM employee
   WHERE NOT EXISTS ( SELECT *
					    FROM `order_detail`
						WHERE NOT EXISTS ( SELECT * FROM `order`
											WHERE `order`.EMPLOYEE_ID = employee.ID
                                            AND order_detail.ORDER_ID = `order`.ID));
                                            
                                            Select * from `order`;
                                            
										