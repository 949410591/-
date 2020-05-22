SELECT DISTINCT department_id FROM employees;

SELECT 1+1,2+"123",2+"ASD",3+"123B",+4+"DS123";




SELECT CONCAT("abc","def");

SELECT IFNULL(1,1), ISNULL(1);




SELECT COUNT(*) FROM employees WHERE employee_id >150;

SELECT  COUNT(*) FROM employees WHERE employee_id = 150;
SELECT COUNT(*) FROM employees WHERE employee_id <=>150;

SELECT  COUNT(*) FROM employees WHERE employee_id <>150;
SELECT  COUNT(*) FROM employees WHERE employee_id !=150;

SELECT COUNT(*) FROM employees WHERE last_name LIKE "_A%";
SELECT COUNT(*) FROM employees WHERE last_name LIKE "%A%";
SELECT COUNT(*) FROM employees WHERE last_name LIKE "A%";

SELECT COUNT(*) FROM employees WHERE employee_id BETWEEN 100 AND 150;
SELECT COUNT(*) FROM employees WHERE employee_id >= 100 AND employee_id <=150;

SELECT COUNT(*) FROM employees WHERE department_id IS NULL;
SELECT COUNT(*) FROM employees WHERE department_id IS NOT NULL;


SELECT * FROM employees WHERE department_id IS NOT NULL ORDER BY employee_id DESC;

SELECT * FROM employees WHERE department_id IS NOT NULL ORDER BY employee_id;

SELECT * FROM employees WHERE department_id IS NOT NULL ORDER BY employee_id ASC;



SELECT LENGTH("123"),CONCAT("123","456"),UPPER("ABCd"),LOWER("asdDD");

SELECT SUBSTR("123456",1,3),INSTR("123456","123"),TRIM("  asdfsd  sadf as  ");

SELECT TRIM("a" FROM "aaa   aa  aaa   "),LPAD("123",10,"."),RPAD("123",10,".");

SELECT REPLACE("123456","6","7");

SELECT ROUND(123.123,2),ROUND(123.125,2),CEIL(1.12),CEIL(1),FLOOR(1.12),FLOOR(1);

SELECT TRUNCATE(123.412,2),TRUNCATE(123.415,2),MOD(10,9),RAND(),RAND(10);


SELECT NOW(),CURDATE(),CURTIME(),YEAR(NOW()),MONTH(NOW()),DAY(NOW()),MINUTE(NOW()),SECOND(NOW()),MONTHNAME(NOW());

SELECT STR_TO_DATE("19970206","%Y%m%d");
SELECT DATE_FORMAT(NOW(),"%Y,%m,%d");

SELECT DATEDIFF(NOW(),STR_TO_DATE("19970206","%Y%m%d"));

SELECT VERSION(), DATABASE(),USER();


SELECT IF(1>0,1,0);


SELECT SUM(employee_id ) FROM employees;
SELECT COUNT(*) FROM employees;
SELECT MAX(salary) FROM employees;
SELECT MIN(salary) FROM employees;
SELECT AVG(salary) FROM employees;


SELECT SUM(salary),department_id FROM employees GROUP BY department_id;





SELECT last_name,salary,department_name
FROM departments d
INNER JOIN employees e
ON e.`department_id` = d.`department_id`;


SELECT AVG(salary) asalary,department_name
FROM departments d
INNER JOIN employees e
ON e.`department_id` = d.`department_id`
WHERE e.manager_id IS NULL
GROUP BY e.`department_id`
HAVING asalary >10000;


SELECT AVG(salary) asalary,department_name
FROM departments d
RIGHT JOIN employees e
ON e.`department_id` = d.`department_id`
WHERE e.manager_id IS NULL
GROUP BY e.`department_id`
HAVING asalary >10000;

SELECT AVG(salary) asalary,department_name
FROM departments d
LEFT JOIN employees e
ON e.`department_id` = d.`department_id`
WHERE e.manager_id IS NULL
GROUP BY e.`department_id`
HAVING asalary >10000;

SELECT COUNT(*) FROM employees;
SELECT COUNT(*) FROM departments;

SELECT COUNT(*) FROM employees
CROSS JOIN departments;

SELECT 107*27;



SELECT (SELECT salary FROM employees WHERE employee_id = 100);

SELECT * FROM  (SELECT salary FROM employees) AS e;


SELECT *
FROM employees e
WHERE e.`department_id` IN (
	SELECT department_id FROM departments
	WHERE department_id >50
);

SELECT AVG(salary)
FROM employees e
GROUP BY department_id
HAVING e.`department_id` IN (
	SELECT department_id FROM departments
	WHERE department_id >50
);


SELECT EXISTS(SELECT * FROM employees);




SELECT * FROM employees LIMIT 10;
SELECT * FROM employees LIMIT 0,20;
SELECT * FROM employees LIMIT 20,20;



