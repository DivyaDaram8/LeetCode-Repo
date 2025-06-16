# Write your MySQL query statement below
SELECT A.student_id, A.student_name, C.subject_name, COUNT(B.subject_name) AS attended_exams
FROM Students AS A
CROSS JOIN Subjects AS C
LEFT JOIN Examinations AS B
ON A.student_id = B.student_id AND C.subject_name = B.subject_name
GROUP BY A.student_id, A.student_name, C.subject_name
ORDER BY A.student_id, C.subject_name;
