
CREATE DATABASE  IF NOT EXISTS test;
USE test;
DROP TABLE  IF EXISTS book;
DROP TABLE IF EXISTS author;
CREATE TABLE book(

	id INT,
	bname VARCHAR(10),
	price DOUBLE,
	authorId INT,
	publishdate DATETIME);
CREATE TABLE author(
	id INT,
	au_name VARCHAR(20),
	nation VARCHAR(10)
	);

ALTER TABLE book CHANGE COLUMN publishdate pubdate DATETIME;
ALTER TABLE book MODIFY COLUMN pubdate TIMESTAMP;
ALTER TABLE author ADD COLUMN annual DOUBLE ;
ALTER TABLE author DROP COLUMN annual;
ALTER TABLE author RENAME TO book_author; 
DROP TABLE IF EXISTS book_author;
DROP TABLE IF EXISTS copy;
DROP TABLE IF EXISTS copy2;

INSERT INTO author
VALUES(1,"莫言","china");
CREATE TABLE copy1 LIKE author;
CREATE TABLE copy2 
SELECT * FROM author;


CREATE TABLE copy3
SELECT id,au_name
FROM author
WHERE 1=2;