select	last_name, 
		commission_pct, 
		if(commission_pct is null,"hehe","haha") 
from 
		employees; 
        
        
select 
	distinct department_id
from 
	employees;
    
    
select 
	salary 原始工资,
    department_id,
    case department_id
    when 10 then salary*1.5
    when 20 then salary*2
    when 30 then salary*3
    else salary
    end as 实际工资
from
	employees;

select 
	last_name,
	case
	when salary >20000 then "A"
    when salary >15000 then "B"
    when salary >10000 then "C"
    else "D"
    end 级别
from employees;