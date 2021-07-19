<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ page import="model.Evento"%>
<%@ page import="java.util.ArrayList"%>
<%
	ArrayList<Evento> lista = (ArrayList<Evento>) request.getAttribute("evento");
%>

<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="utf-8">
<title>Listagem de Evento</title>
<link rel="stylesheet" href="style.css">
</head>
<body>
	<h1>Listagem de Evento</h1>
	<a href="novoEvento.html" class="Botao1">Criar um novo Evento</a>
	<table id="tabela">
		<thead>
			<tr>
				<th>ID da Evento</th>
				<th>ID da Tela</th>
				<th>Situacao</th>
				<th>ordem</th>
				<th>Parametros</th>
				<th>Opções</th>
			</tr>
		</thead>
		<tbody>
			<%
				for (int i = 0; i < lista.size(); i++) {
			%>
			<tr>
				
				<td><%=lista.get(i).getIdEvento()%></td>
				<td><%=lista.get(i).getIdTela()%></td>
				<td><%=lista.get(i).isSituacao()%></td>
				<td><%=lista.get(i).getOrdem()%></td>
				<td><%=lista.get(i).getParametros()%></td>
				
				<td>
					<a href="selectEvento?idEvento=<%=lista.get(i).getIdEvento()%>"
					class="Botao1">Editar</a>
					
					<a href="javascript: confirmarEvento(<%=lista.get(i).getIdEvento()%>)"
					class="Botao2">Excluir</a>
					
				</td>
			</tr>
			<%
				}
			%>
		</tbody>
	</table>
	<script src="scripts/confirmador.js"></script>
</body>
</html>