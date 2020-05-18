USE girls;
SELECT * FROM admin;

DELIMITER $
CREATE PROCEDURE myp1()
BEGIN
	INSERT INTO admin VALUES(NULL,"join1","0000");
	INSERT INTO admin VALUES(NULL,"join2","0000");
	INSERT INTO admin VALUES(NULL,"join3","0000");
	INSERT INTO admin VALUES(NULL,"join4","0000");
	INSERT INTO admin VALUES(NULL,"join5","0000");
END $








DELIMITER ;

SELECT * FROM admin;
DROP PROCEDURE myp2;
DELIMITER $
CREATE PROCEDURE myp2(IN beautyName VARCHAR(10))
BEGIN
	SELECT bo.*
	FROM boys bo
	RIGHT JOIN beauty b ON bo.id = boyfriend_id
	WHERE b.name LIKE beautyName;
END $
DELIMITER ;
CALL myp2('小昭');


DROP PROCEDURE IF EXISTS myp3;
DELIMITER $
CREATE PROCEDURE myp3(IN un VARCHAR(10),IN pw VARCHAR(10))
BEGIN
	DECLARE result INT;
	SELECT  COUNT(*) INTO result
	FROM admin a
	WHERE a.username = un AND a.password = pw;
	SELECT 
		CASE result
		WHEN 1 THEN "成功"
		ELSE "失败"
		END
	;
	SELECT  
		CASE COUNT(*)
		WHEN 1 THEN "成功"
		ELSE "失败"
		END
	FROM admin a
	WHERE a.username = un AND a.password = pw;
	
	SELECT IF(result = 1,"成功","失败");
END $

DELIMITER ;
SELECT * FROM admin;
CALL myp3("john","8888");


USE girls;
DROP PROCEDURE IF EXISTS myp4;
DELIMITER $
CREATE PROCEDURE myp4(IN gname VARCHAR(10), OUT bname VARCHAR(10))
BEGIN
	SELECT b.boyName INTO bname
	FROM boys b
	JOIN beauty g
	ON b.id = g.boyfriend_id 
	WHERE g.name = gname;
	
END $
DELIMITER ;
SELECT @bname;
CALL myp4("小昭", @bname);
SELECT @bname;


DROP PROCEDURE IF EXISTS myp5;
DELIMITER $
CREATE PROCEDURE myp5(IN gname VARCHAR(10),INOUT bname VARCHAR(10), INOUT usercp INT)
BEGIN
	SELECT b.boyName, b.usercp INTO bname,usercp
	FROM boys b
	JOIN beauty g
	ON g.boyfriend_id = b.id
	WHERE g.name = gname;
END $
DELIMITER ;
SELECT @bname;
SELECT @usercp;
CALL myp5("小昭",@bname,@usercp);
SELECT @bname,@usercp;








