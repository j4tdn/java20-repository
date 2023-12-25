-- ======================= REFRESH DATA =======================
-- -- DISABLE FOREIGN KEY
-- B. DELETE
-- 1. Xóa nhân viên có tên 'abcxyz' trong hệ thống
DELETE 
  FROM employee
  WHERE `NAME` = 'Nhân viên F';

-- 2. Xóa bộ phận giao hàng trong hệ thống
DELETE
  FROM department
  WHERE `NAME` = 'Bộ phận giao hàng';
-- 3. Xóa tất cả các mặt hàng thuộc loại hàng là mũ
-- Cách 1:
DELETE
  FROM item
  WHERE ITEM_GROUP_ID IN (
							SELECT ID
                              FROM item_group
                              WHERE `NAME` = 'Mũ'
						);
-- Cách 2:
ALTER TABLE item
DROP CONSTRAINT FK_ITEM_ITEM_GROUP;
ALTER TABLE item
ADD CONSTRAINT FK_ITEM_ITEM_GROUP 
	FOREIGN KEY(ITEM_GROUP_ID) REFERENCES item_group(ID)
    ON DELETE CASCADE;
    
DELETE
  FROM item_group
  WHERE `NAME` = 'Mũ';
-- 4. Xóa tất cả các mặt hàng trong hệ thống
-- 5. Vì hệ thống bị lỗi. Hủy tất cả các đơn hàng ngày 23/11/2019
--    Thực hiện xóa các đơn hàng bị lỗi

-- ======================= REFRESH DATA =======================
-- C. UPDATE
-- 1. Cập nhật tên mới cho phòng ban có MaPB = 2 thành 'Bộ phận quản lý'
UPDATE department
   SET `NAME` = 'Bộ phận quản lý'
 WHERE ID = 2;
-- 2. Cập nhật địa chỉ của đơn hàng 01 thành 'Hải Châu, Đà Nẵng'
UPDATE `order`
   SET `order`.DELIVERY_ADDRESS = 'Hải Châu, Đà Nẵng'
 WHERE ID = 1;
 
Select * from `order`;

-- 3. Đơn hàng 01 đã được giao hàng thành công. Thực hiện cập nhật
--    MaTT = 03, TrangThai = 'Đã giao', ThoiGian = Thời gian hiện tại
UPDATE order_status_detail
   SET order_status_detail.ORDER_STATUS_ID = (
												SELECT ID
                                                  FROM order_status
												 WHERE `DESC` = 'Giao hàng thành công'
												)
   AND order_status_detail.UPDATED_AT = current_timestamp()
   WHERE order_status_detail.ORDER_ID = 1;                                           

-- 4. Cập nhật số tiền cần thanh toán trong bảng hóa đơn thành 890 cho đơn hàng 01
UPDATE bill
   SET bill.TOTAL_OF_MONEY = 890
 WHERE bill.ORDER_ID = 1;

-- 5. Cập nhật tất cả các mặt hàng thuộc loại hàng là 'Mũ' với giá bán là 199K
UPDATE item_detail
   SET item_detail.SALESPRICE = 199
 WHERE ITEM_ID IN (
				SELECT ID 
                  FROM item
                  WHERE ITEM_GROUP_ID IN (
											SELECT ID
                                              FROM item_group 
                                              WHERE `NAME` = 'Mũ'
										)
			);