#https://leetcode-cn.com/problems/not-boring-movies/description/
select * from cinema
where id & 1
and description <> "boring"
order by rating desc