DROP PROCEDURE IF EXISTS a;
DELIMITER $
CREATE PROCEDURE a(IN gname1 VARCHAR(10) ,IN gname2 VARCHAR(10),OUT result VARCHAR(10))
BEGIN
	DECLARE gdate1 DATE;
	DECLARE gdate2 DATE;
	
	SELECT @gdate1 := g.borndate
	FROM beauty g
	WHERE g.name = gname1;
	
	
	SELECT @gdate2 := (
	SELECT g.borndate
	FROM beauty g
	WHERE g.name = gname2);
	
	
	
	SELECT IF(gdate1>gdate2,gname2,gname1) INTO result; 
	
	
END $
DELIMITER ;
SELECT @result;
CALL a("小昭","柳岩",@result);
SELECT @result;



SHOW CREATE PROCEDURE a;


