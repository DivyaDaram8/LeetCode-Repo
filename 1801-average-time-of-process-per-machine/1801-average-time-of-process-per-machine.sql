# Write your MySQL query statement below
SELECT machine_id, ROUND(
    SUM(
        CASE 
            WHEN activity_type = "start" THEN timestamp*-1
            ELSE timestamp
        END
    ) / (SELECT count(DISTINCT process_id)), 3
) AS processing_time FROM activity GROUP BY machine_id;