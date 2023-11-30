-- 1. RENAME column `KEY` to `SIZE` in table SIZE

-- 1a. delete constraint CHK_SIZE_KEY
ALTER TABLE SIZE
DROP CONSTRAINT CHK_SIZE_KEY;

-- 1b. rename column
ALTER TABLE SIZE
RENAME COLUMN `KEY` TO `SIZE`;

-- 1c. recreate constraint
ALTER TABLE SIZE 
ADD CONSTRAINT `CHK_SIZE` CHECK ((`SIZE` IN ('S','M','L','XL','XXL','XXXL')));

-- 18:56:30	ALTER TABLE SIZE RENAME COLUMN `KEY` TO `SIZE`	
-- Error Code: 3959. Check constraint 'CHK_SIZE_KEY' uses column 'KEY', hence column cannot be dropped or renamed.	0.000 sec
