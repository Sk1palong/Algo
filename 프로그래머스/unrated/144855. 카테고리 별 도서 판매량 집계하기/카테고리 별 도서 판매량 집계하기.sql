SELECT CATEGORY, SUM(SALES) FROM BOOK B
INNER JOIN BOOK_SALES BS
ON B.BOOK_ID = BS.BOOK_ID
WHERE BS.SALES_DATE LIKE ('%2022-01-%')
GROUP BY CATEGORY
ORDER BY CATEGORY