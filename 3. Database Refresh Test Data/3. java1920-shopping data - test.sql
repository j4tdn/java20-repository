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


-- Test delete/update option --> restrict(no option)/cascade all



-- 18:10:19	INSERT INTO EMPLOYEE(ID,`NAME`,PHONE,ADDRESS,DEPARTMENT_ID) 
-- VALUES(11, 'Nhân viên 11', 123456789, 'Đà Nẵng', 1)	
-- Error Code: 1452. Cannot add or update a child row: 
-- a foreign key constraint fails (`java1920_shopping`.`employee`, CONSTRAINT `FK_EMPLOYEE_DEPARTMENT` 
-- FOREIGN KEY (`DEPARTMENT_ID`) REFERENCES `department` (`ID`))	0.015 sec

-- 18:15:06	SELECT * FROM DEPARTMENT WHERE ID = 1	
-- Error Code: 1451. Cannot SELECT * or update a parent row: 
-- a foreign key constraint fails (`java1920_shopping`.`employee`, CONSTRAINT `FK_EMPLOYEE_DEPARTMENT` 
-- FOREIGN KEY (`DEPARTMENT_ID`) REFERENCES `department` (`ID`))	0.000 sec