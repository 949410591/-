select * from employees where email like "%a%" or department_id > 90;
select * from employees where email like "%a%"
union
select * from employees where department_id > 90;

select * from employees where email like "%a%"
union all
select * from employees where department_id > 90;