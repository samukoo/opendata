<!DOCTYPE html>
<html lang="en">
	<%@taglib prefix="c"
		  	  uri="http://java.sun.com/jsp/jstl/core"  %>
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <title>${prop['header.menu.brand']}</title>

    <!-- Bootstrap -->
    <link href="css/bootstrap.min.css" rel="stylesheet">

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
  </head>
  <body>
    
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
            
          </ul>
        </div><!--/.nav-collapse -->
      </div>
    </nav>

    <br>
    <br>
    <br>
    
    <c:set value="${prop }" var="text" ></c:set>
    <h1>${text['parkmeter.topic'] }</h1>
    
    
     <div class="col-md-6">
          <table class="table">
            <thead>
              <tr>
                <th>Tunniste</th>
                <th>Osoite</th>
                <th>Zone</th>
                <th>Maksullisuus</th>
              </tr>
            </thead>
            <tbody>
              
              <tr>
                <td>${parkmeter.tunniste}</td>
                <td>${parkmeter.osoite}</td>
                <td>${parkmeter.zone}</td>
                <td>${parkmeter.maksullisuus}</td>
              
              </tr>

            </tbody>
          </table>
        </div>
    
    <iframe
  width="600"
  height="450"
  frameborder="0" style="border:0"
  src="https://www.google.com/maps/embed/v1/place?key=AIzaSyBlvD1AYIv3lDV-83nG14s1fgAzqJ7vba0
    &q=${parkmeter.osoite}">
</iframe>
    
    <span class="label label-success">Tykk‰‰!</span>
	




    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="js/bootstrap.min.js"></script>
  </body>
</html>