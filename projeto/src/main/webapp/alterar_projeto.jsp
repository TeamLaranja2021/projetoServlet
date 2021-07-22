<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="pt-br">

<head>
	<meta charset="UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>Cadastrar Projeto</title>

	<!-- Normalize -->
	<link rel="stylesheet" href="css/normalize.css">

	<!-- Custom CSS -->
	<link rel="stylesheet" href="css/novo_projeto.css">
</head>

<body>
	<section id="novo-projeto">
		<h1>Alterar Projeto</h1>
		<form name="frmProjeto" action="update">
			<div class="form-control">
				<input class="entrada" name="idProjeto" type="text" readonly placeholder="id do Projeto" value="<%out.print(request.getAttribute("idProjeto"));%>">
			</div>
			<div class="form-control">
				<input class="entrada" name="nomeProjeto" type="text" placeholder="Nome do Projeto" value="<%out.print(request.getAttribute("nomeProjeto"));%>">
			</div>
			<div class="form-control">
				<input type="text" name="situacao" placeholder="situacao"
					class="entrada" value="<%out.print(request.getAttribute("situacao"));%>">
			</div>
			
			<div class="form-control">
				<a href="alterar_projeto.html" class="button"id="cancelar" >Cancelar</a>

				<input type="button" value="OK" class="button"
			onclick="validar()">
			</div>
		</form>
		
		<script src="scripts/validador.js"></script>
	</section>
</body>

</html>