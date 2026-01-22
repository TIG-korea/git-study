--  employees라는 데이터베이스 선택 
use employees;

select emp_no, first_name from employees;
select * from employees;

-- Q1.실습
select emp_no, birth_date from employees;
select hire_date from employees;
select emp_no, from_date, to_date from dept_manager;
select * from departments;

insert into employees
values(1,
		'2000-01-01',
		'jaeseop',
		'kim',
		'M',
		now());

select *from employees;


-- ---------------------- 1/22
 -- 테이블 생성 
CREATE TABLE ddl_alter_test(         
	alter_id varchar(255),
	alter_name varchar(255),
	alter_as varchar (255)
);

-- 테이블 이름변경 
ALTER TABLE ddl_alter_test 
RENAME TO ddl_alter; 	


-- 테이블 구조 변경 ( 컬럼 변경 )
ALTER TABLE  ddl_alter 
MODIFY alter_as varchar(100);

-- 테이블 구조 변경 ( 컬럼 추가 )
ALTER TABLE ddl_alter
 ADD alter_pwd varchar(255);

-- 테이블 구조 변경 ( 컬럼 삭제 )
ALTER TABLE ddl_alter DROP COLUMN alter_as;

-- alter_name이라는 컬럼에 중복된 값이 들어가서는 안된다라는 조건을 추가 
ALTER TABLE ddl_alter
ADD CONSTRAINT  alter_name_unique UNIQUE (alter_name); 

-- ""nirsa", "김재섭", 'qwer1234!'
--  "tetst", "김재섭", '1111'
 
-- 추가
 INSERT INTO ddl_alter 
 VALUES ('nirsa', '김재섭', 'qwer12324!'); 
 
  INSERT INTO ddl_alter 
 VALUES ('test', '김재섭', '111111');
  
  
-- MySQL에서는 지원 x , 수정하려면 제거 후 다시 추가 
-- ALTER TABLE ddl_alter 
-- RENAME CONSTRAINT  alter_name_unique to name_unique;

ALTER TABLE ddl_alter 
DROP CONSTRAINT alter_name_unique;  

ALTER TABLE ddl_alter
ADD CONSTRAINT name_unique UNIQUE (alter_name);





CREATE TABLE test_employees(
	te_employees_id INT,
	te_first_name varchar(50),
	te_last_name varchar(50),
	te_salary int,
	te_department varchar(50)
);


ALTER TABLE test_employees 
 RENAME TO STAFF;

ALTER TABLE STAFF
 MODIFY te_department varchar(100);

ALTER TABLE STAFF 
 CHANGE te_last_name Surname varchar(50) ;
--  RENAME TO 사용하면 가능 
 
ALTER TABLE STAFF 
 DROP COLUMN te_first_name;

ALTER TABLE STAFF
 ADD COLUMN te_hire_date DATETIME;

ALTER TABLE STAFF
 ADD Salary varchar(255);

ALTER TABLE STAFF
 ADD CONSTRAINT te_salary_check UNIQUE (Salary);


DROP TABLE	ddl_alter ;
DROP TABLE	staff  ;



















 