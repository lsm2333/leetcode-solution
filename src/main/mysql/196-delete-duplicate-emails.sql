#https://leetcode-cn.com/problems/delete-duplicate-emails/description/
delete from Person 
where Id not in (select Id from (
select min(Id) as Id
from Person
group by Email) ids )