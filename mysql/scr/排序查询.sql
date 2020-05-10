select * from employees order by salary DESC;
select * from employees order by salary asc;
select * from employees where department_id>90 order by hiredate ASC;
select *,salary*12*(1+ifnull(commission_pct,0)) "年薪" from employees order by salary*12*(1+ifnull(commission_pct,0)) desc;
select *,salary*12*(1+ifnull(commission_pct,0)) 年薪 from employees order by 年薪 desc;


select length(last_name) 长度, last_name from employees ORDER BY  length(last_name)  desc;

select * from employees order by salary asc, employee_id desc;

select last_name,department_id, salary from employees order by salary desc;

select *, length(email)from employees where email like "%e%" order by length(email) desc, department_id asc;