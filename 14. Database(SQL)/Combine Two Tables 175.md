

//   https://leetcode.com/problems/combine-two-tables/description/

##  select p.firstname, p.lastname, a.city, a.state from Person p left outer join Address a on p.personId = a.personId;