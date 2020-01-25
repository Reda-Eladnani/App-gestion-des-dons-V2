<%-- 
    Document   : ProfilDonn
    Created on : Jan 14, 2020, 12:12:41 AM
    Author     : Eladnani Ahmed Reda
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>

  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="">
  <meta name="author" content="">

  <title>Votre profil</title>

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
          
          <li class="nav-item">
            <a class="nav-link" href="#">Vos favoris</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="#">Vos dons</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="#">Associations vous interressants</a>
          </li>
        </ul>
      </div>
    </div>
  </nav>

  <!-- Page Content -->
  <div class="container">

    <!-- Jumbotron Header -->
    <header class="jumbotron my-4" ><!--style="background-image: url('images/hands.jpg') ; max-width:100%; " > -->
        <h1 class="display-3">${sessionScope.nomAsso}</h1>
      <p class="lead">Vous trouverez ici les evenements des associations ayant besoin de votre aide.</p>
      <a href="AddEvent" class="btn btn-primary btn-lg">Creer un evenement</a>
    </header>

    <!-- Page Features -->
    <div class="row text-center">

      <div class="col-lg-3 col-md-6 mb-4">
        <div class="card h-100">
            <img class="card-img-top" src="images/CINDH.jpg" alt=""> 
          <%--<div class="card-img-top" style="background-image: url('images/CINDH.jpg');">--%>
          <div class="card-body">
            <h4 class="card-title">CINDH</h4>
            <p class="card-text">Club d'Initiative Nationale et Développement Humain CINDH à l'Ecole Nationale Supérieure de l'informatique et Analyse des Systémes l'ENSIAS.</p>
          </div>
          <div class="card-footer">
            <a href="#" class="btn btn-primary">Voir plus sur le CINDH</a>
          </div>
        </div>
      </div>

      <div class="col-lg-3 col-md-6 mb-4">
        <div class="card h-100">
          <img class="card-img-top" src="images/ADEI.JPG" alt="">
          <div class="card-body">
              <h4 class="card-title">${sessionScope.nomAss}</h4>
            <p class="card-text">Association des eleves ingenieurs à l'Ecole Nationale Supérieure de l'informatique et Analyse des Systémes l'ENSIAS.</p>
          </div>
          <div class="card-footer">
            <a href="ListeAssociations.jsp" class="btn btn-primary">Voir plus sur l'ADEI</a>
          </div>
        </div>
      </div>

      <div class="col-lg-3 col-md-6 mb-4">
        <div class="card h-100">
          <img class="card-img-top" src="http://placehold.it/500x325" alt="">
          <div class="card-body">
            <h4 class="card-title">Card title</h4>
            <p class="card-text">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Sapiente esse necessitatibus neque.</p>
          </div>
          <div class="card-footer">
            <a href="#" class="btn btn-primary">Find Out More!</a>
          </div>
        </div>
      </div>

      <div class="col-lg-3 col-md-6 mb-4">
        <div class="card h-100">
          <img class="card-img-top" src="http://placehold.it/500x325" alt="">
          <div class="card-body">
            <h4 class="card-title">Card title</h4>
            <p class="card-text">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Explicabo magni sapiente, tempore debitis beatae culpa natus architecto.</p>
          </div>
          <div class="card-footer">
            <a href="#" class="btn btn-primary">Find Out More!</a>
          </div>
        </div>
      </div>

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

