select t.item_id
from ITEM_INFO i join item_tree t on i.item_id = t.parent_item_id
where i.rarity = 'rare'