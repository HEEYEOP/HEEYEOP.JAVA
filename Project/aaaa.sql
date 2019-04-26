

/*select course.course_num, course.course_class_num, student.student_name 
from course
join student
on course.course_student_num = student.student_num;*/

/* 강의 테이블에는 과목 코드와 교수번호가 있는데, 현재 강의 테이블을 기준으로 아래와 같이 출력되도록 sql문을 작성하세요.
	강의번호 과목명 교수번호 강의실 일정 년도 학기*/

/*select class.class_num, subject.subject_title, class.class_professor_num
from class
join subject
on class.class_subject_code = subject.subject_code; */

select class.class_num, class.class_subject_code, professor.professor_name
from class
join professor
on class.class_professor_num = professor.professor_num;


