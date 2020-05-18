USE test;
DROP TABLE IF EXISTS TestInt;
CREATE TABLE TestInt(
	a INT
);
DESC TestInt;
INSERT INTO TestInt VALUES(-1);
SELECT * FROM TestInt;
DROP TABLE IF EXISTS TestInt;



CREATE TABLE TestInt(
	a INT,
	b INT UNSIGNED
);
DESC TestInt;
INSERT INTO TestInt VALUES(-1,-2);
SELECT * FROM TestInt;


DROP TABLE IF EXISTS TestInt;

CREATE TABLE TestInt(
	a INT,
	b INT UNSIGNED,
	c INT ZEROFILL
);

INSERT INTO TestInt VALUES(-1,2,4);

SELECT * FROM TestInt;






CREATE TABLE Testfloat(
	a FLOAT(5,2),
	b DOUBLE(5,2),
	c DEC(5,2)
	);


INSERT INTO TestFloat VALUES(52.26,52.26,52.26);
INSERT INTO TestFloat VALUES(52.267,52.267,52.267);
INSERT INTO TestFloat VALUES(1522.26,1522.26,1522.26);
SELECT * FROM Testfloat;

DROP TABLE IF EXISTS Testfloat;

CREATE TABLE Testfloat(
	a FLOAT,
	b DOUBLE,
	c DEC
	);
DESC Testfloat;
INSERT INTO Testfloat VALUES(1522.26,1522.26,1522.26);
SELECT * FROM Testfloat;





CREATE TABLE Testchar(
	a ENUM("a","b",'c'),
	b SET("a","b",'c'));
	
	
INSERT INTO Testchar VALUES("a","b,c");
INSERT INTO Testchar VALUES("A","a,c");
INSERT INTO Testchar VALUES("b","B,c");

SELECT * FROM Testchar;


CREATE TABLE Testdate(
	a DATETIME,
	b TIMESTAMP);
INSERT INTO Testdate VALUES(NOW(),NOW());
SELECT * FROM Testdate;
SHOW VARIABLES LIKE "time_zone";
SET time_zone = "+9:00";
SET time_zone = "system";



SELECT 1,2
UNION ALL SELECT 1,2;

	
