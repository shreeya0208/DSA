# Write your MySQL query statement below
select MAX(num) num  from mynumbers where num in (select num from mynumbers group by num having count(*)=1);