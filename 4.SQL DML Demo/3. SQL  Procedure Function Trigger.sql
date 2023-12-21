-- 1. Viết phương thức liệt kê các mặt hàng
DELIMITER $$
CREATE PROCEDURE P_PRINT_ALL_ITEMS()
BEGIN 
	-- body, statements
    SELECT * FROM item;
    -- body end
END $$

-- Gọi sử dụng procedure
CALL P_PRINT_ALL_ITEMS();

-- 2.1 Viết phương thức liệt kê các mặt hàng theo mã loại hàng
DROP PROCEDURE P_PRINT_ITEMS;

DELIMITER $$
CREATE PROCEDURE P_PRINT_ITEMS_BY_ITEM_GROUP_ID(p_item_group_id INT)
BEGIN 
    SELECT * 
      FROM item
	 WHERE ITEM_GROUP_ID = p_item_group_id;
END $$

CALL P_PRINT_ITEMS_BY_ITEM_GROUP_ID(2);
-- 2.2 Viết phương thức liệt kê các mặt hàng theo mã loại hàng
DROP PROCEDURE P_PRINT_ITEMS_BY_ITEM_GROUP_NAME;

DELIMITER $$
CREATE PROCEDURE P_PRINT_ITEMS_BY_ITEM_GROUP_NAME(p_item_group_name varchar(100))
BEGIN 
	DECLARE p_ig_id INT; -- default = null
    
    SET p_ig_id = ( SELECT ID
					  FROM item_group
					 WHERE NAME = p_item_group_name);
    
    SELECT * 
      FROM item
	 WHERE ITEM_GROUP_ID = p_ig_id;
END $$
CALL P_PRINT_ITEMS_BY_ITEM_GROUP_NAME('Thắt lưng');

-- 3. Viết phương thức thêm N dòng dữ liệu cho bảng loại hàng
DROP PROCEDURE P_INSERT_DATA_ITEM_GROUP;
DELIMITER $$
CREATE PROCEDURE P_INSERT_DATA_ITEM_GROUP(p_rows INT)
BEGIN
	DECLARE max_id INT DEFAULT (SELECT max(ID) FROM item_group);
    DECLARE id INT DEFAULT max_id + 1;
    
    DECLARE i INT DEFAULT 0;
    
    WHILE i < p_rows DO
		INSERT INTO item_group(ID, NAME)
		SELECT (id + i), concat('Loại hàng ', (id + i));
        SET i = i + 1;
    END WHILE;
END $$

CALL P_INSERT_DATA_ITEM_GROUP(3);

-- 4. Viết chương trình liệt kê cá phần tử chẵn nhỏ hơn N
DROP PROCEDURE P_PRINT_EVEN_NUMBER_WITH_MAX;

-- global table temporary
CREATE TABLE GTT_DATA
(
	GTT_COL TEXT
);

DELIMITER $$
CREATE PROCEDURE P_PRINT_EVEN_NUMBER_WITH_MAX(n INT)
BEGIN
	
	DECLARE i INT DEFAULT 0;
    DECLARE res TEXT DEFAULT '';
    
    TRUNCATE GTT_DATA;
    
    WHILE i < n DO
		IF i MOD 2 = 0 THEN 
			INSERT INTO GTT_DATA(GTT_COL)
			SELECT i;
        END IF;
        SET i = i + 1;
    END WHILE;
    SELECT * FROM GTT_DATA;
    
    TRUNCATE GTT_DATA;
END $$

CALL P_PRINT_EVEN_NUMBER_WITH_MAX(15);

-- 1. Tính tổng các phần tử chẵn nhỏ hơn N
SET global log_bin_trust_function_creators = 1;

DROP FUNCTION P_PRINT_EVEN_NUMBER_WITH_MAX;

DELIMITER $$
CREATE FUNCTION F_SUM_EVEN_NUMBERS(n INT)
RETURNS INT -- table, array
BEGIN
	
	DECLARE i INT DEFAULT 0;
    DECLARE res INT DEFAULT 0;
    
    WHILE i < n DO
		IF i MOD 2 = 0 THEN 
			SET res = res + i;
        END IF;
        SET i = i + 1;
    END WHILE;
    
    RETURN res;
END $$

SELECT F_SUM_EVEN_NUMBERS(10);

-- DEMO TRIGGER
CREATE TABLE Salaries (
    employeeNumber INT PRIMARY KEY,
    validFrom DATE NOT NULL,
    amount DEC(12 , 2 ) NOT NULL DEFAULT 0
);

INSERT INTO salaries(employeeNumber,validFrom,amount)
VALUES
    (1002,'2000-01-01',50000),
    (1056,'2000-01-01',60000),
    (1076,'2000-01-01',70000);

CREATE TABLE SalaryArchives (
    id INT PRIMARY KEY AUTO_INCREMENT,
    employeeNumber INT ,
    validFrom DATE NOT NULL,
    amount DEC(12 , 2 ) NOT NULL DEFAULT 0,
    deletedAt TIMESTAMP DEFAULT NOW()
);

SELECT * FROM salaries;
SELECT * FROM salaryArchives;

DELIMITER $$

-- old --> đối tượng trỏ đến data của dòng chuẩn bị insert/update/delete
-- new --> đối tượng trỏ đến data của dòng mới cho insert/update

CREATE TRIGGER before_salaries_delete
BEFORE DELETE
ON salaries FOR EACH ROW
BEGIN
    INSERT INTO SalaryArchives(employeeNumber,validFrom,amount)
    VALUES(OLD.employeeNumber,OLD.validFrom,OLD.amount);
END$$    

DELIMITER ;

DELETE FROM salaries WHERE employeeNumber = 1002;

-- view , partition