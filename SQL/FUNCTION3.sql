-- 2024.04.13
-- JOIN

-- CROSCC JOIN
-- 스키마를 붙이고 결과 행은 모든 경우의 수 => N*N
-- EMP, DEPT => 14*4 => 56개를 가져온다.
-- 외래키와 연결된 경우 이를 많이 사용한다.

SELECT *
FROM EMP,DEPT
WHERE EMP.DEPTNO=DEPT.DEPTNO;

select d.deptno, empno, dname
from emp e, dept d
where e.deptno=d.deptno;
-- 중복된 칼럼은 별칭을 주고 사용, 중복x 그냥 써도 된다.

-- 이름이 scott인 사람의 부서명을 출력해봅시다.
-- 만약 JOIN을 모른다면 이렇게 출력한다.
select *
from emp
where ename='SCOTT';
-- 20
SELECT DNAME FROM DEPT
WHERE DEPTNO=20;

-- JOIN으로 해결
SELECT e.ename
FROM EMP e, DEPT d
WHERE e.DeptNO=d.DEPTNO
and ename='SCOTT';
 
 -- 사원별 급여 등급 표현
 select * 
 from salgrade;
 
 select e.ename,s.grade, s.losal, e.sal,s.hisal 
 from emp e, salgrade s
 where e.sal between s.losal and hisal;
 
 -- SELF-JOIN은 자기 자신의 테이블을 조인하는 경우
 -- 각 사원의 이름과 각 사원의 매니저 이름을 출력하자
 SELECT E.ENAME, M.ENAME AS "해당 관리자"
 FROM EMP E, EMP M
 WHERE E.MGR=M.EMPNO;
        
-- 아웃터 조인 : 조건에 만족하지 않는 행도 출력을 하는 조인입니다.        
SELECT E.ENAME,NVL(M.ENAME,'없음')
FROM EMP E, EMP M
WHERE E.MGR=M.EMPNO(+);
 
 SELECT *
 FROM EMP E JOIN EMP M
 ON E.MGR=M.EMPNO;
 
 SELECT *
 FROM EMP E LEFT OUTER JOIN EMP M
 ON E.MGR=M.EMPNO;
 
 -- ANSI JOIN
 SELECT *
 FROM EMP, DEPT;
 ------------------- 둘이 같다.
 SELECT *
 FROM EMP CROSS JOIN DEPT;
 
 -- INNER JOIN, EQUL 조인과 같다.
SELECT *
FROM EMP INNER JOIN DEPT
ON EMP.DEPTNO = DEPT.DEPTNO;
-- INNER 조인은 INNER 뺴고 가능
SELECT *
FROM EMP JOIN DEPT
ON EMP.DEPTNO = DEPT.DEPTNO;

SELECT *
FROM EMP JOIN DEPT
USING(DEPTNO); -- USING를 기준으로
------------------ 둘이 비슷하게 나온다.
SELECT *
FROM EMP NATURAL JOIN DEPT;

SELECT DEPTNO
FROM EMP NATURAL JOIN DEPT;


-- 도서 판매 정보 출력















        
        
        