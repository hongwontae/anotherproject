--2023.01.11
-- SELECT

-- 로그인 한 사용자가 소유하고 있는 테이블의 정보를 알 수 있다. (질의에 대한 결과),(셀렉)
SELECT * FROM tab;

-- 테이블 정보 확인 (스크립트 출력) (유형은 도메인 유형을 뜻한다.) (벤더 = dbms을 만드는 회사)
DESCRIBE emp;
DESCRIBE dept;

-- 데이터 추출하는 질의어 : SELECT
-- select {칼럼이름, 칼럼이름, 칼럼이름 .... from 테이블이름(view 사용사능)};
-- selcet * from 테이블 이름; -> 전체 테이블 가져오는 경우

select *from dept; -- (대소문자 가리지 않는다.), (안에 들어있는 데이터는 대소문자 구별한다.)
seLECT *from DEPT; 

--특정 칼럼의 데이터만 출력
SELECT DNAME,DEPTNO, LOC
FROM DEPT
; --(SELECT 순서는 상관없다. 마음대로 정의할 수 있다.)

-- SELECT 구문의 프레젠테이션 영역에 테이블이 가지고 있는 칼럼 뿐 아니라 연산의 결과를 
-- 새로운 칼럼으로 출력할 수 있다.
SELECT SAL, SAL+100 FROM EMP;
SELECT SAL - 100 FROM EMP;
SELECT SAL + 100 FROM EMP;
SELECT SAL+100, SAL-100, SAL*12, SAL/2 FROM EMP;

-- 사원테이블에서 사원의 이름과 급여, 연봉계산 결과를 출력하세요.
-- 연봉의 계산은 급여*12+ 상여금 500
SELECT ENAME, SAL, SAL*12 FROM EMP;

-- 상여금 계산 => SAL*12+COMM = 커미션은 널은 가지고 있네?
SELECT SAL, COMM, SAL*12+COMM FROM EMP;

--널 값 수정하기
SELECT SAL,SAL*12+NVL(COMM,0), NVL(COMM,0) FROM EMP;

--칼럼의 이름에 별칭을 부여해 줄 수 있다.
-- 칼럼 뒤에 AS라고 하는 키워드를 작성하고 별칭을 기술하면 된다.

SELECT SAL,SAL*12+NVL(COMM,0) AS MANCITY, NVL(COMM,0) AS RIVERPOOL FROM EMP;

-- 문자열을 붙이는 연산 : 문자열 || 문자열
SELECT ENAME || ' is a ' || JOB as riverpool
FROM EMP;

-- select [distinct] from.... => 중복된 데이터를 제거하고 값을 하나씩만 출력해준다.
select deptno from emp;
select DISTINCT deptno from emp;
select distinct job from emp;

--원하는 행 검색
-- where 절을 사용한다.
--select.....from....where 조건식;
-- 급여가 3000 이상인 사원의 정보 리스트
select * from emp where sal>=3000;


-- 칼럼의 데이터를 같다 비교
-- 10번 부서의 소속된 사원들의 정보를 출력해보자.
select *from emp
where deptno =10;

--이름이 FORD인 사원의 사원번호(EMPNO)과 사원이름(ENAME)과 급여(SAL)을 출력하는 예제
-- 문자열 비교 = '' 싱글코트 사용을 해야한다.
select empno, ename, sal
from emp
where ename = 'FORD';

-- 날씨를 비교할 떄 홑 따옴표로 묶어준다.
select *
from emp
where hiredate = '81/12/03';

select *
from emp
where hiredate < '81/12/03';

-- 논리 연산자 : and, or, not
-- 10번 부서의 매니저가 누구인지 찾아보자
select * from emp where deptno=10 and job='MANAGER';
select * from emp where deptno=10 OR job='MANAGER';
select * from emp where deptno=20 OR DEPTNO =30 OR DEPTNO=40;
select * from emp where NOT deptno=10;
select * from emp where deptno<>10; -- =! <> NOT

SELECT * FROM EMP
WHERE SAL>=2000 AND SAL<=3000;
-- 범위 연산자 BETWEEN A AND B (A이상 B이하)
SELECT * FROM EMP
WHERE SAL BETWEEN 2000 AND 3000;

