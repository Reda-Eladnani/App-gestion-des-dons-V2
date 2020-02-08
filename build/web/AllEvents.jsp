<%-- 
    Document   : ProfilDonn
    Created on : Jan 14, 2020, 12:12:41 AM
    Author     : Eladnani Ahmed Reda
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>

  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="">
  <meta name="author" content="">

  <title>Les événements Disponibles</title>

  <!-- Bootstrap core CSS -->
  <link href="vendor_profilDonn/bootstrap/css/bootstrap.min.css" rel="stylesheet">

  <!-- Custom styles for this template -->
  <link href="css_profilDonn/heroic-features.css" rel="stylesheet">

</head>

<body>

  <!-- Navigation -->
  <nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top">
    <div class="container">
      <a class="navbar-brand" href="#">Application de gestion des dons</a>
      <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>
      <div class="collapse navbar-collapse" id="navbarResponsive">
        <ul class="navbar-nav ml-auto">
          
<!--          <li class="nav-item">
            <a class="nav-link" href="#">Vos favoris</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="#">Vos dons</a>
          </li>-->
          <li class="nav-item">
            <a class="nav-link" href="Accueil.html">Retour a la page d'accueil</a>
          </li>
        </ul>
      </div>
    </div>
  </nav>

  <!-- Page Content -->
  <div class="container">


    <!-- Page Features -->
    <div class="row text-center">
       <c:forEach var = "ev" items = "${eventsList}"> 
      <div class="col-lg-3 col-md-6 mb-4">
        <div class="card h-100">
            <img class="card-img-top" src="images/${ev.image_event}" alt=""> 
         
          <div class="card-body">
            <h4 class="card-title">${ev.titre_event}</h4>
            <p class="card-text">${ev.comm_event}</p>
          </div>
          <div class="card-footer">
            <a href="#" class="btn btn-primary">Aider</a>
          </div>
        </div>
      </div>

        </c:forEach>
    </div>
    <!-- /.row -->

  </div>
  <!-- /.container -->

  <!-- Footer -->
  <footer class="py-5 bg-dark">
    <div class="container">
      <p class="m-0 text-center text-white">Bénie sois l’influence d’une âme charitable sur une autre.</p>
    </div>
    <!-- /.container -->
  </footer>

  <!-- Bootstrap core JavaScript -->
  <script src="vendor_profilDonn/jquery/jquery.min.js"></script>
  <script src="vendor_profilDonn/bootstrap/js/bootstrap.bundle.min.js"></script>

</body>

</html>

