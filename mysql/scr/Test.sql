select e.last_name, e.first_name, d.dept_no
from dept_emp d
right join employess e
on d.emp_no = e.emp_no;