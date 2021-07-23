<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="pt-br">

<head>
	<meta charset="UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>Alterar Requisição</title>
	<!-- Custom CSS -->
	<link rel="stylesheet" href="css/normalize.css">
	<link rel="stylesheet" href="css/cadastar_tela.css">
</head>

<body>
	<section id="novo-projeto">
		<h1>Alterar Tela</h1>
		<form name="frmRequisicao" action="updateRequisicao">
			<div class="form-control">
				<input type="text" name="idRequisicao" class="entrada" readonly
					value="<%out.print(request.getAttribute("idRequisicao"));%>">
				<input type="text" name="idEvento" class="entrada"
					value="<%out.print(request.getAttribute("idEvento"));%>">
			</div> 
			<div class="form-control">
				<input type="text" name="urlHomolog" class="entrada"
					value="<%out.print(request.getAttribute("urlHomolog"));%>">
				<input type="text" name="uriProd" class="entrada"
					value="<%out.print(request.getAttribute("uriProd"));%>">
			</div>
			<div class="form-control">
					<input type="text" name="descricao" class="entrada"
					value="<%out.print(request.getAttribute("descricao"));%>">
					<input type="text" name="requisicaoPai" class="entrada"
					value="<%out.print(request.getAttribute("requisicaoPai"));%>">
			</div>
			<div class="form-control">
				<input type="text" name="camada" class="entrada"
					value="<%out.print(request.getAttribute("camada"));%>">
			</div>
			<div class="form-control">
				<input type="text" name="situacao" class="entrada"
					value="<%out.print(request.getAttribute("situacao"));%>">">
			</div>
			<div class="form-control">
				<input type="text" name="ordem" class="entrada"
					value="<%out.print(request.getAttribute("ordem"));%>">
			</div>
			<div class="form-control">
				<a href="requisicao"class="button"id="cancelar"> Cancelar</a>
				<input type="button" value="OK" class="button"
			onclick="validarRequisicao()">
			</div>
		</form>
		<script src="scripts/validador.js"></script>
	</section>
</body>

</html>