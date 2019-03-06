<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
	<title>Biblioteca</title>
	<link rel="icon" type="image/png" href="images/favicon.png" />
	<link rel="stylesheet" type="text/css" href="assets/css/style.css">
	<meta charset="UTF-8">
	<script src="assets/js/script.js" type="text/javascript" language="JavaScript"></script>
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>

<body onload="randomBanner();">
	<div class="divBanner">
		<h2>
			<ul>
				<li><a class="active" href="index.jsp">Inicio</a></li>
				<li><a href="material.jsp">Buscar Material</a></li>
				<li><a href="estudiante.jsp">Buscar Reservas</a></li>
			</ul>
		</h2>
	</div>
	<div class="divImg" id="divImg">
	</div>
	<div class="divContainer" align="center">
		<div class="divContent">
			<div class="divTabla">
				<table>
					<tr>
						<td>
							<form action="material.jsp">
								<input type="submit" value="Buscar Material" class="button">
							</form>
						</td>
						<td>
							<form action="estudiante.jsp">
								<input type="submit" value="Buscar Reservas" class="button">
							</form>
						</td>
					</tr>
				</table>
			</div>
		</div>
	</div>
</body>

</html>