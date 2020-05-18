select * from beauty where phone like "%9";

delete  from beauty where phone like "%9";

select * from beauty;
select * from boys;


select b.*,g.*
from beauty g
join boys b on g.boyfriend_id  = b.id
where b.boyName = "张无忌";

delete  g
from boys b
join beauty g on g.boyfriend_id  = b.id
where b.boyName = "张无忌";

update boys
set boyName = "黄晓明"
where boys.id = 3;

delete  g,b
from boys b
join beauty g on g.boyfriend_id  = b.id
where b.boyName = "黄晓明";

insert  into boys(boyName,userCP)
values("刘备",200);
select * from boys;
delete from boys;
insert into boys(boyName,userCP)
values("关羽",123),("刘备",123),("张飞",123);

truncate table boys;
insert into boys(boyName,userCP)
values("关羽",123),("刘备",123),("张飞",123);


