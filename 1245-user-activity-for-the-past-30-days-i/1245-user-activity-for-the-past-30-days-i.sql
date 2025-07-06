# Write your MySQL query statement below
-- SELECT activity_date as day, COUNT(DISTINCT user_id) as active_users
-- FROM Activity
-- WHERE activity_date BETWEEN DATE('2019-07-27') - INTERVAL 29 DAY AND '2019-07-27'
-- GROUP BY activity_date;

SELECT activity_date as day, COUNT(DISTINCT user_id) as active_users
FROM Activity
WHERE activity_date BETWEEN '2019-06-28' AND '2019-07-27'
GROUP BY activity_date;