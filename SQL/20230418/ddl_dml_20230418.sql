-- CREATE DDL
-- 2023-04-18

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

INSERT INTO PHONEINFO_BASIC (IDX,FR_NAME,FR_PHONENUMBER,FR_EMAIL,FR_ADDRESS,FR_REGDATE)
                    VALUES (1,'아놀드','010-2489-5578','dnjsxoghd','의정부','');
INSERT INTO PHONEINFO_BASIC (IDX,FR_NAME,FR_PHONENUMBER,FR_EMAIL,FR_ADDRESS,FR_REGDATE)
                    VALUES (2,'로버트슨','010-5589-5578','robertson','파리','');
INSERT INTO PHONEINFO_BASIC (IDX,FR_NAME,FR_PHONENUMBER,FR_EMAIL,FR_ADDRESS,FR_REGDATE)
                    VALUES (3,'코나테','010-3366-5578','konate','영국','');
                    