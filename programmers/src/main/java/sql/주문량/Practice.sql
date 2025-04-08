select sum(a.TOTAL_ORDER)
from (SELECT *
      from FIRST_HALF
      union all
      SELECT *
      from JULY) a
where
group by flavor
order by sum(a.TOTAL_ORDER)
limit 3