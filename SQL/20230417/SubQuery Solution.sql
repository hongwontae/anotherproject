-- SubQuery
-- 20230417

-- 43. 사원 번호가 7788인 사원과
-- 담당 업무가 같은 사원을 표시(사원 이름과 담당업무)하시오. ->7788인 사원의 담당업무

select job
from emp
where empno=7788;

select ename,job
from emp
where job=(select job
from emp
where empno=7788);

select *
from emp e1, emp e2
where e2.empno=7788 and e1.job=e2.job;

-- 44. 사원번호가 7499인 사원보다 급여가 많은 사원을 표시하시오.
-- 사원이름과 감당 업무

select ename,job
from emp
where sal>(select sal from emp where empno=7499);

-- 45. 최소급여를 받는 사원의 이름, 담당업무 및 급여를 표시하시오. (그룹함수 사용)

select min(sal)from emp;

select ename,job,sal
from emp
where sal=(select min(sal)from emp);

-- 46. 평균급여가 가장 적은 직급의 직급 이름과 직급의 평균을 구하시오.
-- 직급별 평균 
select job, trunc(avg(sal))
from emp
group by job
having avg(sal)=(select min(avg(sal))
from emp
group by job);

-- 직급별 최저 평균 급여
select min(avg(sal))
from emp
group by job;

-- 47.각 부서의 최소 급여를 받는 사원의 이름, 급여, 부서번호를 표시하시오.
select deptno, min(sal)
from emp
group by deptno;

select *
from emp e3, (select deptno, min(sal)as minsal
from emp
group by deptno) m
where e3.deptno=m.deptno and e3.sal=m.minsal;

-- 48. 담당업무가 ANALYST 인사원보다 급여가 적으면서 -> ANALYST 직급의 최소 급여보다 적어야한다.
-- 업무가 ANALYST가 아닌 사원들을
-- 표시(사원번호, 이름, 담당 업무, 급여)하시오.
select *
from emp
where job !='ANALYST' AND SAL< ALL(SELECT DISTINCT SAL
FROM EMP
WHERE JOB='ANALYST');

-- 49. 부하직원이 없는 사원의 이름을 표시하시오.
-- 나의 사원번호가 다른 사원의 mgr에 있다면 => 관리자 부하직원이 있다.
-- 나의 사원번호가 다른 사원의 mgr에 없다면 => 부하직원이 없다.

select distinct mgr
from emp
where mgr is not null;

select *
from emp
where empno not in(select distinct mgr
from emp
where mgr is not null);

-- 50.부하직원이 있는 사원의 이름을 표시하시오.
select *
from emp
where empno in(select distinct mgr
from emp
where mgr is not null);

-- 51.BLAKE와 동일한 부서에 속한 
-- 사원의 이름과 입사일을 표시하는 질의를 작성하시오. ( 단 BLAKE는 제외 )

select deptno
from emp
where ename='BLAKE';

SELECT ENAME, HIREDATE
FROM EMP
WHERE DEPTNO=(select deptno
from emp
where ename='BLAKE') AND ENAME != 'BLAKE';


-- 52. 급여가 평균 급여보다 많은
-- 사원들의 사원 번호와 이름을 표시하되 
-- 결과를 급여에 대해서 오름차순으로 정렬하시오.

SELECT TRUNC(AVG(SAL))
FROM EMP;

SELECT EMPNO, ENAME, SAL
FROM EMP
WHERE SAL>(SELECT TRUNC(AVG(SAL))
FROM EMP)
ORDER BY SAL ASC;

-- 53. 이름에 K가 포함된 사원과 같은 부서에서 일하는 사원의 사원 번호와 이름을 표시하시오.
SELECT DISTINCT DEPTNO
FROM EMP
WHERE ENAME LIKE '%K%';

SELECT EMPNO, ENAME
FROM EMP
WHERE DEPTNO IN(SELECT DISTINCT DEPTNO
FROM EMP
WHERE ENAME LIKE '%K%');

