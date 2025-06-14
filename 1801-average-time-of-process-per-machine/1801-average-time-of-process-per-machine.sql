# Write your MySQL query statement below
-- SELECT machine_id, ROUND(
--     SUM(
--         CASE 
--             WHEN activity_type = "start" THEN timestamp*-1
--             ELSE timestamp
--         END
--     ) * 1.0 / (SELECT count(DISTINCT process_id)), 3
-- ) AS processing_time FROM activity GROUP BY machine_id;

SELECT a1.machine_id, ROUND(AVG(a2.timestamp - a1.timestamp),3) 
AS processing_time
FROM activity a1
JOIN activity a2
ON 
a1.machine_id = a2.machine_id AND
a1.process_id = a2.process_id AND
a1.activity_type = "start" AND
a2.activity_type = "end"
GROUP BY machine_id;