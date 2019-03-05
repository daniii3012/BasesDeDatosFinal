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
				<li><a href="index.html">Inicio</a></li>
				<li><a href="material.html">Buscar Material</a></li>
				<li><a class="active" href="estudiante.html">Buscar Reservas</a></li>
			</ul>
		</h2>
	</div>
	<div class="divImg" id="divImg">
	</div>
	<div class="divContainer" align="center">
		<div class="divContent">
			<form action="estudiante_reservaciones.html">
				<div class="divTabla" align="center">
					<table>
						<tr>
							<td>
								<h2>
									Buscar Reservaciones
								</h2>
							</td>
						</tr>
						<tr>
							<td>
								Codigo Estudiante
							</td>
						</tr>
						<tr id="usuario">
							<td>
								<input type="number" id="codigo" placeholder="Codigo" required>
							</td>
							<td>
								<!--
									<input type="button" value="Siguiente" class="button" onclick="nextEstudiante();">
								-->
								<input type="submit" value="Buscar" class="button">
							</td>
						</tr>
						<!--
						<tr id="estudiante" style="display: none">
							<td>
								<input type="number" id="codigo2" value="" disabled>
							</td>
							<td>
								<input type="submit" value="Buscar" class="button">
							</td>
						</tr>
						-->
					</table>
				</div>
			</form>
		</div>
	</div>
</body>

</html>