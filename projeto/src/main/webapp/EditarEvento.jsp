<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Editar eventos- Editar</title>
<link rel="stylesheet" href="style.css">
</head>
<body>
	<h1>Editar Evento</h1>
	<form name="frmEvento" action="updateEvento">
		<table>
		<tr>
				<td><input type="text" name="idEvento" id="caixa3" readonly
					value="<%out.print(request.getAttribute("idEvento"));%>"></td>
			</tr> 
			
			<tr>
				<td><input type="text" name="idTela" class="Caixa2" readonly
					value="<%out.print(request.getAttribute("idTela"));%>"></td>
			</tr> 
			
			<tr>
				<td><input type="text" name="situacao" class="Caixa1"
					value="<%out.print(request.getAttribute("situacao"));%>"></td>
			</tr>
			<tr>
				<td><input type="text" name="ordem" class="Caixa2"
					value="<%out.print(request.getAttribute("ordem"));%>"></td>
			</tr>
			
			<tr>
				<td><input type="text" name="parametros" class="Caixa2"
					value="<%out.print(request.getAttribute("parametros"));%>"></td>
			</tr>
		
		</table>
		<input type="button" value="Editar Evento" class="Botao1" onclick="validarEvento()">
	</form>
	<script src="scripts/validador.js"></script>
</body>
</html>