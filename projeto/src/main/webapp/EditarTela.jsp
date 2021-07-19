<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Editar Telas - Editar</title>
<link rel="stylesheet" href="style.css">
</head>
<body>
	<h1>Editar Tela</h1>
	<form name="frmTela" action="updateTela">
		<table>
		<tr>
				<td><input type="text" name="idTela" class="Caixa2" readonly
					value="<%out.print(request.getAttribute("idTela"));%>"></td>
			</tr> 
			<tr>
				<td><input type="text" name="idVersao" class="Caixa2"
					value="<%out.print(request.getAttribute("idVersao"));%>"></td>
			</tr>
		
			<tr>
				<td><input type="text" name="dataCadastro" class="Caixa2"
					value="<%out.print(request.getAttribute("dataCadastro"));%>"></td>
			</tr>
			
				<tr>
				<td><input type="text" name="nomeTela" class="Caixa2"
					value="<%out.print(request.getAttribute("nomeTela"));%>"></td>
			</tr>
			
				<tr>
				<td><input type="text" name="imagem" class="Caixa2"
					value="<%out.print(request.getAttribute("imagem"));%>"></td>
			</tr>
			
				<tr>
				<td><input type="text" name="situacao" class="Caixa2"
					value="<%out.print(request.getAttribute("situacao"));%>"></td>
			</tr>
			
			
				<tr>
				<td><input type="text" name="telaPai" class="Caixa2"
					value="<%out.print(request.getAttribute("telaPai"));%>"></td>
			</tr>
			
			
				<tr>
				<td><input type="text" name="ordem" class="Caixa2"
					value="<%out.print(request.getAttribute("ordem"));%>"></td>
			</tr>
			
				<tr>
				<td><input type="text" name="urlog" class="Caixa2"
					value="<%out.print(request.getAttribute("urlog"));%>"></td>
			</tr>
			
				<tr>
				<td><input type="text" name="versaoOrigem" class="Caixa2"
					value="<%out.print(request.getAttribute("versaoOrigem"));%>"></td>
			</tr>
		
		</table>
		<input type="button" value="Editar projeto" class="Botao1" onclick="validarTela()">
	</form>
	<script src="scripts/validador.js"></script>
</body>
</html>