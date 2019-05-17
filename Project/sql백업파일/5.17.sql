drop procedure if exists getNo;

delimiter //
/*현재 날짜를 기준으로 yyyymmdd 형태의 번호를 생성하는 프로시저*/
create procedure getNo(
	out no varchar(30)
)
begin
	/* in 또는 out에서 선언한 변수는 declare를 통해 다시 선언하면 안된다.*/
	declare year varchar(4);
    declare month varchar(2);
    declare day varchar(2); 
    set year = year(now()); /*year()는 매개변수로 날짜를 넘겨주면 해당 날짜의 년도를 정수로 추출해서 넘겨준다*/
    set month = month(now());
    set day = day(now());

    /*월이 한자리이면 월 앞에 0을 붙이는 작업*/
    if month < 10 then 
		set month = concat('0', month); /*concat()은 문자열을 순서대로 이어 붙이는 함수*/
	end if;
    
    if day < 10 then
		set day =concat('0',day);
	end if;
    
    set no = concat(year, month, day);

end //
delimiter ;