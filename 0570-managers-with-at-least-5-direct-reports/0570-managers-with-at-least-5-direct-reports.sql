# Write your MySQL query statement below
select name from employee as name where ID in (select managerId from employee Group by managerId having count(managerId) >= 5 );