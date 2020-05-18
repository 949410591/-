-- 经典插入
use girls;
insert into beauty(id,name,sex,borndate,phone,photo,boyfriend_id)
values(13,"唐艺昕","女","1990-4-23",'18038888888',null,2);


insert into beauty(id,name,sex,borndate,phone,boyfriend_id)
values(14,"金星","女","1990-4-24",'18038882888',2);


insert into beauty(id,name,sex,borndate,phone)
values(15,"娜扎","女","1990-4-24",'18033322888');


insert into beauty(name,sex,id,borndate,phone)
values("蒋欣","女",16,"1990-4-24",'18033322888');
insert into beauty(name,sex,id,borndate,phone)
values("关晓彤","女",17,"1999-4-24",'18038882888');


insert into beauty
values(18,"张飞燕","女",null,"188999999",null,null);


-- 方式二

insert into beauty
set id = 19, name = "刘涛", phone="12312312";

-- 
insert into beauty
values(20,"张飞燕2","女",null,"188999",null,null),
(21,"张飞燕3","女",null,"188999123",null,null);


insert into beauty
select 22,"宋茜","女",null,"12312",null,null;
