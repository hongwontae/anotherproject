-- CREATE DDL
-- 2023-04-18
-- DEFAULT는 INSERT에서 DEFAULT를 써주면 된다.

CREATE TABLE PHONEINFO_BASIC(
    IDX NUMBER(6) CONSTRAINT PHONEINFO_BASIC_IDX_PK PRIMARY KEY,
    FR_NAME VARCHAR2(20) CONSTRAINT PHONEINFO_BASIC_FRNAME_NN NOT NULL,
    FR_PHONENUMBER VARCHAR(20) CONSTRAINT PHONEINFO_BASIC_FRPHONENUMBER_NN NOT NULL,
    FR_EMAIL VARCHAR(20),
    FR_ADDRESS VARCHAR(20),
    FR_REGDATE DATE DEFAULT SYSDATE
);

CREATE TABLE PHONEINFO_UNIV(
    IDX NUMBER(6) CONSTRAINT PHONEINFO_UNIV_IDX_PK PRIMARY KEY,
    FR_U_MAJOR VARCHAR(20) DEFAULT 'N' CONSTRAINT PHONEINFO_UNIV_FR_NN NOT NULL,
    FR_U_YEAR NUMBER(1) DEFAULT '1' CONSTRAINT PHONEINFO_UNIV_FY_NN NOT NULL
                                    CONSTRAINT PIU_YEAR_CHECK CHECK(0 < FR_U_YEAR AND FR_U_YEAR < 5),
    FR_REF NUMBER(7) CONSTRAINT PU_REF_FK REFERENCES PHONEINFO_BASIC(IDX) NOT NULL);
    
CREATE TABLE PHONEINFO_COM(
    IDX NUMBER(6) CONSTRAINT PC_IDX_PK PRIMARY KEY,
    FR_C_COMPANY VARCHAR(20) DEFAULT 'N' CONSTRAINT PC_FCC_NN NOT NULL,
    FR_REF NUMBER(6) CONSTRAINT PC_FR_FK REFERENCES PHONEINFO_BASIC(IDX) NOT NULL
);

-- 1 테이블
SELECT * FROM PHONEINFO_BASIC;
INSERT INTO PHONEINFO_BASIC (IDX,FR_NAME,FR_PHONENUMBER,FR_EMAIL,FR_ADDRESS,FR_REGDATE)
                    VALUES (1,'아놀드','010-2489-5578','dnjsxoghd','의정부','');
                    
INSERT INTO PHONEINFO_BASIC (IDX,FR_NAME,FR_PHONENUMBER,FR_EMAIL,FR_ADDRESS,FR_REGDATE)
                    VALUES (2,'로버트슨','010-5589-5578','robertson','파리','');
                    
INSERT INTO PHONEINFO_BASIC (IDX,FR_NAME,FR_PHONENUMBER,FR_EMAIL,FR_ADDRESS,FR_REGDATE)
                    VALUES (3,'코나테','010-3366-5578','konate','영국','');
                    
-- 2 테이블
SELECT * FROM PHONEINFO_UNIV;

INSERT INTO PHONEINFO_UNIV (IDX,FR_u_major,FR_u_year,FR_REF)
                    VALUES (1,'반대전환',3,1);
INSERT INTO PHONEINFO_UNIV (IDX,FR_u_major,FR_u_year,FR_REF)
                    VALUES (2,'CROSS',2,2);
INSERT INTO PHONEINFO_UNIV (IDX,FR_u_major,FR_u_year,FR_REF)
                    VALUES (3,'BODY',1,3);
                    
-- 3 테이블
INSERT INTO PHONEINFO_COM (IDX,FR_C_COMPANY,FR_REF)
                        VALUES(1,'리버풀1',1);
INSERT INTO PHONEINFO_COM (IDX,FR_C_COMPANY,FR_REF)
                        VALUES(2,'리버풀2',2);
INSERT INTO PHONEINFO_COM (IDX,FR_C_COMPANY,FR_REF)
                        VALUES(3,'리버풀3',3);
                        
SELECT * FROM PHONEINFO_BASIC;
SELECT * FROM PHONEINFO_BASIC WHERE IDX=1;
SELECT * FROM PHONEINFO_BASIC WHERE IDX=2;

                

-- JOIN
SELECT * FROM PHONEINFO_BASIC B, PHONEINFO_UNIV U
WHERE B.IDX=U.FR_REF;

SELECT * FROM PHONEINFO_BASIC B, PHONEINFO_UNIV U
WHERE B.IDX=U.IDX;

SELECT * FROM PHONEINFO_BASIC B, PHONEINFO_UNIV U, PHONEINFO_COM C
WHERE B.IDX=U.FR_REF AND B.IDX=C.FR_REF;














                    