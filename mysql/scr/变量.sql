-- 系统变量
-- 查
SHOW VARIABLES;
SHOW SESSION VARIABLES;
SHOW GLOBAL VARIABLES;


SHOW VARIABLES LIKE "%char%";
SHOW SESSION VARIABLES LIKE "%char%";
SHOW GLOBAL VARIABLES LIKE "%char";


SELECT @@autocommit;
SELECT @@session.autocommit;
SELECT @@global.autocommit;



-- 改

SET GLOBAL autocommit = 0;
SET GLOBAL autocommit = 1;

SET autocommit = 0;
SET SESSION autocommit = 1;


SET @@global.autocommit =0;
SET @@global.autocommit =1;

SET @@autocommit = 0;
SET @@autocommit  = 1;


-- 自定义变量
-- 用户自变量
-- 声明 查看
SELECT @a;

-- 赋值
SET @a = 1;
SET @a :=2;
SELECT @a := 3;

SELECT COUNT(*) INTO @a FROM employees;




-- 局部变量

DROP PROCEDURE IF EXISTS a;
DELIMITER $
CREATE PROCEDURE a()
BEGIN
-- 声明
DECLARE a1 INT;
DECLARE a2 INT DEFAULT 1;

-- 赋值
SET a1 = 1;
SELECT a1,1;
SET a1 := 2;
SELECT a1,2;
-- 这一行代码成用户变量了 ，在begin end 外都可以查询到，不是局部变量了
SELECT @a1 := 3;

SELECT a1,3;

SELECT COUNT(*) INTO a1 FROM employees;
SELECT a1,4;





-- 查看

SELECT a1;
SELECT a1,5;






END $
DELIMITER ;
CALL a();


-- 在begin end 外都可以查询到，不是局部变量了
SELECT @a1;






