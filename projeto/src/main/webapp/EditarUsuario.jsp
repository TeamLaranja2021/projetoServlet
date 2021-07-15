<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Editar Usuario - Editar</title>
<link rel="stylesheet" href="style.css">
</head>
<body>
	<h1>Editar Usuario</h1>
	<form name="frmUsuario" action="updateUser">
		<table>
		<tr>
				<td><input type="text" name="idUsuario" id="caixa3" readonly
					value="<%out.print(request.getAttribute("idUsuario"));%>"></td>
			</tr> 
			<tr>
				<td><input type="text" name="nome" class="Caixa1"
					value="<%out.print(request.getAttribute("nome"));%>"></td>
			</tr>
			<tr>
				<td><input type="text" name="senha" class="Caixa2"
					value="<%out.print(request.getAttribute("senha"));%>"></td>
			</tr>
			
			<tr>
				<td><input type="text" name="email" class="Caixa2"
					value="<%out.print(request.getAttribute("email"));%>"></td>
			</tr>
			
			<tr>
				<td><input type="text" name="cargo" class="Caixa2"
					value="<%out.print(request.getAttribute("cargo"));%>"></td>
			</tr>
		
		</table>
		<input type="button" value="Editar Usuario" class="Botao1" onclick="validarUser()">
	</form>
	<script src="scripts/validador.js"></script>
</body>
</html>