<html>
<%@taglib prefix="c"
		  uri="http://java.sun.com/jstl/core"  %>



<body>
<h2>
	
	<c:out value="${teksti}"/> 
	
	<%= request.getAttribute("teksti") %>
	
	
	<c:out value="${1<2 }"/> 
</h2>
</body>
</html>
