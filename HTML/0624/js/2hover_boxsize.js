$(document).ready(function(){

    //방법1
    // $('div').hover(function(){
    //     $('div').animate({width: 100, height:100},1000);
    // });

    //방법2
    $('div').mouseenter(function(){
        $('div').animate({width: '100px', height: 100, },1000);
    });
    $('div').mouseout(function(){
        $('div').animate({width: 50, height:50},1000);
    });

});
