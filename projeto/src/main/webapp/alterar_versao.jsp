<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="pt-br">

<head>
	<meta charset="UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>Alterar Versão</title>
	<!-- Custom CSS -->
	<link rel="stylesheet" href="css/normalize.css">
	<link rel="stylesheet" href="css/alterar_tela.css">
</head>

<body>
	<section id="novo-projeto">
		<h1>Alterar Versão</h1>
		<form name="frmVersao" action="updateVersao">
			<div class="form-control">
				<input class="entrada" type="text" placeholder="id da versao"  readonly name="idVersao"
					value="<%out.print(request.getAttribute("idVersao"));%>">
				<input class="entrada" type="text" placeholder="id do projeto" name="idProjeto"
					value="<%out.print(request.getAttribute("idProjeto"));%>">
			</div>
			<div class="form-control">
				<input class="entrada" type="text" placeholder="Número de GMUD" name="GMUD" value="<%out.print(request.getAttribute("GMUD"));%>">
			</div> 
			<div class="form-control">
				<input type="text" name="descricao" placeholder="Descrição"
					class="entrada" value="<%out.print(request.getAttribute("descricao"));%>">
			</div>
			<div class="form-control">
				<input class="entrada" type="text" placeholder="situação" name="situacao" value="<%out.print(request.getAttribute("situacao"));%>"> 
			</div>
			<div class="form-control">
				<input class="entrada" type="text" id="url"
						placeholder="Data de Lançamento" name="dataLancamento" value="<%out.print(request.getAttribute("dataLancamento"));%>">
			</div>
			<div class="form-control">
				<input class="entrada" type="text" placeholder="Ordem" name="ordem" value="<%out.print(request.getAttribute("ordem"));%>"> 
			</div>
			<div class="form-control">
				<input class="entrada" type="text" placeholder="Número da versão" name="numeroVersao" value="<%out.print(request.getAttribute("numeroVersao"));%>"> 
			</div> 
			<div class="form-control">
				<a href="versao"class="button"id="cancelar"> Cancelar</a>
			
				<input type="button" class="button" value="OK" onclick="validarVersao()">
			
			</div>
		</form>
		<script src="scripts/validador.js"></script>
	</section>
</body>

</html>