DROP DATABASE IF EXISTS karaoke;
CREATE DATABASE karaoke CHAR SET utf8mb4;
USE karaoke;

DROP TABLE IF EXISTS MONEY_PER_HOUR;
CREATE TABLE CUSTOMER
(
	ID VARCHAR(20) PRIMARY KEY,
    `NAME` VARCHAR(100) NOT NULL,
    ADDRESS TEXT NOT NULL,
    PHONE VARCHAR(11) NOT NULL,
    TAX_CODE VARCHAR(50) NOT NULL
);

DROP TABLE IF EXISTS MONEY_PER_HOUR;
CREATE TABLE HOUR_RATE
(
	ID VARCHAR(20) PRIMARY KEY,
    UNIT_PRICE FLOAT NOT NULL,
    `DESCRIPTION` VARCHAR(200) NOT NULL
);

CREATE TABLE ROOM
(
	ID VARCHAR(20) PRIMARY KEY,
    MAX_PEOPLE INT NOT NULL,
    `STATUS` VARCHAR(100) NOT NULL,
     `DESCRIPTION` VARCHAR(200) NOT NULL
);

DROP TABLE IF EXISTS SERVICE;
CREATE TABLE SERVICE
(
	ID VARCHAR(20) PRIMARY KEY,
    `NAME` VARCHAR(100) NOT NULL,
    UNIT_OF_MEASURE VARCHAR(100) NOT NULL,
     UNIT_PRICE FLOAT NOT NULL
);

CREATE TABLE `ORDER`
(
	ID VARCHAR(20) PRIMARY KEY,
    CUSTOMER_ID VARCHAR(20) NOT NULL,
    ROOM_ID VARCHAR(20) NOT NULL,
    HOUR_RATE_ID VARCHAR(20) NOT NULL,
    START_TIME DATETIME,
    END_TIME DATETIME,
    `STATUS` VARCHAR(100) NOT NULL,
    CONSTRAINT FK_ORDER_CUSTOMER FOREIGN KEY (CUSTOMER_ID) REFERENCES CUSTOMER(ID),
    CONSTRAINT FK_ORDER_ROOM FOREIGN KEY (ROOM_ID) REFERENCES ROOM(ID),
    CONSTRAINT FK_ORDER_HOUR_RATE FOREIGN KEY (HOUR_RATE_ID) REFERENCES HOUR_RATE(ID)
);

CREATE TABLE SERVICE_USAGE_DETAIL
(
	 ORDER_ID VARCHAR(20) NOT NULL,
     SERVICE_ID VARCHAR(20) NOT NULL,
     AMOUNT INT NOT NULL,
	 PRIMARY KEY (ORDER_ID, SERVICE_ID),
     CONSTRAINT UNQ_ORDER_SERVICE UNIQUE (ORDER_ID, SERVICE_ID),
     CONSTRAINT FK_SUD_ORDER FOREIGN KEY (ORDER_ID) REFERENCES `ORDER`(ID),
	 CONSTRAINT FK_SUD_SERVICE FOREIGN KEY (SERVICE_ID) REFERENCES SERVICE(ID)
);

-- INSERT DATA
INSERT INTO CUSTOMER (ID, `NAME`, ADDRESS, PHONE, TAX_CODE) VALUES
('KH001', 'Tran Van Nam', 'Hai Chau', '0905123456', '12345678'),
('KH002', 'Nguyen Mai Anh', 'Lien Chieu', '0905123457', '12345679'),
('KH003', 'Phan Hoai Lan Khue', 'Hoa Vang', '0905123458', '12345680'),
('KH004', 'Nguyen Hoai Nguyen', 'Hoa Cam', '0905123459', '12345681'),
('KH005', 'Le Truong Ngoc Anh', 'Hai Chau', '0905123460', '12345682'),
('KH006', 'Ho Hoai Anh', 'Hai Chau', '0905123461', '12345683'),
('KH007', 'Pham Thi Huong', 'Son Tra', '0905123462', '12345684'),
('KH008', 'Chau Trinh Tri', 'Hai Chau', '0905123463', '12345685'),
('KH009', 'Phan Nhu Thao', 'Hoa Khanh', '0905123464', '12345686'),
('KH010', 'Tran Thi To Tam', 'Son Tra', '0905123465', '12345687');

