#https://leetcode-cn.com/problems/department-highest-salary/description/
select Department, Employee,Salary
from (
select d.Name as Department, e.name as Employee, Salary, rk.rank
from department d
join Employee e
on d.Id = e.DepartmentId 
join (
select
e1.id,count(e2.id) as rank
from Employee e1
left outer join Employee e2
on e1.DepartmentId =e2.DepartmentId 
and e1.salary<e2.salary
group by e1.DepartmentId,e1.id ) rk
on rk.id = e.id 
)f 
where f.rank = 0
order by Salary asc