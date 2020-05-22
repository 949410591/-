SELECT * FROM employees;


SELECT last_name,department_id FROM employees WHERE department_id!=90;


SELECT last_name, salary, commission_pct FROM employees WHERE salary >10000 AND salary < 20000;

SELECT * FROM employees WHERE (department_id >=90 AND department_id <= 110) OR salary >15000;

SELECT * FROM employees WHERE last_name LIKE "%a%";
SELECT * FROM employees WHERE last_name LIKE "\_%";
SELECT * FROM employees WHERE last_name LIKE "f%" ESCAPE "a";

SELECT * FROM employees WHERE salary BETWEEN 10000 AND 11000;



SELECT * FROM employees WHERE job_id IN ("AC_ACCOUNT","AC_MGR","AD_VP");

SELECT job_id FROM employees;

SELECT * FROM employees WHERE commission IS NULL;
SELECT * FROM employees WHERE commission IS NOT NULL;


SELECT * FROM employees WHERE salary <=> NULL;


SELECT * FROM employees WHERE  salary <=> 120000;




