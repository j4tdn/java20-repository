-- DROP PROCEDURE P_INSERT_DATE_ITEM_GROUP;
-- 1. Viết phương thức liệt kê các mặt hàng
DELIMITER $$
CREATE PROCEDURE P_PRINT_ALL_ITEMS()
BEGIN
	-- body, statements
    SELECT * FROM item;
END $$

-- Gọi sử dụng procedure
CALL P_PRINT_ALL_ITEMS();

-- 2.1. Viết phương thức liệt kê các mặt hàng theo mã loại hàng

DELIMITER $$
CREATE PROCEDURE P_PRINT_ITEMS_BY_ITEM_GROUP_ID(p_item_group_id INT)
BEGIN
    SELECT * 
	  FROM item 
	 WHERE ITEM_GROUP_ID = p_item_group_id;
END $$

CALL P_PRINT_ITEMS_BY_ITEM_GROUP_ID(2);

-- 2.2. Viết phương thức liệt kê các mặt hàng theo tên loại hàng
DELIMITER $$
CREATE PROCEDURE P_PRINT_ITEMS_BY_ITEM_GROUP_NAME(p_item_group_name VARCHAR(100))
BEGIN
	DECLARE p_ig_id INT;
    SET p_ig_id = (SELECT ID 
					 FROM ITEM_GROUP
					WHERE NAME = p_item_group_name);
    
    SELECT * 
	  FROM item 
	 WHERE ITEM_GROUP_ID = p_ig_id;
END $$

CALL P_PRINT_ITEMS_BY_ITEM_GROUP_NAME('Quần');

-- 3. Viết phương thức thêm N dòng dữ liệu cho bảng loại hàng
DELIMITER $$
CREATE PROCEDURE P_INSERT_DATA_ITEM_GROUP(p_rows INT)
BEGIN
	DECLARE max_id INT DEFAULT (SELECT max(ID) FROM item_group);
    DECLARE id INT DEFAULT max_id + 1;
    
    DECLARE i INT DEFAULT 0;
    WHILE i < p_rows DO
		INSERT INTO item_group(ID, NAME)
        SELECT (id+i),	concat('Loại hàng ', (id+i));
        SET i = i + 1;
	END WHILE;
END $$

CALL P_INSERT_DATA_ITEM_GROUP(3);

SELECT * FROM item_group;

-- 4. Viết phương thức liệt kê các phần tử chẵn nhỏ hơn N
CREATE TABLE GTT_DATA
(
	GTT_COL TEXT
);
SELECT * FROM GTT_DATA;

DELIMITER $$
CREATE PROCEDURE P_PRINT_EVEN_NUMBER_WITH_MAX(n INT)
BEGIN
	DECLARE i INT DEFAULT 0;
    
    TRUNCATE GTT_DATA;
    WHILE i < n DO
		IF i MOD 2 = 0 THEN
			INSERT INTO GTT_DATA(GTT_COL)
            SELECT i;
		END IF;
        SET I = i + 1;
    END WHILE;
    SELECT * FROM GTT_DATA;
    TRUNCATE GTT_DATA;
END $$

CALL P_PRINT_EVEN_NUMBER_WITH_MAX(15);

-- FUNCTION
-- 1. Tính tổng các phần tử chẵn nhỏ hơn N
-- This function has none of DETERMINISTIC, NO SQL, or READS SQL DATA in its declaration and binary logging is enabled 
-- (you *might* want to use the less safe log_bin_trust_function_creators variable)
SET GLOBAL log_bin_trust_function_creators = 1;

DELIMITER $$
CREATE FUNCTION F_PRINT_EVEN_NUMBER_WITH_MAX(n INT)
RETURNS INT		-- / table / array
BEGIN
	DECLARE i INT DEFAULT 0;
    DECLARE result INT DEFAULT 0;
    
    WHILE i < n DO
		IF i MOD 2 = 0 THEN
			SET result = result + i;
		END IF;
        SET i = i + 1;
    END WHILE;
    
    RETURN result;
END $$

SELECT F_PRINT_EVEN_NUMBER_WITH_MAX(12);

-- DEMO TRIGGER
-- K/N: là 1 thao tác hay đoạn code đc tạo ra cho từng table, đc thực thi trước hoặc sau khi select, insert hoặc update
DROP TABLE IF EXISTS Salaries;
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
    
DROP TABLE IF EXISTS SalaryArchives;    
CREATE TABLE SalaryArchives (
    id INT PRIMARY KEY AUTO_INCREMENT,
    employeeNumber INT,
    validFrom DATE NOT NULL,
    amount DEC(12 , 2 ) NOT NULL DEFAULT 0,
    deletedAt TIMESTAMP DEFAULT NOW()
);

SELECT * FROM Salaries;
SELECT * FROM SalaryArchives;

DELIMITER $$

-- OLD -> đối tượng trỏ đến data của row chuẩn bị INSERT/DELETE/UPDATE
-- NEW -> đối tượng trỏ đến data của row mới vừa INSERT/UPDATE
CREATE TRIGGER before_salaries_delete
BEFORE DELETE
ON salaries FOR EACH ROW
BEGIN
    INSERT INTO SalaryArchives(employeeNumber,validFrom,amount)
    VALUES(OLD.employeeNumber,OLD.validFrom,OLD.amount);
END$$    

DELIMITER ;

DELETE FROM salaries WHERE employeeNumber = 1056;


