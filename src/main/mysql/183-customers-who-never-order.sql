#https://leetcode-cn.com/problems/customers-who-never-order/description/
select Name as Customers
from Customers c
where Id not in
(select CustomerId from Orders)