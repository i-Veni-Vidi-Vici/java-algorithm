SELECT a.rest_id, a.rest_name, a.food_type, a.favorites, a.address,  b.review_score
from rest_info a left join (select avg(review_score) as review_score,rest_id  from rest_review group by rest_id) b on a.rest_id = b.rest_id
where address='서울'