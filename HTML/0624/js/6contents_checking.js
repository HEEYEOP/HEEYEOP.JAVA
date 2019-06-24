$(document).ready(function(){
    
    $('td').click(function(){
       var index = $(this).attr('id');
       var str = $('input').eq(index).prop('checked');
       $('input').eq(index).prop('checked', !str);
    });
});
