#https://leetcode-cn.com/problems/employees-earning-more-than-their-managers/description/
select e2.Name as Employee
from Employee e1
join Employee e2
on e1.Id = e2.ManagerId
where e2.Salary > e1.Salary