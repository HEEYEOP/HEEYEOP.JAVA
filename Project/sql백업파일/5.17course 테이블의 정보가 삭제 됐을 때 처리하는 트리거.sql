
/*course 테이블의 정보가 삭제 됐을 때 처리하는 트리거를 작성하세요*/

/* 삭제된 course 테이블의 정보 중 giveup_state가 Y이면 아무것도 안해도 된다.
===> 이전에 작성한 update 트리거에 의해서 total값이 하나 빠진 상태이기 때문에 해당 행을 지워도 total값에는 영향이 없다.
삭제된 course 테이블의 정보 중 giveup_state가 N이면 total값을 하나 빼야한다.

조건문
~이면..해라  ===> ~ 가 조건식 ..이 실행문

조건식 :  giveup_state가 N이다  => giveup_state가 'N'과 같다
실행문 : total값을 하나 빼라  =>  total = total -1;
*/



drop trigger if exists delete_course;

delimiter // 
create trigger delete_course after delete on course
FOR EACH ROW

begin

if old.giveup_state = 'N' then
	update class
	set total = total-1
	where old.class_no = no;
end if ;

end //
delimiter ;




