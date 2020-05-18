CREATE VIEW a
AS 
SELECT * FROM myemployees.employees;

SELECT * FROM a;


CREATE VIEW b
AS
SELECT *
FROM employees
WHERE email LIKE "%a%";

SELECT * FROM b;


DROP VIEW IF EXISTS c;

CREATE VIEW c
AS
SELECT AVG(salary),d.department_id
FROM employees e
JOIN departments d
ON e.department_id = d.department_id
GROUP BY d.department_id;
;

SELECT * FROM c;

DROP VIEW IF EXISTS d;
CREATE VIEW d
AS
SELECT AVG(salary) ag,d.*
FROM employees e
JOIN departments d
ON e.department_id = d.department_id
GROUP BY d.department_id
ORDER BY ag 
LIMIT 1
;

SELECT * FROM d



DROP VIEW IF EXISTS e;
CREATE VIEW e
AS
SELECT AVG(salary) ag,d.`department_name`
FROM employees e
JOIN departments d
ON e.department_id = d.department_id
GROUP BY d.department_id
ORDER BY ag 
LIMIT 1;
SELECT * FROM e;



CREATE OR REPLACE VIEW e
AS
SELECT * FROM employees;


ALTER VIEW e
AS
SELECT * FROM departments;


DROP VIEW b,c,d,e;

DESC e;

SHOW CREATE VIEW e;

SHOW CREATE TABLE employees;



create or replace view emp_v1
as
select * 
from employees e
where phone_number like "011%";
select * from emp_v1;

create or replace view a
as
select department_id,max(salary) m
from employees
group by department_id
having m >12000
;

create or replace view emp_v2
as
select d.*,a.m
from departments d
join a
on a.department_id = d.`department_id`

	

;

select * from emp_v2;




create or replace view a
as

select last_name,email
from employees;

select * from employees;
select * from a;
insert into a set last_name = "张飞",email = "qq.com";
update a set last_name = "张无忌" where last_name = "张飞";
delete from a where last_name = "张无忌";