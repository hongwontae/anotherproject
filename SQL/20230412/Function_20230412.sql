--2023.04.12
-- 함수

desc dual;
select * from dual;

-- 단일 행 함수 / 집합(그룹) 함수
-- 단일행 함수 : 숫자, 문자, 날짜, 변환, 기타 함수

-- 숫자 함수

-- ABS 절대값 함수
SELECT 10,-10, ABS(-10), ABS(10) FROM DUAL;
-- DUAL은 행이 하나, 값은 X하나이다. 

-- FLOOR 함수 : 소수점 아래를 절삭해준다.
SELECT 2.1, 2.9  ,FLOOR(2.1), FLOOR(2.9)
FROM DUAL;

-- ROUND 함수 : 지정 위치에서 반올림 처리
SELECT 1234.567, ROUND(1234.567), ROUND (1234.567, 1), ROUND(1237.567, -1)
FROM DUAL;
-- 값, 자리수 

-- TRINC 함수 : 특정 자리수 아래를 잘라낸다.
SELECT 1234.567, TRUNC (1234.567), TRUNC(1234.567, 1), TRUNC (1234.567, -1)
FROM DUAL;

-- MOD 함수 : 나머지 연산
SELECT MOD(1,3), MOD(2,3), MOD(0,3), MOD(3,0)
FROM DUAL;


-- 문자 함수 -> STRING 메서드와 유사한 점이 많다.

-- lower : 문자열 모두를 소문자로 변경
SELECT 'SCOTT', LOWER('SCOTT') FROM DUAL;
SELECT DNAME, LOWER(DNAME) FROM DEPT;

-- upper : 문자열 모두를 대문자로 변경
SELECT 'scott', upper('scott')
From dual;

-- INITCAP : 첫 글자만 대문자로 나머지 글자는 소문자로 변환
select INITCAP('scott')
FROM DUAL;

-- SUBSTR : 문자열을 추출
-- SUBSTR(원본, 시작위치), SUBSTR(원본, 시작위치, 반환할 문자의 개수)
-- 인덱스 1부터 시작, 0부터 시작은 자바
SELECT '안녕하세요. 손흥민입니다.',
    SUBSTR('안녕하세요. 손흥민입니다.',8),
    SUBSTR('안녕하세요. 손흥민입니다.',2,8)
FROM DUAL;

-- LENGTH : 문자열의 개수
SELECT LENGTH('안녕하세요. 손흥민입니다.')
FROM DUAL;

-- LPAD,RPAD  문자열에서 특정 자리수를 지정하고 자리에 데이터가 없을 때 패턴을 입력
SELECT '10', LPAD('10',5,'0'),
    RPAD('11',5,0)
FROM DUAL;
-- 원본 파일 10이고, 전체 5개 자리를 만들고, 데이터를 오른쪽에 밀고 나머지 공간은 0으로 준다.
-- 원본 파일 11이고, 전체 5개 자리를 만들고, 데이터를 왼쪽에 밀고 나머지 공간은 0으로 준다.
SELECT DEPTNO, LPAD(DEPTNO,5,'0') FROM DEPT;

--TRIM : 공백제거
SELECT '         ABC        ',
    TRIM('         ABC        '),
     TRIM('ABC        ')
FROM DUAL;

-- REPLACE 함수
SELECT 'STEVEN KING',
    REPLACE('STEVEN KING', 'STEVEN','S.'),
     REPLACE('STEVEN KING', 'STEVEN','')
FROM DUAL;


-- 날짜 함수

-- SYSDATE : 시스템 저장된 현재 날짜를 반환한다.
SELECT SYSDATE
FROM DUAL;

-- MONTHS_BETWEEN : 두 날짜 사이가 몇 개월인지를 반환한다.
SELECT SYSDATE, MONTHS_BETWEEN('23/12/12',SYSDATE)
FROM DUAL;

-- ADD_MONTHS : 특정 날짜에 개월 수를 더한다
SELECT ADD_MONTHS(SYSDATE,8)
FROM DUAL;
SELECT ADD_MONTHS(SYSDATE,-1)
FROM DUAL;
SELECT ADD_MONTHS(SYSDATE,-3)
FROM DUAL;
SELECT ADD_MONTHS(SYSDATE,-6)
FROM DUAL;

-- NEXT_DAY : 특정 날짜에서 최초로 도래하는 인자로 받은 요일의 날짜를 반환한다.
SELECT NEXT_DAY(SYSDATE,2)
FROM DUAL;

-- LAST_DAY : 해당 달의 마지막 날짜를 반환한다.
SELECT LAST_DAY (SYSDATE)
FROM DUAL;

-- ROUND : 인자로 받은 날짜를 특정 기준으로 반올림한다.
SELECT ROUND(SYSDATE)
FROM DUAL;

--TRUNC : 인자로 받은 날짜를 특정 기준으로 버린다.
SELECT TRUNC (SYSDATE)
FROM DUAL;


--형 변환 함수

