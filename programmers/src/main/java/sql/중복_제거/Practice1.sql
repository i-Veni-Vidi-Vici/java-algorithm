SELECT count(*)
from ANIMAL_INS
where name in (select distinct name from animal_ins where name is not null)