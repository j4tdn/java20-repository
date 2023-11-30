SELECT * FROM bill;
SELECT * FROM customer;
SELECT * FROM department;
SELECT * FROM employee;
SELECT * FROM item;
SELECT * FROM item_detail;
SELECT * FROM item_group;
SELECT * FROM `order`;
SELECT * FROM order_detail;
SELECT * FROM order_status;
SELECT * FROM order_status_detail;
SELECT * FROM payment_method;
SELECT * FROM size;


-- -----------------------------------------------------
-- COMMIT
-- Khi thực thị 1 câu lệnh SQL(insert/update/delete) dữ liệu sẽ tác động
-- trực tiếp vào database khi thực hiện COMMIT, nếu chưa COMMIT dữ liệu chưa ăn vào database

-- SET AUTO_COMMIT = TRUE | FALSE

-- TRUE: khi run lệnh --> tự động commit
SET AUTOCOMMIT = 1;
-- FALSE: khi run lệnh --> phải commit bằng tay
--                     --> có thể rollback dữ liệu về trạng thái trước khi lệnh dc thực thi
-- ROLLBACK
SET AUTOCOMMIT = 0;
ROLLBACK;

SELECT * FROM ORDER_STATUS WHERE ID = 2; -- Xác nhận thành công
SELECT * FROM ORDER_STATUS_DETAIL WHERE ORDER_STATUS_ID = 2;
SELECT * FROM ORDER_STATUS_DETAIL WHERE ORDER_STATUS_ID = 3;

DELETE FROM ORDER_STATUS WHERE ID = 2;
DELETE FROM ORDER_STATUS_DETAIL WHERE ORDER_STATUS_ID = 2;
DELETE FROM ORDER_STATUS_DETAIL WHERE ORDER_STATUS_ID = 3;



INSERT INTO DEPARTMENT(ID, `NAME`)
VALUES(1, 'Phòng kỹ thuật'),
      (2, 'Phòng bán hàng');

INSERT INTO DEPARTMENT(ID, `NAME`)
VALUES(3, 'Phòng bảo vệ');

INSERT INTO EMPLOYEE(ID, `NAME`, PHONE, ADDRESS, DEPARTMENT_ID)
VALUES(11, 'Nhân viên 11', 123456789, 'Đà Nẵng', 1);

INSERT INTO EMPLOYEE(ID, `NAME`, PHONE, ADDRESS, DEPARTMENT_ID)
VALUES(12, 'Nhân viên 12', 123456789, 'Đà Nẵng', 2);

SELECT * FROM DEPARTMENT;
SELECT * FROM EMPLOYEE;

DELETE FROM DEPARTMENT WHERE ID = 3;

-- 18:10:19	INSERT INTO EMPLOYEE(ID,`NAME`,PHONE,ADDRESS,DEPARTMENT_ID) 
-- VALUES(11, 'Nhân viên 11', 123456789, 'Đà Nẵng', 1)	
-- Error Code: 1452. Cannot add or update a child row: 
-- a foreign key constraint fails (`java1920_shopping`.`employee`, CONSTRAINT `FK_EMPLOYEE_DEPARTMENT` 
-- FOREIGN KEY (`DEPARTMENT_ID`) REFERENCES `department` (`ID`))	0.015 sec

-- 18:15:06	DELETE FROM DEPARTMENT WHERE ID = 1	
-- Error Code: 1451. Cannot delete or update a parent row: 
-- a foreign key constraint fails (`java1920_shopping`.`employee`, CONSTRAINT `FK_EMPLOYEE_DEPARTMENT` 
-- FOREIGN KEY (`DEPARTMENT_ID`) REFERENCES `department` (`ID`))	0.000 sec

-- DEMO GROUP BY:
-- Error Code: 1055. Expression #1 of SELECT list is not in GROUP BY 
-- clause and contains nonaggregated column 'java1920_shopping.item.ID' 
-- which is not functionally dependent on columns in GROUP BY clause; 
-- this is incompatible with sql_mode=only_full_group_by	0.000 sec

SELECT @@sql_mode;
SET sql_mode=(SELECT REPLACE(@@sql_mode,'ONLY_FULL_GROUP_BY',''));
SET sql_mode=(SELECT CONCAT(@@sql_mode,',ONLY_FULL_GROUP_BY'));

-- GROUP_CONCAT gom tất cả các dòng trên 1 column để tạo ra 1 dòng (mặc định được ngăn bởi dấu ,)

SELECT *
  FROM item
 ORDER BY ITEM_GROUP_ID;
 
SELECT GROUP_CONCAT(`NAME`)
  FROM item; 

-- các columns trong mệnh đề SELECT yêu cầu phải xuất hiện trong mệnh đề group by
-- ngoài trừ hàm(trả về 1 dòng dữ liệu cho 1 bảng, nếu có group by thao tác trên từng group)

SELECT ITEM_GROUP_ID,
	   GROUP_CONCAT(`NAME` ORDER BY `NAME` SEPARATOR ', ') ITEMS
  FROM item
 GROUP BY ITEM_GROUP_ID;
 
SELECT ITEM_GROUP_ID,
	   COUNT(*) ROWS_IN_EACH_GROUP,
	   concat(COUNT(*), ' row(s)') ROWS_IN_EACH_GROUP
  FROM item
 GROUP BY ITEM_GROUP_ID;
 
 