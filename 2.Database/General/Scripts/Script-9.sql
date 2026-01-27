CREATE TABLE position(
		id int,
		position_name varchar(50)
);


SELECT * FROM employees;




INSERT INTO employees
VALUES('짱구',5,'M','개발팀',9800,5);


UPDATE 
SET salary = 3500
WHERE name = '김민수';

DELETE FROM employees
WHERE name = '김민수';



SELECT name
FROM employees
WHERE dept = '개발팀'
AND salary >= 3000;


SELECT name
FROM employees
WHERE dept = '기획팀'
OR dept = '마케팅팀';


SELECT * FROM employees
WHERE name LIKE '김%';

SELECT name, position_name
FROM employees e
JOIN position p;
























