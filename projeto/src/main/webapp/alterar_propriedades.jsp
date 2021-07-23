<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="pt-br">

<head>
	<meta charset="UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>Alterar Propriedade</title>
	<!-- Custom CSS -->
	<link rel="stylesheet" href="css/normalize.css">
	<link rel="stylesheet" href="css/alterar_tela.css">
</head>

<body>
	<section id="novo-projeto">
		<h1>Alterar Propriedade</h1>
		<form name="frmPropriedade" action="updatePropriedade">
			<div class="form-control">
				<input type="text" name="idPropriedade" class="Caixa2" readonly
					value="<%out.print(request.getAttribute("idPropriedade"));%>">
			</div>
			<div class="form-control">
				<input type="text" name="idRequisicao" class="Caixa2"
					value="<%out.print(request.getAttribute("idRequisicao"));%>">
			</div>
			<div class="form-control">
				<input type="text" name="tipoPropriedade" class="Caixa2"
					value="<%out.print(request.getAttribute("tipoPropriedade"));%>">
			</div> 
			<div class="form-control">
				<input type="text" name="chave" class="Caixa2"
					value="<%out.print(request.getAttribute("chave"));%>">
			</div>
			<div class="form-control">
				<input type="text" name="valor" class="Caixa2"
					value="<%out.print(request.getAttribute("valor"));%>">
			</div>
			<div class="form-control">
				<input type="text" name="ordem" class="Caixa2"
					value="<%out.print(request.getAttribute("ordem"));%>">
			</div>
			<div class="form-control">
				<a href="propriedade"class="button"id="cancelar"> Cancelar</a>
			
				<input type="button" class="button" value="OK" onclick="validarPropriedade()">
			
			</div>
		</form>
		<script src="scripts/validador.js"></script>
	</section>
</body>

</html>