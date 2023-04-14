-- 2023.04.14
-- SUB QUERY

--스칼라 부속질의 : select 절에 쓸수 있는 서브쿼리이다. 반드시 단일값(질의결과 단일행, 단일열)

SELECT DEPTNO, (SELECT DNAME 
                FROM DEPT 
                WHERE DEPT.DEPTNO=EMP.DEPTNO) AS "LONG"
FROM EMP
WHERE ENAME = 'SCOTT';

SELECT O.CUSTID, C.NAME, SUM(saleprice)
FROM ORDERS O, CUSTOMER C
WHERE O.CUSTID=C.CUSTID
GROUP BY O.CUSTID, C.NAME
;

select o.custid,
        (select name from customer c where c.custid= o.custid) as name,
        (select sysdate from dual),
sum(o.saleprice)
from orders o
group by o.custid;
-- 단일 값이 들어가야 한다. *****`


-- 인라인 뷰 : from절 뒤에 오는 서브쿼리이다. 가상의 테이블, 테이블처럼 사용을 한다.

select empno, ename,job,hiredate
from emp
where deptno=30;

select *
from (select empno, ename,job,hiredate from emp where deptno=30)
where ename='SCOTT';
-- 보안을 해결 가능.

-- 고객번호가 2 이하인 고객들의 총 판매액
SELECT O.CUSTID, SUM(SALEPRICE) TOTAL
FROM (SELECT CUSTID, NAME FROM CUSTOMER WHERE CUSTID<=2)C, ORDERS O
WHERE C.CUSTID=O.CUSTID
GROUP BY O.CUSTID
;

SELECT ROWNUM, ENAME, HIREDATE
FROM EMP
ORDER BY HIREDATE;

SELECT ENAME, HIREDATE
FROM EMP
ORDER BY HIREDATE;

SELECT ROWNUM, ENAME, HIREDATE
FROM (SELECT ENAME, HIREDATE
FROM EMP
ORDER BY HIREDATE)
WHERE ROWNUM<=3;

-- EMP 테이블에서 최고 급여를 받는 사람 5명을 뽑아서 사원의 이름과 급여 정보를 출력해보자.
SELECT ROWNUM, ENAME, SAL
FROM (SELECT ENAME, SAL
FROM EMP
ORDER BY SAL DESC)
WHERE ROWNUM<=5;

-- 부속질의 : WHERE절 뒤에 오는 비교연산관 연산자를 

-- 비교 : 단일값이 나오는 서브쿼리를 사용해야 한다.
-- 평균급여보다 더 많은 급여를 받는 사원
SELECT AVG(SAL)FROM EMP; --2074;

SELECT *
FROM EMP
WHERE SAL>(SELECT AVG(SAL) FROM EMP)
;

-- 평균 주문금액 이하의 주문에 대해서 주문번호와 금액을 보이시오.
SELECT ORDERID, SALEPRICE
FROM ORDERS
WHERE SALEPRICE<=(SELECT AVG(SALEPRICE) FROM ORDERS);

-- 각 고객의 평균 주문금액보다 큰 금액의 주문 내역에 대해서 주문번호, 고객번호, 금액을 보이시오.
SELECT *
FROM ORDERS O1
WHERE SALEPRICE > (SELECT AVG(SALEPRICE) FROM ORDERS O2 WHERE O2.CUSTID=O1.CUSTID);
-- 고객의 평균 구매액을 구해야 한다.

-- 1번고객의 평균 구매액
SELECT AVG(SALEPRICE) FROM ORDERS WHERE CUSTID=1;

-- 주어진 문제가 3000 이상 받는 사원이 소속된 부서(10번, 20번)와 
-- 동일한 부서에서 근무하는 사원
-- 이기에 서브쿼리의 결과 중에서 하나라도 일치하면 참인 결과를 구하는 IN 연산자와 함께 사용되어야 합니다.

SELECT * FROM EMP WHERE SAL>=3000;
SELECT DEPTNO FROM EMP WHERE SAL>=3000;

--다중행 단일 열 : 10,20,30
SELECT *
FROM EMP
WHERE DEPTNO IN(SELECT DISTINCT DEPTNO FROM EMP WHERE SAL>=3000);

-- 대한민국에 거주하는 고객에게 
-- 판매한 도서의 총 판매액을 구하시오. 
SELECT SUM(SALEPRICE)
FROM ORDERS
WHERE CUSTID IN(SELECT CUSTID FROM CUSTOMER WHERE ADDRESS LIKE '%대한민국%');

-- 대한민국에 거주하는 고객 번호
SELECT CUSTID FROM CUSTOMER WHERE ADDRESS LIKE '%대한민국%';
SELECT CUSTID FROM CUSTOMER WHERE ADDRESS NOT LIKE '%대한민국%';
----- 둘 다 같다.
SELECT SUM(O.SALEPRICE)
FROM ORDERS O, CUSTOMER C
WHERE O.CUSTID=C.CUSTID
AND C.ADDRESS LIKE '%대한민국%';

-- 3번 고객이 주문한 도서의 최고 금액보다 더 비싼 도서를 구입한
-- 주문의 주문번호와 금액을 보이시오. 
SELECT *
FROM ORDERS
WHERE SALEPRICE > (SELECT MAX(SALEPRICE)FROM ORDERS WHERE CUSTID=3
);

-- 3번 고객이 주문한 도서의 최고 금액
SELECT SALEPRICE
FROM ORDERS
WHERE CUSTID=3;

-- 서브쿼리의 결과 데이터 모두와 비교해서 참일 때 => 참
SELECT *
FROM ORDERS
WHERE SALEPRICE > ALL(SELECT SALEPRICE FROM ORDERS WHERE CUSTID=3
); -- SALEPRICE > 6000AND12000AND13000

-- 부서번호가 30번인 사원들의 급여 중 가장 작은 값(950)보다 많은 급여를 받는 사원의 이름, 급여
SELECT SAL FROM EMP WHERE DEPTNO=30;
SELECT MIN(SAL) FROM EMP WHERE DEPTNO=30;

SELECT ENAME, SAL
FROM EMP
WHERE SAL>950;
-- SAL이 2850보다 크거나 SAL이 1600보다 크거나 SAL 1250보다 크거나 SAL이 1500 보다 크거나
-- SAL이 500보다 크거나

-- 부서번호가 30번인 사원들의 급여 중 가장 작은 값(950)보다 많은 급여를 받는 사원의 이름, 급여
SELECT ENAME, SAL
FROM EMP
WHERE SAL>ANY(SELECT SAL FROM EMP WHERE DEPTNO=30);


SELECT SUM(saleprice) "total"
FROM Orders od
WHERE EXISTS (SELECT *
FROM Customer cs
WHERE address LIKE '%대한민국%' AND cs.custid=od.custid);


-- EXISTS, NOT EXISTS
-- 상관관계가 반드시 필요한 서브쿼리가 조건의 결과로 사용 : SELECT의 결과가 존재하는지 여부에 따라 결과를
-- 처리한다. TRUE/FALSE

-- EXISTS 연산자로 대한민국에 거주하는 고객에게 판매한 도서의 총 판매액을 구하시오.
SELECT SUM(SALEPRICE)
FROM ORDERS O1
WHERE EXISTS (SELECT * FROM CUSTOMER C WHERE O1.CUSTID=C.CUSTID AND C.ADDRESS LIKE '%대한민국%');















