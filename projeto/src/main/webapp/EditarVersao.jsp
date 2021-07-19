<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Editar Versao do projeto - Editar</title>
<link rel="stylesheet" href="style.css">
</head>
<body>
	<h1>Editar Versao do projeto</h1>
	<form name="frmVersao" action="updateVersao">
		<table>
		<tr>
				<td><input type="text" name="idVersao" class="Caixa2" readonly
					value="<%out.print(request.getAttribute("idVersao"));%>"></td>
			</tr> 
			<tr>
				<td><input type="text" name="idProjeto" class="Caixa2"
					value="<%out.print(request.getAttribute("idProjeto"));%>"></td>
			</tr>
			<tr>
				<td><input type="text" name="GMUD" class="Caixa2"
					value="<%out.print(request.getAttribute("GMUD"));%>"></td>
			</tr>
			
			<tr>
				<td><input type="text" name="descricao" class="Caixa2"
					value="<%out.print(request.getAttribute("descricao"));%>"></td>
			</tr>
			
			<tr>
				<td><input type="text" name="situacao" class="Caixa2"
					value="<%out.print(request.getAttribute("situacao"));%>"></td>
			</tr>
			
			<tr>
				<td><input type="text" name="dataLancamento" class="Caixa2"
					value="<%out.print(request.getAttribute("dataLancamento"));%>"></td>
			</tr>
			
			<tr>
				<td><input type="text" name="ordem" class="Caixa2"
					value="<%out.print(request.getAttribute("ordem"));%>"></td>
			</tr>
			
			
			<tr>
				<td><input type="text" name="numeroVersao" class="Caixa2"
					value="<%out.print(request.getAttribute("numeroVersao"));%>"></td>
			</tr>
			
			
		
		</table>
		<input type="button" value="Editar Versao" class="Botao1" onclick="validarVersao()">
	</form>
	<script src="scripts/validador.js"></script>
</body>
</html>