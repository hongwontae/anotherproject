-- 스칼라 부속질의 = SELECT 안에 SELECT
-- 인라뷰 = FROM TABLE 임의 생성
-- 중첩질의 = WHERE 안에 WHERE 묻기

--  마당서점의 고객별 판매액을 보이시오(결과는 고객이름과 고객별 판매액을 출력)
select (select name from customer cs where cs.custid=od.custid)"name",
sum(saleprice)"total"
from orders od
group by od.custid;

-- 고객번호가 2 이하인 고객의 판매액을 보이시오 (결과는 고객이름과 고객별 판매액 출력
SELECT cs.name, SUM(od.saleprice) "total" 
FROM (SELECT custid, name 
FROM Customer 
WHERE custid <= 2) cs, 
Orders od 
WHERE cs.custid=od.custid
GROUP BY cs.name;

SELECT orderid, saleprice
FROM Orders 
WHERE saleprice <= (SELECT AVG(saleprice) FROM Orders); 






