# Write your MySQL query statement below
select
    p.project_id,
    Round(AVG(e.experience_years),2) AS average_years
from project p
join Employee e
    on p.employee_id=e.employee_id
Group By p.project_id;


