CREATE TABLE stuinfo(
	id INT PRIMARY KEY,
	stuName VARCHAR(20) NOT NULL,
	gender CHAR(1) CHECK(gender="男" OR gender = "女"),
	seat INT UNIQUE,
	age INT DEFAULT 18,
	majorId INT  
	);
	
CREATE TABLE major(
	id INT PRIMARY KEY,
	majorName VARCHAR(20)
);
SHOW INDEX FROM stuinfo;


DROP TABLE IF EXISTS stuinfo;

CREATE TABLE stuinfo(
	id INT ,
	stuName VARCHAR(20)  ,
	gender CHAR(1) ,
	seat INT ,
	age INT,
	majorId INT , 
	constraint pk primary key(id),
	constraint uq unique(seat),
	check(gender = "男" or gender  = "女"),
	constraint fk_stuinfo_major foreign key(majorId) references major(id)
	);
	
	
CREATE TABLE stuinfo(
	id INT ,
	stuName VARCHAR(20)  ,
	gender CHAR(1) ,
	seat INT ,
	age INT,
	majorId INT , 
	PRIMARY KEY(id,stuName),
	UNIQUE(seat),
	CHECK(gender = "男" OR gender  = "女"),
	FOREIGN KEY(majorId) REFERENCES major(id)
	);
	
	
CREATE TABLE major(
	id INT PRIMARY KEY,
	majorName VARCHAR(20)
);	
SHOW INDEX FROM stuinfo;


DROP TABLE IF EXISTS stuinfo;
insert into major values(1,"html5");
INSERT INTO major VALUES(2,"java");

insert into stuinfo values(1,"lilei","男",1,18,1);
INSERT INTO stuinfo VALUES(2,"lilei","男",2,18,1);
INSERT INTO stuinfo VALUES(1,"lilei","男",3,18,1);


DROP TABLE IF EXISTS stuinfo;
CREATE TABLE stuinfo(
	id INT auto_increment,
	stuName VARCHAR(20)  ,
	gender CHAR(1) ,
	seat INT ,
	age INT,
	majorId INT );
alter table stuinfo modify stuName varchar(20) unique not null;
desc stuinfo;
alter table stuinfo add foreign key(majorId) references major(id);



ALTER TABLE 表名 modify column 列名 类型（长度） 约束1 约束2；

alter table 表名 add 【constraint 约束名】 约束（列名） 【references 主表名（列名）】
