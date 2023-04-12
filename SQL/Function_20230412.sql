--2023.04.12
-- 함수

desc dual;
select * from dual;

-- 단일 행 함수 / 집합(그룹) 함수
-- 단일행 함수 : 숫자, 문자, 날짜, 변환, 기타 함수

-- 숫자 함수

-- ABS 절대값 함수
SELECT 10,-10, ABS(-10), ABS(10) FROM DUAL;
-- DUAL은 행이 하나, 값은 X하나이다. 

-- FLOOR 함수 : 소수점 아래를 절삭해준다.
SELECT 2.1, 2.9  ,FLOOR(2.1), FLOOR(2.9)
FROM DUAL;

-- ROUND 함수 : 지정 위치에서 반올림 처리
SELECT 1234.567, ROUND(1234.567), ROUND (1234.567, 1), ROUND(1237.567, -1)
FROM DUAL;
-- 값, 자리수 

-- TRINC 함수 : 특정 자리수 아래를 잘라낸다.
SELECT 1234.567, TRUNC (1234.567), TRUNC(1234.567, 1), TRUNC (1234.567, -1)
FROM DUAL;

-- MOD 함수 : 나머지 연산
SELECT MOD(1,3), MOD(2,3), MOD(0,3), MOD(3,0)
FROM DUAL;


-- 문자 함수 -> STRING 메서드와 유사한 점이 많다.

-- lower : 문자열 모두를 소문자로 변경
SELECT 'SCOTT', LOWER('SCOTT') FROM DUAL;
SELECT DNAME, LOWER(DNAME) FROM DEPT;

-- upper : 문자열 모두를 대문자로 변경
SELECT 'scott', upper('scott')
From dual;

-- INITCAP : 첫 글자만 대문자로 나머지 글자는 소문자로 변환
select INITCAP('scott')
FROM DUAL;

-- SUBSTR : 문자열을 추출
-- SUBSTR(원본, 시작위치), SUBSTR(원본, 시작위치, 반환할 문자의 개수)
-- 인덱스 1부터 시작, 0부터 시작은 자바
SELECT '안녕하세요. 손흥민입니다.',
    SUBSTR('안녕하세요. 손흥민입니다.',8),
    SUBSTR('안녕하세요. 손흥민입니다.',2,8)
FROM DUAL;

-- LENGTH : 문자열의 개수
SELECT LENGTH('안녕하세요. 손흥민입니다.')
FROM DUAL;

-- LPAD,RPAD  문자열에서 특정 자리수를 지정하고 자리에 데이터가 없을 때 패턴을 입력
SELECT '10', LPAD('10',5,'0'),
    RPAD('11',5,0)
FROM DUAL;
-- 원본 파일 10이고, 전체 5개 자리를 만들고, 데이터를 오른쪽에 밀고 나머지 공간은 0으로 준다.
-- 원본 파일 11이고, 전체 5개 자리를 만들고, 데이터를 왼쪽에 밀고 나머지 공간은 0으로 준다.
SELECT DEPTNO, LPAD(DEPTNO,5,'0') FROM DEPT;

--TRIM : 공백제거
SELECT '         ABC        ',
    TRIM('         ABC        '),
     TRIM('ABC        ')
FROM DUAL;

-- REPLACE 함수
SELECT 'STEVEN KING',
    REPLACE('STEVEN KING', 'STEVEN','S.'),
     REPLACE('STEVEN KING', 'STEVEN','')
FROM DUAL;


-- 날짜 함수

-- SYSDATE : 시스템 저장된 현재 날짜를 반환한다.
SELECT SYSDATE
FROM DUAL;

-- MONTHS_BETWEEN : 두 날짜 사이가 몇 개월인지를 반환한다.
SELECT SYSDATE, MONTHS_BETWEEN('23/12/12',SYSDATE)
FROM DUAL;

-- ADD_MONTHS : 특정 날짜에 개월 수를 더한다
SELECT ADD_MONTHS(SYSDATE,8)
FROM DUAL;
SELECT ADD_MONTHS(SYSDATE,-1)
FROM DUAL;
SELECT ADD_MONTHS(SYSDATE,-3)
FROM DUAL;
SELECT ADD_MONTHS(SYSDATE,-6)
FROM DUAL;

-- NEXT_DAY : 특정 날짜에서 최초로 도래하는 인자로 받은 요일의 날짜를 반환한다.
SELECT NEXT_DAY(SYSDATE,2)
FROM DUAL;

-- LAST_DAY : 해당 달의 마지막 날짜를 반환한다.
SELECT LAST_DAY (SYSDATE)
FROM DUAL;

-- ROUND : 인자로 받은 날짜를 특정 기준으로 반올림한다.
SELECT ROUND(SYSDATE)
FROM DUAL;

--TRUNC : 인자로 받은 날짜를 특정 기준으로 버린다.
SELECT TRUNC (SYSDATE)
FROM DUAL;












