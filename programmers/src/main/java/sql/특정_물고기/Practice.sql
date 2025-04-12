select  count(*) as FISH_COUNT
from    fish_info i join FISH_NAME_INFO n on i.fish_type = n.fish_type
where n.fish_name ='bass' or n.fish_name = 'snapper'