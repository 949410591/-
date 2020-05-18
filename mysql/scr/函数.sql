SET @@global.log_bin_trust_function_creators = 1;


DROP FUNCTION IF EXISTS a;
DELIMITER $
CREATE FUNCTION a() RETURNS INT
BEGIN
	DECLARE a INT ;
	SELECT 
	COUNT(1) INTO a FROM beauty;
	RETURN a;
END $
DELIMITER ;
SELECT a();


USE myemployees;
DROP FUNCTION IF EXISTS b;
DELIMITER $
CREATE FUNCTION b(ename VARCHAR(10)) RETURNS INT
BEGIN

	DECLARE resualt INT;
	SELECT salary INTO resualt FROM employees e
	WHERE e.last_name = ename
	LIMIT 1;
	RETURN resualt;
END $

DELIMITER ;

SELECT @ename;
SELECT last_name INTO @ename FROM employees LIMIT 1;
SELECT b(@ename);


SELECT * FROM employees e
WHERE e.`last_name` = "K_ing";

DROP FUNCTION IF EXISTS c;
DELIMITER $
CREATE FUNCTION c( dname VARCHAR(10)) RETURNS INT
BEGIN
	DECLARE ag INT ;
	SELECT  AVG(salary) INTO ag
	FROM employees e
	JOIN departments d
	ON e.department_id = d.department_id
	WHERE d.`department_name` = dname;
	RETURN ag;
	
	
END $
DELIMITER ;
SELECT @dname;
SELECT department_name INTO @dname FROM departments LIMIT 1;
SELECT c(@dname);

DROP FUNCTION IF EXISTS d;
DELIMITER $
CREATE FUNCTION d(num1 FLOAT,num2 FLOAT) RETURNS FLOAT
BEGIN
	RETURN num1 + num2;
	
	
END $
DELIMITER ;

SELECT d(1.2,1.4);





