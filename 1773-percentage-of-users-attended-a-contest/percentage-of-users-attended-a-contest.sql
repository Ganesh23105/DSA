# Write your MySQL query statement below
SELECT r.contest_id,Round(COUNT(distinct user_id)*100/(SELECT COUNT(user_id) from users),2) AS percentage
FROM register r
GROUP BY contest_id
ORDER BY percentage DESC,contest_id

    