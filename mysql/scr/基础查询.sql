
USE myemployees;

-- 基础查询


-- 单个
SELECT last_name FROM employees;


-- 多个

SELECT last_name,salary,email FROM employees;

-- 全部
SELECT * FROM employees;



-- 查询常量
SELECT 1000;
SELECT 'join';



-- 查询表达式
SELECT 12*100;


-- 查询函数
SELECT VERSION();
SELECT VERSION() AS 结果;

SELECT VERSION() 结果;


-- 别名
SELECT salary AS "out put" FROM employees;


-- 去重
SELECT DISTINCT department_id FROM employees;


SELECT last_name+first_name AS 姓名 FROM employees;

SELECT 100+"B123";

SELECT 1+1,2+"123",2+"ASD",3+"123B",+4+"DS123";

SELECT NULL + 123;


SELECT CONCAT("12312312","12312gffgsdfg");