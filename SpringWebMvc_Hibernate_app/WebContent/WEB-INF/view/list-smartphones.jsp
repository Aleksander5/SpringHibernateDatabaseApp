<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>

<html>

<head>
	<title>Manufacturers list</title>
	
	<link type="text/css"
		  rel="stylesheet"
		  href="${pageContext.request.contextPath}/resources/css/style.css" />
</head>

<body>
	
	<div id="wrapper">
		<div id="header">
			<h2>Smartphone database table</h2>
		</div>
	</div>
	
	<div id="container">
		<div id="content">
			
			<table>
			
				<tr>
					<th>Model</th>
					<th>Screen size</th>
					<th>RAM/ROM memory</th>
					<th>Operating System</th>
					<th>Colour</th>
				</tr>
				
				<c:forEach var="tempSmartphone" items="${smartphones}">
				
					<tr>
						<td> ${tempSmartphone.model} </td>
						<td> ${tempSmartphone.screenSize} </td>
						<td> ${tempSmartphone.ramRom} </td>
						<td> ${tempSmartphone.operatingSystem} </td>
						<td> ${tempSmartphone.colour} </td>
					</tr>
				
				</c:forEach>
				
			</table>
			
		</div>	
	</div>
	
</body>

</html>