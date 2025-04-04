SELECT b.book_id, a.author_name, b.PUBLISHED_DATE
from   book b join author a on b.AUTHOR_ID = a.AUTHOR_ID
where b.category = '경제'
order by b.PUBLISHED_DATE asc;