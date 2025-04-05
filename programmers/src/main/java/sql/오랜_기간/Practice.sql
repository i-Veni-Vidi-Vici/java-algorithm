
SELECT i.name, i.datetime
from ANIMAL_INS i left join  ANIMAL_OUTS o on i.animal_id = o.animal_id
where o.animal_id is null and row_count(3)
order by i.DATETIME