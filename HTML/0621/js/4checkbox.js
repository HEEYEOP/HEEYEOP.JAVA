

// $(document).ready(function(){
//     $('.box-check').change(function(){
//         var isChecked = $(this).prop('checked');
//         if(isChecked){  //체크된경우
//             $('.box').eq($(this).val()).addClass('display-none');
//         }
//         else{ //해제된 경우
//             $('.box').eq($(this).val()).removeClass('display-none');
//         }
//     });
// });

$(document).ready(function(){
    $('.box-check').change(function(){
        var isChecked = $(this).prop('checked');
        var pos = 0; //현재 이벤트가 발생된 체크박스의 위치
        var cnt = 0;
        var thisObj = $(this);
  
        $('.box-check').each(function(){
            if($(this).val() == thisObj.val()){ //여기 this는 box-check클래스를 가지고 있는 요소를 하나씩 꺼냈을 때 해당되는 요소
                pos = cnt;
            }
            cnt++;
        });

        if(isChecked){
            $('.box').eq(pos).addClass('display-none');
        }
        else{ 
            $('.box').eq(pos).removeClass('display-none');
        }
    });
});