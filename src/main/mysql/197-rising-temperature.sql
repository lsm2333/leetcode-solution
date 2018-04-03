#https://leetcode-cn.com/problems/rising-temperature/description/
select w2.Id 
from Weather w1 
join Weather w2 
on 1=1 
where DATEDIFF(w2.Date,w1.Date)=1 
and w2.Temperature>w1.Temperature