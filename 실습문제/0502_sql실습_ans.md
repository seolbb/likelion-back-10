### SELECT 문 사용 (기본 검색)

1. 모든 직원의 이름(first_name)과 성(last_name)을 조회
   ```sql
   SELECT first_name, last_name FROM employees;
   ```

2. 모든 부서의 이름과 위치 ID를 조회
   ```sql
   SELECT department_name, location_id FROM departments;
   ```

3. 직업 ID와 직업 타이틀을 조회
   ```sql
   SELECT job_id, job_title FROM jobs;
   ```

4. 각 위치의 주소와 우편번호를 조회
   ```sql
   SELECT street_address, postal_code FROM locations;
   ```

5. 국가 ID와 국가 이름을 조회
   ```sql
   SELECT country_id, country_name FROM countries;
   ```

6. 지역 ID와 지역 이름을 조회
   ```sql
   SELECT region_id, region_name FROM regions;
   ```

7. 모든 직원의 직업 ID를 조회
   ```sql
   SELECT employee_id, job_id FROM employees;
   ```

8. 부서 ID별로 부서 이름을 조회
   ```sql
   SELECT department_id, department_name FROM departments;
   ```

9. 직원 ID와 부서 ID를 조회
   ```sql
   SELECT employee_id, department_id FROM job_history;
   ```

10. 직원 ID, 이름과 성을 조회
    ```sql
    SELECT employee_id, first_name, last_name FROM employees;
    ```

### WHERE 구문 사용 (조건 검색)

1. 급여가 10000 이상인 직원의 이름과 급여를 조회
   ```sql
   SELECT first_name, last_name, salary FROM employees WHERE salary >= 10000;
   ```

2. 위치 ID가 1700인 부서의 이름을 조회
   ```sql
   SELECT department_name FROM departments WHERE location_id = 1700;
   ```

3. 직업 ID가 'IT_PROG'인 직원들의 전체 정보를 조회
   ```sql
   SELECT * FROM employees WHERE job_id = 'IT_PROG';
   ```

4. 부서 ID가 90인 직원들의 이름과 급여를 조회
   ```sql
   SELECT first_name, last_name, salary FROM employees WHERE department_id = 90;
   ```

5. 최소 급여가 5000 이상인 직업의 타이틀을 조회
   ```sql
   SELECT job_title FROM jobs WHERE min_salary >= 5000;
   ```

6. 성이 'King'인 직원의 전체 정보를 조회
   ```sql
   SELECT * FROM employees WHERE last_name = 'King';
   ```

7. 국가 ID가 'US'인 위치의 상세 정보를 조회
   ```sql
   SELECT * FROM locations WHERE country_id = 'US';
   ```

8. 시작 날짜가 '2001-01-01' 이전인 기록을 조회
   ```sql
   SELECT * FROM job_history WHERE start_date < DATE '2001-01-01';
   ```

9. 성에 'a'가 포함되는 직원들의 이름과 이메일을 조회
   ```sql
   SELECT first_name, last_name, email FROM employees WHERE last_name LIKE '%a%';
   ```

10. 부서 이름이 'Sales'인 부서의 모든 직원 정보를 조회
    ```sql
    SELECT e.* FROM employees e JOIN departments d ON e.department_id = d.department_id WHERE d.department_name = 'Sales';
    ```

### 날짜형 함수 사용 (날짜 데이터 처리)

1. 각 직원의 입사 연도를 조회
   ```sql
   SELECT first_name, last_name, EXTRACT(YEAR FROM hire_date) AS hire_year FROM employees;
   ```

2. 근무 기간을 월로 계산
   ```sql
SELECT employee_id, start_date, end_date,
       TIMESTAMPDIFF(MONTH, start_date, end_date) AS months_worked
FROM job_history;
   ```

3. 오늘로부터 입사한 지 10년 된 직원들의 이름과 입사 날짜를 조회
   ```sql
  SELECT first_name, last_name, hire_date 
FROM employees 
WHERE hire_date = CURDATE() - INTERVAL 120 MONTH;
   ```

4. 이번 달이 입사월인 직원들의 이름과 생일을 조회
   ```sql
  SELECT first_name, last_name, hire_date
FROM employees
WHERE MONTH(hire_date) = MONTH(CURDATE());
   ```

5. 입사 날짜가 최근 30년 이내인 직원들의 이름과 입사 날짜를 조회
   ```sql
   SELECT first_name, last_name, hire_date
FROM employees
WHERE hire_date >= CURDATE() - INTERVAL 30 YEAR;
   ```

6. job_history 테이블에서 직원이 특정 부서에 근무한 기간을 일(days) 단위로 조회
   ```sql
   SELECT employee_id, department_id, start_date, end_date,
       DATEDIFF(end_date, start_date) AS days_worked
FROM job_history;
   ```

