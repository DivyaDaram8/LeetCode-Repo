# Write your MySQL query statement below
WITH SalaryRanks AS (
    SELECT 
        e.name AS Employee,
        d.name AS Department,
        e.salary AS Salary,
        DENSE_RANK() OVER (
            PARTITION BY e.departmentId 
            ORDER BY e.salary DESC
        ) AS rnk
    FROM Employee e
    JOIN Department d
      ON e.departmentId = d.id
)
SELECT Department, Employee, Salary
FROM SalaryRanks
WHERE rnk <= 3;