-- 54. 부서위치가 DALLAS인 사원의 이름과 부서번호 및 담당업무를 표시하시오.
-- 부서위치가 DALLAS인 부서번호와 같은 사람
-- 부서의 위치가 DALLAS인 부서번호
SELECT DEPTNO
FROM DEPT
WHERE LOC='DALLAS';

SELECT ENAME, DEPTNO, JOB
FROM EMP
WHERE DEPTNO =(SELECT DEPTNO
FROM DEPT
WHERE LOC='DALLAS');

-- 55. KING에게 보고하는 사원의 이름과 급여를 표시하시오.
-- EMP => MGR(상사)
-- KING에게 보고한다? => 사원의 MGR 칼럼에 KING 사원번호를 가지고 있으면 => KING이 상사이다.
-- MGR에 KING의 사원번호를 가지고 있는 사람을 찾자.
-- KING 사원의 사원번호
SELECT EMPNO 
FROM EMP
WHERE ENAME='KING';

SELECT ENAME, SAL
FROM EMP
WHERE MGR=(SELECT EMPNO 
FROM EMP
WHERE ENAME='KING');

-- 56. RESEARCH 부서의 사원에 대한 부서번호, 사원이름 및 담당 업무를 표시하시오.
-- RESEARCH의 부서의 부서번호
SELECT DEPTNO
FROM DEPT
WHERE DNAME='RESEARCH';

SELECT DEPTNO, ENAME, JOB
FROM EMP
WHERE DEPTNO=(SELECT DEPTNO
FROM DEPT
WHERE DNAME='RESEARCH');

-- 57. 평균 월급보다 많은 급여를 받고 
-- 이름에 M이 포함된 사원과 같은 부서에서 근무하는 사원의 
-- 사원 번호, 이름, 급여를 표시하시오.
SELECT AVG(SAL)
FROM EMP;

SELECT DISTINCT DEPTNO
FROM EMP
WHERE ENAME LIKE '%M%';

SELECT EMPNO, ENAME, SAL
FROM EMP
WHERE SAL>(SELECT AVG(SAL)
FROM EMP) AND IN (SELECT DISTINCT DEPTNO
FROM EMP
WHERE ENAME LIKE '%M%');

-- 59. 담당업무가 MANAGER 인 사원이 소속된 부서와 동일한 부서의 사원을 표시하시오.

SELECT DEPTNO
FROM EMP
WHERE JOB='MANAGER';

SELECT *
FROM EMP
WHERE DEPTNO IN (SELECT DEPTNO
FROM EMP
WHERE JOB='MANAGER');

-- (5) 박지성이구매한도서의출판사수
SELECT DISTINCT COUNT(B.PUBLISHER)
FROM ORDERS O, BOOK B, CUSTOMER C
WHERE O.BOOKID=B.BOOKID AND O.CUSTID=C.CUSTID
AND C.NAME='박지성';

-- (6) 박지성이구매한도서의이름, 가격, 정가와판매가격의차이
SELECT C.NAME, B.BOOKNAME, B.PRICE, B.PRICE-O.SALEPRICE AS "GAP"
FROM ORDERS O, BOOK B, CUSTOMER C
WHERE O.BOOKID=B.BOOKID AND O.CUSTID=C.CUSTID
AND C.NAME='박지성';

-- (7) 박지성이 구매하지 않은 도서의 이름
-- 구매한 도서를 찾고 해당 범위를 반전시키자.
-- 박지성이 구매한 도서의 BOOKID

SELECT DISTINCT BOOKID
FROM ORDERS O, CUSTOMER C
WHERE O.CUSTID=C.CUSTID AND C.NAME='박지성';

SELECT *
FROM BOOK
WHERE BOOKID NOT IN(SELECT DISTINCT BOOKID
FROM ORDERS O, CUSTOMER C
WHERE O.CUSTID=C.CUSTID AND C.NAME='박지성');