7. 가장 오래전에 입사한 직원의 이름과 입사 날짜를 조회
   ```sql
   SELECT first_name, last_name, hire_date 
FROM employees 
ORDER BY hire_date ASC 
LIMIT 1;

   ```

8. `employees` 테이블에서 각 직원의 입사일로부터 경과한 일수를 조회하세요.
   ```sql
   SELECT first_name, last_name, hire_date,
       DATEDIFF(CURDATE(), hire_date) AS days_since_hire
FROM employees;

   ```

9. 1999년대에 시작된 모든 근무 기록을 조회
   ```sql
   SELECT * FROM job_history WHERE EXTRACT(YEAR FROM start_date) >= 1999;
   ```

10. 각 직원의 입사 날짜를 요일로 표시
    ```sql
    SELECT first_name, last_name, hire_date, DAYNAME(hire_date) AS weekday
FROM employees;
    ```

### 숫자형 함수 사용 (수치 데이터 처리)

1. 각 직원의 급여에 10% 인상된 금액을 계산하여 조회
   ```sql
   SELECT first_name, last_name, salary, salary * 1.10 AS increased_salary FROM employees;
   ```

2. 각 직업의 최소 급여와 최대 급여의 차이를 계산
   ```sql
   SELECT job_id, max_salary - min_salary AS salary_difference FROM jobs;
   ```

3. 각 직원의 급여를 원화로 환산하여 조회
   ```sql
   SELECT first_name, last_name, salary, salary * 1200 AS salary_in_krw FROM employees;
   ```

4. 전체 직원의 평균 급여보다 높은 급여를 받는 직원들의 이름과 급여를 조회
   ```sql
   SELECT first_name, last_name, salary FROM employees WHERE salary > (SELECT AVG(salary) FROM employees);
   ```

5. 각 직원의 급여에서 평균 급여를 뺀 금액을 계산하여 조회
   ```sql
   SELECT first_name, last_name, salary, salary - (SELECT AVG(salary) FROM employees) AS diff_from_avg FROM employees;
   ```

6. 급여의 표준 편차를 계산하여 조회
   ```sql
   SELECT STDDEV(salary) FROM employees;
   ```

7. 각 직원의 연봉을 계산하고, 연봉이 가장 높은 순으로 정렬하여 조회
   ```sql
   SELECT first_name, last_name, salary * 12 AS annual_salary FROM employees ORDER BY annual_salary DESC;
   ```

8. 부서 변경 횟수를 계산
   ```sql
   SELECT employee_id, COUNT(*) AS num_department_changes FROM job_history GROUP BY employee_id;
   ```

9. 직원들의 급여를 오름차순으로 정렬하여 조회
   ```sql
   SELECT first_name, last_name, salary FROM employees ORDER BY salary ASC;
   ```



### 문자 함수를 이용한 SQL 연습 문제

1. **직원의 성(last_name)을 대문자로 변환하여 조회하기**:
   ```sql
   SELECT first_name, UPPER(last_name) AS upper_last_name FROM employees;
   ```

2. **직원의 이름(first_name)의 첫 글자를 추출하기**:
   ```sql
   SELECT first_name, SUBSTR(first_name, 1, 1) AS initial FROM employees;
   ```

3. **직원의 성(last_name)에서 'a'가 몇 번 나오는지 세기**:
   ```sql
   SELECT last_name, LENGTH(last_name) - LENGTH(REPLACE(last_name, 'a', '')) AS a_count FROM employees;
   ```

4. **직원의 이메일에서 도메인 부분만 추출하기 (@ 이후 문자열)**:
   ```sql
   SELECT email, SUBSTR(email, INSTR(email, '@') + 1) AS domain FROM employees;
   ```

5. **직원의 전체 이름을 성과 이름으로 구분하여 조회하기**:
   ```sql
   SELECT first_name || ' ' || last_name AS full_name FROM employees;
   ```

6. **직원의 이름(first_name)에서 세 번째 문자부터 세 글자 가져오기**:
   ```sql
   SELECT first_name, SUBSTR(first_name, 3, 3) AS name_part FROM employees;
   ```

7. **모든 직원의 성(last_name)을 쉼표와 공백 후 이름(first_name)으로 표시하기**:
   ```sql
   SELECT last_name || ', ' || first_name AS name_format FROM employees;
   ```

8. **직원의 이름(first_name)의 길이를 구하여 조회하기**:
   ```sql
   SELECT first_name, LENGTH(first_name) AS name_length FROM employees;
   ```

9. **직원의 성(last_name)이 'King'인 직원 찾기 (대소문자 구분 없이)**:
   ```sql
   SELECT first_name, last_name FROM employees WHERE UPPER(last_name) = 'KING';
   ```

10. **직원의 성(last_name) 중 'M'으로 시작하는 사람들의 수 구하기**:
    ```sql
    SELECT COUNT(*) AS m_start_count FROM employees WHERE last_name LIKE 'M%';
    ```
