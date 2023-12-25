
-- 1. Viết phương thức liệt kê các mặt hàng
DELIMITER $$
CREATE PROCEDURE P_PRINT_ALL_ITEMS()
BEGIN
	SELECT * FROM item;
END $$

CALL P_PRINT_ALL_ITEMS();

-- 2.1 Viết phương thức liệt kê mặt hàng theo mã loại hàng
DELIMITER $$
CREATE PROCEDURE P_PRINT_ITEMS_BY_ITEM_GROUP_ID(p_item_group_id INT)
BEGIN
	SELECT * 
      FROM item
	 WHERE item.ITEM_GROUP_ID = p_item_group_id;
END $$
DELIMITER ;
CALL P_PRINT_ITEMS_BY_ITEM_GROUP_ID(1);

-- 2.2 Viết phương thức liệt kê mặt hàng theo tên loại hàng
DROP PROCEDURE P_PRINT_ITEMS_BY_ITEM_GROUP_NAME;
DELIMITER $$
CREATE PROCEDURE P_PRINT_ITEMS_BY_ITEM_GROUP_NAME(p_item_group_name VARCHAR(100))
BEGIN
	DECLARE p_ig_id INT; -- default value = NULL
    SET p_ig_id = (SELECT ID FROM item_group WHERE `NAME` = p_item_group_name);
	SELECT * 
      FROM item
	 WHERE item.ITEM_GROUP_ID = p_ig_id;
END $$
DELIMITER ;
CALL P_PRINT_ITEMS_BY_ITEM_GROUP_NAME('Thắt lưng');

-- 3. Viết phương thức thêm(append) N dòng dữ liệu cho bảng loại hàng
-- Tự làm
DROP PROCEDURE P_INSERT_DATA_ITEM_GROUP;
DELIMITER $$
CREATE PROCEDURE P_INSERT_DATA_ITEM_GROUP(p_rows INT)
BEGIN
	DECLARE i INT DEFAULT 15;
    WHILE i < p_rows DO
        INSERT INTO item_group (ID, NAME) VALUES (i, CONCAT('Loại hàng ', i));
        SET i = i + 1;
    END WHILE;
END $$
DELIMITER ;

-- Cách anh Quyền
DROP PROCEDURE P_INSERT_DATA_ITEM_GROUP;
DELIMITER $$
CREATE PROCEDURE P_INSERT_DATA_ITEM_GROUP_ANH_QUYEN(p_rows INT)
BEGIN
	DECLARE max_id INT DEFAULT (SELECT MAX(ID) FROM item_group);
    DECLARE id INT DEFAULT max_id + 1;
    DECLARE i INT DEFAULT 0;
    WHILE i < p_rows DO
        INSERT INTO item_group (ID, NAME) 
        SELECT (id+i), CONCAT('Loại hàng ',(id+i));
        SET i = i + 1;
    END WHILE;
END $$
DELIMITER ;

CALL P_INSERT_DATA_ITEM_GROUP(2);

select * from item_group;


-- 4. Viết phương thức liệt kê các phần tử chẵn nhỏ hơn N
CREATE TABLE GTT_DATA
(
	GTT_COL TEXT
);

DELIMITER $$
CREATE PROCEDURE P_LIST_EVEN_NUMBER_WITH_MAX(n INT)
BEGIN
	DECLARE i INT DEFAULT 0;
    DECLARE result TEXT DEFAULT '';
    
END $$

-- FUNCTION
-- Tính tổng các phần tử chẵn nhỏ hơn N
DELIMITER $$
CREATE FUNCTION F_SUM_EVEN_NUMBER(n INT)
RETURNS INT
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
DELIMITER ;

SELECT F_SUM_EVEN_NUMBER(10);