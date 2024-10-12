-- Cách làm của em là tìm số lần sử dụng nhiều nhất, chưa chắc đã có thời gian sử dụng nhiều
-- Ví dụ ngày 18.02.2024
-- Phòng A: Dùng 2 lần 1 lần 30p
-- Phòng B: Dùng 1 lần 6 tiếng
-- Kết quả của e sẽ ra Phòng A, chưa đúng yêu cầu 100% nhưng chấp nhận: 4đ
SELECT MaPhong, COUNT(*) AS used_count FROM (
	SELECT * FROM HOADON
	WHERE ThoiGianBatDauSD >= '2014/1/1 00:00:00' -- thay thế bằng between end em hi
	AND ThoiGianKetThucSD <= '2015/2/1 00:00:00'
) AS temp_table
GROUP BY MaPhong
ORDER BY used_count DESC
LIMIT 1;