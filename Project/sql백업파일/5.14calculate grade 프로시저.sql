use university;

DROP PROCEDURE IF EXISTS calculate_grade; 
DELIMITER // 
CREATE PROCEDURE calculate_grade( 
	IN in_mid DOUBLE, 
    IN in_end DOUBLE, 
    IN in_att INT, 
    IN in_rep INT, 
    IN in_class_num INT, 
    IN in_student_num INT 
) 
BEGIN 
	DECLARE total DOUBLE DEFAULT 0; 
    DECLARE grade VARCHAR(2); 
    SET total = in_mid + in_end + in_att + in_rep; 
    
    IF total >= 95 AND total <= 100 THEN 
		SET grade = 'A+'; 
	END IF; 
    IF total >=90 AND total < 95 THEN 
		SET grade = 'A'; 
	END IF; 
    IF total >=85 AND total < 90 THEN 
		SET grade = 'B+'; 
	END IF; 
    IF total >=80 AND total < 85 THEN 
		SET grade = 'B'; 
	END IF; 
    IF total >=75 AND total < 80 THEN 
		SET grade = 'C+'; 
	END IF; 
    IF total >=70 AND total < 75 THEN 
		SET grade = 'C'; 
	END IF; 
    IF total >=65 AND total < 70 THEN 
		SET grade = 'D+'; 
	END IF; 
    IF total >=60 AND total < 65 THEN 
		SET grade = 'D'; 
	END IF; 
    IF total >=0 AND total < 60 THEN 
		SET grade = 'F'; 
	END IF; 
    
    UPDATE university.course 
    SET course_mid = in_mid, 
		course_end = in_end, 
        course_report = in_rep, 
        course_attendance = in_att, 
        course_total = total, 
        course_grade = grade 
	WHERE course_student_num = in_student_num AND course_class_num = in_class_num AND course_num >= 1; 
    END // 
    DELIMITER ;
    
    SHOW procedure status;
    