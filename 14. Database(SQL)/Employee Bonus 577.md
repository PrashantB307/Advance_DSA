

//   https://leetcode.com/problems/employee-bonus/

select e.name, b.bonus from 
Employee e left outer join Bonus b on
e.empId = b.empId where
bonus < 1000 or b.bonus is null; 