/* board 테이블에 views(조회수) 속성을 추가한 후 update를 이용하여 조회수를 1 증가하는 쿼리문을 작성하세요

update board
set board_views = board_views + 1
where board_no = 1;
*/



/* board테이블에 게시글을 추가하는 쿼리문을 작성하세요 

insert into board(board_title, board_contents, board_writer, board_category_code, board_cafe_name)
values('가입인사', '안녕하세요' ,'gmlduq','categ1', '중고나라'); 


update member
set member_board_count = (select count(*) from board where board_writer = 'gmlduq' and board_cafe_name ='중고나라')
where member_no >= 1 and member_user_id = 'gmlduq' and member_cafe_name ='중고나라';

*/



/*board테이블 수정하는 쿼리문을 작성하세요

update board
set board_title = '등업요청', board_contents = '등업해주세요'
where board_no = 1; 
*/



/* 회원가입하는 쿼리문을 작성하세요 

insert into user(user_id, user_pw, user_email, user_name,user_nick,user_phone)
values('rudtn','2333','rudtn@naver.com','경수'); 
*/



/* 회원가입시 아이디가 a123인 아이디가 있는지 중복체크에 활용할 수 있는 쿼리문을 작성하세요

select count(*)
from user
where user_id = 'gmlduq';

->count(*) 결과가 1이면 중복이고 0이면 중복이 아님
*/



/*회원정보를 수정하는 쿼리문을 작성하세요 

update user
set user_pw = '777', user_ email ='' user_name = '희엽이', user_nick ='사자', user_phone = '010-7894-5631'
where user_id = 'gmlduq';
*/



/*회원이 카페에 가입할때 필요한 쿼리문을 작성하세요 

insert into member(member_cafe_name, member_user_id)
values('중고나라','rudtn');


 update cafe
 set cafe_total = (select count(*) from member where member_cafe_name ='중고나라')
 where cafe_name = '중고나라';
*/



/* 카페1에 등록된 모든 게시물들을 출력하는 쿼리를 작성하세요

select *
from board
where board_cafe_name = '중고나라';
*/



/* 카페1에 등록된 게시물 중 제목에 '단어(ex:가입)'가 포함된 게시물들을 출력하는 쿼리를 작성하세요 

select *
from board
where board_cafe_name = '중고나라' and board_title like '%가입%';
*/




/* 업로드 파일 데이터를 추가하고, 등록된 게시물에 첨부된 파일리스트를 출력하는 쿼리문을 작성하세요 

select *
from upload
where upload.upload_board_no = 2;
*/




/* 회원1이 카페1에 등록한 첨부 파일 리스트를 출력하는 쿼리문을 작성하세요

select board.board_no, board.board_title, upload.upload_filename
from upload
join board
on upload.upload_board_no = board.board_no 
where board.board_writer = 'gmlduq' and board.board_cafe_name = '중고나라';
 */




/* 카페1에 가입된 모든 회원들의 이메일을 출력하는 쿼리문을 작성하세요 

select user.user_id, user.user_email
from member
join user
on user.user_id = member_user_id
where member.member_cafe_name = '중고나라';
*/


/*게시글에 좋아요 기능을 추가하기 위한 테이블과 속성을 엑셀로 정리하고,
   기존 테이블에 수정이 필요한 경우 속성을 추가하세요 */
   




