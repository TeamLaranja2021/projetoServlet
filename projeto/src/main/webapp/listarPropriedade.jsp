<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ page import="model.Propriedade"%>
<%@ page import="java.util.ArrayList"%>
<%
	ArrayList<Propriedade> lista = (ArrayList<Propriedade>) request.getAttribute("propriedade");
%>

<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="utf-8">
<title>Listagem de proprieade</title>
<link rel="stylesheet" href="style.css">
</head>
<body>
	<h1>Listagem de propriedades</h1>
	<a href="novoPropriedade.html" class="Botao1">Criar uma nova Propriedade </a>
	<table id="tabela">
		<thead>
			<tr>
				<th>ID da Propriedade</th>
				<th>ID da Requisicao</th>
				<th>Tipo Propriedade</th>
				<th>Chave</th>
				<th>Valor</th>
				<th>Ordem</th>
				<th>Opções</th>
			</tr>
		</thead>
		<tbody>
			<%
				for (int i = 0; i < lista.size(); i++) {
			%>
			<tr>
				
				<td><%=lista.get(i).getIdPropriedade()%></td>
				<td><%=lista.get(i).getIdRequisicao()%></td>
				<td><%=lista.get(i).getTipoPropriedade()%></td>
				<td><%=lista.get(i).getChave()%></td>
				<td><%=lista.get(i).getValor()%></td>
				<td><%=lista.get(i).getOrdem()%></td>
				
				
				<td>
					<a href="selectPropriedade?idPropriedade=<%=lista.get(i).getIdPropriedade()%>"
					class="Botao1">Editar</a>
					
					<a href="javascript: confirmarPropriedade(<%=lista.get(i).getIdPropriedade()%>)"
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