-- singleton row - constant
-- query cost 1(100%)
-- loop n -> get n
EXPLAIN SELECT * FROM item WHERE ID = 1;

ALTER TABLE item ADD INDEX IDX_NAME (`NAME`);
EXPLAIN SELECT * FROM item WHERE `NAME` = 'Áo 1';

CREATE INDEX IDX_ABC ON item(NAME);
ALTER TABLE item DROP INDEX IDX_NAME;
