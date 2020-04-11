    show user;
    -- USER이(가) "MYORAUSER"입니다.
    
    select * from tab;
    
    select *
    from user_sequences;
    
    drop table jdbc_tbl_memo purge;
    
    drop sequence JDBC_SEQ_MEMO ;
    
    insert into jdbc_tbl_memo (no, name, msg) 
    values(2, '하하호호', '안녕');
    -- 1 행 이(가) 삽입되었습니다.
    
    update jdbc_tbl_memo set name = '안중근';
    -- 2개 행 이(가) 업데이트되었습니다.
    
    delete from  jdbc_tbl_memo;
    -- 2개 행 이(가) 삭제되었습니다.
    
    rollback;
    
    select *
    from jdbc_tbl_memo;
    
    String sql = "select no, name, msg\n"+
"            , to_char(writeday, 'yyyy-mm-dd hh24:mi:ss') AS writeday\n"+
"    from jdbc_tbl_memo\n"+
"    order by no desc";
    
select no, name, msg
        , to_char(writeday, 'yyyy-mm-dd hh24:mi:ss') AS writeday
from jdbc_tbl_memo
where msg like '%' || '안녕' || '%';

    
update jdbc_tbl_memo set msg = '바꿔봅시다';
where no = '1';

update jdbc_tbl_memo set msg = '0'
where no = '0';

rollback;

commit;

    select *
    from jdbc_tbl_memo;

String sql = "delete from jdbc_tbl_memo \n"+
"where no = 1;";

    commit;
    
    select *
    from jdbc_tbl_memo2;
    
    select *
    from jdbc_tbl_memo2
    where no = 2;
    
    select *
    from jdbc_tbl_memo2
    where no = '2';
    
    select *
    from jdbc_tbl_memo2
    where name = '김건형';
    
    select *
    from jdbc_tbl_memo2
    where to_char(no) = '하하하';
    
    
    select *
    from jdbc_tbl_memo2
    where to_char(no) = '2';
    
    select *
    from user_tables
    where table_name = 'JDBC_TBL_MEMO2' ;
    
    select *
    from user_sequences
    where sequence_name = 'JDBC_SEQ_MEMO2' ;
    
    
String sql = "select *\n"+
"from user_tables\n"+
"where table_name = 'JDBC_TBL_MEMO2' ;";
    
String sql = "drop table jdbc_tbl_memo2 purge; ";   

String sql = "drop sequence JDBC_SEQ_MEMO2 ;";






    --- /// 회원 테이블 생성하기 (부모) /// ---
    
    drop  table jdbc_member purge;
    
    
    create table jdbc_member
    ( userseq               number not null 
    , userid                  varchar2(30) not null
    , passwd                 varchar2(30) not null
    , name                  varchar2(20) not null
    , mobile                  varchar2(20) 
    , point                  number(10) default 0
    , registerday           date default sysdate
    , status                   number(1) default 1 -- status 컬럼의 값이 1이면 정상, 0 이면 탈퇴
    , constraint PK_jdbc_member Primary Key (userseq)
    , constraint UK_jdbc_member Unique (userid)
    , constraint CK_jdbc_member check (status in (0,1) )
    );
    -- Table JDBC_MEMBER이(가) 생성되었습니다.
    
    create sequence user_seq
    start with 1
    increment by 1
    nomaxvalue
    nominvalue
    nocycle
    nocache;
    -- Sequence USER_SEQ이(가) 생성되었습니다.


    

    --- /// 게시판 테이블 생성하기 /// ---
    
    create table jdbc_board
    ( boardno                   number not null
    , fk_userid                   varchar2(30) not null
    , 
    , constraint PK_ jdbc_board primany key (boardno)
    , constraint FK_ jdbc_board Foreign Key (fk_userid) references jdbc_member(userid)
    );
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    