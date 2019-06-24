$(document).ready(function(){

    $('#top-checkbox').change(function(){
        
        var value = $(this).prop('checked');

        $('.bottom-checkbox').each(function(){
            $(this).prop('checked', value);
        });
    });
});