-- (8) 주문하지않은고객의이름(부속질의사용)
SELECT DISTINCT CUSTID
FROM ORDERS;

SELECT *
FROM CUSTOMER
WHERE CUSTID NOT IN (SELECT DISTINCT CUSTID
FROM ORDERS);

-- 구매 이력이 있는 고객
SELECT *
FROM CUSTOMER C
WHERE EXISTS (SELECT * FROM ORDERS O WHERE C.CUSTID=O.CUSTID);
-- SELECT의 결과가 1행이라도 있으면 참이 된다. () 상관관계가 이루어져야 한다.

-- (9) 주문금액의총액과주문의평균금액
SELECT SUM(SALEPRICE), AVG(SALEPRICE)
FROM ORDERS;

-- (10) 고객의이름과고객별구매액
-- GROUP BY, C.NAME, C.CUSTID
-- ORDERS, CUSTID JOIN
SELECT C.CUSTID ,C.NAME, SUM(O.SALEPRICE) AS TOTAL
FROM ORDERS O, CUSTOMER C
WHERE O.CUSTID=C.CUSTID
GROUP BY C.CUSTID, C.NAME
ORDER BY CUSTID;

-- (11) 고객의이름과고객이구매한도서목록
SELECT *
FROM ORDERS O, BOOK B, CUSTOMER C
WHERE O.BOOKID=B.BOOKID AND C.CUSTID=O.CUSTID;

-- (12) 도서의가격(Book 테이블)과판매가격(Orders 테이블)의차이가가장많은주문
-- 정가-판매가 => 최대 차이
SELECT MAX(PRICE-SALEPRICE) AS GAP
FROM ORDERS O, BOOK B
WHERE O.BOOKID=B.BOOKID;

SELECT O.ORDERID, B.PRICE, O.SALEPRICE, PRICE-SALEPRICE AS GAP
FROM ORDERS O, BOOK B
WHERE O.BOOKID=B.BOOKID 
AND B.PRICE-O.SALEPRICE=(SELECT MAX(PRICE-SALEPRICE) AS GAP
FROM ORDERS O, BOOK B
WHERE O.BOOKID=B.BOOKID
);

-- (13) 도서의판매액평균보다자신의구매액평균이더높은고객의이름
-- 고객별 총 판매액 출력 조건 -> 총 평균보다 더 높은 값을 가지는 고객만

select c.custid, c.name, trunc(avg(o.saleprice))
from orders o, customer c
where o.custid=c.custid
group by c.custid, c.name
having avg(saleprice)> (select avg(saleprice)
from orders)
order by c.custid;

-- (14) 박지성이 구매한 도서의 출판사와 같은 출판사에서 도서를 구매한 고객의 이름
-- orders, book이 조인을 하고 publisher in ()
-- 박지성이 구매한 도서의 출판사 이름

select distinct b.publisher
from orders o, book b, customer c
where o.bookid=b.bookid and o.custid=c.custid
and c.name='박지성';

select c.name 
from orders o, book b, customer c
where o.bookid=b.bookid and o.custid=c.custid 
and b.publisher in (select distinct b.publisher
from orders o, book b, customer c
where o.bookid=b.bookid and o.custid=c.custid
and c.name='박지성') and c.name <> '박지성';

-- (2) 두 개 이상의 서로 다른 출판사에서 도서를 구매한 고객의 이름
-- group by custid, name
-- 고객별 구매한 도서의 출판사의 순
select c.custid, c.name, count(distinct b.publisher)
from orders o, book b, customer c
where o.bookid=b.bookid and o.custid=c.custid
group by c.custid, c.name
having count(distinct b.publisher)>1;


-- 두 개 이상 출판사의 책을 구매한 회원 아이디
select *
from customer
where exists ();

select o.custid, count(distinct b.publisher)
from orders o, book b
where o.bookid=b.bookid
group by o.custid
having count(distinct b.publisher)>1;













