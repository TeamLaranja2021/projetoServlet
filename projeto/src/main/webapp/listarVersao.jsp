<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ page import="model.Versao"%>
<%@ page import="java.util.ArrayList"%>
<%
	ArrayList<Versao> lista = (ArrayList<Versao>) request.getAttribute("versao");
%>

<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="utf-8">
<title>Listagem de Versao</title>
<link rel="stylesheet" href="style.css">
</head>
<body>
	<h1>Listagem de Versao</h1>
	<a href="novoVersao.html" class="Botao1">Criar uma nova versao do projeto</a>
	<table id="tabela">
		<thead>
			<tr>
				<th>ID da Versao</th>
				<th>ID do projeto</th>
				<th>GMUD</th>
				<th>Descricao</th>
				<th>situacao</th>
				<th>data de Lancamento</th>
				<th>Ordem</th>
				<th>Numero da Versao</th>
				<th>Opções</th>
			</tr>
		</thead>
		<tbody>
			<%
				for (int i = 0; i < lista.size(); i++) {
			%>
			<tr>
				<td><%=lista.get(i).getIdVersao()%></td>
				<td><%=lista.get(i).getIdProjeto()%></td>
				<td><%=lista.get(i).getGMUD()%></td>
				<td><%=lista.get(i).getDescricao()%></td>
				<td><%=lista.get(i).isSituacao()%></td>
				<td><%=lista.get(i).getDataLancamento()%></td>
				<td><%=lista.get(i).getOrdem()%></td>
				<td><%=lista.get(i).getNumeroVersao()%></td>
				<td>
					<a href="selectVersao?idVersao=<%=lista.get(i).getIdVersao()%>"
					class="Botao1">Editar</a>
					
					<a href="javascript: confirmarVersao(<%=lista.get(i).getIdVersao()%>)"
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