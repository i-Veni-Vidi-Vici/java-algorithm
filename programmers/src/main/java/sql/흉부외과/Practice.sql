
SELECT DR_NAME, DR_ID, MCDP_CD, HIRE_YMD
from DOCTOR
where  MCDP_CD = 'cs' or  MCDP_CD ='gs'
order by HIRE_YMD desc, dr_name asc