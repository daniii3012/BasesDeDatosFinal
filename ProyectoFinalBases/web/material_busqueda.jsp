<%@page import=""%>
<%@page import=""%>
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>

<% ResultSet /*nombreVariable*/ = (ResultSet)session.getAttribute("/*atributo*/"); %>

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
				<li><a href="estudiante.html">Buscar Reservas</a></li>
			</ul>
		</h2>
	</div>
	<div class="divImg" id="divImg">
	</div>
	<div class="divContainer" align="center">
		<div class="divContent">
			<form action="">
				<div class="divTablaColor" align="center">

					<table>
						<tr>
							<td>
								Titulo
							</td>
							<td>
								Autor
							</td>
							<td>
								Tipo de Material
							</td>
							<td>
								Codigo Estudiante
							</td>
						</tr>
						<tr>
							<td>
								<input type="text" id="" placeholder="Titulo" disabled>
							</td>
							<td>
								<input type="text" id="" placeholder="Autor" disabled>
							</td>
							<td id="bibliografico">
								<select id="" disabled>
									<option value="">Material Bibliográfico</option>
									<option selected value="" id="">Libro</option>
									<option value="" id="">Revista</option>
								</select>
							</td>
							<td id="audiovisual" style="display: none">
								<select id="" disabled>
									<option value="">Material Audiovisual</option>
									<option value="" id="">Video</option>
									<option selected value="" id="">Pelicula</option>
								</select>
							</td>
							<td>
								<input type="number" id="" placeholder="Codigo" required>
							</td>
						</tr>
					</table>
				</div>
				<div class="divTabla" align="center">
					<% while (/*nombreVariable*/.next()){ %>
					<table class="busqueda">
						<tr>
							<td>
								<%= /*nombreVariable*/.getString("k_id") %> /Titulo
							</td>
							<td>
								<%= personaje.getString("n_nombre") %> /Autor
							</td>
							<td>
								<%= personaje.getString("n_nombre") %> /Tipo de Material
							</td>
							<td class="reserva">
								<input type="submit" value="Reservar" class="button">
								<!--
									Despues de reservar se redirige a inicio
								-->
							</td>
						</tr>
					</table>
					<% }%>
				</div>
			</form>
		</div>
		<input type="submit" value="Volver" class="button" onclick="goBack()">
	</div>
</body>

</html>