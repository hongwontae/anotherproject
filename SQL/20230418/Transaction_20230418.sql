-- 트랙잭션
-- 여러 개의 명령어의 집합이 정상적으로 처리되면 정상 종료하도록 하고 여러 개의 명령어 중에서 하나의 
-- 명령어라도 잘못되었다면 전체를 취소해버립니다.
-- 데이터베이스에서 작업의 단위로 트랜잭션이란 개념을 도입한 이유는 데이터의 일관성을 유지하면서 
-- 안정적으로 데이터를 복구시키기 위해서입니다.
-- 하나의 트랜잭션은 All-OR-Nothing 방식으로 처리됩니다.

-- 트랜잭션 제어를 위한 명령어(Transaction Control Language)
-- commit, rollback => 물리적으로 적용한다.

-- DML(Data Manipulation Language)은 이들이 실행됨과 동시에 트랜잭션이 진행됩니다. 
--  DML 작업이 성공적으로 처리되도록 하기 위해서는 COMMIT 명령을, 작업을 취소하기 위해서는 
-- ROLLBACK 명령으로 종료해야 합니다.
-- COMMIT 명령어를 수행하게 되면 하나의 트랜잭션 과정을 종료하게 됩니다.

-- ROLLBACK은 작업 중 문제가 발생되어서 트랜잭션의 처리 과정에서 발생한 변경사항을 취소하는 명령어
-- ROLLBACK 명령어 역시 트랜잭션 과정을 종료하게 됩니다. 
-- ROLLBACK => 마지막 커밋 시점으로 돌아간다.

DELETE FROM EMP;
SELECT * FROM EMP;
SELECT * FROM EMP01;
DELETE FROM EMP01;
ROLLBACK;

















