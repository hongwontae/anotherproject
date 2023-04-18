CREATE TABLE DEPT01
AS
SELECT * FROM DEPT WHERE 1=0;

-- 칼럼 DEPTNO에 10을, 칼럼 DNAME에는 'ACCOUNTING'을, 칼럼 LOC에는 'NEW YORK'을 추가합시다.
INSERT INTO DEPT01 (DEPTNO,DNAME,LOC)
VALUES(10,'ACCOUNTING','NEW YORK');


-- INSERT 할 떄 4가지 오류
-- 칼럼 명에 기술된 목록의 수보다 VALUES 다음에 나오는 괄호 안에 기술한 값의 개수가 적으면 에러가 발생합니다.
INSERT INTO DEPT01 (DEPTNO,DNAME,LOC)
VALUES(10,'ACCOUNTING');

-- 칼럼 명에 기술된 목록의 수보다 VALUES 다음에 나오는 괄호에 기술한 값의 개수가 많으면 에러가 발생합니다.
INSERT INTO DEPT01 (DEPTNO,DNAME,LOC)
VALUES(10,'ACCOUNTING','NEW YORK',20);

-- 칼럼 명이 잘못 입력되었을 때에도 에러가 발생합니다. 
INSERT INTO DEPT01 (DEPTN2O,DNAME,LOC)
VALUES(10,'ACCOUNTING','NEW YORK');

-- 칼럼과 입력할 값의 데이터 타입이 서로 맞지 않을 경우에도 에러가 발생합니다.
INSERT INTO DEPT01 (DEPTNO,DNAME,LOC)
VALUES('ROBERTSON','ACCOUNTING','NEW YORK');

-- 칼럼에 대해 모두 데이터를 입력하는 경우 칼럼명 기술 X
-- DESC의 순서를 따르자.
DESC DEPT01;

INSERT INTO DEPT01
VALUES (20,'SALESMAN','MEXICO');


-- NULL 값 입력에는 두 가지가 있다.
-- 명시적 입력, 암시적 입력
-- 명시적 입력은 NULL을 넣어주는 것, 암시적 입력은 생략하는 것

--  지역명이 결정되지 않은 30번 부서에 부서명, 암시적 입력
INSERT INTO DEPT01 (DEPTNO,DNAME)
VALUES (30,'TECHNIQUES');

-- 명시적 입력
INSERT INTO DEPT01
VALUES (40,'EXCUTIVE',NULL);
-- NULL 대신 ''(작은 따옴표)를 써서 사용할 수 도 있다.


-- 서브 쿼리로 데이터 삽입하기
-- INSERT INTO 다음에 VALUES 절을 사용하는 대신에 서브 쿼리를 사용할 수 있습니다.
--  기존의 테이블에 있던 여러 행을 복사해서 다른 테이블에 삽입할 수 있습니다.
-- 주의할 점은 INSERT 명령문에서 지정한 컬럼의 개수나 데이터 타입이 서브 쿼리를 수행한 결과와 
-- 동일해야 한다는 점

-- 테이블 생성
CREATE TABLE DEPT02
AS
SELECT * FROM DEPT WHERE 1=0;

-- 서브 쿼리를 이용해서 데이터 삽입
INSERT INTO DEPT02
SELECT * FROM DEPT;


-- 테이블의 내용을 수정하기 위한 UPDATE 문
-- UPDATE 문은 기존의 행을 수정하는 것입니다. 따라서 어떤 행의 데이터를 수정하는지 WHERE 절을 
-- 이용하여 조건을 지정합니다.
-- WHERE 절을 사용하지 않을 경우는 테이블에 있는 모든 행이 수정됩니다. 

-- 테이블 생성
CREATE TABLE EMP01
AS
SELECT * FROM EMP;

-- 모든 사원의 부서번호를 30번으로 수정합시다.
UPDATE EMP01
SET DEPTNO=30;

-- 이번엔 모든 사원의 급여를 10% 인상시키는 UPDATE 문을 보겠습니다.
UPDATE EMP01
SET SAL=SAL*1.1;

-- 모든 사원의 입사일을 오늘로 수정
UPDATE EMP01
SET HIREDATE=SYSDATE;


-- 테이블의 특정 행만 변경
-- UPDATE 문에 WHERE 절을 추가하면 테이블의 특정 행이 변경됩니다.

-- 테이블 제거 후 EMP 다시 생성
DROP TABLE EMP01;

CREATE TABLE EMP01
AS
SELECT * FROM EMP;

-- 부서번호가 10번인 사원의 부서번호를 30번으로 수정합시다.
SELECT * FROM EMP01;

UPDATE EMP01
SET DEPTNO=30
WHERE DEPTNO=10;

-- 급여가 3000 이상인 사원만 급여를 10% 인상합시다.
UPDATE EMP01
SET SAL=SAL*1.1
WHERE SAL>=3000;

-- 1987년에 입사한 사원의 입사일이 오늘로 수정합시다.
UPDATE EMP01
SET HIREDATE=SYSDATE
WHERE SUBSTR(HIREDATE,1,2)='87';

--  하나의 칼럼이 아닌 복수 개 칼럼의 값을 변경하려면 기존 SET 절에 콤마를 추가하고 칼럼=값을 추가 기술
-- SCOTT 사원의 부서번호는 20번으로, 직급은 MANAGER로 한꺼번에 수정
UPDATE EMP01
SET DEPTNO=20, JOB='MANAGER'
WHERE ENAME='SCOTT';

-- SCOTT 사원의 입사일자는 오늘로, 급여를 50 으로 커미션을 4000 으로 수정합시다.
UPDATE EMP01
SET HIREDATE=SYSDATE, SAL=50, COMM=4000
WHERE ENAME='SCOTT';

-- 서브 쿼리를 이용한 데이터 수정하기
-- 20번 부서의 지역명을 40번 부서의 지역명으로 변경
SELECT * FROM DEPT01;

UPDATE DEPT01
SET LOC=(SELECT LOC FROM DEPT01 WHERE DEPTNO=40)
WHERE DEPTNO=20;

-- 테이블에 불필요한 행을 삭제하기 위한 DELETE 문
-- DELETE 문은 테이블에 저장되어 있는 데이터를 삭제합니다.
-- WHERE을 이용해서 특정 행을 삭제한다.
-- DELETE 문에 WHERE 절을 사용하지 않을 경우 테이블에 있는 모든 행이 삭제
-- UPDATE와 같다.

SELECT * FROM DEPT01;
SELECT * FROM EMP01;

DELETE FROM DEPT01;
DROP TABLE DEPT01;
CREATE TABLE DEPT01
AS
SELECT * FROM DEPT;
COMMIT;

-- 사원 테이블에서 부서명이 SALES인 사원을 모두 삭제해봅시다.
DELETE FROM DEPT01
WHERE DNAME='SALES';

DELETE FROM EMP01 
WHERE DEPTNO=(SELECT DEPTNO 
 FROM DEPT 
 WHERE DNAME='SALES'); 














