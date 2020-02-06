<%-- 
    Document   : Loging
    Created on : Dec 7, 2019, 10:29:03 PM
    Author     : Eladnani Ahmed Reda
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<head>
	<title>Ajouter un evenement</title>
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
                            <form class="login100-form validate-form" action="ModifierEvent" method="post" >
					<span class="login100-form-title p-b-43">
						Entrez les informations de votre evenement
					</span>
					
					
					<div class="wrap-input100 validate-input" data-validate = "Titre de votre evenement">
						<input class="input100" type="text" name="titre" value="${ev.titre_event}">
						<span class="focus-input100"></span>
						<span class="label-input100">${ev.titre_event}</span>
					</div>
                                
                                                                                          <div class="wrap-input100 validate-input" data-validate = "Description de votre evenement">
						<input class="input100" type="text" name="comm" value="${ev.comm_event}">
						<span class="focus-input100"></span>
						<span class="label-input100">Description</span>
					</div>
                                
                                                                                          <div class="wrap-input100 validate-input" data-validate = "Inserrer l'image de votre evenement">
						<input class="input100" type="file" name="image" value="${ev.image_event}">
						<span class="focus-input100"></span>
						<span class="label-input100">Inserrer l'image de votre evenement</span>
					</div>
					
					
					
			

					<div class="container-login100-form-btn">
						<button class="login100-form-btn" type="submit" >
							Enregistrer
						</button>
					</div>
					<div>
							<a href="ProfilAssociation">
								Retour au profil
							</a>
						</div>
					
				</form>

				<div class="login100-more" style="background-image: url('images/event.jpg');">
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
