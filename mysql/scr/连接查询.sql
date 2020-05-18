
-- sql92
use girls;
select *
from
	beauty,
    boys
    
where
	beauty.boyfriend_id = boys.id
;

use myemployees;
select 
	*
from
	employees e,
    jobs j
where
	e.job_id = j.job_id
;

select
	last_name,
    e.department_id,
    commission_pct
from
	employees e,
    departments d
where
	e.department_id = d.department_id and 
    e.commission_pct is not null;
    
select
	department_name,
    city
from
	departments d,
    locations l
where
	d.location_id = l.location_id and
    l.city like "%o%"
;

select
	city,
    count(*) 个数
from
	departments d,
	locations l
where
	d.location_id=l.location_id
GROUP BY
	l.city
;

select
	department_name,
    d.manager_id,
    min(salary)
from
	departments d,
    employees e
where
	d.department_id = e.department_id and
    commission_pct is not null
GROUP BY
	department_name
;

select
	job_title,
    count(*) num
from
	jobs j,
    employees e
where
	j.job_id = e.job_id
group by
	job_title;


select
	last_name,
    department_name,
    city
-- 	count(*)
from
	employees e,
    departments d,
    locations l
where
	e.department_id = d.department_id and
    d.location_id = l.location_id;
    
select
	salary,grade_level
from
	employees e,
    job_grades g
where
	salary BETWEEN g.lowest_sal and g.highest_sal;

select
	e1.last_name,
    e2.last_name
from
	employees e1,
    employees e2
where
	e1.manager_id = e2.employee_id;

 
--  sql99
--  内连接


-- 	等值连接
select 
	last_name,
    department_name
from 
	employees e 
    inner JOIN
		departments d 
    on 	
		e.department_id = d.department_id
;

select last_name,job_title
from employees e
inner join jobs j
on e.job_id = j.job_id
where last_name like "%e%";

select city,count(*) dnum
from departments d
inner join locations l
on d.location_id = l.location_id
GROUP BY city
having dnum > 3
;

select count(*) e_num, department_name
from employees e 
inner join departments d
on e.department_id = d.department_id
group by department_name
HAVING e_num >3
order by e_num desc;

select last_name,department_name,job_title
from employees e 
inner join departments d 
on e.department_id = d.department_id
inner join jobs j
on e.job_id = j.job_id
order by department_name desc;

-- 非等值连接
SELECT first_name,last_name, grade_level
from employees e 
join job_grades jg on e.salary BETWEEN jg.lowest_sal and jg.highest_sal
;

SELECT count(*) num , grade_level
from employees e 
join job_grades jg on e.salary BETWEEN jg.lowest_sal and jg.highest_sal
group by grade_level
HAVING num > 20
order by num desc;

-- 自连接
select e.last_name,m.last_name
from employees e
join employees m on e.manager_id = m.employee_id
where e.last_name like "%k%"
;

-- sql99 外连接
-- 左外连接
use girls;
select g.name, boyName
from beauty g
left join boys b on g.boyfriend_id = b.id
where b.id is  null;

select g.name, boyName
from  boys b
left join beauty g on g.boyfriend_id = b.id
;
select *
from  boys;

select *
from beauty;
-- 右外连接
select g.name, boyName
from boys b
right join beauty g on g.boyfriend_id = b.id
where b.id is  null;

use myemployees;
select department_name,count(*) num
from departments d 
left join employees e on d.department_id = e.department_id
where e.employee_id is  null
group by department_name 

;

-- 交叉连接
use girls;
select g.*, b.*
from beauty g
CROSS join boys b;



 