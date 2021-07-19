<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Editar Requisicao - Editar</title>
<link rel="stylesheet" href="style.css">
</head>
<body>
	<h1>Editar Tela</h1>
	<form name="frmRequisicao" action="updateRequisicao">
		<table>
		<tr>
				<td><input type="text" name="idRequisicao" class="Caixa2" readonly
					value="<%out.print(request.getAttribute("idRequisicao"));%>"></td>
			</tr> 
			<tr>
				<td><input type="text" name="idEvento" class="Caixa2"
					value="<%out.print(request.getAttribute("idEvento"));%>"></td>
			</tr>
		
			<tr>
				<td><input type="text" name="urlHomolog" class="Caixa2"
					value="<%out.print(request.getAttribute("urlHomolog"));%>"></td>
			</tr>
			
				<tr>
				<td><input type="text" name="uriProd" class="Caixa2"
					value="<%out.print(request.getAttribute("uriProd"));%>"></td>
			</tr>
			
				<tr>
				<td><input type="text" name="descricao" class="Caixa2"
					value="<%out.print(request.getAttribute("descricao"));%>"></td>
			</tr>
			
				<tr>
				<td><input type="text" name="requisicaoPai" class="Caixa2"
					value="<%out.print(request.getAttribute("requisicaoPai"));%>"></td>
			</tr>
			
			
				<tr>
				<td><input type="text" name="camada" class="Caixa2"
					value="<%out.print(request.getAttribute("camada"));%>"></td>
			</tr>
			
			
				<tr>
				<td><input type="text" name="situacao" class="Caixa2"
					value="<%out.print(request.getAttribute("situacao"));%>"></td>
			</tr>
			
				<tr>
				<td><input type="text" name="ordem" class="Caixa2"
					value="<%out.print(request.getAttribute("ordem"));%>"></td>
			</tr>
			
		
		</table>
		<input type="button" value="Editar Requsicao" class="Botao1" onclick="validarRequisicao()">
	</form>
	<script src="scripts/validador.js"></script>
</body>
</html>