#https://leetcode-cn.com/problems/second-highest-salary/description/
select max(Salary) as SecondHighestSalary
from employee
where Salary not in (
    select max(Salary) from Employee)