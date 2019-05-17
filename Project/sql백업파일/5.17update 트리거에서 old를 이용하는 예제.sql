DROP TRIGGER IF EXISTS update_course;

DELIMITER //
CREATE TRIGGER update_course AFTER update ON course 
FOR EACH ROW 

BEGIN

	/*update 트리거에서 old를 이용하는 예제*/ 
 
	/*수강 신청했다가 수강 포기를 하는 경우	->	giveup_state가 N이었다가 Y로 바뀌는 경우*/
    if old.giveup_state = 'N' and new.giveup_state = 'Y' then
        update class
        set total = total -1
        where no = new.class_no;
	end if;
	
    /*수강 포기를 했다가 수강 포기를 철회하는 경우	->	giveup_state가 Y이었다가 N로 바뀌는 경우*/
    if old.giveup_state = 'Y' and new.giveup_state = 'N' then
		update class
        set total = total +1
        where no = new.class_no;
	end if;
        
END // 
DELIMITER ;


