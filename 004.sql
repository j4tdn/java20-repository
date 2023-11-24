-- Patches to create tables
-- PAYMENT METHOD, ORDER STATUS

-- CREATE TABLE PAYMENT METHOD
CREATE TABLE PAYMENT_METHOD
(
    `ID`    INT,
    `DESC`  TEXT NOT NULL,
    CONSTRAINT PRIMARY KEY(`ID`)
);

-- CREATE TABLE ORDER STATUS
CREATE TABLE ORDER_STATUS
(
    `ID`    INT,
    `DESC`  TEXT NOT NULL,
    CONSTRAINT PRIMARY KEY(`ID`)
);