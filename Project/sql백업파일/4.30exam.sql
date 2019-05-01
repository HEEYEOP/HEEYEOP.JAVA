

/* 카페 회원수를 쿼리문으로 수정해보세요 */
/*
update cafe
set cafe_total = (select count(*) from member where member_cafe_name = '취업카페')
where cafe_name = '취업카페' ;

select * from cafe;
*/


/* member_board_count를 수정해보세요*/
/*회원1이 카페1에 등록한 글의 갯수를 쿼리문으로 수정해보세요*/

update member 
set member_board_count = (select count(*) from board where board_writer ='wjdtnr' and board_cafe_name='중고나라')
where member_no >= 1 and member_user_id = 'wjdtnr' and member_cafe_name ='중고나라' ;

select * from member;



