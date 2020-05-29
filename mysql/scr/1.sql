
CREATE DATABASE jdbcStudy CHARACTER SET utf8 COLLATE utf8_general_ci;

USE jdbcStudy;

CREATE TABLE `users`(
 id INT PRIMARY KEY,
 NAME VARCHAR(40),
 PASSWORD VARCHAR(40),
 email VARCHAR(60),
 birthday DATE
);

INSERT INTO `users`(id,NAME,PASSWORD,email,birthday)
VALUES(1,'zhansan','123456','zs@sina.com','1980-12-04'),
(2,'lisi','123456','lisi@sina.com','1981-12-04'),
(3,'wangwu','123456','wangwu@sina.com','1979-12-04')



SELECT * FROM users WHERE `name` = "zhansan" AND `password` = "123456";

SELECT * FROM users;



INSERT INTO users VALUES(4,"zhaoliu",123456,'zhaoliu@sina.com',NOW());


SELECT * FROM users WHERE id = 4;

UPDATE users SET`password` = 'root' WHERE id = 4;

SELECT * FROM users WHERE id = 4;

DELETE FROM users WHERE id =0;

SELECT * FROM users;


