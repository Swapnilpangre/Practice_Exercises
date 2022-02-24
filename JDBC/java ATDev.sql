use JDBCTest2;

/*Exercise 8: Write a query to find those customers with their name and those salesmen with their
 name and city who lives in the same city.*/
 
select customer.custname,salesman.sname,salesman.scity from salesman,
customer where salesman.scity=customer.city;

/*Exercise 9:  Write a SQL statement to find the names of all customers along with the salesmen who
 works for them */
 
 select customer.custname,salesman.sname from customer , 
salesman where customer.salesmanid=salesman.salesmanid;

/*Exercise 10: Write a SQL statement that finds out each order number followed by the name of the
 customers who made the order.*/
 
select customer.custname as "Customer" ,
orders.orderno as "Orderno." 
from orders,salesman,customer
where orders.customerid=customer.customerid
and orders.salesmanid=salesman.salesmanid;

/* Exercise 11 : Write a SQL statement that sorts out the customer and
 their grade who made an order.Each of the customers must have a grade
 and served by at least a salesman, who belongs to a city.*/
select customer.custname as "Customer",
customer.grade as "Grade",
orders.orderno as "Order no"
from orders,salesman,customer
where orders.customerid=customer.customerid and
orders.salesmanid=salesman.salesmanid
and salesman.scity is not null
and customer.grade is not null;

/* Exercise 12 : Write a query that produces all customers with their name, city, salesman and
 commission, who served by a salesman and the salesman works at a rate of the 
 commission within 12% to 14%*/

select customer.custname as "Customer",customer.city as "City",
salesman.sname as "salesman name",salesman.commission as "salesman commissiin"
from customer ,salesman 
where customer.salesmanid=salesman.salesmanid
and salesman.commission between .12 and .14;

/* Exercise 13 : Write a query to list the department ID and name of 
all the departments where no employee is working.*/

SELECT * FROM departments 
where DepartmentId not in(select DepartmentId from employees);

/* Exercise 14 : Write a query to get 3 maximum salaries from Employees table.*/

SELECT distinct Salary from employees a where 3 >= (select count(DISTINCT Salary)
from employees b where b.Salary>=a.Salary) order by a.Salary desc;

/*Exercise 15 : Write a query to get 3 minimum salaries from Employees table.*/

select distinct Salary from employees a where 3 >= (select count(DISTINCT Salary)
from employees b where b.Salary <= a.Salary)order by a.Salary desc;

/* Exercise 16 : Write a query to find the 4th minimum salary in the employees table*/

select distinct Salary from employees a where 4=(select count(distinct Salary)
from employees b where a.Salary >=b.salary);

/* Exercise 17 : Write a query to display the employee ID, first name, last name, salary 
of all employees whose salary is above average for their departments.*/

select EmpId,FName,LName, Salary from employees as a where Salary >
(select avg(Salary)from employees where DepartmentId=a.DepartmentId);

/*Exercise 18 : Write a query to list the number of jobs available in the employees table.*/

 select count(distinct JobId)
 from employees;
 
/* Exercise 19 : Write a query to get the minimum salary from employees table..*/

select distinct Salary from employees a where 0>= (select count(distinct Salary)
from employees b where a.Salary <b.Salary);

 /*Exercise 20 : Write a query to get the total salaries payable to employees .*/

select sum(Salary) from employees
  
