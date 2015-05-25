<!DOCTYPE html>
<html lang="en">
	<%@taglib prefix="c"
		  	  uri="http://java.sun.com/jsp/jstl/core"  %>
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="../../favicon.ico">

    <title>${prop['header.menu.brand']}</title>

    <!-- Bootstrap core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <!-- Bootstrap theme -->
    <link href="css/bootstrap-theme.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="theme.css" rel="stylesheet">

    <!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
    <!--[if lt IE 9]><script src="../../assets/js/ie8-responsive-file-warning.js"></script><![endif]-->
    <script src="js/ie-emulation-modes-warning.js"></script>

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
  </head>

  <body role="document">

    <!-- Fixed navbar -->
    <nav class="navbar navbar-inverse navbar-fixed-top">
      <div class="container">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
        </div>
        <div id="navbar" class="navbar-collapse collapse">
          <ul class="nav navbar-nav">
            <li class="active"><a href="${prop['header.menu.home.link']}">${prop['header.menu.home']}</a></li>
            <li><a href="${prop['header.menu.about.link']}">${prop['header.menu.about']}</a></li>
            <li class="dropdown">
              <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">${prop['header.menu.dropdown'] } <span class="caret"></span></a>
              <ul class="dropdown-menu" role="menu">
                
                <c:forEach items="${menuitems }" var="menuitem">
                
					<li><a href=<c:out value="${menuitem.osoite }"></c:out> > <c:out value="${menuitem.nimi }"></c:out> </a></li>               
                
                </c:forEach>
              
              </ul>
            </li>
          </ul>
        </div><!--/.nav-collapse -->
      </div>
    </nav>

    <div class="container theme-showcase" role="main">

      <!-- Main jumbotron for a primary marketing message or call to action -->
      <div class="jumbotron">
        <h1><c:out value="${prop['header.menu.brand']}"></c:out></h1>
        <p><c:out value="${prop['main.topic.description'] }"></c:out></p>
      </div>

		<form method="POST" action="main">
		Hae:<input name="search"/>
		<input type="Submit" value="HAE OSOITETTA"/>
		      
      
      


      <div class="page-header">
        <h1><c:out value="${text['main.tables.header'] }"></c:out> </h1>
      </div>
      <div class="row">
        <div class="col-md-6">
          <table class="table">
            <thead>
              <tr>
                <th>Tunniste</th>
                <th>Osoite</th>
                <th>Zone</th>
                <th>Maksullisuus</th>
                <th>Stop time</th>
                <th>Muu maksutapa</th>
                <th>Tykk�ykset</th>
              </tr>
            </thead>
            <tbody>
              
            <c:forEach items="${mittarit }" var="mittari">  
              <tr>
                <td><a href="parkmeter?meter=${mittari.tunniste}">${mittari.tunniste}</a></td>
                <td><a href="parkmeter?meter=${mittari.tunniste}">${mittari.osoite}</a></td>
                <td>${mittari.zone}</td>
                <td>${mittari.maksullisuus}</td>
              </tr>
			</c:forEach>

            </tbody>
          </table>
        </div>
        
        
        


      

    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/docs.min.js"></script>
    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <script src="js/ie10-viewport-bug-workaround.js"></script>
  </body>
</html>
