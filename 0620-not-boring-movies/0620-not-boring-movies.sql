# Write your MySQL query statement below
select * from cinema where description<>"boring" and id in  (select id from cinema as id where id%2=1) order by rating desc;