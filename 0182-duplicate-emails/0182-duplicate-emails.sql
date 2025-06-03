# Write your MySQL query statement below
#select email as Email from Person group by email having count(email) > 1;

select distinct p1.email as Email from
 Person p1 join Person p2 on p1.email = p2.email and p1.id != p2.id;