SELECT p.PRODUCT_ID, p.PRODUCT_name, SUM(o.AMOUNT)*p.price as sum
from FOOD_PRODUCT p join food_order  o on p.PRODUCT_ID = o.PRODUCT_ID
where o.produce_date between '2022-05-01' and '2022-05-31'
group by p.PRODUCT_ID, p.PRODUCT_name
order by sum desc, p.PRODUCT_ID asc