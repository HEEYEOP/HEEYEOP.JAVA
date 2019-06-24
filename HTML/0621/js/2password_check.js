

$(document).ready(function(){
    //pw1 : 길이(내용이 변경됐을 때 체크 or 가입버튼이 클릭되었을 때)
    $('#pw1').change(function(){
        if(!checkLength('#pw1',8,13)){
            alert('8~13자리를 입력해야합니다');
        }
    });
     //pw2 : pw1과 동일하면 된다(조건은 pw1과 동일).
     $('#pw2').change(function(){
         if(!equals('#pw1','#pw2'))
            alert('비밀번호가 일치하지 않습니다');
     });
});

function checkLength(selector,min,max){
    //selector에 #을 입력안하고 순수하게 아이디명만 입력하는 경우 ex: pw1
    //var length = $('#'+selector).val().length;

    //selector에 #을 포함한 아이디값을 입력하는 경우 ex: #pw1
    var length = $(selector).val().length;

    if(length > max || length < min)
        return false;
    else
        return true;
}

function equals(sel1, sel2){
    if($(sel1).val() == $(sel2).val())
        return true;
    return false;
}