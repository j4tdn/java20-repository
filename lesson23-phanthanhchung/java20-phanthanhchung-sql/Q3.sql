SELECT MaPhong, COUNT(*) AS used_count FROM (
	SELECT * FROM HOADON
	WHERE ThoiGianBatDauSD >= '2014/1/1 00:00:00' 
	AND ThoiGianKetThucSD <= '2015/2/1 00:00:00'
) AS temp_table
GROUP BY MaPhong
ORDER BY used_count DESC
LIMIT 1;