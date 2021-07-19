<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Editar Propriedade - Editar</title>
<link rel="stylesheet" href="style.css">
</head>
<body>
	<h1>Editar Tela</h1>
	<form name="frmPropriedade" action="updatePropriedade">
		<table>
		<tr>
				<td><input type="text" name="idPropriedade" class="Caixa2" readonly
					value="<%out.print(request.getAttribute("idPropriedade"));%>"></td>
			</tr> 
			<tr>
				<td><input type="text" name="idRequisicao" class="Caixa2"
					value="<%out.print(request.getAttribute("idRequisicao"));%>"></td>
			</tr>
		
			<tr>
				<td><input type="text" name="tipoPropriedade" class="Caixa2"
					value="<%out.print(request.getAttribute("tipoPropriedade"));%>"></td>
			</tr>
			
				<tr>
				<td><input type="text" name="chave" class="Caixa2"
					value="<%out.print(request.getAttribute("chave"));%>"></td>
			</tr>
			
				<tr>
				<td><input type="text" name="valor" class="Caixa2"
					value="<%out.print(request.getAttribute("valor"));%>"></td>
			</tr>
			
				<tr>
				<td><input type="text" name="ordem" class="Caixa2"
					value="<%out.print(request.getAttribute("ordem"));%>"></td>
			</tr>
			
		</table>
		<input type="button" value="Editar Propriedade" class="Botao1" onclick="validarPropriedade()">
	</form>
	<script src="scripts/validador.js"></script>
</body>
</html>