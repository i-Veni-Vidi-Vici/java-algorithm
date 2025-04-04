select month(START_DATE), car_id, records
from CAR_RENTAL_COMPANY_RENTAL_HISTORY
where car_id in (SELECT count(*)
                 from
                     where start_date>='2022-08-01' and end_date<'2022-11-01'
                 group by car_id) >=5

