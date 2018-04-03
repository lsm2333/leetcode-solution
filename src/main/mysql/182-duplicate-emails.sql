#https://leetcode-cn.com/problems/duplicate-emails/description/
select Email
from Person
group by Email
having count(distinct Id)>1

#select distinct p1.Email
#from Person p1
#join Person p2
#on p1.Email = p2.Email
#and p1.Id <> p2.Id
