-- 2024.04.13
-- JOIN

--CROSCC JOIN
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
        
        
        
        
        
        
        
        
        
        
        
        