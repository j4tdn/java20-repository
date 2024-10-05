SELECT MaPhong, COUNT(*) AS SoLanSuDung
FROM HOADON
WHERE ThoiGianBatDauSD BETWEEN '2014-02-01' AND '2015-02-28'
GROUP BY MaPhong
ORDER BY SoLanSuDung DESC;

WITH MonthlyUsage AS (
    SELECT 
        MaDV,
        MONTH(ThoiGianBatDauSD) AS Thang,
        YEAR(ThoiGianBatDauSD) AS Nam,
        SUM(SoLuong) AS TongSoLuong
    FROM CHITIET_SUDUNGDV
    JOIN HOADON ON CHITIET_SUDUNGDV.MaHD = HOADON.MaHD
    WHERE ThoiGianBatDauSD BETWEEN '2014-01-01' AND '2014-12-31'
    GROUP BY MaDV, Thang, Nam
),
RankedUsage AS (
    SELECT 
        MaDV, 
        Thang, 
        Nam, 
        TongSoLuong,
        ROW_NUMBER() OVER (PARTITION BY Thang, Nam ORDER BY TongSoLuong DESC) AS RowNum
    FROM MonthlyUsage
)
SELECT MaDV, Thang, Nam, TongSoLuong
FROM RankedUsage
WHERE RowNum <= 2
ORDER BY Nam, Thang, RowNum;

SELECT *
FROM PHONG
WHERE MaPhong LIKE 'VIP%';