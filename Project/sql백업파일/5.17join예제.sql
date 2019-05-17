/*JOIN*/
/*

select * 
from 테이블A
join 테이블B
on A.외래키 = B.기본키;

*/
/*학번이 a인 학생이 수강한 목록과 학생 이름을 출력하는 쿼리를 join을 이용하여 작성하세요
출력문  :  강의번호 학생이름 총점

select course.course_class_num , student.student_name, course.course_total
from course
join student
on course.course_student_num = student.student_num
where student.student_num = '100';

*/


/*학번이 a인 학생이 수강한 목록과 학생 이름을 출력하는 쿼리를 join을 이용하여 작성하세요
출력문  :  학생이름 과목명 총점

(((선생님 코드)))

select student_name, subject_title, course_total
from (select * from course where course_student_num = '100') as c
join student
on course_student_num = student_num
join class
on class_num = course_class_num
join subject
on subject_code = class_subject_code;

(((내코드)))
select student.student_name, a.subject_title, course.course_total
from course
join (select * from class join subject on class.class_subject_code = subject.subject_code) as a
on course.course_class_num = a.class_num
join student
on course.course_student_num = student.student_num
where student.student_num = '100';
*/

/* 출력문 : 학생이름, 과목명, 교수이름, 총점 */

select student.student_name, a.subject_title, professor.professor_name, course_total
from course
join (select * from class join subject on class.class_subject_code = subject.subject_code) as a
on course.course_class_num = a.class_num
join student
on course.course_student_num = student.student_num
join professor
on a.class_professor_num = professor.professor_num
where student.student_num = '100';




