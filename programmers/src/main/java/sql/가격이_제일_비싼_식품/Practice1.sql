SELECT product_id, product_name, product_cd, category, price
from food_product
where price in (select Max(price) from food_product)