<%-- 
    Document   : ProfilDonn
    Created on : Jan 14, 2020, 12:12:41 AM
    Author     : Eladnani Ahmed Reda
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="DB.ConnexionDB"%>
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
            <a class="nav-link" href="Accueil.html">Retour a la page d'accueil</a>
          </li>
          
<!--          <li class="nav-item">
            <a class="nav-link" href="#">Vos evenements favoris</a>
          </li>-->
<!--          <li class="nav-item">
            <a class="nav-link" href="#">Vos dons</a>
          </li>-->
<!--          <li class="nav-item">
            <a class="nav-link" href="#">Associations vous interressants</a>
          </li>-->
        </ul>
      </div>
    </div>
  </nav>

  <!-- Page Content -->
  <div class="container">

    <!-- Jumbotron Header -->
    <header class="jumbotron my-4" ><!--style="background-image: url('images/hands.jpg') ; max-width:100%; " > -->
        <h1 class="display-3">M. ${sessionScope.nomDonnat}, bienvenue sur votre profil!</h1>
      <p class="lead">Vous trouverez ici les evenements des associations ayant besoin de votre aide.</p>
      <a href="ShowEvents" class="btn btn-primary btn-lg">Passer directement aux evenements!</a>
    </header>

      
      <div class="container">
        <div class="row text-center">
        <% Connection cnx = ConnexionDB.loadDatabase();
           PreparedStatement statement = cnx.prepareStatement("SELECT * FROM association");           
            ResultSet resultat = statement.executeQuery();
            while(resultat.next()) {
        %>
       
    <!-- Page Features -->
    
        <div class="col-lg-3 col-md-6 mb-4">
        <div class="card h-100">
            
          <%--<div class="card-img-top" style="background-image: url('images/CINDH.jpg');">--%>
          <div class="card-body">
              <img class="card-img-top" src="images/<%=resultat.getString("imageAss") %>" alt=""> 
            <h4 class="card-title"><%=resultat.getString("nomAss") %></h4>
            <p class="card-text"><%=resultat.getString("descriptionAss") %></p>
            
          </div>
          <div class="card-footer">
            <a href="ProfilAssPourDonn?nomAss=<%=resultat.getString("nomAss") %>" class="btn btn-primary">Voir plus sur <%=resultat.getString("nomAss") %></a>
          </div>
           
        </div>
      </div>
         
   
     
          <% } %></div> </div>
    <!-- Page Features -->
<!--    <div class="row text-center">
 <c:forEach var = "ass" items = "${AssList}"> 
      <div class="col-lg-3 col-md-6 mb-4">
        <div class="card h-100">
            <img class="card-img-top" src="images/${ass.imageAss}" alt=""> 
          
          <div class="card-body">
            <h4 class="card-title">${ass.nom_ass}</h4>
            <p class="card-text">${ass.description_ass}</p>
          </div>
          <div class="card-footer">
            <a href="ProfilAssPourDonn?nomAss=${ass.nom_ass}" class="btn btn-primary">Voir plus sur ${ass.nom_ass}</a>
          </div>
        </div>
      </div>
</c:forEach>


    </div>-->
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

