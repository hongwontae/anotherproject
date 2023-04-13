SELECT * FROM BOOK;

-- 1 마당서점의고객이요구하는다음질문에대해SQL 문을작성하시오.

--(3) 박지성의총구매액(박지성의고객번호는1번으로놓고작성)
SELECT * FROM ORDERS;

SELECT SUM(SALEPRICE)
FROM ORDERS
WHERE CUSTID=1
;
--(4) 박지성이구매한도서의수(박지성의고객번호는1번으로놓고작성)

SELECT COUNT(*)
FROM ORDERS
WHERE CUSTID=1;


-- 2 마당서점의운영자와경영자가요구하는다음질문에대해SQL 문을작성하시오.

-- ​(1) 마당서점도서의총개수
SELECT COUNT(BOOKNAME)
FROM BOOK;

-- (2) 마당서점에 도서를 출고 하는 출판사의 총 개수
SELECT COUNT(DISTINCT PUBLISHER)
FROM BOOK
ORDER BY PUBLISHER;







