SELECT BOOK_ID, date_format(PUBLISHED_DATE, '%Y-%m-%d')
from book
where year(PUBLISHED_DATE) = 2021 and CATEGORY = '인문'
order by PUBLISHED_DATE asc