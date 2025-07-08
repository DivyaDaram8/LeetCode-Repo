# Write your MySQL query statement below
SELECT *, IF( x + y > z AND y + z > x AND z + x > y, "Yes", "No") AS triangle 
FROM Triangle;
