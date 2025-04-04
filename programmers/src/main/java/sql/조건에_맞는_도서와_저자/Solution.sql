
SELECT
    b.book_id,
    a.author_name,
    DATE_FORMAT(b.PUBLISHED_DATE, '%Y-%m-%d') AS PUBLISHED_DATE
FROM book b
         JOIN author a ON b.AUTHOR_ID = a.AUTHOR_ID
WHERE b.category = '경제'
ORDER BY b.PUBLISHED_DATE ASC;