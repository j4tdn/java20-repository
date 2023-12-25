-- GRANT statements to assign privileges to user accounts
USE mydb;
-- create test user
create user 'user1' identified by 'ChangeMe' password expire;

SHOW GRANTS FOR super@localhost;


--  LOCK TABLE --
LOCK TABLE employees READ;

INSERT INTO employees(id, store_id)
VALUES(5, 5);

UNLOCK TABLE;

SHOW PROCESSLIST;