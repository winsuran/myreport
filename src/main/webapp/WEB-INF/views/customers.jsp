<!DOCTYPE html>
<html lang="en">
<!--[if IE 6]><html class="ie6 ie"><![endif]-->
<!--[if IE 7]><html class="ie7 ie"><![endif]-->
<!--[if IE 8]><html class="ie8 ie"><![endif]-->
<!--[if IE 9]><html class="ie9 ie”><![endif]-->
<head>
<meta charset="utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Landing Page</title>
<link rel="stylesheet" type="text/css" href="resources/css/jquery.jscrollpane.css" >
<link rel="stylesheet" type="text/css" href="resources/css/main.css" >
<!--[if IE]><style type="text/css">.pie {behavior:url(PIE.htc);}</style><![endif]-->

<script type="text/javascript" src="resources/js/jquery-2.1.4.min.js"></script>
<script type="text/javascript" src="resources/js/outher/jquery-1.9.1.js"></script>
<script src="resources/js/outher/jquery-ui-1.10.4.custom.js"></script>
<script src="resources/js/outher/outher/jquery.mousewheel.js"></script>
<script src="resources/js/outher/jquery.jscrollpane.min.js"></script>
<script src="resources/js/outher/jquery.form-validator.min.js"></script>


<script type="text/javascript" src="resources/js/Signup.js"></script>

<script>
$(document).ready(function(){
    $( ".toggle1" ).hide()
	$( ".toggle2" ).hide()
	$("#login" ).click(function(event) {
		 event.stopPropagation();
         $( ".toggle1" ).toggle( "bounce", { times: 1 }, "slow" );
		 $( ".toggle2" ).hide()
    });
  /*   $("#signup" ).click(function(event) {
		 event.stopPropagation();
         $( ".toggle2" ).toggle( "bounce", { times: 1 }, "slow" );
		 $( ".toggle1" ).hide()
    }); */
	/*$(document).click( function(){
        $( ".toggle1" ).hide()
		$( ".toggle2" ).hide()
    });*/
});
</script>
<!--[if lt IE 9]><script src="js/respond-1.1.0.min.js"></script><![endif]-->
<!--[if gte IE 9]><style type="text/css">.gradient { filter: none; }</style>
<![endif]-->
</head>

<body>
<div class="outer">
<header>
  <div class="headerBack">
    <div class="wrapper">
      <header> 
      	<div class="logo">&nbsp;</div> 
        <button class="loginBtn" id="login" name="login">Login</button>
        <div class="toggle1">
        <form>
        	<input type="text" id="email" name="email" placeholder="email" required>
            <input type="password" id="password" name="password" placeholder="password" required>
            <div class="width100P"><a class="forgotPassword"><em>forgot password</em></a></div>
            <input type="checkbox" id="rememberPassword" name="rememberPassword">Remember me
            <button class="formLoginBtn" id="loginBtn" name="loginBtn">Login</button>
        </form>
        </div>
        <div class="clear">&nbsp;</div>
      </header>
    </div>
  </div>
  <div class="clear">&nbsp;</div>
</header>
<section class="content">
  <div class="wrapper">
    <div class="mobile">&nbsp;</div>
    <div class="mainTxtBox">
    	<h2>Revision Made Easy...!!!</h2>
        <button class="signupBtn" id="signup" name="signup">Sign Up Now</button>
        <div class="toggle2">
        <form>
        	<input type="text" id="first_name" name="first_name" placeholder="first name" required>
            <input type="text" id="last_name" name="last_name" placeholder="last name" required> 
                 
            <input name="gender" type="radio" value="male"  id="male" checked><label for="male">Male</label>
            <input name="gender" type="radio" value="female" id="female"><label for="female">Female</label>
            
            <input type="text" id="email" name="email" placeholder="email" required>
            <input type="password" id="password" name="password" placeholder="password" required>
            <input type="password" id="confirmation_password" name="confirmation_password" placeholder="re-enter password" required>
            <button class="formSignUpBtn" id="SignUpBtn" name="SignUpBtn">Sign Up</button>
        </form>
        </div>
    	<p>"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum. Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua."</p>
        <div class="clear">&nbsp;</div>
    </div>
    <div class="dwnldBtns">
    	<a class="google" href="#">&nbsp;</a>
        <a class="apple" href="#">&nbsp;</a>  
    </div>
  <div class="clear">&nbsp;</div>
  </div>
  <div class="wrapper">
  	<p class="whatIs">WHAT IS </p>
  	<div class="logo logo2">&nbsp;</div> 
    
    <video width="470" height="255" poster="images/video.jpg" controls>
      <source src="video.mp4" type="video/mp4">
      <source src="video.ogg" type="video/ogg">
      <source src="video.webm" type="video/webm">
      <object data="video.mp4" width="470" height="255">
      <embed src="video.swf" width="470" height="255">
      </object>
    </video>
    
    <article class="schedule">
    	<h3>Lorem Ipsum</h3>
        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip.</p>
    </article>
    <article class="edit">
    	<h3>Lorem Ipsum</h3>
        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip.</p>
    </article>
    <article class="alarm">
    	<h3>Lorem Ipsum</h3>
        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip.</p>
    </article>    
    <article class="note">
    	<h3>Lorem Ipsum</h3>
        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip.</p>
    </article>

    
    
  
  <div class="clear">&nbsp;</div>
  </div>
 </section>
<footer>
  <p>Powered by : <span>Worldwide Technology Services</span></p>
</footer>
</div>
</body>
</html>
