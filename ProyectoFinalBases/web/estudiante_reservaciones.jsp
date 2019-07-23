<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<%@page import="java.util.List"%>
<%@page import="logica.Material"%>
<%@page import="logica.Reserva"%>
<%@page import="java.sql.ResultSet"%>

<!DOCTYPE html>

<% ResultSet reservaBD = (ResultSet)session.getAttribute("reserva"); %>
<% ResultSet reservaCopiaBD = (ResultSet)session.getAttribute("reservaCopia"); %>

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
			<div class="divTablaColor" align="center">
				<table>
					<tr>
						<td>
							Código Estudiante
						</td>
					</tr>
					<tr>
						<td>
							<input class="inputColor" type="number" id="" <c:out value="${codigoEst}" disabled>
						</td>
					</tr>
				</table>
			</div>
			<div class="divTabla" align="center">

				<table class="busqueda">
					<tr class="busquedaTitulo">
						<td>
							IDReserva
						</td>
						<td>
							Fecha de Reservacion
						</td>
						<td>
							Materiales
						</td>
					</tr>
					<% while (reservaBD.next()){ %>
					<tr>
						<td>
							<%= reservaBD.getString("k_reserva") %>
						</td>
						<td>
							<%= reservaBD.getString("f_reservacion") %>
						</td>
						<td>
							<% while (reservaCopiaBD.next()){ %>
								<%= reservaCopiaBD.getString("k_copia") %></br>
							<% }%>
						</td>
					</tr>
					<% }%>
				</table>

			</div>
		</div>
		<input type="submit" value="Volver" class="button" onclick="goBack()">
	</div>
</body>

</html>