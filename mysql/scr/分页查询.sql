select *
from employees
LIMIT 10;

select *
from employees
LIMIT 1,10;

select * 
from employees e
where e.commission_pct is not null
ORDER BY e.salary desc
LIMIT 10;

