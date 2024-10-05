-- Câu 3: Liệt kê các phòng karaoke được sử dụng nhiều nhất từ 01.01.2024 -> 12.12.2025
SELECT phong.MaPhong, Phong.MoTa, COUNT(hoadon.MaPhong) AS SoLanSuDung 
  FROM phong
  JOIN hoadon 
    ON phong.MaPhong = hoadon.MaPhong
 WHERE hoadon.ThoiGianBatDauSD >= '2024-01-01' 
   AND hoadon.ThoiGianKetThucSD <= '2025-12-12'
 GROUP BY hoadon.MaPhong;
 
 SELECT * FROM hoadon;

SELECT * FROM HoaDon;
-- Câu 4: Liệt kê 2 dịch vụ được sử dụng nhiều nhất trong mỗi tháng từ 01.2024 đến 12.2025
SELECT 
		dv.MaDV,
		dv.TenDV,
		MONTH(hd.ThoiGianBatDauSD) AS Thang,
		YEAR(hd.ThoiGianBatDauSD) AS Nam,
		SUM(ct.SoLuong) AS TongSoLuong
 FROM hoadon hd
 JOIN chitiet_sudungdv ct 
   ON hd.MaHD = ct.MaHD
 JOIN dichvu dv 
   ON ct.MaDV = dv.MaDV
WHERE hd.ThoiGianBatDauSD >= '2024-01-01' 
  AND hd.ThoiGianKetThucSD <= '2025-12-12'
GROUP BY  dv.MaDV, dv.TenDV, Thang, Nam
ORDER BY TongSoLuong DESC
LIMIT 2;

-- Câu 5: Liệt kê thông tin của các phòng karaoke có mã phòng bắt đầu bằng cụm từ "VIP"
SELECT * FROM phong 
WHERE MaPhong LIKE 'VIP%';