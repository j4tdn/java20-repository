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
-- FALSE: khi run lệnh --> phải commit bằng tay
--                     --> có thể rollback dữ liệu về trạng thái trước khi lệnh dc thực thi

-- ROLLBACK

SET AUTOCOMMIT = 0;
SET AUTOCOMMIT = 1;
ROLLBACK;

-- Test delete/update option --> restrict(no option)/casecade all
-- DEFAULT: no option
SELECT * FROM ORDER_STATUS WHERE ID = 2; -- Xác nhận thành công
SELECT * FROM ORDER_STATUS_DETAIL WHERE ORDER_STATUS_ID = 2;

DELETE FROM ORDER_STATUS WHERE ID = 2;
DELETE FROM ORDER_STATUS_DETAIL WHERE ORDER_STATUS_ID = 2;



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