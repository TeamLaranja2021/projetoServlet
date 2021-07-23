<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="pt-br">

<head>
	<meta charset="UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>Alterar Usuario</title>
	<!-- Custom CSS -->
	<link rel="stylesheet" href="css/normalize.css">
	<link rel="stylesheet" href="css/alterar_tela.css">
</head>

<body>
	<section id="novo-projeto">
		<h1>Alterar Usuario</h1>
		<form name="frmUsuario" action="updateUser">
			<div class="form-control">
				<input type="text" name="idUsuario" placeholder="Id do Usuario"
					class="entrada" readonly value="<%out.print(request.getAttribute("idUsuario"));%>">
			</div>
			<div class="form-control">
				<input type="text" name="nome" placeholder="Nome Usuario"
					class="entrada" value="<%out.print(request.getAttribute("nome"));%>">
			</div>
			<div class="form-control">
				<input type="text" name="senha" placeholder="Senha"
					class="entrada" value="<%out.print(request.getAttribute("senha"));%>">
			</div> 
			<div class="form-control">
				<input type="text" name="email" placeholder="Email"
					class="entrada" value="<%out.print(request.getAttribute("email"));%>">
			</div>
			<div class="form-control">
				<input type="text" name="cargo" placeholder="Cargo"
					class="entrada" value="<%out.print(request.getAttribute("cargo"));%>"> 
			</div>
			<div class="form-control">
				<a href="user"class="button"id="cancelar"> Cancelar</a>
			
				<input type="button" class="button" value="OK" onclick="validarUser()">
			
			</div>
		</form>
		<script src="scripts/validador.js"></script>
	</section>
</body>

</html>