-- 1A. Liệt kê toàn bộ thông tin các loại hàng
SELECT * FROM item_group;

-- 1B. Liệt kê thông tin loại hàng có mã loại = 3
SELECT * FROM item_group WHERE ID = 3;

-- 1C. Thêm mới/cập nhật LoaiHang --> saveOrUpdate, merge(oracle)
INSERT INTO item_group(ID, NAME)
VALUE (?, ?);

UPDATE item_group
   SET NAME = ?
 WHERE ID = ?;

-- 1D. Thêm mới/cập nhật danh sách LoaiHang --> batch update/procedure + batch update
DELIMITER $$
CREATE PROCEDURE P_MERGE_INTO_ITEM_GROUP(pid INT, pname VARCHAR(100))
BEGIN
	DECLARE counter INT DEFAULT (SELECT COUNT(*) FROM item_group WHERE ID = pid);
    IF (counter = 1) THEN
		UPDATE item_group
        SET `NAME` = pname
        WHERE ID = pid;
	ELSE
		INSERT item_group(ID, `NAME`)
        VALUES(pid, pname);
	END IF;
END $$

SELECT * FROM item_group;

CALL P_MERGE_INTO_ITEM_GROUP(15, 'Loại hàng 1444');

-- 1E. Liệt kê loại hàng theo tên loại(varchar) --> SQL Injection
ALTER TABLE item_group
ADD CONSTRAINT UNI_ITEM_GROUP_NAME UNIQUE(`NAME`);

SELECT * FROM item_group WHERE `NAME` = 'Thắt lưng';

-- 1F. Liệt kê các mặt hàng(MatHang, LoaiHang) --> hasA
SELECT it.*,
	   ig.ID IG_ID,
       ig.NAME IG_NAME
  FROM item it
  JOIN item_group ig
    ON it.ITEM_GROUP_ID = ig.ID;

-- 1G. Liệt kê tất cả các loại hàng(LoaiHang, Danh Sach MatHang) [theo danh sách MaLH] --> hasN
SELECT ig.ID IG_ID,
       ig.NAME IG_NAME,
	   group_concat(it.NAME SEPARATOR ', ') LIST_ITEMS
  FROM item it
  JOIN item_group ig
    ON it.ITEM_GROUP_ID = ig.ID
 GROUP BY ig.ID, ig.NAME;

-- 1H. Liệt kê các mặt hàng(MatHang) được bán trong ngày bất kì
SELECT it.*,
       '2023-09-07' SALES_DATE
  FROM item it
  JOIN item_detail id
    ON it.ID = id.ITEM_ID
  JOIN order_detail odd
    ON id.ID = odd.ITEM_DETAIL_ID
  JOIN `order` od
    ON odd.ORDER_ID = od.ID
 WHERE cast(od.CREATED_AT AS DATE) = '2023-09-07';

-- Phần 1: Truy vấn từ 1/N bảng, các column truy vấn ra lấy từ columns trong các table của database
-- JDBC: Class dùng để mapping Java Object vs Database Table: Normal
-- ORMF(JPA/Hibernate): Entity

-- Phần 2: Truy vấn từ N bảng, mỗi bảng chỉ lấy 1 vài column và các column còn lại được tạo từ các công thức/hàm tính toán
--         (count, sum, group_concat) -> k thể khai báo các column này vào trong Entity/Normal class vì k phải khi nào các
--         các column này cũng cần cho db query
-- ==> tạo ra 1 class gọi là DTO

-- 2. Đếm số lượng các mặt hàng theo từng loại hàng - C16
-- MaLH    TenLH  TongSoLuong         DanhSachMatHang
--  1      Áo        20        Áo sơ mi-S-10, Áo sơ mi-M-2, Áo Khoác-M-8
--  2      Quần      12        Quần jean-S-10, Quần short-M-2
SELECT itg.ID,
	   itg.NAME,
       sum(itd.AMOUNT) TOTAL_OF_ITEMS,
	   group_concat(concat(it.NAME, '-', itd.SIZE_ID, '-', itd.AMOUNT) SEPARATOR ', ') ITEM_DETAILS_INFO
  FROM item_group itg
  JOIN item it
    ON itg.ID = it.ITEM_GROUP_ID
  JOIN item_detail itd
    ON itd.ITEM_ID = it.ID
 GROUP BY itg.ID, itg.NAME;

-- 3. Hiển thị mặt hàng có số lượng nhiều nhất trong mỗi loại hàng - C21
-- >> Table - DTO: Data Transfer Object
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
SELECT itg_d.ITEM_ID,
       itg_d.ITEM_NAME,
       itg_d.SIZE,
       itg_d.AMOUNT,
       itg_d.ITEM_GROUP_ID,
       itg_d.ITEM_GROUP_NAME
  FROM CTE_ITEM_GROUP_DETAIL itg_d
  JOIN CTE_ITEM_GROUP_MAX_AMOUNT itg_max
    ON itg_d.ITEM_GROUP_ID = itg_max.ITEM_GROUP_ID
   AND itg_d.AMOUNT = itg_max.MAX_REMAINNING_ITEM_AMOUNT;

-- 4. Thêm mới nhân viên vào hệ thống
--    Thông tin mật khẩu được mã hóa theo chuẩn 'MD5', SHA-256, BCrypt
--    Kiểm thử với chức năng login
SELECT * FROM customer;

INSERT INTO customer(ID, `NAME`, EMAIL, ADDRESS, PHONE, `PASSWORD`)
VALUES (?,?,?,?,?,?);

SELECT * FROM customer WHERE EMAIL = ? AND `PASSWORD` = ?;

-- 5. Cập nhập
--    + Số lượng mặt hàng MaMH=1, MaKC=L thành 80->40
--    + Số lượng mặt hàng MaMH=1, MaKC=M thành 40->80
--    + .....
-- >> Transaction
SELECT * FROM item_detail;
