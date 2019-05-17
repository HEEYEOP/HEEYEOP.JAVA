/*프로그램을 등록한 회원목록을 가져오시오
select program.program_name, user.user_name
from enroll
join user
on enroll.enroll_user_code = user.user_code
join program
on enroll.enroll_program_code = program.program_code;
*/

/*회원이 등록할 수 있는 프로그램목록을 가져오시오
select *
from program
where program.program_state = '모집중';
*/

/*회원들에게 각자관심분야에 맞는 강좌목록을 보여주시오 
select user.user_name, user.user_interest_field_code, field.*, program.program_code
from user
join field
on user.user_interest_field_code = field.field_code
join program
on user.user_interest_field_code = program.progrm_field_code
where user.user_teacher_code is null;
*/


/*회원1에게 회원관심분야 강좌를 보여주시오

select user.user_name, user.user_interest_field_code, field.*, program.program_code
from user
join field
on user.user_interest_field_code = field.field_code
join program
on user.user_interest_field_code = program.progrm_field_code
where user.user_name = '희엽';
*/






















