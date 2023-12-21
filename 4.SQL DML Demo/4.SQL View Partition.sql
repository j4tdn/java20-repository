-- DEMO VIEW --
-- view as virtual table
CREATE VIEW V_ITEM_ITEM_GROUP AS
SELECT itg.ID,
	   itg.NAME,
       count(it.ID) NUMBER_OF_ITEMS
  FROM item it
  JOIN item_group itg
    ON it.ITEM_GROUP_ID = itg.ID
 GROUP BY itg.ID, itg.NAME;

SELECT * FROM v_item_item_group;
-- cannot update
-- DELETE FROM v_item_item_group WHERE ID = 1;

DROP VIEW V_DAYS_OF_WEEK;
CREATE VIEW V_DAYS_OF_WEEK AS 
SELECT 'monday' `DAY`
UNION
SELECT 'tuesday'
UNION
SELECT 'wednesday'
UNION
SELECT 'thursday'
UNION
SELECT 'friday'
UNION
SELECT 'saturday'
UNION
SELECT 'sunday';

SELECT * FROM v_days_of_week;
SELECT * 
  FROM v_days_of_week 
 WHERE `day` = 'monday';