INSERT INTO ROOM (ID, MAX_PEOPLE, `STATUS`, `DESCRIPTION`) VALUES
('VIP01', 5, 'Duoc su dung', 'phong vip'),
('P02', 10, 'Duoc su dung', 'phong binh thuong'),
('P03', 15, 'Duoc su dung', 'phong binh thuong'),
('VIP04', 20, 'Duoc su dung', 'phong vip'),
('P05', 25, 'Duoc su dung', 'phong binh thuong'),
('P06', 30, 'Duoc su dung', 'phong binh thuong'),
('VIP07', 35, 'Duoc su dung', 'phong vip'),
('P08', 40, 'Duoc su dung', 'phong binh thuong'),
('VIP09', 45, 'Duoc su dung', 'phong vip');

INSERT INTO SERVICE (ID, `NAME`, UNIT_OF_MEASURE, UNIT_PRICE) VALUES
('DV01', 'Hat Dua', 'Bao', 5000),
('DV02', 'Trai cay', 'Dia', 30000),
('DV03', 'Bia', 'Lon', 35000),
('DV04', 'Nuoc Ngot', 'Chai', 10000),
('DV05', 'Ruou', 'Chai', 200000);

INSERT INTO HOUR_RATE (ID, UNIT_PRICE,`DESCRIPTION`) VALUES
('MT01', 60000, 'Ap dung tu 6 gio den 17 gio'),
('MT02', 80000, 'Ap dung sau 17 gio den 22 gio'),
('MT03', 100000, 'Ap dung tu sau 22 gio den 6 gio sang');

INSERT INTO `ORDER` (ID, CUSTOMER_ID, ROOM_ID, HOUR_RATE_ID, START_TIME, END_TIME, `STATUS`) VALUES
('HD001', 'KH001', 'VIP01', 'MT01', '2015-11-20 08:15', '2015-11-20 12:30', 'Da thanh toan'),
('HD002', 'KH002', 'P02', 'MT01', '2015-12-12 13:10', '2015-12-12 17:20', 'Chua thanh toan'),
('HD003', 'KH001', 'P02', 'MT01', '2015-10-15 12:12', '2015-10-15 16:30', 'Da thanh toan'),
('HD004', 'KH001', 'VIP01', 'MT03', '2015-09-20 18:30', '2015-09-20 21:00', 'Chua thanh toan'),
('HD005', 'KH001', 'P03', 'MT02', '2015-11-25 19:00', '2015-11-25 21:45', 'Thanh toan mot phan'),
('HD006', 'KH002', 'VIP01', 'MT01', '2014-09-12 09:14', '2014-09-12 10:45', 'Da thanh toan'),
('HD007', 'KH006', 'VIP04', 'MT02', '2014-12-22 14:00', '2014-12-22 17:30', 'Da thanh toan'),
('HD008', 'KH006', 'VIP04', 'MT03', '2015-08-23 14:30', '2015-08-23 17:15', 'Chua thanh toan'),
('HD009', 'KH006', 'P05', 'MT03', '2015-05-12 21:30', '2015-05-12 22:45', 'Chua thanh toan'),
('HD010', 'KH005', 'P06', 'MT03', '2014-12-22 15:45', '2014-12-22 20:15', 'Chua thanh toan'),
('HD011', 'KH001', 'VIP07', 'MT01', '2015-07-04 13:15', '2015-07-04 15:20', 'Da thanh toan'),
('HD012', 'KH007', 'P06', 'MT02', '2014-12-22 15:00', '2014-12-22 21:30', 'Chua thanh toan'),
('HD013', 'KH008', 'P02', 'MT01', '2014-12-14 20:15', '2014-12-14 23:20', 'Da thanh toan'),
('HD014', 'KH003', 'P08', 'MT01', '2014-06-24 11:30', '2014-06-24 14:10', 'Chua thanh toan'),
('HD015', 'KH003', 'P08', 'MT02', '2015-12-22 15:30', '2015-12-22 19:45', 'Da thanh toan'),
('HD016', 'KH010', 'P10', 'MT03', '2014-05-12 14:00', '2014-05-12 20:40', 'Da thanh toan'),
('HD017', 'KH009', 'VIP09', 'MT02', '2014-12-14 11:00', '2014-12-14 14:20', 'Da thanh toan');

