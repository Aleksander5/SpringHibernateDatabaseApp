<!DOCTYPE html>
<html>

<head>
	<title>index</title>
	
	<link type="text/css"
		  rel="stylesheet"
		  href="${pageContext.request.contextPath}/resources/css/style.css" />
</head>

<body>
	
	<body style="background-color:mediumseagreen;">
	
	<h1 style="border:2px solid Gray;">Select proper table</h1>
	
	<button onclick="window.location.href = 'http://localhost:8080/web-mvc-hb-app/manufacturer/list';">Show Manufacturers</button>
	<br>
	<button onclick="window.location.href = 'http://localhost:8080/web-mvc-hb-app/notebook/list';">Show Notebooks</button>
	<br>
	<button onclick="window.location.href = 'http://localhost:8080/web-mvc-hb-app/smartphone/list';">Show Smartphones</button>
	
</body>

</html>
