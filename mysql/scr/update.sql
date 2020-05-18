SET SQL_SAFE_UPDATES = 0;
SELECT * FROM girls.beauty;
select * from boys;
use girls;
update beauty
set phone = "139"
where name like "张%";


update boys set boyname = "张飞", usercp=10
where id = 2;


select b.*, g.*
from boys b
join beauty g on b.id = g.boyfriend_id
where b.boyName = "张无忌";

update boys b
join beauty g on b.id = g.boyfriend_id
set g.phone = "123123123"
where b.boyName = "张无忌";


update beauty
set boyfriend_id = 2
where boyfriend_id is null;


update boys b
join beauty g on b.id = g.boyfriend_id
set g.phone = "1111",b.userCP = 1
where b.boyName = "段誉";