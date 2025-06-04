# Write your MySQL query statement below

-- delete from Person where id not in (
--     select * from (select min(id) from person group by email) as temp
-- );


delete p from Person p 
join (
    select min(id) as low_id, email 
    from person 
    group by email
) as fd
on p.email = fd.email
where p.id != fd.low_id;