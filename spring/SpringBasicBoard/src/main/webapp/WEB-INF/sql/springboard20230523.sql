insert into tbl_board (title, content, memidx)
value ('게시글 테스트1', '글쓰기 테스트',1);

-- insert into tbl_board (title, content, memidx) vlaue (#(),#(),#())

select * from tbl_board;

select bno, title,content, file, uname as writer, memidx
from tbl_board b, member m
where b.memidx=m.idx;