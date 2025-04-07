SELECT PT_NAME,pt_no, GEND_CD, AGE, case when TLNO is null then 'NONE' else TLNO end as tlno
from PATIENT
where AGE <=12 and gend_cd = 'W'
order by age desc, pt_name asc