SELECT user_id, PRODUCT_ID
from ONLINE_SALE

group by user_id, PRODUCT_ID
having count(user_id)>= 2
order by user_id, PRODUCT_ID desc
