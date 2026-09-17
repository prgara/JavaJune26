LIMIT ---- how many records you want to fetch

Select * from students LIMIT 39 Offset 200;

Next 40 records from 41 to 80

201-240


Data Types in SQL
- INT
- VARCHAR
- CHAR
- FLOAT
- DOUBLE
- BOOLEAN
- BIGINT
- DATE
- TIME
- DATETIME
- TIMESTAMP  ------ date & time ..... auto update 
- BLOB


-- Create a Table
Create table students(
studentId INT PRIMARY KEY auto_increment,
name VARCHAR(50) NOT NULL,
email varchar(50) UNIQUE,
marks INT,
enrollmentDate TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

-- Insert single record
INSERT INTO students (
name, email, marks
) value (
'Harry', 'pinky@gmail.com',98
);


create a table in june_batch db with your name (name, city, salary) and add atleast 3 rows in it.

Add a new column to your existing table and modify one existing column or rename existing column.


Alter table nithin rename column employee_id to emp_id;


check(age > 18)


Alter table Harpreet modify column age int check (age > 18);


Primary key   ----- unique & not null
primary vs unique key  -------- 1 primary key vs 1 or more than 1 unique key in table.... no null allowed vs null allowed
Foreign key --- primary key of one table becomes foreign key in another table.

JOIN ---> whenever you want to fetch data from multiple tables, we form the join.

TYPES OF JOINS
- INNER JOIN  ----- Return only rows where there is a match in both the tables.
- LEFT JOIN ---- return all rows from left tables plus matching rows from right table.
- RIGHT JOIN ---- return all rows from right tables plus matching rows from left table.
- FULL JOIN ----- Return all the rows from both the tables.

In mysql, there is no option for full join but if you want to perform the full join you can use union.

--- FULL JOIN IN MYSQL -----
LEFT JOIN
UNION
RIGHT JOIN



SELECT s.student_name, c.course_name, e.grade, s.student_id from Student s
INNER JOIN
Enrollment e on e.student_id = s.student_id
INNER JOIN 
Course c on e.course_id = c.course_id;


    A                         B
id(PK), stu_name          id(FK), stu_marks
1,Nithin                    1, 78            
2,Harpreet                  2, 98
3,PALAK


INNER JOIN
1,2


SELECT s.student_name, c.course_name, e.grade, s.student_id from Student s
LEFT JOIN
Enrollment e on e.student_id = s.student_id
LEFT JOIN Course c on c.course_id = e.course_id
UNION
SELECT s.student_name, c.course_name, e.grade, s.student_id from Student s
RIGHT JOIN
Enrollment e on e.student_id = s.student_id
RIGHT JOIN Course c on c.course_id = e.course_id;


STORE PROCEDURE   -----> 
TRIGGERS


call getSalary()

how to find the second highest salary  ?



