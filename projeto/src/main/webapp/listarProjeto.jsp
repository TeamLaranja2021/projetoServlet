<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ page import="model.Projeto"%>
<%@ page import="java.util.ArrayList"%>
<%
	ArrayList<Projeto> lista = (ArrayList<Projeto>) request.getAttribute("projeto");
%>

<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="utf-8">
<title>Listar Projeto</title>
<link rel="stylesheet" href="style.css">
</head>
<body>
	<h1>Listar Projetos</h1>
	<a href="novoProjeto.html" class="Botao1">Criar novo projeto</a>
	<table id="tabela">
		<thead>
			<tr>
				<th>Id</th>
				<th>Nome Projeto</th>
				<th>Situacao</th>
				<th>Opções</th>
			</tr>
		</thead>
		<tbody>
			<%
				for (int i = 0; i < lista.size(); i++) {
			%>
			<tr>
				<td><%=lista.get(i).getIdProjeto()%></td>
				<td><%=lista.get(i).getNomeProjeto()%></td>
				<td><%=lista.get(i).isSituacao()%></td>
				<td>
					<a href="select?idProjeto=<%=lista.get(i).getIdProjeto()%>"
					class="Botao1">Editar</a>
					
					<a href="javascript: confirmar(<%=lista.get(i).getIdProjeto()%>)"
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