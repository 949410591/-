USE test;
DROP TABLE IF EXISTS tbl_emp;
DROP TABLE IF EXISTS tbl_dept;

CREATE TABLE tbl_dept(
	id INT(11) NOT NULL AUTO_INCREMENT,
	deptName VARCHAR(30) DEFAULT NULL,
	locAdd VARCHAR(40) DEFAULT NULL,
	PRIMARY KEY (id)
	

)ENGINE = INNODB AUTO_INCREMENT=1 DEFAULT CHARSET = utf8;
CREATE TABLE tbl_emp(
	id INT(11) NOT NULL AUTO_INCREMENT,
	`name` VARCHAR(30) DEFAULT NULL,
	deptId INT(11) DEFAULT NULL,
	PRIMARY KEY(id),
	KEY `fk_dept_id`(deptId)
	#CONSTRAINT `fk_dept_id` FOREIGN KEY (deptId) REFERENCES tbl_dept(id)

)ENGINE=INNODB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

INSERT INTO tbl_dept(deptName,locAdd) VALUES("RD",11);
INSERT INTO tbl_dept(deptName,locAdd) VALUES("HR",12);
INSERT INTO tbl_dept(deptName,locAdd) VALUES("MK",13);
INSERT INTO tbl_dept(deptName,locAdd) VALUES("MIS",14);
INSERT INTO tbl_dept(deptName,locAdd) VALUES("FD",15);


INSERT INTO tbl_emp(`name`,deptId) VALUES('z3',1);
INSERT INTO tbl_emp(`name`,deptId) VALUES('z4',1);
INSERT INTO tbl_emp(`name`,deptId) VALUES('z5',1);

INSERT INTO tbl_emp(`name`,deptId) VALUES('w5',2);
INSERT INTO tbl_emp(`name`,deptId) VALUES('w6',2);

INSERT INTO tbl_emp(`name`,deptId) VALUES('s7',3);
INSERT INTO tbl_emp(`name`,deptId) VALUES('s8',4);
INSERT INTO tbl_emp(`name`,deptId) VALUES('s9',51);



SELECT * FROM tbl_dept;
SELECT * FROM tbl_emp;


SELECT * FROM tbl_emp,tbl_dept;



-- ab共有
SELECT * 
FROM  tbl_emp a
INNER JOIN tbl_dept b
ON a.`deptId` = b.id;



-- ab共有加a独有
SELECT * 
FROM  tbl_emp a
LEFT JOIN tbl_dept b
ON a.`deptId` = b.id;


-- ab共有加b独有
SELECT * 
FROM  tbl_emp a
RIGHT JOIN tbl_dept b
ON a.`deptId` = b.id;



-- a独有
SELECT * 
FROM  tbl_emp a
LEFT JOIN tbl_dept b
ON a.`deptId` = b.id
WHERE b.id IS NULL
;


-- b独有
SELECT * 
FROM  tbl_emp a
RIGHT JOIN tbl_dept b
ON a.`deptId` = b.id
WHERE a.id IS NULL
;




-- ab合集
SELECT * 
FROM  tbl_emp a
RIGHT JOIN tbl_dept b
ON a.`deptId` = b.id


UNION

SELECT * 
FROM  tbl_emp a
LEFT JOIN tbl_dept b
ON a.`deptId` = b.id

;




-- a独有，b独有
SELECT * 
FROM  tbl_emp a
RIGHT JOIN tbl_dept b
ON a.`deptId` = b.id
WHERE a.id IS NULL

UNION

SELECT * 
FROM  tbl_emp a
LEFT JOIN tbl_dept b
ON a.`deptId` = b.id
WHERE b.id IS NULL;

























