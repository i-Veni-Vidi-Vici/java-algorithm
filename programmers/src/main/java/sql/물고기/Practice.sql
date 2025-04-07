select f.id as id,  n.fish_name as fish_name,  max(f.length) as length
from FISH_INFO f join FISH_NAME_INFO n on f.FISH_TYPE = n.FISH_TYPE
group by fish_name
order by id asc