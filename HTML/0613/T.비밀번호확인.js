

function checkPwConfirm(idpw1,idpw2,min,max){
    var pw1 = document.getElementById(idpw1).value;
    var pw2 = document.getElementById(idpw2).value;

    var strErrorPw1 = 'error' + idpw1; //비밀번호 id값을 이용하여 에러메세지박스 아이디 만들기
    var strErrorPw2 = 'error' + idpw2;
    
    var errorMessage1 ='';
    var errorMessage2 ='';

    
    if( !checkPw(pw1,min,max) ){ 
        errorMessage1 = '비밀번호는 '+ min + '~' + max + '자리 입니다.'
    }
    if( pw1 != pw2 ){
        errorMessage2 = '비밀번호가 일치하지 않습니다.'    
    }
    document.getElementById(strErrorPw1).innerHTML = errorMessage1;
    document.getElementById(strErrorPw2).innerHTML = errorMessage2;
}

function checkStringLength(str,min,max){
    if(str.length > max || str.length < min) //문자열의 길이가 벗어난경우
        return false;
    return true;
}  

function checkPw(str,min,max){
    if( !checkStringLength(str,min,max)){
        //alert('비밀번호는 '+ min + '~' + max + '자리 입니다.');
        return false;
    }
    return true;
}

