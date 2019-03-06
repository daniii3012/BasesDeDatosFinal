<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<%@page import="java.util.List"%>
<%@page import="logica.Material"%>
<%@page import="logica.MaterialAudiovisual"%>
<%@page import="logica.MaterialBibliografico"%>
<%@page import="java.sql.ResultSet"%>

<!DOCTYPE html>

<% ResultSet materialBibliografico = (ResultSet)session.getAttribute("bibliografico"); %>
<% ResultSet materialAudiovisual = (ResultSet)session.getAttribute("audiovisual"); %>
<% ResultSet copia = (ResultSet)session.getAttribute("copia"); %>

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
				<li><a href="material.jsp">Buscar Material</a></li>
				<li><a href="estudiante.jsp">Buscar Reservas</a></li>
			</ul>
		</h2>
	</div>
	<div class="divImg" id="divImg">
	</div>
	<div class="divContainer" align="center">
		<div class="divContent">
			<form action="AgregarReserva">
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
								<input class="inputColor" type="text" id="" placeholder="Titulo" disabled>
							</td>
							<td>
								<input class="inputColor" type="text" id="" placeholder="Autor" disabled>
							</td>
							<td id="bibliografico">
								<select class="selectColor" id="" disabled>
									<option value="">Material Bibliogr�fico</option>
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
								<input class="inputColor" type="number" id="codigoEstudiante" name="codigoEstudiante" placeholder="Código" required>
							</td>
						</tr>
					</table>
				</div>
				<div class="divTabla" align="center">

					<table class="busqueda">
						<tr class="busquedaTitulo">
							<td>
								ID
							</td>
							<td>
								Titulo
							</td>
							<td>
								Autor(es)
							</td>
							<td>
								Fecha de Publicacion
							</td>
							<td>
								Tipo de Material
							</td>
							<td>
								Tema
							</td>
							<td class="reserva">

							</td>
						</tr>
						<% while (materialBibliografico.next()){ %>
						<tr>
							<td>
								<%= materialBibliografico.getString("k_isbnissn") %>
							</td>
							<td>
								<%= materialBibliografico.getString("n_titulo") %>
							</td>
							<td>
								<%--<%= material.getString("") %>--%> /Autor
							</td>
							<td>
								<%= materialBibliografico.getString("f_publicacion") %>
							</td>
							<td>
								<%= materialBibliografico.getString("n_tipo") %>
							</td>
							<td>
								<%= materialBibliografico.getString("n_tema") %>
							</td>
							<td class="reserva">
								<!--<input type="submit" value="Reservar" class="button">-->
								<input type="checkbox" id="reservarBibliografico" name="reservarBibliografico" value="<%= materialBibliografico.getString("k_isbnissn") %>">
							</td>
						</tr>
						<% }%>
						<% while (materialAudiovisual.next()){ %>
						<tr>
							<td>
								<%= materialAudiovisual.getString("k_isbnissn") %>
							</td>
							<td>
								<%= materialAudiovisual.getString("n_titulo") %>
							</td>
							<td>
								<%--<%= material.getString("") %>--%> /Autor
							</td>
							<td>
								<%= materialAudiovisual.getString("f_publicacion") %>
							</td>
							<td>
								<%= materialAudiovisual.getString("n_tipo") %>
							</td>
							<td>
								<%= materialAudiovisual.getString("n_tema") %>
							</td>
							<td class="reserva">
								<!--<input type="submit" value="Reservar" class="button">-->
								<input type="checkbox" id="reservarAudiovisual" name="reservarAudiovisual" value="<%= materialAudiovisual.getString("k_isbnissn") %>">
							</td>
						</tr>
						<% }%>
					</table>


					<input type="submit" value="Reservar" class="button">
				</div>
			</form>
		</div>
		<input type="submit" value="Volver" class="button" onclick="goBack()">
	</div>
</body>

</html>