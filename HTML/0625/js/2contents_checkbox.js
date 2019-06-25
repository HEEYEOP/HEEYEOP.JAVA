$(document).ready(function(){ 

	$('tr').click(function(){ 
		 
		var pos = $(this).find('input[type=checkbox]'); 
		var isChecked = pos.prop('checked'); 

		pos.prop('checked',!isChecked); 
	}); 

	$('tr input[type=checkbox]').click(function(){ 
		var isChecked = $(this).prop('checked'); 
        $(this).prop('checked',!isChecked); 
	}); 
});