
/*select course.course_num, course.course_class_num, student.student_name 
from course
join student
on course.course_student_num = student.student_num;*/

/* 강의 테이블에는 과목 코드와 교수번호가 있는데, 현재 강의 테이블을 기준으로 아래와 같이 출력되도록 sql문을 작성하세요.
	강의번호 과목명 교수번호 강의실 일정 년도 학기*/

/*select class.class_num, subject.subject_title, class.class_professor_num
from class
join subject
on class.class_subject_code = subject.subject_code;	(on 다음에 나와야 하는 코드는 기준테이블.외래키명 = 참조테이블.기본키명)*/

/*select class.class_num, class.class_subject_code, professor.professor_name
from class
join professor
on class.class_professor_num = professor.professor_num; */







/*
select class.class_num, subject.subject_title, professor.professor_name 
from class
join subject on class.class_subject_code = subject.subject_code
join professor on class.class_professor_num = professor.professor_num
where professor.professor_name = '이교수'; */

/*
select count(*)
from course
join student
on course.course_student_num = student.student_num
where course.course_student_num = '100'; */


/*
select avg(course_mid*0.4 + course_end*0.4 + course_attendance*0.1 + course_report*0.1)
from course
join student
on course.course_student_num = student.student_num
where course.course_student_num = '100'; */

/*
select advisor.advisor_num, professor.professor_name, student.student_name
from advisor
join professor
on advisor.advisor_professor_num = professor.professor_num
join student
on advisor.advisor_student_num = student.student_num; */

/*
update course
set course.course_total = course_mid*0.4 + course_end*0.4 + course_attendance*0.1 + course_report*0.1
where course_num = 'course1';

select * from course; */











 






