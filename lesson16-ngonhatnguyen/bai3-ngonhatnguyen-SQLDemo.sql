-- 21. Hiển thị mặt hàng có số lượng nhiều nhất trong mỗi loại hàng
SELECT DISTINCT it.ITEM_GROUP_ID, it.ID, it.NAME, itd.AMOUNT
  FROM item it
  JOIN item_detail itd
  ON it.ID = itd.ITEM_ID
  JOIN (SELECT it.ITEM_GROUP_ID GROUP_ID, MAX(itd.AMOUNT) MAX_AMOUNT
						  FROM item it
						  JOIN item_detail itd
						  ON it.ID = itd.ITEM_ID
						  GROUP BY it.ITEM_GROUP_ID) iga
  ON it.ITEM_GROUP_ID = iga.GROUP_ID
  WHERE itd.AMOUNT = iga.MAX_AMOUNT
  ORDER BY it.ITEM_GROUP_ID;

-- 22. Hiển thị giá bán trung bình của mỗi loại hàng
SELECT it.ITEM_GROUP_ID, AVG(itd.SALES_PRICE) AVG_SALES_PRICE
  FROM item it
  JOIN item_detail itd
  ON it.ID = itd.ITEM_ID
  GROUP BY it.ITEM_GROUP_ID;
  
-- 23. In ra 3 loại hàng có số lượng hàng còn lại nhiều nhất ở thời điểm hiện tại
SELECT it.ID, it.NAME, itd.AMOUNT
  FROM item it
  JOIN item_detail itd
  ON it.ID = itd.ITEM_ID
  ORDER BY itd.AMOUNT DESC
  LIMIT 3;
  
-- 24. Liệt kê những mặt hàng có MaLoai = 2 và thuộc đơn hàng 100100
SELECT it.ITEM_GROUP_ID, it.ID, it.NAME, odd.ORDER_ID
  FROM item it
  JOIN item_detail itd
  ON it.ID = itd.ITEM_ID
  JOIN order_detail odd
  ON itd.ID = odd.ITEM_DETAIL_ID
  WHERE it.ITEM_GROUP_ID = '2' AND odd.ORDER_ID = '5';
  
-- 25. Tìm những mặt hàng có Mã Loại = 2 và đã được bán trong ngày 28/11
SELECT it.ITEM_GROUP_ID, it.ID, it.NAME, odd.ORDER_ID, od.CREATED_AT
  FROM item it
  JOIN item_detail itd
  ON it.ID = itd.ITEM_ID
  JOIN order_detail odd
  ON itd.ID = odd.ITEM_DETAIL_ID
  JOIN `order` od
  ON od.ID = odd.ORDER_ID
  WHERE it.ITEM_GROUP_ID = '2' AND cast(od.CREATED_AT as DATE) = '2023-02-15';

-- 26. Liệt kê những mặt hàng là 'Mũ' không bán được trong ngày 14/02/2019
SELECT DISTINCT it.ITEM_GROUP_ID, it.ID, it.NAME
  FROM item it
  JOIN item_detail itd
  ON it.ID = itd.ITEM_ID
  JOIN order_detail odd
  ON itd.ID = odd.ITEM_DETAIL_ID
  JOIN `order` od
  ON od.ID = odd.ORDER_ID
  WHERE it.NAME LIKE '%Mũ%' AND cast(od.CREATED_AT as DATE) <> '2023-09-07';

-- 27. Cập nhật giá bán của tất cả các mặt hàng thuộc loại hàng 'Áo' thành 199
UPDATE item_detail
SET item_detail.SALES_PRICE = '199' WHERE item_detail.ITEM_ID IN (SELECT it.ID
											  FROM item it
											  JOIN item_group itg
											  ON itg.ID = it.ITEM_GROUP_ID
											  WHERE itg.NAME = 'Áo');
SELECT it.ID, itd.ID, itd.SALES_PRICE, itg.NAME ITEM_GROUP_NAME
  FROM item it
  JOIN item_group itg
  ON itg.ID = it.ITEM_GROUP_ID
  JOIN item_detail itd
  ON itd.ITEM_ID = it.ID
  WHERE itg.NAME = 'Áo';

-- 28. Backup data. Tạo table LoaiHang_SaoLuu(MaLoai, TenLoai)
--     Sao chép dữ liệu từ bảng LoaiHang sang LoaiHang_SaoLuu
CREATE TABLE IF NOT EXISTS LOAIHANG_SAOLUU
SELECT * FROM item_group;
SELECT * FROM loaihang_saoluu;

-- 30. Liệt kê 2 sản phẩm (có số lượng tồn kho nhiều nhất) của loại hàng 'Áo' và 'Quần'
-- B1: Tìm số lượng hàng còn lại của mỗi mặt hàng thuộc loại hàng 'Áo', 'Quần'
-- B2: ORDER BY SoLuongTon DESC
-- B3: LIMIT 2


-- 31. Tính tổng tiền cho đơn hàng 02
    -- Với tổng tiền được tính bằng tổng các sản phẩm và số lượng của sản phẩm tương ứng
SELECT od.ID, GROUP_CONCAT(' ',itd.ITEM_ID,'-',itd.SALES_PRICE,'-',odd.AMOUNT) DETAILS, SUM(odd.AMOUNT * itd.SALES_PRICE) TONGTIEN
FROM `order` od
JOIN order_detail odd
ON od.ID = odd.ORDER_ID
JOIN item_detail itd
ON itd.ID = odd.ITEM_DETAIL_ID
WHERE od.ID = '2'
GROUP BY od.ID;
    
-- 32. Xuất thông tin hóa đơn của đơn hàng 02 với thông tin như sau.
	-- SoDH ChiTietDonHang           TongTien
    -- 02   TenMH:GiaBan:SoLuong     100
SELECT od.ID SOHD, GROUP_CONCAT(' ',it.NAME,':',itd.SALES_PRICE,':',odd.AMOUNT) CHITIETDONHANG, SUM(odd.AMOUNT * itd.SALES_PRICE) TONGTIEN
FROM `order` od
JOIN order_detail odd
ON od.ID = odd.ORDER_ID
JOIN item_detail itd
ON itd.ID = odd.ITEM_DETAIL_ID
JOIN item it
ON it.ID = itd.ITEM_ID
WHERE od.ID = '2'
GROUP BY od.ID;