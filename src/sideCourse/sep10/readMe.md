Database ??

Type of DBs
- Relational -----> Postgre, MySQL, OracleDb -----   Tables with rows & cols .... Structured
- NoSQL      -----> Documents, key-value  ------MongoDb, DynamoDb,Redis   ...... unstructured


RDBMS ---- Relational database management system
it is a software which is used to manage relational databases.

SQL -----  Structured Query language .... it is a language to communicate with relational dbs. 

SQL categories ---- 
- DDL ---- Data definition language .... define the db structure ..... create alter, drop
- DML ---- Data Manipulation language ...... manage data  ....... select, insert, update,delete
- DCL ----  Data Control Language ....... manage permissions   ..... grant, revoke
- TCL ----  Transaction control language .... Manage transaction   ....... COMMIT, ROLLBACK

use employee_db;  ---- used to select a db

show tables;  ------ used to see all the tables in the selected DB.
create database june_batch; ----- used to create a new db.
Select * from Student; ----- show all the records from the table.

select name,id,salary from employees; --- show the cols mentioned only

select distinct address from employees;  ---- show only unique records.
select * from employees where address = 'canada'; ------ condition search
select * from employees where salary Between 50000 AND  65000 ;


Select * from employees limit 10;   will fetch only limited rows/records

Select * from employees order by name;  ---- sort the data by ascending order
Select * from employees order by name DESC ---- sort the data by descending order.

describe employees;   ----- used to tell about table structure


select * from employees where  name LIKE '%lor';
select * from employees where  name LIKE 'Dan_el Taylor';


Aggregate functions
- Count
- MIN
- MAX
  select MAX(salary) from employees;

-- create Table -----
create table students(
id int primary key auto_increment,
name varchar(50),
email varchar(50)
);











