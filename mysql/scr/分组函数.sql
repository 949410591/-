select sum(salary) from employees;
select avg(salary) from employees;
select max(salary) from employees;
select min(salary) from employees;
select count(salary) from employees;


select 
		sum(salary),
		round(avg(salary),4),
        max(salary),
        count(salary)
from
	employees;
    
    
select
	sum(commission_pct),
    avg(commission_pct),
    max(commission_pct),
    min(commission_pct),
    count(commission_pct)
    

from
	employees;
    
select
	sum(salary),
    sum(distinct salary)
from
	employees;
    
select count(salary),count(*),count(1)from employees;



select 
		max(salary),
        min(salary),
        avg(salary),
        sum(salary)
from
	employees;


    