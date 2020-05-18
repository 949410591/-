SHOW VARIABLES;
SHOW VARIABLES LIKE "%admin%";
SELECT @@global.autocommit;
SELECT @@session.autocommit;
SELECT @@transaction_isolation;

SHOW VARIABLES LIKE "%isolation%";

SET GLOBAL autocommit = 0;

SET GLOBAL autocommit = 1;

SET @@global.autocommit = 0;

SET @@global.autocommit = 1;

SHOW SESSION VARIABLES;
SHOW VARIABLES;

SHOW VARIABLES LIKE "%char%";
SHOW SESSION VARIABLES LIKE "%char%";

SELECT @@session.transaction_isolation;
SELECT @@transaction_isolation;


SET @@session.transaction_isolation = 0;
SET @@session.transaction_isolation = 2;

SET SESSION transaction_isolation = 0;
SET transaction_isolation = 1;
SELECT @@global.transaction_isolation;
SET @@global.transaction_isolation = 2;



SET @a = 1;
SET @a:=2;
SELECT @a := 3;
SELECT @a;


SELECT COUNT(*) INTO @a FROM employees
WHERE department_id  = 20
GROUP BY department_id 
;





SET @m =1;
SET @n = 2;
SET @sum = @m + @n;
SELECT @m,@n,@sum;



DECLARE m INT DEFAULT 1;
DECLARE n INT DEFAULT 2;
DECLARE sum1 INT;
SET sum1 = m+n;
SELECT m,n,suml;




