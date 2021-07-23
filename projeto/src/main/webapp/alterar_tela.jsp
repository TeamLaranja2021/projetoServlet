<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="pt-br">

<head>
	<meta charset="UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>Alterar Tela</title>
	<!-- Custom CSS -->
	<link rel="stylesheet" href="css/normalize.css">
	<link rel="stylesheet" href="css/cadastar_tela.css">
</head>

<body>
	<section id="novo-projeto">
		<h1>Alterar Tela</h1>
		<form name="frmTela" action="updateTela">
			<div class="form-control">
				<input type="text" name="idTela" class="entrada" readonly
					value="<%out.print(request.getAttribute("idTela"));%>">
				<input type="text" name="idVersao" class="entrada"
					value="<%out.print(request.getAttribute("idVersao"));%>">
			</div> 
			<div class="form-control">
				<input type="text" name="dataCadastro" class="entrada"
					value="<%out.print(request.getAttribute("dataCadastro"));%>">
				<input type="text" name="nomeTela" class="entrada"
					value="<%out.print(request.getAttribute("nomeTela"));%>">
			</div>
			<div class="form-control">
					<input type="text" name="imagem" class="entrada"
					value="<%out.print(request.getAttribute("imagem"));%>">
					<input type="text" name="situacao" class="entrada"
					value="<%out.print(request.getAttribute("situacao"));%>">
			</div>
			<div class="form-control">
				<input type="text" name="telaPai" class="entrada"
					value="<%out.print(request.getAttribute("telaPai"));%>">
			</div>
			<div class="form-control">
				<input type="text" name="ordem" class="entrada"
					value="<%out.print(request.getAttribute("ordem"));%>">
			</div>
			<div class="form-control">
				<input type="text" name="urlog" class="entrada"
					value="<%out.print(request.getAttribute("urlog"));%>">
			</div>
			<div class="form-control">
				<input type="text" name="versaoOrigem" class="entrada"
					value="<%out.print(request.getAttribute("versaoOrigem"));%>">
			</div>
			<div class="form-control">
				<a href="tela"class="button"id="cancelar"> Cancelar</a>
				<input type="button" value="OK" class="button"
			onclick="validarTela()">
			</div>
		</form>
		<script src="scripts/validador.js"></script>
	</section>
</body>

</html>