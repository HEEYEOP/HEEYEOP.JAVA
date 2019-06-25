$(document).ready(function(){
    $('button').click(function(){
        $(this).before('<div class="inner-box"></div><div class="inner-box"></div><div class="inner-box"></div>');
    });
});