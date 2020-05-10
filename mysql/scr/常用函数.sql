select substr("含数发射东方红",4);
select substr("含数发射东方红",1,4);

select instr("slfjlasdfj","asd");
select trim("     fasdfsdf ");
select trim("a" from "aaaaaaaaaaaaa asdjflkasjfls  aaaaaaaaaaaaaafasdf sadf asdfas aaaaaaaaaaaaaaaaa");

select lpad("123",10,"..");
select rpad("123",10,"..");

select round(123.123,2);
select round(123.523);

select floor(123.123);

select truncate(123.123,1);

select now();

select curdate();

select curtime();

select year(now());
select year("1997-12-12");
select minute();


select * from employees where hiredate = "1992-4-3";
select distinct hiredate from employees ;
select * from employees where hiredate = str_to_date("4-3 1992","%m-%d %Y"); 

    
select last_name,date_format(now(),"%m月%d日 %y年") from employees where commission_pct is not null;



select version(),database(),user();