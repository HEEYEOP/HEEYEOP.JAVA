$(document).ready(function(){

    var pos =0;                             //현재위치를 나타내는 전역변수 초기0

    $('.next').click(function(){
        pos++;                              //1.현재위치 증가
        if(pos == 3)                        //2. 증가된 위치가 3이면 현재 위치를 2로 수정
            pos = 2;
        //$('.box').removeClass('border-red');      //3. 모든 박스에서 빨간색 테두리 제가
        //$('.box').eq(pos).addClass('border-red'); //4. 현재 위치의 박스만 빨간색 추가
        drawBox();                                  //위의 코드를 함수로 따로 구현하여 함수를 호출함
    });

    $('.pre').click(function(){
        pos--;                              //1.현재위치 감소
        if(pos == -1)                       //2. 증가된 위치가 -1이면 현재 위치를 0로 수정
            pos = 0;
        //$('.box').removeClass('border-red');      //3. 모든 박스에서 빨간색 테두리 제가
        //$('.box').eq(pos).addClass('border-red'); //4. 현재 위치의 박스만 빨간색 추가
        drawBox();
    });

    function drawBox(){
        $('.box').removeClass('border-red'); 
        $('.box').eq(pos).addClass('border-red');  

    }

});