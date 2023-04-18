-- 20223-04-18 관계형 데이터베이스
-- 테이블의 내용, 추가, 수정 삭제하는 DML
-- CREATE, READ, UPDATE, DELETE => CRUD

-- 행을 기준으로 추가, 수정, 삭제한다.

-- INSERT : 데이터를 행 단위로 입력

-- 테스트 테이블 생성
CREATE TABLE DEPT01(
    DEPTNO NUMBER(2) CONSTRAINT PK_DEPT01_DEPTNO PRIMARY KEY,
    DNAME VARCHAR2(10) NOT NULL,
    LOC VARCHAR2(10)
);
DESC DEPT01;

-- INSERT INTO 테이블 이름 (칼럼,칼럼,칼럼 ....) VALUES (데이터,데이터,데이터....);
INSERT INTO DEPT01 (DEPTNO, DNAME, LOC) 
    VALUES  (10,'TEST','TEST-LOC');
    
INSERT INTO DEPT01 (LOC,DNAME,DEPTNO)
    VALUES('서울', '개발팀', 20);
    
INSERT INTO DEPT01 (DEPTNO, DNAME,LOC)
    VALUES (30,'QA','서울','MO'); -- 칼럼 수와 데이터 수가 일치하지 않는다.
-- 지정한 칼럼 수와 데이터 수는 일치해야 한다.

INSERT INTO DEPT01 (DEPTNO,DNAME) VALUES (30,'QA');

INSERT INTO DEPT01 (DEPTNO,DNAME) VALUES (NULL,NULL);
-- 제약조건 때문에 오류난다.

INSERT INTO DEPT01 (DEPTNO) VALUES (30);
-- 암묵적으로 NULL값이 들어간다. 근데 DNAME은 NOT NULL이라 행이 삽입되지 않는다.

INSERT INTO DEPT01 (DEPTNO,DANME) VALUES (30,'QA');
-- 적절한 칼럼의 이름이 기술하지 않았을 때 행이 삽입되지 않는다.

-- 모든 칼럼에 데이터를 입력하는 경우 -> 칼럼명을 생략하고 사용할 수 있다,
INSERT INTO DEPT01 VALUES (40, '기획팀', '대전');
-- CREATE 칼럼 순서, DESC 순서

-- NULL 값의 입력
-- 명시적 입력, 암묵적 입력
INSERT INTO DEPT01 VALUES (50,'TEST',NULL); -- 명시적 입력

INSERT INTO DEPT01 (DEPTNO, DNAME) VALUES (60,'TEST123'); -- 암묵적 입력

INSERT INTO DEPT01 VALUES (70,'TEST111','');

    
SELECT * FROM DEPT01;

-- 서브 쿼리를 이용한 데이터 입력
CREATE TABLE DEPT02
AS 
SELECT * FROM DEPT
WHERE 1=0;

INSERT INTO DEPT02
SELECT *
FROM DEPT;

DESC DEPT02;

-- UPDATE : 행 단위 칼럼들의 데이터를 변경한다. -> 해당 칼럼의 값을 입력/수정/삭제
-- UPDATE 테이블 이름 SET 킬럼1=새로운 값, 칼럼2=새로운 값, 칼럼3=새로운 값... 조건 ;
-- WHERE 절을 사용하지 않을 경우는 테이블에 있는 모든 행이 수정됩니다.

SELECT * FROM DEPT01;

-- 10번 부서의 이름을 '디자인팀'으로 변경하고 위치 정보를 '판교'로 수정하자
UPDATE DEPT01
SET DNAME='디자인', LOC='판교'
WHERE DEPTNO=10;
-- 한글을 3바이트로 인식한다. ORACLE에서만

SELECT * FROM EMP01;
-- 모든 사원의 부서번호를 30번으로 수정합시다.
CREATE TABLE EMP01
AS
SELECT * FROM EMP;

UPDATE  EMP01
SET DEPTNO=30;

-- 이번엔 모든 사원의 급여를 10% 인상시키는 UPDATE
UPDATE EMP01
SET SAL=SAL*1.1;

-- 모든 사원의 입사일을 오늘로 수정하려면 다음과 같이 합니다.
UPDATE EMP01
SET HIREDATE=SYSDATE;

-- 특정 행을 수정할 경우 WHERE절의 조건으로 행을 선택한다.
SELECT * FROM EMP01;
--부서번호가 10번인 사원의 부서번호를 30번으로 수정합시다.
UPDATE EMP01
SET DEPTNO=30
WHERE DEPTNO=10;

-- 급여가 3000 이상인 사원만 급여를 10% 인상합시다.
UPDATE EMP01
SET SAL=SAL*1.1
WHERE SAL>=3000;

-- 1987년에 입사한 사원의 입사일이 오늘로 수정합시다. 
DROP TABLE EMP01;
CREATE TABLE EMP01
AS
SELECT * FROM EMP;

SELECT * FROM EMP01;

UPDATE EMP01
SET HIREDATE=SYSDATE
WHERE SUBSTR(HIREDATE,1,2)='87';

-- 테이블에서 2개 이상의 칼럼 값 변경
-- SCOTT 사원의 부서번호는 40번으로, 직급은 MANAGER로 한꺼번에 수정하도록 합시다.
UPDATE EMP01
SET DEPTNO=40, JOB='MANAGER'
WHERE ENAME='SCOTT';

-- SCOTT 사원의 입사일자는 오늘로, 급여를 50 으로 커미션을 4000 으로 수정합시다.
UPDATE EMP01
SET HIREDATE=SYSDATE, SAL=50, COMM=4000
WHERE ENAME='SCOTT';

-- 서브 쿼리를 이용한 데이터 수정
-- 20번 부서의 지역명을 40번 부서의 지역명으로 변경
SELECT * FROM DEPT02;

SELECT LOC FROM DEPT02 WHERE DEPTNO=40;

UPDATE DEPT02
SET LOC=(SELECT LOC FROM DEPT02 WHERE DEPTNO=40)
WHERE DEPTNO=20;
-- 서브 쿼리를 이용해서 부서번호가 20인
-- 부서의 부서명과 지역명을 부서 번호가 40번인 부서와 동일하게 변경
UPDATE DEPT02 
SET (DNAME, LOC)=(SELECT DNAME,LOC
                    FROM DEPT02
                    WHERE DEPTNO=30)
WHERE DEPTNO=20;

SELECT * FROM DEPT02;

-- DELETE는 테이블의 행 단위 삭제이다.
-- DELETE FROM 테이블 이름 WHERE COMDITIONS(행을 선택하는 조건)
SELECT * FROM DEPT01;
-- DEPT01 테이블의 모든 행을 삭제, 모든 부서정보를 삭제한다.
DELETE FROM DEPT01;

-- 부서 테이블 DEPT02에서 30번 부서만 삭제합시다.
DELETE FROM DEPT02
WHERE DEPTNO=30;

SELECT * FROM DEPT02;
SELECT * FROM EMP01;

-- 사원 테이블에서 부서명이 세일즈인 사원을 모두 삭제해봅시다.
SELECT DEPTNO FROM DEPT02 WHERE DNAME='SALES';
DELETE EMP01 WHERE DEPTNO=(SELECT DEPTNO FROM DEPT02 WHERE DNAME='SALES');


























