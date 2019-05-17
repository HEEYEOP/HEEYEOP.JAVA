/* grduation 테이블에서 학생 정보가 주어졌을 때 ,
 graduation_ck에 값을 설정하는 프로시저를 작성하세요*/
 
 
USE university;

DROP PROCEDURE IF EXISTS update_graduation;

DELIMITER //

CREATE PROCEDURE update_graduation(
	IN in_student_num INT,
    In in_requirement_num Int
)

BEGIN

	DECLARE s_english, r_english INT;
    DECLARE s_project, r_project VARCHAR(1);
    DECLARE s_paper, r_paper VARCHAR(1);
    DECLARE s_test, r_test VARCHAR(1);
    DECLARE s_certificate, r_certificate VARCHAR(1);
    


	SET s_english = (SELECT graduation_english FROM graduation WHERE graduation_student_num = in_student_num);
	SET s_project = (SELECT graduation_project FROM graduation WHERE graduation_student_num = in_student_num);	
    SET s_paper = (SELECT graduation_paper FROM graduation WHERE graduation_student_num = in_student_num);	
    SET s_test = (SELECT graduation_test FROM graduation WHERE graduation_student_num = in_student_num);	
    SET s_certificate = (SELECT graduation_certificate FROM graduation WHERE graduation_student_num = in_student_num);	



    SET r_english = (SELECT requirement_english FROM requirement WHERE requirement_num = in_requirement_num);
	SET r_project = (SELECT requirement_project FROM requirement WHERE requirement_num = in_requirement_num);	
    SET r_paper = (SELECT requirement_paper FROM requirement WHERE requirement_num = in_requirement_num);	
    SET r_test = (SELECT requirement_test FROM requirement WHERE requirement_num = in_requirement_num);	
    SET r_certificate = (SELECT requirement_certificate FROM requirement WHERE requirement_num = in_requirement_num);	



    IF r_english <= s_english 
		AND ( r_paper = 'N' || (r_paper = 'Y' AND s_paper='Y') )
        AND ( r_test = 'N' || (r_test = 'Y' AND s_test='Y') )
        AND ( r_project = 'N' || (r_project = 'Y' AND s_project='Y') )
        AND ( r_certificate = 'N' || (r_certificate = 'Y' AND s_certificate='Y') ) THEN

        UPDATE 	graduation
        SET		graduation_ok = 'Y'
		WHERE	graduation_student_num = in_student_num;

	ELSE

		UPDATE 	graduation
        SET		graduation_ok = 'N'
		WHERE	graduation_student_num = in_student_num;

	END IF;

END //

DELIMITER ;
