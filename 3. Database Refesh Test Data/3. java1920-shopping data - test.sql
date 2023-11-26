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

