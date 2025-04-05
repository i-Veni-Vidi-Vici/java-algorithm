-- 코드를 입력하세요
SELECT  car_id, if(car_id = select car_id from AR_RENTAL_COMPANY_RENTAL_HISTORY where START_DATE <='2022-10-16' and end_date>='2022-10-16', '대여가능') as AVAILABILITY
from CAR_RENTAL_COMPANY_RENTAL_HISTORY
