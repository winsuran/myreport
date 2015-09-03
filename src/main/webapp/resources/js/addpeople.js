/**
 * 
 */
$(document).ready(function() {


	$( "#addpeople" ).click(function() {
		
 var formData = {};
 formData.first_name =$("#first_name").val();
 formData.last_name = $("#last_name").val();
 formData.email = $("#email").val();
 

	$.ajax({
		type : "POST",
		url : "people/save",
		data : formData,
		//dataType : "json",
		// async : false,
		error : function(val) {

		},
		success : function(text) {
			alert("Save completed");
			
			$("#first_name").val('');
			$("#last_name").val('');
			$("#email").val('');
			
				
		}
		
	
	});
	});
	
				});

