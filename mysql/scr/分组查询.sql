select avg(salary),department_id,count(*)from employees group by department_id;


select max(salary),min(salary),avg(salary),department_id,count(*)from employees group by department_id;


select
	location_id,
    count(*)
from
	departments
group by
	location_id;
    
select 
	avg(salary),
    department_id
from 
	employees
where
	email like "%a%"
GROUP BY
	department_id;

select
	max(salary),
	manager_id
from
	employees
group by
	manager_id;
    
    
select
	department_id,
    count(*) as num
from
	employees
where
	ifnull(department_id,false)
GROUP BY
	department_id;
    

select
	department_id,
	count(*) num
from
	employees

GROUP BY
	department_id
having
	count(*)>2;

select
	job_id 
from
	employees
where
	commission_pct is not null;

select
	job_id,
    max(salary) max_salary
from
	employees
where
	commission_pct is not null
group by
	job_id
having
	max_salary >12000;
    
    
select
	manager_id,
    min(salary) min_salary
from
	employees
where
	manager_id > 102
group by
	manager_id
having
	min_salary >5000;
	
	

	