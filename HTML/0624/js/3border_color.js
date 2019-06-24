$(document).ready(function(){
    
    var index = 0;

    $('#before').click(function(){
        $('div').eq(index).removeClass('red-box');
        index--;
        if(index < 0 ) alert('잘못되었습니다');
        else
            $('div').eq(index).addClass('red-box');
    });

    $('#next').click(function(){
        $('div').eq(index).removeClass('red-box');
        index++;
        if(index > 2) alert('잘못되었습니다');
        else
            $('div').eq(index).addClass('red-box');
        
    });
});