SELECT department_id FROM employees 
UNION ALL
SELECT department_id FROM departments;



USE test;

DROP TABLE IF EXISTS test;

CREATE TABLE test(
	a INT NULL,
	b INT

);

DESC test;


INSERT INTO test(a,b) VALUES(1,1);
INSERT INTO test(b) VALUES(1);
INSERT INTO test VALUES(1,1);

INSERT INTO test VALUES(2,2),(3,3);


INSERT INTO test
SET a= 1;

INSERT INTO test
SET a=1,b=1;

SELECT * FROM test;



DROP TABLE IF EXISTS test;

CREATE TABLE test(
	a INT NULL,
	b INT

);




DESC test;


INSERT INTO test VALUES(1,1),(2,2),(3,3);

SELECT * FROM test;


UPDATE test t
SET a = NULL
WHERE t.b = 2;

SELECT * FROM test;

UPDATE test t
SET a = NULL,
b = NULL
WHERE b != 3;

SELECT * FROM test;








DROP TABLE IF EXISTS test1;
DROP TABLE IF EXISTS test2;
CREATE TABLE test1(
	a INT NULL,
	b INT

);

CREATE TABLE test2(
	a INT NULL,
	b INT

);


INSERT INTO test1 VALUES(1,1),(2,2),(3,3);
INSERT INTO test2 VALUES(1,1),(2,2),(3,3);

SELECT * FROM test1
UNION ALL
SELECT * FROM test2;

UPDATE test1 t1 
JOIN test2 t2
ON t1.a = t2.a
SET t1.a = NULL
WHERE t1.b >2;


SELECT * FROM test1
UNION ALL
SELECT * FROM test2;











DROP TABLE IF EXISTS test;

CREATE TABLE test(
	a INT NULL,
	b INT

);




DESC test;


INSERT INTO test VALUES(1,1),(2,2),(3,3);

SELECT * FROM test;


DELETE FROM test t WHERE t.b = 3;
SELECT *FROM test; 



DELETE FROM test;
SELECT * FROM test;

INSERT INTO test VALUES(1,1),(2,2),(3,3);
SELECT * FROM test;

TRUNCATE TABLE test;
SELECT * FROM test;






DROP TABLE IF EXISTS test1;
DROP TABLE IF EXISTS test2;
CREATE TABLE test1(
	a INT NULL,
	b INT

);

CREATE TABLE test2(
	a INT NULL,
	b INT

);


INSERT INTO test1 VALUES(1,1),(2,2),(3,3);
INSERT INTO test2 VALUES(1,1),(2,2),(3,3);

SELECT * FROM test1
UNION ALL
SELECT * FROM test2;



DELETE t1,t2
FROM test1 t1
JOIN test2 t2
ON t1.a = t2.`a`
WHERE t1.a = 2;


SELECT * FROM test1
UNION ALL
SELECT * FROM test2;









DROP DATABASE IF EXISTS test;
CREATE DATABASE IF NOT EXISTS test;
SHOW DATABASES;

DROP TABLE IF EXISTS test;
CREATE TABLE test(
	a INT,
	b INT
);
DESC test;
SHOW TABLES;
SHOW TABLES FROM myemployees;

CREATE TABLE c1 LIKE test;
DESC test;
DESC c1;
DROP TABLE IF EXISTS c1;

INSERT INTO test VALUES(1,1),(2,2),(3,3);

CREATE TABLE c1
SELECT * FROM test;

SELECT * FROM c1;


DROP TABLE IF EXISTS c1;
CREATE TABLE c1
SELECT b FROM test 
WHERE b IS NULL;
DESC c1;
DROP TABLE IF EXISTS c1;






DROP TABLE IF EXISTS test;
CREATE TABLE test(
	a INT,
	b VARCHAR(20),
	c FLOAT(10,5),
	d TIMESTAMP,
	e ENUM("A","B"),
	f SET("A","B","C")
);

INSERT INTO test VALUES(1,"1",1,NOW(),"b","A,B,c");
SELECT * FROM test;


ALTER TABLE test ADD COLUMN g INT;
ALTER TABLE test DROP COLUMN g ;
ALTER TABLE test MODIFY a VARCHAR(20);
ALTER TABLE test RENAME TO test1;
DESC test1;
ALTER TABLE test1 RENAME TO test;
DESC test;
ALTER TABLE test CHANGE COLUMN a arename INT;
DESC test;
ALTER TABLE test CHANGE COLUMN arename a INT;








DROP TABLE IF EXISTS ptest;

CREATE TABLE ptest(
	a INT PRIMARY KEY
);

DROP TABLE IF EXISTS test;

CREATE TABLE test(
	a INT PRIMARY KEY,
	b INT UNIQUE,
	c INT DEFAULT 1,
	d INT NULL,
	e INT NOT NULL,
	FOREIGN KEY(b) REFERENCES ptest(a)

);