-- 범위 연산은 날짜도 가능하다. (날씨는 작은 따옴표로 정의한다.)
SELECT * FROM EMP
WHERE HIREDATE BETWEEN '1987/01/01' AND '1987/12/31';

-- 10번, 20번, 30번 부서에 소속한 사원의 정보를 출력한다.
SELECT * FROM EMP WHERE DEPTNO = 10 OR DEPTNO=20 OR DEPTNO=30;

--OR의 연산을 간단하게 처리 IN(값,값,값.....)
-- 칼럼 =값1 OR 칼럼=값2 OR 칼럼=값3.......................
SELECT * FROM EMP
WHERE DEPTNO IN(10,20,30);

-- 패턴 검색 : 문자열에 패턴 
-- -> 칼럼 LIKE '패턴' 
-- 패턴 형식 : %-> 0개이상 '%java%' -> java문자열을 포함하는 문자열
-- _ 한자리, __ 두자리, ___ 세자리(언더바_)
-- __a 앞 두자리는 어떤 문자가 와도 상관없고 a로 끝나는 세자리 문자열을 찾는다. 


-- f로 시작하는 사원이름의 리스트를 찾아주자.
SELECT * FROM EMP
WHERE ENAME LIKE 'S%';
--이름에 A를 포함하는 사원 리스트
SELECT * FROM EMP
WHERE ENAME LIKE '%A%';
--이름에 N으로 끝나는 사원의 리스트
SELECT * FROM EMP
WHERE ENAME LIKE '%N';

-- 사원 이름중 두번쨰 문자가 A인 사원 리스트
SELECT * FROM EMP
WHERE ENAME LIKE '_A%';

-- NOT 연산자
SELECT * FROM EMP
WHERE ENAME NOT LIKE '%A%';

SELECT * FROM EMP
WHERE DEPTNO NOT IN(10,20);

SELECT * FROM EMP
WHERE HIREDATE NOT BETWEEN '1981/01/01' AND '1981/12/31';

-- NULL 여부를 판단하는 IS NULL/ NOT NULL
-- 커미션이 등록되지 않은 사원 리시트
SELECT * FROM EMP
WHERE COMM IS NULL;
-- 커미션이 등록되어 있는 사원 리스트 (NULL이 아닌 값을 찾자.)
SELECT * FROM EMP
WHERE COMM IS NOT NULL;
-- 커미션을 받지 않는 사원 리스트
SELECT * FROM EMP
WHERE COMM =0 OR COMM IS NULL;
SELECT * FROM EMP
WHERE NOT(COMM =0 OR COMM IS NULL);
--커미션을 받는 사원의 리스트
SELECT * FROM EMP
WHERE COMM >0 AND COMM IS NOT NULL;

-- SELECT -FROM-WHERE-ORDERBY 순서를 지켜야 한다.
-- 특정 칼럼의 값을 오름차순이나 내림차순으로 정렬시켜준다.
-- 오름차순(ascending) 정렬 방식 : 작은 것이 위에 출력되고 아래로 갈수록 큰 값이 출력
-- 내림차순(descending) 정렬 방식 : 큰 값이 위에 출력되고 아래로 갈수록 작은 값이 출력
-- SELECT의 출력 결과의 정렬 : 오름차순 ASC 내림차순 DESC (ASC는 생략이 가능하다.), (칼럼 다음에 기술한다.)
-- 급여 순으로 사원 리스트를 출력
SELECT *FROM EMP
ORDER BY SAL ASC;
SELECT *FROM EMP
ORDER BY SAL DESC;

-- 문자 정렬
-- 이름 순
SELECT * FROM EMP
ORDER BY ENAME;
SELECT * FROM EMP
ORDER BY ENAME DESC;

--날짜 
-- 입사일이 빠른 순서내로 정렬해보자
SELECT * FROM EMP 
ORDER BY HIREDATE;
-- 입사일이 늦은 순서대로 정렬해보자
SELECT * FROM EMP 
ORDER BY HIREDATE DESC;

-- 급여 순으로 정렬
SELECT * FROM EMP
ORDER BY SAL, ENAME DESC;
-- 셀레리는 내림차순








