<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

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
				<li><a class="active" href="material.jsp">Buscar Material</a></li>
				<li><a href="estudiante.jsp">Buscar Reservas</a></li>
			</ul>
		</h2>
	</div>
	<div class="divImg" id="divImg">
	</div>
	<div class="divContainer" align="center">
		<div class="divContent">
			<div class="divTabla" align="center">
				<form action="BuscarMaterial" method="POST">
					<table>
						<tr>
							<td>
								<h2>
									Buscar Material
								</h2>
							</td>
						</tr>
						<tr>
							<td>
								Titulo
							</td>
							<!--
							<td>
								Autor
							</td>
							-->
							<td colspan="2">
								Tipo de Material
							</td>
							<td>
								Codigo Estudiante
							</td>
						</tr>
						<tr>
							<td>
								<input type="text" id="titulo" name="titulo" placeholder="Titulo" value="">
							</td>
							<!--
							<td>
								<input type="text" id="" placeholder="Autor">
							</td>
							-->
							<td>
								<input type="radio" name="tipo" id="tipoBibliografico"
									onclick="tipoMaterial();">Bibliográfico
									<!--
								<input type="radio" name="tipo" id="tipoAudiovisual"
									onclick="tipoMaterial();">Audiovisual
									-->
							</td>
							<td id="bibliografico" style="display: none">
								<select id="tipoBibliograficoSelect" name="tipoBibliograficoSelect">
									<option disabled selected value="">Material Bibliografico</option>
									<option value="libro" id="">Libro</option>
									<option value="revista" id="">Revista</option>
								</select>
							</td>
							<td id="audiovisual" style="display: none">
								<select id="tipoAudiovisualSelect" name="tipoAudiovisualSelect">
									<option disabled selected value="">Material Audiovisual</option>
									<option value="video" id="">Video</option>
									<option value="pelicula" id="">Pelicula</option>
								</select>
							</td>
							<td>
								<input type="number" name="codigoEstudiante" id="codigoEstudiante" placeholder="12365478952" required>
							</td>
							<td>

								<input type="submit" value="Buscar" class="button" onclick="">

							</td>
						</tr>
					</table>
				</form>
			</div>
		</div>
	</div>
</body>

</html>