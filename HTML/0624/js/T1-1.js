$(document).ready(function(){
    
    /*
    $('선택자').이벤트함수();   //해당 요소의 이벤트를 강제로 실행
	$('선택자').이벤트함수(function(){});   //해당 요소의 이벤트 실행시 동작 코드를 등록

	$('선택자').메소드명();//해당 메소드의 값을 가져옴.         ex) val();
	$('선택자').메소드명(값1);//해당 메소드의 값을 값1로 설정.  ex) val(값1);

	$('선택자').prop(속성명);       //해당 속성의 값을 가져옴
	$('선택자').prop(속성명,값1);   //해당 속성의 값을 값1로 설정
    
    */ 

   $('.check-all').change(function(){
       var isChecked = $(this).prop('checked');
       $('input[type=checkbox]').prop('checked',isChecked); //방법1

       $('input[type=checkbox]').each(function(){           //방법2
           $(this).prop('checked', isChecked);
       }); 
   });
});