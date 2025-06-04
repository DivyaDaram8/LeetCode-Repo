# Write your MySQL query statement below
delete from Person where id not in (
    select * from (select min(id) from person group by email) as temp
);
