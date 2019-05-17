
/*
select course.course_num, course.course_student_num, 
	   student.student_name,  course.course_total
from course
join student on student.student_num = course.course_student_num
join class on course.course_class_num = class.class_num
join subject on subject.subject_code = class.class_subject_code;
*/

/*
select course.course_num, classdetail.subject_title, course.course_student_num, 
	   student.student_name,  course.course_total
from course
join (select * 
	  from class 
      join subject 
      on class.class_subject_code = subject.subject_code) as classdetail
on course.course_class_num = classdetail.class_num
join student
on student.student_num = course.course_student_num;
*/