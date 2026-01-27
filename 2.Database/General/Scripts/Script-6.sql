-- 입사일이 1993년 2월 19일 이면서 1964년 10월 24일 직원의 이름을 구하고 
-- 다시 해당 이름으로 조건을 검색해서 사번(emp_no)를 구해야 하는 경우


SELECT first_name, last_name FROM employees
WHERE hire_date  = '1993-02-19'
AND birth_date  = '1964-10-24';


SELECT emp_no FROM employees
WHERE FIRST_name = 'Conrado'
AND last_name = 'Serra';


-- 서브쿼리 사용 
SELECT emp_no
FROM employees 
WHERE first_name = (SELECT first_name 
					FROM employees
					WHERE hire_date  = '1993-02-19'
					AND birth_date  = '1964-10-24')
AND last_name =		(SELECT last_name 
					FROM employees
					WHERE hire_date  = '1993-02-19'
					AND birth_date  = '1964-10-24');


SELECT emp_no
FROM employees
WHERE (first_name ,last_name) = (SELECT first_name , last_name 
									FROM employees
									WHERE hire_date = '1993-02-19'
									AND birth_date = '1964-10-24');


-- 직원중에서 emp_no가 가장 높은 직원 찾기 
 SELECT first_name, last_name
 FROM employees
 WHERE emp_no = (SELECT max(emp_no) FROM employees);

SELECT max(emp_no), first_name, last_name,emp_no
FROM employees
GROUP BY first_name, last_name ,emp_no
ORDER BY emp_no DESC 
LIMIT 1;

SELECT first_name, last_name 
FROM employees
ORDER BY emp_no DESC
LIMIT 1;



SELECT first_name,  last_name
FROM employees
WHERE hire_date =(SELECT min(hire_date) FROM employees );

-- 전체 평균보다 높은 연봉을 받는 이름 조회

SELECT first_name,  last_name
FROM employees
WHERE emp_no  = (SELECT emp_no 
				FROM salaries s 
				ORDER BY salary DESC
				LIMIT 1);



SELECT first_name,  last_name
FROM employees
WHERE emp_no >= (SELECT avg(emp_no) FROM employees
); -- 평균 사번보다 높은 직원으 이름만


-- SELECT *
-- FROM employees e
-- WHERE hire_date > (SELECT avg(hire_date)
-- 					FROM employees
-- 					WHERE emp_no = e.emp_no);  


 

SELECT emp_no, salary
FROM salaries 
WHERE salary IN (SELECT salary
				FROM salaries s
				ORDER BY salary DESC);

SELECT salary
FROM salaries s
ORDER BY salary DESC;

SELECT * 
FROM salaries s 
WHERE (emp_no, salary) IN (SELECT emp_no, max(salary)
							FROM salaries
							GROUP BY emp_no);


SELECT emp_no, title, to_date
FROM titles
WHERE (emp_no, to_date) IN (SELECT emp_no, max(to_date)
							FROM titles
							GROUP BY emp_no);

SELECT * FROM salaries;

SELECT emp_no, salary, to_date
FROM salaries
WHERE (emp_no, to_date) IN (SELECT emp_no, max(to_date)
							FROM salaries 
							GROUP BY emp_no);

SELECT * FROM dept_emp;

SELECT emp_no, dept_no, from_date
FROM dept_emp 
WHERE (emp_no, from_date) IN (SELECT emp_no, min(from_date)
							  	FROM dept_emp
								GROUP BY emp_no);


SELECT *
FROM (SELECT de.dept_no, avg(s.salary)
		FROM dept_emp de
		JOIN salaries s ON de.emp_no =s.emp_no 
		GROUP BY de.dept_no) a;

SELECT *
FROM( SELECT emp_no, salary, salary*1.1 AS increment_salary
		FROM salaries 
		ORDER BY increment_salary DESC
		LIMIT 3) a
WHERE increment_salary >= 170000;


-- dept_no, 평균 연봉(salary)을 조회 (인라인뷰)	
-- 메인쿼라에서  평균 연봉이 70000 이상인 부서만 조회       

SELECT *
FROM (SELECT dept_no, avg(salary) AS avg_salary
	  FROM dept_emp de 
	  JOIN  salaries s ON de.emp_no = s.emp_no
	  GROUP BY dept_no) t
WHERE avg_salary >= 70000;

-- 인라인뷰 salaries 테이블에서 emp_no, 평균 연봉을 가져오세요.
-- 메인 쿼리에서 조건으로 급여가 80000 잇아일 경우에만 조회하세요.
SELECT *
FROM (SELECT emp_no, avg(salary) AS avg_salary123
		FROM salaries s 
		GROUP BY emp_no ) t1
WHERE avg_salary123 >= 80000;