DROP TABLE IF EXISTS test;

CREATE TABLE test(
	a INT ,
	b INT ,
	c INT ,
	d INT,
	e INT 

);


ALTER TABLE test MODIFY COLUMN a INT PRIMARY KEY;

ALTER TABLE test MODIFY COLUMN b INT UNIQUE;

ALTER TABLE test MODIFY COLUMN c INT DEFAULT 1;

ALTER TABLE test MODIFY COLUMN d INT NULL;

ALTER TABLE test MODIFY COLUMN e INT NOT NULL;


ALTER TABLE test ADD  FOREIGN KEY(d) REFERENCES ptest(a);


DESC test;

SHOW INDEX FROM test;



ALTER TABLE test MODIFY COLUMN c INT;
ALTER TABLE test MODIFY COLUMN d INT;
ALTER TABLE test MODIFY COLUMN e INT;



ALTER TABLE test DROP PRIMARY KEY;
ALTER TABLE test DROP INDEX b;
ALTER TABLE test DROP FOREIGN KEY test_ibfk_1;


SHOW CREATE TABLE test;

DESC test;




DROP TABLE IF EXISTS test;


DROP TABLE IF EXISTS ptest;



CREATE TABLE test(
	a INT UNIQUE AUTO_INCREMENT

);


DROP TABLE IF EXISTS test;

CREATE TABLE test(
	a INT PRIMARY KEY AUTO_INCREMENT


);




SHOW VARIABLES LIKE "%increment%";










DROP PROCEDURE IF EXISTS test;

DELIMITER $
CREATE PROCEDURE test()
BEGIN
	SELECT * FROM myemployees.`employees`;
END $
DELIMITER ;
CALL test();





SHOW VARIABLES LIKE "autocommit";
SET @@autocommit = 1;



DROP TABLE IF EXISTS test;
CREATE TABLE test(
	a INT
);

TRUNCATE TABLE test;

START TRANSACTION;
	SAVEPOINT A;
	INSERT INTO test VALUES(1);
	SELECT * FROM test;
ROLLBACK;
ROLLBACK TO A;
COMMIT;







DROP VIEW IF EXISTS v1;

CREATE VIEW v1
AS 
SELECT * FROM myemployees.`employees` LIMIT 1;

SELECT * FROM v1;

DESC v1;

SHOW CREATE VIEW v1;



CREATE OR REPLACE VIEW vi
AS

SELECT * FROM myemployees.`employees` LIMIT 2;


SELECT * FROM v1;


ALTER VIEW v1 AS

SELECT * FROM myemployees.`employees` LIMIT 3;

SELECT * FROM v1;






SHOW VARIABLES;

SHOW VARIABLES LIKE "%char%";

SHOW GLOBAL VARIABLES;
SHOW SESSION VARIABLES;


SELECT @@autocommit;
SELECT @@session.autocommit;
SELECT @@global.autocommit;





SET autocommit = 0;
SET SESSION autocommit = 1;

SET GLOBAL autocommit = 0;
SET GLOBAL autocommit =1;

SET @@session.autocommit =0;
SET @@autocommit = 1;

SET GLOBAL autocommit =0;
SET GLOBAL autocommit = 1;




SELECT @a;
SELECT @a = 1;
SELECT @a := 2;




DROP PROCEDURE IF EXISTS test;

DELIMITER $
CREATE PROCEDURE test(IN num INT)
BEGIN
	SELECT * FROM myemployees.`employees` LIMIT num;
END $
DELIMITER ;
CALL test(@a);

SELECT @a;

DROP PROCEDURE IF EXISTS test;
DELIMITER $
CREATE PROCEDURE test( OUT num INT)
BEGIN
	SET num = 3;
END $
DELIMITER ;
CALL test(@a);

SELECT @a;




DROP PROCEDURE IF EXISTS test;
DELIMITER $
CREATE PROCEDURE test( INOUT num INT)
BEGIN
	SELECT * FROM myemployees.`employees` LIMIT num;
	SET num = 3;
END $
DELIMITER ;
CALL test(@a);

SELECT @a;







DROP PROCEDURE IF EXISTS test;
DELIMITER $
CREATE PROCEDURE test()
BEGIN
	DECLARE num INT DEFAULT 1;
	SET num = 2;
	SELECT * FROM myemployees.`employees` LIMIT num;
	
END $
DELIMITER ;
CALL test();




SHOW VARIABLES LIKE "%function%";
SET @@global.log_bin_trust_function_creators = 1;
DROP FUNCTION IF EXISTS test;
DELIMITER $

CREATE FUNCTION test() RETURNS INT
BEGIN
	DECLARE num INT DEFAULT 1;
	WHILE num >0 DO
		SET num = num -1;
		
	
	END WHILE;
	RETURN 1;
END $
DELIMITER ;
SELECT test();
















