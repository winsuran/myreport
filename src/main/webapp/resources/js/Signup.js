/**
 * 
 */

$(document)
          .ready
              (function(){
            	  
       $("#signup").click(function(event) {
         event.stopPropagation();
         $( ".toggle2" ).toggle( "bounce", { times: 1 }, "slow" );
         $( ".toggle1" ).hide()
            	    });
     
     $("#SignUpBtn").click(function(){
    	 //alert("fdfdf");
    	 
       var signData = {};
       signData.first_name = $("#first_name").val();
       signData.last_name = $("#last_name").val();
       signData.gender = $("#gender").val();
       signData.email = $("#email").val();
       signData.password = $("#password").val();
       signData.confirmation_password = $("#confirmation_password").val();
       
       $.ajax({
    	   type : "GET",
    	   url  : "customers/regis",
    	   data : signData,
    	   //dataType : "json",
    	   error : function(val){
    		   
    	   },
    	   success : function(text){
    		  
    	   }   
    	   
       });
  		 
             });
     
     
     	  
                     });
              