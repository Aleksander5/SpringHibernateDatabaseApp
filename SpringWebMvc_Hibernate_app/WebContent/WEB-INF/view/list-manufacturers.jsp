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
			<h2>Manufacturer database table</h2>
		</div>
	</div>
	
	<div id="container">
		<div id="content">
		
			<input type="button" value="Add Manufacturer"
					onclick="window.location.href='showFormForAddManufacturer'; return false;"
					class="add-button"
			/>
			
			<table>
			
				<tr>
					<th>Brand name</th>
					<th>Importer</th>
				</tr>
				
				<c:forEach var="tempManufacturer" items="${manufacturers}">
				
					<tr>
						<td> ${tempManufacturer.brandName} </td>
						<td> ${tempManufacturer.importer} </td>
					</tr>
				
				</c:forEach>
				
			</table>
			
		</div>	
	</div>
	
</body>

</html>