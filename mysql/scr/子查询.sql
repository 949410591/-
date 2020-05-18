
-- 标量子查询
use myemployees;
select salary 
from employees 
where last_name like "Abel";


-- where\having 后面的子查询
select *
from employees
where salary > (
	select salary 
	from employees 
	where last_name like "Abel"
);

select last_name,job_id,salary
from employees
where job_id = (
	select job_id
    from employees
    where employee_id = 141
) 
and salary >(
	select salary
    from employees
    where employee_id = 143

);

select min(salary)
from employees;

select last_name, job_id, salary
from employees
where salary = (
	select min(salary)
	from employees
);

select min(salary)
from employees
where department_id = 50;

select department_id,min(salary) salary
from employees
group by department_id
having salary >(
	select min(salary)
	from employees
	where department_id = 50
);

-- 非法使用标量子查询
-- select department_id,min(salary) salary
-- from employees
-- group by department_id
-- having salary >(
-- 	select salary
-- 	from employees
-- 	where department_id = 50
-- );

-- select department_id,min(salary) salary
-- from employees
-- group by department_id
-- having salary >(
-- 	select salary
-- 	from employees
-- 	where department_id = 250
-- );


-- 列子查询（多行子查询）

select distinct department_id
from departments
where location_id in (1400,1700);

select last_name,department_id
from employees
where department_id in(
	select distinct department_id
	from departments
	where location_id in (1400,1700)
);
 
 
 select distinct salary
 from employees
 where job_id like "IT_PROG";
 
 select employee_id, last_name, job_id, salary
 from employees
 where salary < any (
	 select distinct salary
	 from employees
	 where job_id like "IT_PROG"
 ) and job_id <>"IT_PROG" ;
 
select employee_id, last_name, job_id, salary
 from employees
 where salary <  (
	 select max(salary)
	 from employees
	 where job_id like "IT_PROG"
 ) and job_id <>"IT_PROG" ;
 
 
 
 select employee_id, last_name, job_id, salary
 from employees
 where salary <  (
	 select min(salary)
	 from employees
	 where job_id like "IT_PROG"
 ) and job_id <>"IT_PROG" ;
 
 
-- 行子查询（一行多列或多行多列）
select min(employee_id),max(salary)
from employees;

select *
from employees
where (employee_id,salary) = (
	select min(employee_id),max(salary)
    from employees
);

-- select后面

select department_name, (
	select count(*)
    from employees e
    where d.department_id = e.department_id
) num 
from departments d
;

-- 分组查询这样写
select count(*) num,department_id
from employees
where department_id is not null
group by department_id;





select (
	select department_name
    from departments d 
    where e.department_id = d.department_id
    
)
from employees e
where employee_id = 102;


-- from 后面

select avg(salary),department_id
from employees
group by department_id;

select * from job_grades;

select avg_dep.* ,jg.grade_level
from (select avg(salary) avg_salary,department_id
	from employees
	group by department_id
    ) avg_dep
join job_grades jg
on avg_dep.avg_salary between jg.lowest_sal and highest_sal;


-- exists

select exists(
	select employee_id 
    from employees
    where salary = 300000000
);

select exists(
	select employee_id 
    from employees
    where salary = 3000
);


select department_name
from departments d
where exists(
	select *
    from employees e
    where d.department_id = e.department_id
);


-- 用in写

select department_name
from departments d
where department_id in (
	select department_id
    from employees
);