INSERT INTO `ORDER` (ID, CUSTOMER_ID, ROOM_ID, HOUR_RATE_ID, START_TIME, END_TIME, `STATUS`) VALUES
 ('HD001', 'KH001', 'VIP01', 'MT01', '2015-11-20 08:15', '2015-11-20 12:30', 'Da thanh toan'),
 ('HD002', 'KH002', 'P02', 'MT01', '2015-12-12 13:10', '2015-12-12 17:20', 'Chua thanh toan'),
 ('HD003', 'KH001', 'P02', 'MT01', '2015-10-15 12:12', '2015-10-15 16:30', 'Da thanh toan'),
 ('HD004', 'KH001', 'VIP01', 'MT03', '2015-09-20 18:30', '2015-09-20 21:00', 'Chua thanh toan'),
 ('HD005', 'KH001', 'P03', 'MT02', '2015-11-25 19:00', '2015-11-25 21:45', 'Thanh toan mot phan'),
 ('HD006', 'KH002', 'VIP01', 'MT01', '2014-09-12 09:14', '2014-09-12 10:45', 'Da thanh toan'),
 ('HD007', 'KH006', 'VIP04', 'MT02', '2014-12-22 14:00', '2014-12-22 17:30', 'Da thanh toan'),
 ('HD008', 'KH006', 'VIP04', 'MT03', '2015-08-23 14:30', '2015-08-23 17:15', 'Chua thanh toan'),
 ('HD009', 'KH006', 'P05', 'MT03', '2015-05-12 21:30', '2015-05-12 22:45', 'Chua thanh toan'),
 ('HD010', 'KH005', 'P06', 'MT03', '2014-12-22 15:45', '2014-12-22 20:15', 'Chua thanh toan'),
 ('HD011', 'KH001', 'VIP07', 'MT01', '2015-07-04 13:15', '2015-07-04 15:20', 'Da thanh toan'),
 ('HD012', 'KH007', 'P06', 'MT02', '2014-12-22 15:00', '2014-12-22 21:30', 'Chua thanh toan'),
 ('HD013', 'KH008', 'P02', 'MT01', '2014-12-14 20:15', '2014-12-14 23:20', 'Da thanh toan'),
 ('HD014', 'KH003', 'P08', 'MT01', '2014-06-24 11:30', '2014-06-24 14:10', 'Chua thanh toan');
 
 INSERT INTO service_usage_detail (ORDER_ID, SERVICE_ID, AMOUNT) VALUES
('HD001', 'DV01', 5),
('HD002', 'DV01', 8),
('HD002', 'DV02', 5),
('HD002', 'DV03', 2),
('HD003', 'DV04', 1),
('HD003', 'DV05', 6),
('HD004', 'DV01', 5),
('HD005', 'DV02', 3),
('HD005', 'DV03', 10),
('HD005', 'DV04', 2),
('HD006', 'DV01', 5);

 -- QUERY 
 -- cau 3 Liệt kê các phòng karaoke được sử dụng nhiều nhất từ 02.2014 đến 02.2015
 SELECT *
   FROM room r
   JOIN `order` od
     ON r.ID = od.ROOM_ID
 WHERE MONTH(od.START_TIME) > 2 AND YEAR(od.START_TIME) IN (2014, 2015);
 
 -- Câu 4: Liệt kê 2 dịch vụ được sử dụng nhiều nhất trong mỗi tháng từ 01.2014 đến 12.2014
 SELECT sud.SERVICE_ID,
		COUNT(sud.SERVICE_ID)
   FROM service sv
   JOIN service_usage_detail sud
     ON sv.ID = sud.SERVICE_ID
   JOIN `order` od
     ON od.ID = sud.ORDER_ID
  WHERE YEAR(od.START_TIME) = 2015
  GROUP BY sud.SERVICE_ID 
  ORDER BY COUNT(sud.SERVICE_ID) DESC
  LIMIT 2;
  
-- Câu 5: Liệt kê thông tin của các phòng karaoke có mã phòng bắt đầu bằng cụm từ "VIP"
SELECT * 
  FROM room 
 WHERE ID LIKE 'vip%';