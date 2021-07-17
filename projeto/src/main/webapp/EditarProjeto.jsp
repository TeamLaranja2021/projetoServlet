<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Editar projetos - Editar</title>
<link rel="stylesheet" href="style.css">
</head>
<body>
	<h1>Editar Projeto</h1>
	<form name="frmProjeto" action="update">
		<table>
		<tr>
				<td><input type="text" name="idProjeto" id="caixa3" readonly
					value="<%out.print(request.getAttribute("idProjeto"));%>"></td>
			</tr> 
			<tr>
				<td><input type="text" name="nomeProjeto" class="Caixa1"
					value="<%out.print(request.getAttribute("nomeProjeto"));%>"></td>
			</tr>
			<tr>
				<td><input type="text" name="situacao" class="Caixa2"
					value="<%out.print(request.getAttribute("situacao"));%>"></td>
			</tr>
		
		</table>
		<input type="button" value="Editar projeto" class="Botao1" onclick="validar()">
	</form>
	<script src="scripts/validador.js"></script>
</body>
</html>