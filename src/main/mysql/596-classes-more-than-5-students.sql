#https://leetcode-cn.com/problems/classes-more-than-5-students/description/
select class
from courses
group by class
having count(distinct student)>=5