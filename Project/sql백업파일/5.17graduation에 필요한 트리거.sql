/*
===graduation에 필요한 트리거===
1.student 테이블에서 insert 이벤트가 발생하면 추가된 student_num의 정보를 이용하여 graduation 테이블에 insert를 한다.
2.graduation나머지 요소가 graduation_requirement의 조건을 충족시키면 graduation_ok를 알맞게 변경한다

*/

/* student 테이블에서 insert 이벤트가 발생하면 추가된 student_num의 정보를 이용하여 graduation 테이블에 insert를 한다. */

drop trigger if exists insert_student;
delimiter //
create trigger insert_student
	after insert on student
for each row
begin
	declare r_num int;
    declare r_year int;

	/*졸업 요건 정보는 입학년도와 전공을 통해 결정된다는 전제조건*/
    set r_year = left(new.student_num , 1); -- 졸업연도 계산
    if new.student_major is not null then
		set r_num = (select requirement_num from requirement 
								where new.student_major = requirement_major and requirement_entrance_year = r_year); -- 나는 여기서 오류야 왜냐면 r_year에는 학번의 첫번째글자가 들어가있을텐데 그걸 입학년도랑 비교하라고 하니 오류가 날테지!
	end if;

	insert graduation(graduation_student_num, graduation_reqirement_num)
    values(new.student_num, r_num);
    
end //
delimiter ; 





/*
DROP TRIGGER IF EXISTS insert_graduation;

DELIMITER //
CREATE TRIGGER insert_graduation AFTER insert ON student 
FOR EACH ROW 

BEGIN
if old.count(student) != new.count(student)  then
	insert graduation values();
end if;

END //
DELIMITER ;

*/



