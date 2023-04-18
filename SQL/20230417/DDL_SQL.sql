-- 사원 테이블과 유사한 구조의 사원번호, 사원이름, 급여 3개의 칼럼으로 구성
-- 된 EMP01 
create table emp01(
    empno number(4),
    name varchar(10),
    sal number(10,2)
);

-- CREATE TABLE 문에서 서브 쿼리를 사용하여 이미 존재하는 테이블과 동일한 구조와 내용을 갖는 새
-- 로운 테이블을 생성할 수 있습니다.

--전체 테이블 복사
create table emp02
as
select * from emp;

-- 원하는 칼럼만 복사
create table emp03
as
select empno, ename from emp;

-- 원하는 행만 복사 where절을 추가해서 사용
create table emp05
as
select *from emp
where deptno=10;

-- 데이티는 복사하지 않고 기존 테이블의 구조만 복사, 스키마만 복사
CREATE TABLE EMP06 
AS 
SELECT * FROM EMP WHERE 1=0; 

-- 테이블 구조 변경하는 ALTER (ADD, MODIFY, DROP)

-- EMP01 테이블에 문자 타입의 직급(JOB) 칼럼을 추가해 봅시다.
ALTER TABLE EMP01
ADD (JOB VARCHAR(9));

-- 1. 직급(JOB) 칼럼을 최대 30글자까지 저장할 수 있게 변경해 보도록 하자.
ALTER TABLE EMP01
MODIFY(JOB VARCHAR(30));

-- EMP01 테이블의 직급 칼럼을 삭제해 보도록 합시다.
ALTER TABLE EMP01
DROP COLUMN JOB;


-- 테이블 삭제 DROP, 테이블은 남기고 로우만 삭제 TRUNCATE, 테이블 이름 바꾸기 RENAME

-- CREATE TABLE을 학습할 때 만들어 놓았던 EMP01 테이블을 삭제해 봅시다.
DROP TABLE EMP01;

-- 테이블 EMP02 에 저장된 데이터를 확인하였으면 이번에는 테이블의 모든 로우를 제거
TRUNCATE TABLE EMP02;

-- EMP02 테이블의 이름을 TEST 란 이름으로 변경합시다
RENAME EMP02 TO TEST;


-- 데이터 무결성을 위한 제약 조건
-- 테이블에 부적절한 자료가 입력되는 것을 방지하기 위해서 테이블을 생성할 때
-- 각 컬럼에 대해서 정의하는 여러 가지 규칙
-- DESC는 NOT NULL만 확인이 가능하다.
-- NOT NULL 제약 조건은 컬럼 레벨로만 정의할 수 있다.


-- 컬럼 레벨 정의 방법으로 제약 조건 지정하기

-- 사원 테이블과 유사한 구조의 사원번호, 사원명, 직급, 부서번호 4개의 칼럼으로 구성
-- 된 EMP02 테이블을 생성하되 EMPNO와 EMPNAME 컬럼에 NOT NULL 제약 조건 설정
CREATE TABLE EMP02(
    EMPNO NUMBER (4) NOT NULL,
    ENAME VARCHAR2(10) NOT NULL,
    JOB VARCHAR2(10),
    DEPTNO NUMBER(2)
);
DESC EMP02;

-- 사원번호, 사원명, 직급, 부서번호 4개의 칼럼
-- 으로 구성된 EMP03 테이블을 생성하되 사원번호를 유일키로 지정합시다. 
DROP TABLE EMP03;
CREATE TABLE EMP03(
    EMPNO NUMBER (7) UNIQUE,
    ENAME VARCHAR2(9) NOT NULL,
    JOB VARCHAR (10),
    DEPTNO NUMBER (2)
);
DESC EMP03;

-- 제약 조건명을 지정하는 방법
-- CONSTRAINT [테이블명]_[칼럼명]_[제약 조건 유형]

-- 사원번호, 사원명, 직급, 부서번호 4개의 칼럼
-- 으로 구성된 EMP04 테이블을 생성하되 사원번호에는 유일키로 사원명은 NOT NULL 제약조건을 설정
CREATE TABLE EMP04(
    EMPNO NUMBER (4) CONSTRAINT EMP04_EMPNO_UQ UNIQUE,
    ENAME VARCHAR(10) CONSTRAINT EMP04_ENAME_NN NOT NULL,
    JOB VARCHAR(9),
    DEPTNO NUMBER(4)
);

-- 사원 테이블과 유사한 구조의 사원번호, 사원명, 직급, 부서번호 4개의 칼럼
-- 으로 구성된 테이블을 생성하되 기본 키 제약 조건을 설정
DROP TABLE EMP05;
CREATE TABLE EMP05(
    EMPNO NUMBER(4) CONSTRAINT EMP05_EMPNO_PK PRIMARY KEY,
    ENAME VARCHAR (9) CONSTRAINT EMP05_ENAME_NN NOT NULL,
    JOB VARCHAR (9),
    DEPTNO NUMBER (4)
);
DESC EMP05;

-- FK 외래키
-- 부모 키로 설정된 컬럼에 존재하는 값만 추가하고 존재하지 않는 값이라면 추가하지 않습니다

-- CHECK
-- CHECK 제약 조건은 입력되는 값을 체크하여 설정된 값 이외의 값이 들어오면 오류 메시지와 함께 명령
-- 이 수행되지 못하게 하는 것입니다.

-- 테이블 레벨의 제약 조건
-- 칼럼을 모두 정의하고 나서 테이블 정의를 마무리 짓기 전에 따로 생성된 칼럼들에
-- 대한 제약 조건을 한꺼번에 지정하는 것입니다.

DROP TABLE EMP03;
CREATE TABLE EMP03( 
 EMPNO NUMBER(4) CONSTRAINT EMP03_ENAME_NN NOT NULL, 
 ENAME VARCHAR2(10), 
JOB VARCHAR2(9),
DEPTNO NUMBER(4),
 CONSTRAINT EMP03_EMPNO_PK PRIMARY KEY(EMPNO), 
 CONSTRAINT EMP03_JOB_UK UNIQUE(JOB), 
 CONSTRAINT EMP03_DEPTNO_FK FOREIGN KEY(DEPTNO) 
 REFERENCES DEPT(DEPTNO) 
); 
