-- DATE -> CHAR
-- TO_CHAR(원본(날짜 데이터,'페턴')
SELECT SYSDATE, 
    TO_CHAR(SYSDATE, 'YYYY-MM-DD'),
    TO_CHAR(SYSDATE, 'YYYY.MM.DD.'),
    TO_CHAR(SYSDATE, 'YYYY-MM-DD DAY'),
    TO_CHAR(SYSDATE,'YYYY.MM.DD. HH24:MI:SS')
FROM DUAL;

-- TO CHAR (NUMBER -> CHAR)
-- TO CHAR(원본 숫자, 패턴)
SELECT 123456789,
    TO_CHAR(123456789, '000000000000'),
    TO_CHAR(123456789, '000,000,000,000'),
    TO_CHAR(123456789, '9999999999999999999999'),
     TO_CHAR(123456789, '999,999,999,999,999,999,999'),
     TO_CHAR(123456789, 'L999,999,999,999,999,999,999'),
     TO_CHAR(123456789, '999,999') -- 범위를 넘어서면 오류가 발생한다.
FROM DUAL;
SELECT ENAME, TO_CHAR(SAL*1300,'999,999,999') AS WON
FROM EMP;

-- CAHR -> DATE
-- TO_DATE(문자열, '패턴')
select *
from emp
where hiredate = to_date('19810220','yyyymmdd');

insert into emp values (9999,'son','manager',7788,
to_date('04-2023-12','mm-yyyy-dd'),4000,null,10);
select * from emp;
rollback; --마지막 커밋 시점으로 회귀한다.

-- char - number
-- to_number('문자열','패턴') => 숫자 타입
select '20000'-'10000'
from dual; -- 자동 형변환해준다.
select to_number('20,000','999,999,999')- to_number('10,000','999,999,999')
from dual;

SELECT ENAME, SAL, COMM, SAL*12+COMM, 
NVL(COMM, 0), SAL*12+NVL(COMM, 0)
FROM EMP
ORDER BY JOB;

-- decode 함수 : 동등비교이다. =비교 연산 후 결과를 출력한다. switch와 유사하다.
SELECT ENAME, DEPTNO, 
 DECODE(DEPTNO, 10, 'ACCOUNTING', 
 20, 'RESEARCH', 
 30, 'SALES', 
40, 'OPERATIONS' ) 
 AS DNAME
FROM EMP;

SELECT ENAME, JOB, SAL,
DECODE(JOB,'ANAlYST',SAL*1.05,
             'SALESMAN',SAL*1.10,
           'MANAGER',SAL*1.15,
            'CLERK',SAL*1.20
            ) AS RAISESAL
FROM EMP
ORDER BY DEPTNO;


SELECT ENAME, DEPTNO, 
 DECODE(DEPTNO, 10, 'ACCOUNTING', 
 20, 'RESEARCH', 
 30, 'SALES', 
40, 'OPERATIONS' ) 
 AS DNAME
 from emp;
 
SELECT ename,deptno,
 CASE WHEN DEPTNO=10 THEN 'ACCOUNTING' 
 WHEN DEPTNO=20 THEN 'RESEARCH' 
 WHEN DEPTNO=30 THEN 'SALES' 
 WHEN DEPTNO=40 THEN 'OPERATIONS'
 END AS DNAME
FROM EMP;


-- 그룹함수, 집합함수, 집계함수, 다중행 함수 
-- 하나의 행이 아닌 다중행을 그룹으로 묶어서 처리
-- sum,avg : 해당 칼럼에 있는 값을 구해준다. // 널은 값은 무시해버린다.(sum,avg,count)
-- count : 행을 센다.
-- max,min

-- 급여 총액을 구해보자. 일반적으로 그룹함수 다음에 일반 칼럼 못나온다.
select sum(sal), to_char(sum(sal),'999,999')
from emp;

-- 커미션의 총합
select sum(comm), count(comm), avg(comm)
from emp;
-----------------------  동일하다
select comm from emp
where comm is not null;

-- 평균 급여
select avg(sal), trunc(avg(sal)), round(avg(sal),2)
from emp;

-- 최대 급여 max(), 최소 급여min()
select max(sal), min(sal)
from emp;

-- count () => row 개수
-- 전체 사원의 수
select count(*)
from emp;
-- 10번 부서의 사원의 수
select count(*)
from emp 
where deptno=10;
-- 부서의 개수
select count(*)
from dept;

-- 각 부서의 개수
select distinct job 
from emp
order by job;
select count(distinct job)
from emp;

SELECT COUNT(COMM)
FROM EMP;

-- 칼럼 단위로 묶는게 아니라 행 별로 묶고 싶다면 GROUP BY절
SELECT * 
FROM EMP
ORDER BY DEPTNO;

SELECT DEPTNO
FROM EMP
GROUP BY DEPTNO
ORDER BY DEPTNO;

-- 부서별 급여 평균을 구하는 것이다.
SELECT DEPTNO, AVG(SAL)
FROM EMP
GROUP BY DEPTNO
ORDER BY DEPTNO;

-- GROUP BY => 행 단위로 그룹핑
SELECT DEPTNO, COUNT(*) AS"사원의 수", SUM(SAL) AS "총 급여 액",
                TRUNC(AVG(SAL)) AS "총 평균 급여 액",
                MAX(SAL) AS "최고 급여 액",
                MIN(SAL) AS "최소 급여 액",
                COUNT(COMM) AS "커미션을 받는 사원의 수"
FROM EMP
GROUP BY DEPTNO
-- HAVING AVG(SAL)>=2000
 -- 그룹화된 데이터의 집합함수의 결과를 조건식으로 받을 때 HAVING
 -- 총 급여액이 10,000을 넘어가는 그룹
HAVING SUM(SAL) > 10000
ORDER BY DEPTNO;

SELECT JOB, COUNT(*), TRUNC(AVG(SAL)), SUM(SAL), MAX(SAL),MIN(SAL),MAX(SAL)-MIN(SAL)
FROM EMP
GROUP BY JOB;































