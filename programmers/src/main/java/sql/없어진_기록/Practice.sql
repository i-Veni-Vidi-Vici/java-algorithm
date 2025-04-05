SELECT o.ANIMAL_ID, o.name
from ANIMAL_INS i right join animal_outs o on i.ANIMAL_ID = o.ANIMAL_ID
where i.ANIMAL_ID is null
order by o.ANIMAL_ID asc