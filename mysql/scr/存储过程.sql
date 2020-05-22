-- 存储过程
-- 删除
DROP PROCEDURE IF EXISTS a;
-- 创建
DELIMITER $
CREATE PROCEDURE a()
BEGIN
	SELECT * FROM myemployees.`employees`;
END $
DELIMITER ;
-- 调用
CALL a();

-- 查看存储过程的信息
SHOW CREATE PROCEDURE a;


-- in or out or inout
USE myemployees;
SELECT @a2 ;
SELECT @a3 := 1;
DROP PROCEDURE IF EXISTS a;
DELIMITER $
CREATE PROCEDURE a(IN a1 INT , OUT a2 INT , INOUT a3 INT)
BEGIN

	SELECT a1,a3;
	SET a3 := 1;
	SET a2 := 2;
	SELECT 11,22 INTO a3,a2;
	-- 以下方式赋值参数列表没有效果
	SELECT @a2 := 1;
	SELECT @a3 := 1;

	

END $
DELIMITER ;
CALL a(1,@a2,@a3);
SELECT @a2,@a3;
