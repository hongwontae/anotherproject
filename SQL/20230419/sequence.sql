-- sequence : 연속된 숫자를 생성해주는 객체
-- create sequence 이름 [옵션]

drop sequence seq_dept_deptno;
create sequence seq_dept_deptno
start with 10
increment by 10
;

-- 자동 생성된 값 : 시퀀스객체이름.nextval
select seq_dept_deptno.nextval
from dual;
select * from dept01;
insert into dept01 values(seq_dept_deptno.nextval, 'test이름', 'test위치');

select seq_dept_deptno.currval
from dual;

