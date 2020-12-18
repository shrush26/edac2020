select database();
use shrusti;
create table member(member_id int(5) , member_name varchar(30),
 member_address varchar(50) , acc_open_date date , 
 membership_type varchar(20), Penalty_amount int(7));
 create table books(book_no int(6), book_name varchar(30) ,
 author_name varchar(30) , cost int(7), category char(10));
 create table issue (lib_issue_id int(10), book_no int(6),
 member_id int(5), issue_date date, return_date date);
 alter table member drop Penalty_amount;
insert into member values(1, "Richa Sharma ", "pune", "2005-10-12", "Lifetime" );
insert into member values(3, "Shilpa", "pune", curdate(), "health" );
insert into member values(4, "rita ", "pune", curdate(), "health" );
insert into member values(5, "Sita", "pune", curdate(), "health" );
insert into member values(6, "Gita", "pune", curdate(), "health" );
insert into member values(7, "Nita", "pune", curdate(), "health" );
desc member;
insert into books values("101", "Let us C" , "Denis zritchie", "450", "System");
insert into books values("102", "Oracle complete ref" , "Loni", "550", "Database");
insert into books values("103", "Mastering SQL" , "Loni", "250", "Database");
insert into books values("104", "PL- SQL ref" , "ScottUrman", "750", "Database");
select * from books;
use shrusti;
set SQL_SAFE_UPDATES = 0;
UPDATE books SET cost=300 , category="RDBMS"  where book_no =103  ; 
select * from books;
 drop table issue;
   create table issue (lib_issue_id int(10), book_no int(6),
 member_id int(5), issue_date date, return_date date);
 desc issue;

 insert into issue values (7001, 101,1, "2006-1-12",null);
 insert into issue values (7002, 102,2, "2006-9-12",null);
 insert into issue values (7003, 104,1, "2006-4-12",null);
 insert into issue values (7004, 101,1, "2006-7-12",null);
 insert into issue values (7005, 104,2, "2006-9-12",null);
 insert into issue values (7006, 101,3, "2006-18-12",null);
update issue set return_date = NULL;
select * from issue; 
 