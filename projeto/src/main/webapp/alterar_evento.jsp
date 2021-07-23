<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="pt-br">

<head>
	<meta charset="UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>Alterar Evento</title>
	<!-- Custom CSS -->
	<link rel="stylesheet" href="css/normalize.css">
	<link rel="stylesheet" href="css/cadastar_tela.css">
</head>

<body>
	<section id="novo-projeto">
		<h1>Alterar Evento</h1>
		<form name="frmEvento" action="updateEvento">
			<div class="form-control">
				<input type="text" name="idEvento" class="entrada" readonly
					value="<%out.print(request.getAttribute("idEvento"));%>">
			</div> 
			<div class="form-control">
				<input type="text" name="idTela" class="entrada"
					value="<%out.print(request.getAttribute("idTela"));%>">
			</div>
			<div class="form-control">
					<input type="text" name="situacao" class="entrada"
					value="<%out.print(request.getAttribute("situacao"));%>">
			</div>
			<div class="form-control">
				<input type="text" name="ordem" class="entrada"
					value="<%out.print(request.getAttribute("ordem"));%>">
			</div>
			<div class="form-control">
				<input type="text" name="parametros" class="entrada"
					value="<%out.print(request.getAttribute("parametros"));%>">
			</div>
			<div class="form-control">
				<a href="evento"class="button"id="cancelar"> Cancelar</a>
				<input type="button" value="OK" class="button"
			onclick="validarEvento()">
			</div>
		</form>
		<script src="scripts/validador.js"></script>
	</section>
</body>

</html>