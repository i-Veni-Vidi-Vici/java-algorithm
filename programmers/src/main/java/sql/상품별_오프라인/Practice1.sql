select p.PRODUCT_CODe as PRODUCT_CODe, p.price*b.sum as sales
from product p join (SELECT 	PRODUCT_ID, sum(SALES_AMOUNT) as sum
                     from OFFLINE_SALE
                     group by  PRODUCT_ID) b on p.product_id = b.product_id
order by sales dec, PRODUCT_CODe asc
