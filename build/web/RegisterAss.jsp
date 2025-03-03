<%-- 
    Document   : Loging
    Created on : Dec 7, 2019, 10:29:03 PM
    Author     : Eladnani Ahmed Reda
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<head>
	<title>RegisterAss</title>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
<!--===============================================================================================-->	
	<link rel="icon" type="image/png" href="images/icons/favicon.ico"/>
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor_loging/bootstrap/css/bootstrap.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="fonts_loging/font-awesome-4.7.0/css/font-awesome.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="fonts_loging/Linearicons-Free-v1.0.0/icon-font.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor_loging/animate/animate.css">
<!--===============================================================================================-->	
	<link rel="stylesheet" type="text/css" href="vendor_loging/css-hamburgers/hamburgers.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor_loging/animsition/css/animsition.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor_loging/select2/select2.min.css">
<!--===============================================================================================-->	
	<link rel="stylesheet" type="text/css" href="vendor_loging/daterangepicker/daterangepicker.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="css_loging/util.css">
	<link rel="stylesheet" type="text/css" href="css_loging/main.css">
<!--===============================================================================================-->
</head>
<body style="background-color: #666666;">
	
	<div class="limiter">
		<div class="container-login100">
			<div class="wrap-login100">
                            <form class="login100-form validate-form" action="RegisterAss" method="post">
					<span class="login100-form-title p-b-43">
						Entrez les informations de votre association
					</span>
					
					
					<div class="wrap-input100 validate-input" data-validate = "Exemple : ex@abc.xyz">
						<input class="input100" type="text" name="email">
						<span class="focus-input100"></span>
						<span class="label-input100">Email</span>
					</div>
                                
                                                                                          <div class="wrap-input100 validate-input" data-validate = "Votre nom">
						<input class="input100" type="text" name="nom">
						<span class="focus-input100"></span>
						<span class="label-input100">Nom</span>
					</div>
                                
                                                                                          <div class="wrap-input100 validate-input" data-validate = "Votre prenom">
						<input class="input100" type="text" name="description">
						<span class="focus-input100"></span>
						<span class="label-input100">Description</span>
					</div>
					
					
					<div class="wrap-input100 validate-input" data-validate="Password is required">
						<input class="input100" type="password" name="mdp">
						<span class="focus-input100"></span>
						<span class="label-input100">Password</span>
					</div>
                                                                                            
                                                                                          <div class="wrap-input100 validate-input" data-validate="RIB">
						<input class="input100" type="text" name="rib">
						<span class="focus-input100"></span>
						<span class="label-input100">RIB</span>
					</div>
                                <div class="wrap-input100 validate-input" data-validate="Image">
						<input class="input100" type="file" name="image">
						<span class="focus-input100"></span>
						<span class="label-input100">Image</span>
					</div>
			

					<div class="container-login100-form-btn">
						<button class="login100-form-btn" type="submit">
							Register
						</button>
					</div>
					
					
				</form>

				<div class="login100-more" style="background-image: url('images/20191020_161226.jpg');">
				</div>
			</div>
		</div>
	</div>
	
	

	
	
<!--===============================================================================================-->
	<script src="vendor/jquery/jquery-3.2.1.min.js"></script>
<!--===============================================================================================-->
	<script src="vendor/animsition/js/animsition.min.js"></script>
<!--===============================================================================================-->
	<script src="vendor/bootstrap/js/popper.js"></script>
	<script src="vendor/bootstrap/js/bootstrap.min.js"></script>
<!--===============================================================================================-->
	<script src="vendor/select2/select2.min.js"></script>
<!--===============================================================================================-->
	<script src="vendor/daterangepicker/moment.min.js"></script>
	<script src="vendor/daterangepicker/daterangepicker.js"></script>
<!--===============================================================================================-->
	<script src="vendor/countdowntime/countdowntime.js"></script>
<!--===============================================================================================-->
	<script src="js/main.js"></script>

</body>
</html>
