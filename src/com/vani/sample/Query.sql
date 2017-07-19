create table Employee(emp_id integer, emp_Name varchar(20), emp_Salary varchar(100),dept_id integer);

insert into Employee(emp_id,emp_name,emp_salary) values(11,'neha','100K');

select * from Employee where emp_id = 11;

delete from Employee where emp_id = 11;

update Employee set emp_sal= '120K' where emp_id = 11;

Inner Join
select Emp_name,dept_name from Employee inner join Dept on Employee.dept_id = Dept.dept_id;
Left Outer Join

Right Outer Join

Full Outer Join


create table Book(book_id INTEGER PRIMARY KEY AUTOINCREMENT , book_title text, book_checkoutDate text, book_dueDate text );

insert into Employee(emp_name) values('vani');

insert into Book(book_title) values('vani');
SELECT * FROM Book WHERE book_title LIKE '%the%'";
