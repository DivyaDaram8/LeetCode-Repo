# Write your MySQL query statement below
-- SELECT customer_id 
-- FROM Customer 
-- GROUP BY customer_id 
-- HAVING COUNT(DISTINCT product_key)  = (SELECT COUNT(*) FROM Product);

SELECT customer_id 
FROM Customer c
JOIN Product p
ON c.product_key = p.product_key
GROUP BY c.customer_id
HAVING COUNT(DISTINCT c.product_key) = (SELECT COUNT(*) FROM Product);