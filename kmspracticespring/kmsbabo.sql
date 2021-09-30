SELECT * FROM USER_OBJECTS;

CREATE TABLE springtest(
    no number PRIMARY KEY,
    name varchar2(20) not null,
    email varchar2(100) not null unique,
    password varchar2(20) not null,
    regdate date default sysdate
);

create sequence springtest_seq_val start with 1 increment by 1 NOCACHE NOCYCLE;

insert into springtest(no,name,email,password) values(SPRINGTEST_SEQ_VAL.nextval,'kms','blueha1023@naver.com','1234');


select * from springtest;