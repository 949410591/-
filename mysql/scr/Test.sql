show databases;
use girls;
show tables;
desc admin;
show tables from myemployees;
#ahahhah 
-- fsdjflskdjflskadfjlasdf

select id from admin;
select id, `password` from admin;
select * from admin;



select 1000;
select "join";
select 12*1999;

select 1000 常数 ;

select "123"+"123",123+"A",123+null,"123"+123;
select concat("123","123");

select ifnull(null,0),ifnull(123,0),isnull(123),isnull(null),isnull(not null);

use myemployees;
select * from departments where location_id >2000;
select * from departments where location_id <2000;
select * from departments where location_id >=2000;
select * from departments where location_id <=2000;
select * from departments where location_id =2000;
select * from departments where location_id <=>2000;
select * from departments where location_id !=2000;
select * from departments where location_id <>2000;


select * from employees;
select * from employees where job_id like "%A%";
select * from employees where job_id like "%\_A%";
select * from employees where job_id like "%a_A%" escape "a";

select * from employees where salary BETWEEN 10000 and 15000;
select * from employees where salary >=10000 and salary <= 15000;

select distinct manager_id  from employees ;
select * from employees where manager_id in (100,108,121);

select * from employees where commission_pct is null;
select * from employees where commission_pct is not null;
select * from employees where manager_id = 100;
select * from employees where manager_id <=> 100;

select * from employees where manager_id >100 order by salary asc;
select * from employees where manager_id >100 order by salary desc;
select * from employees where manager_id >100 order by salary asc ,manager_id asc;


select length("123");
select length("发送大");

select 
	upper("asdfADFASDAfsadASDA"),
	lower("asdfADFASDAfsadASDA"),
	substr("asdfADFASDAfsadASDA",5),
	substr("asdfADFASDAfsadASDA",1,5),
    substr("你好我是乔峰",4);

select
	instr("123456","45"),
    instr("123456","5");
    
select
	trim("  fasdf fasdf sdfa   "),
    trim("a" from "asaadfasdfaffffasdfaaaaaa");

select 
	lpad("123",10,"...."),
    rpad("123",10,"...."),
    replace("123","2","....");
    
    
select 
	round(1.123123),
    ceil(1.123123),
    floor(1.123123),
    floor(1.0),
    truncate(1.123123,2),
    mod(1,2),
    mod(2,4);
    
select	now(),
		curdate(),
        curtime(),
        year(now()),
        month(now()),
        date(now()),
        hour(now()),
        minute(now()),
        second(now());
        
        
select
	now(),
	year("1997-2-4");
    
select
	str_to_date("1998-3-2","%Y-%m-%d");
    
select * from employees where hiredate = "1992-4-3";
select distinct hiredate from employees ;
select * from employees where hiredate = str_to_date("4-3 1992","%m-%d %"); 

select now();
select 
	last_name, 
    salary,
    salary*1.2 "new salary"
from 
	employees;
    
    
select
	last_name,
    length(last_name) name_length,
    substr(last_name,1,1) 首字符
from
	employees
ORDER BY
	首字符 asc;
    
select 
	concat(
			last_name,
            " earns ",
            salary,
            " mothly but wants ",
            salary*3,
            " dream salary ") dream_speak
from
	employees;
    
select
	distinct job_id
from 
	employees;
    
select
	distinct job_id,
    case job_id
    when "AC_ACCOUNT" then "A"
    when "AC_MGR" then "B"
    when "AD_ASST" then "C"
    else "D"
    end "grade"
from
	employees;
    
    
select 
		max(salary),
        min(salary),
        avg(salary),
        sum(salary)
from
	employees;

select 
	datediff(max(hiredate),min(hiredate))
from
	employees;
    
select
	datediff(now(),"1997-02-06")-datediff(now(),"1996-10-03");

select
	count(*) 个数
from
	employees
where
	department_id =90;
    
    
select
	max(salary) max_salary,
    max(salary) min_salary,
    avg(salary) avg_salary,
    sum(salary) avg_salary,
    job_id
from
	employees
group by
	job_id
order by
	job_id asc;


select
	max(salary) max_salary,
    min(salary) min_salary,
    max(salary)-min(salary)
from
	employees;

select
	department_id,
    count(*) num,
    avg(salary) avg_salary
from
	employees
GROUP BY
	department_id
order by
	avg_salary;




select
	max(salary) max_salary,
    min(salary) min_salary,
    avg(salary) avg_salary
from
	employees;
    
select
	employee_id,
    job_id,
    last_name
from
	employees
ORDER BY
	department_id desc,
    salary asc;

select
	job_id
from
	employees
where
	job_id like"%A%E%"
ORDER BY
	job_id;

select 
	password('123');

select
	job_id,
    location_id
from
	employees e,
    departments d
where
	e.department_id = d.department_id and
    d.department_id = 90;


select
	last_name,
    e.department_id,
    l.location_id,
    city
from
	employees e,
    departments d,
    locations l
where 
	e.department_id = d.department_id and
    e.location_id = l.location_id and
    e.commission_pct is not null;

select
	last_name,
    job_id,
    e.department_id,
    d.department_name
from
	employees e,
    locations l,
    departments d
where
	e.department_id = d.department_id and
    d.location_id = l.location_id and
    l.city = "Toronto"
;

select
	job_title,
    department_name,
    max_salary,
    min_salary
from
	employees e,
    departments d,
    jobs j
where
	e.department_id = d.department_id and
	e.job_id = j.job_id 
group by
	department_name,job_title
;

select
	country_id,
    department_name,
    count(*) num
from
	departments d,
    locations l
where
	d.location_id = l.location_id
group by
	country_id
having
	num >2
 
;

select
	e.last_name employees,
    e.employee_id Emp,
    m.last_name manager,
    m.employee_id Mgr
from
	employees e,
    employees m
where
	e.manager_id = m.employee_id
;
    

	