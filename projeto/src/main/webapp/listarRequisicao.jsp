<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ page import="model.Requisicao"%>
<%@ page import="java.util.ArrayList"%>
<%
	ArrayList<Requisicao> lista = (ArrayList<Requisicao>) request.getAttribute("requisicao");
%>

<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="utf-8">
<title>Listagem de requisicao</title>
<link rel="stylesheet" href="style.css">
</head>
<body>
	<h1>Listagem de requisicao</h1>
	<a href="novoRequisicao.html" class="Botao1">Criar uma nova Requisicao </a>
	<table id="tabela">
		<thead>
			<tr>
				<th>ID da Requisicao</th>
				<th>ID da Evento</th>
				<th>URL HOMOLOG</th>
				<th>URI Prod</th>
				<th>Descricao</th>
				<th>Requisicao Pai</th>
				<th>Camada</th>
				<th>Situacao</th>
				<th>ordem</th>
				<th>Opções</th>
			</tr>
		</thead>
		<tbody>
			<%
				for (int i = 0; i < lista.size(); i++) {
			%>
			<tr>
				
				<td><%=lista.get(i).getIdRequisicao()%></td>
				<td><%=lista.get(i).getIdEvento()%></td>
				<td><%=lista.get(i).getUrlHomolog()%></td>
				<td><%=lista.get(i).getUriProd()%></td>
				<td><%=lista.get(i).getDescricao()%></td>
				<td><%=lista.get(i).getRequisicaoPai()%></td>
				<td><%=lista.get(i).getCamada()%></td>
				<td><%=lista.get(i).isSituacao()%></td>
				<td><%=lista.get(i).getOrdem()%></td>
			
				
				<td>
					<a href="selectRequisicao?idRequisicao=<%=lista.get(i).getIdRequisicao()%>"
					class="Botao1">Editar</a>
					
					<a href="javascript: confirmarRequisicao(<%=lista.get(i).getIdRequisicao()%>)"
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