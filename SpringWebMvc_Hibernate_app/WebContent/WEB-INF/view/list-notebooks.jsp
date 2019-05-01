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
			<h2>Notebooks database table</h2>
		</div>
	</div>
	
	<div id="container">
		<div id="content">
			
			<table>
			
				<tr>
					<th>Model</th>
					<th>Series</th>
					<th>Screen size</th>
					<th>Processor model</th>
					<th>RAM memory</th>
					<th>Hard drive</th>
				</tr>
				
				<c:forEach var="tempNotebook" items="${notebooks}">
				
					<tr>
						<td> ${tempNotebook.model} </td>
						<td> ${tempNotebook.series} </td>
						<td> ${tempNotebook.screenSize} </td>
						<td> ${tempNotebook.processorModel} </td>
						<td> ${tempNotebook.ram} </td>
						<td> ${tempNotebook.hardDrive} </td>
					</tr>
				
				</c:forEach>
				
			</table>
			
		</div>	
	</div>
	
</body>

</html>