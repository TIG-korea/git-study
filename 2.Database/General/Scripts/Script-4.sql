SELECT * FROM employees	
ORDER BY birth_date DESC;

SELECT * FROM titles 
ORDER BY to_date DESC;

SELECT max(salary) FROM salaries s ;
SELECT min(salary) FROM salaries s ;
SELECT avg(salary) FROM salaries s ;
SELECT sum(salary) FROM salaries s ;
SELECT count(*) FROM salaries s ;


SELECT count(*) AS '직원 수 ' FROM employees ;

SELECT count(*) AS '직원 수 ' FROM titles 
WHERE title = 'Engineer';

SELECT count(*) AS '직원 수 ' FROM employees 
WHERE hire_date > '1965-01-01';

SELECT max(emp_no) AS '가장 높은 직원 ' FROM employees ;
SELECT min(emp_no) AS '가장 낮은 직원 ' FROM employees ;



SELECT max(emp_no), first_name, birth_date FROM employees 
GROUP BY first_name ,birth_date;


-- 부서별 직원 수 구하기
--  부서 번호(dept_no ) 조회 
SELECT count(*), dept_no FROM dept_emp 
GROUP BY dept_no;

SELECT count(*) AS 'cnt', gender FROM employees 
GROUP BY gender;


SELECT count(*) AS '직원 수', title FROM titles 
GROUP BY title 
ORDER BY title DESC;


SELECT count(*) AS '직원 수', title FROM titles 
GROUP BY title 
HAVING count(*)  >= 100000
ORDER BY title DESC;


-- dept_emp 에서 직원 수가 5만 이상인 부서만 조회 

SELECT count(*), dept_no FROM dept_emp
GROUP BY dept_no 
HAVING count(*)  >= 50000;

--  현재 재직중인 직원들 중 직무별 직원수가 200명 미만인 직무만 조회
SELECT title, count(*) FROM titles 
WHERE TO_date = '9999-01-01'
GROUP BY title 
HAVING count(*) < 200;


SELECT * FROM employees;

-- Q1. employees 테이블에서 사원을 사번 기준으로 오름차순 정렬하여 조회하세요.
		SELECT emp_no FROM employees 
		ORDER BY emp_no ;
-- 
-- Q2. employees 테이블에서 사원을 사번 기준으로 내림차순 정렬하여 조회하세요.
		SELECT emp_no  FROM employees
	
		ORDER BY emp_no desc ;
-- 
-- Q3. salaries 테이블에서 급여를 높은 순으로 정렬하여 조회하세요.
		SELECT salary  , count(*) FROM salaries
		GROUP BY salary 
		ORDER BY salary ;
-- 
-- Q4. employees 테이블에서 입사일 기준으로 오래된 순서대로 정렬하여 조회하세요.
		SELECT hire_date  , count(*) FROM employees
		GROUP BY hire_date 
		ORDER BY hire_date ;
-- 
-- Q5. employees 테이블에서 성별 기준으로 정렬한 뒤 사번 기준으로 정렬하여 조회하세요.
		SELECT emp_no  , count(*) FROM employees
		GROUP BY emp_no 
		ORDER BY gender , emp_no asc ;
-- 
-- Q6. salaries 테이블에서 가장 높은 급여를 조회하세요.
		SELECT max(salary) FROM salaries;
		
-- 
-- Q7. salaries 테이블에서 가장 낮은 급여를 조회하세요.
	SELECT min(salary) FROM salaries;

-- 
-- Q8. salaries 테이블에서 평균 급여를 조회하세요.
	SELECT avg(salary) FROM salaries;

-- 
-- Q9. salaries 테이블에서 전체 급여 합계를 조회하세요.
		SELECT sum(salary) FROM salaries;

-- 
-- Q10. employees 테이블에서 전체 사원 수를 조회하세요.
		SELECT count(*) FROM employees;

-- 
-- Q11. employees 테이블에서 성별별 사원 수를 조회하세요.
	SELECT count(*) FROM employees
	GROUP BY gender ;

-- 
-- Q12. dept_emp 테이블에서 부서별 사원 수를 조회하세요.
		SELECT count(*) FROM dept_emp
	GROUP BY dept_no  ;
-- 
-- Q13. titles 테이블에서 직급별 사원 수를 조회하세요.
	SELECT count(*) FROM titles
	GROUP BY  title ;
-- 
-- Q14. salaries 테이블에서 사번별 평균 급여를 조회하세요.
	SELECT emp_no , avg(salary ) FROM salaries
	GROUP BY  emp_no  ;
-- 
-- Q15. employees 테이블에서 입사 연도별 사원 수를 조회하세요.
	SELECT count(*) FROM employees
	GROUP BY  hire_date   ;
-- 
-- Q16. 성별별 사원 수 중 100000명 이상인 경우만 조회하세요.
	SELECT gender, count(*) FROM employees
	GROUP BY gender 
	HAVING COUNT(*) >= 100000 ;
	
-- Q17. 부서별 사원 수 중 20000명 이상인 부서만 조회하세요.
	SELECT count(*) FROM titles 
	GROUP BY title 
	HAVING COUNT(*) >= 20000 ; 
-- 
-- Q18. 직급별 사원 수 중 50000명 이상인 직급만 조회하세요.
	SELECT title,count(*) FROM titles 
	GROUP BY title 
	HAVING COUNT(*) >= 50000 ;
-- 
-- Q19. 사번별 평균 급여가 80000 이상인 사원만 조회하세요.
	SELECT emp_no ,count(*) FROM salaries 
	GROUP BY emp_no  
	HAVING COUNT(*) >= 80000 ;
-- 
-- Q20. 입사 연도별 사원 수 중 10000명 이상인 연도만 조회하세요.
-- 
	SELECT YEAR(hire_date) ,count(*) '연도별' FROM employees 
	GROUP BY YEAR(hire_date)  
	
	HAVING COUNT(*) >= 10000 ;











