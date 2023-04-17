SELECT * 
FROM EMP CROSS JOIN DEPT;
------------------------- 위에는 ansi(표준)조인, 아래는 오라클 조인( 둘 다 cross join)
select *
from emp, dept;


-- inner 조인 : 테이블 사이에 열거하는 모든 조건이 일치하는 결과 집합을 반환한다.
-- inner join은 inner 생략하고 join만 써도 된다.
-- ansi vs oracle => oracle은 join on대신 where에 조건 칼럼을 표시한다.
select *
from dept d join emp e
on d.deptno=e.deptno;
------------------------
select *
from dept d, emp e
where d.deptno=e.deptno;

-- outer join : 아우터 조인은 칼람 값이 null 등 알 수 없는 경우에도 결과 집합을 조회할 수 있도록
-- 지원한다. 아우터 조인은 조회 결과의 중심을 어디에 두느냐에 따라 
-- LEFT OUTER JOIN, RIGHT OUTER JOIN, FULL OUTER JOIN으로 나눌 수 있다.

-- LEFT OUTER JOIN operation  오라클 레프트 아우터 조인의 경우 우측 컬럼에 (+) 표현을 추가한다.
-- right OUTER JOIN operation  오라클 라이트 아우터 조인의 경우 좌측 컬럼에 (+) 표현을 추가한다.



-- full join : oracle만을 위해 방법은 x 표준 방법만 있다.
select e.ename, e.deptno,d.dname
from emp e full join dept d
on e.deptno=d.deptno;















