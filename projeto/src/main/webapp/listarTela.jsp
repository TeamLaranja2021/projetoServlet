<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ page import="model.Tela"%>
<%@ page import="java.util.ArrayList"%>
<%
	ArrayList<Tela> lista = (ArrayList<Tela>) request.getAttribute("tela");
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
	<a href="novoTela.html" class="Botao1">Criar uma nova Tela </a>
	<table id="tabela">
		<thead>
			<tr>
				<th>ID da Tela</th>
				<th>ID da Versao</th>
				<th>Data do cadastro</th>
				<th>Nome da Tela</th>
				<th>Imagem</th>
				<th>Situacao</th>
				<th>Tela Pai</th>
				<th>ordem</th>
				<th>URL log</th>
				<th>Versao Origem</th>
				<th>Opções</th>
			</tr>
		</thead>
		<tbody>
			<%
				for (int i = 0; i < lista.size(); i++) {
			%>
			<tr>
				
				<td><%=lista.get(i).getIdTela()%></td>
				<td><%=lista.get(i).getIdVersao()%></td>
				<td><%=lista.get(i).getDataCadastro()%></td>
				<td><%=lista.get(i).getNomeTela()%></td>
				<td><%=lista.get(i).getImagem()%></td>
				<td><%=lista.get(i).isSituacao()%></td>
				<td><%=lista.get(i).getTelaPai()%></td>
				<td><%=lista.get(i).getOrdem()%></td>
				<td><%=lista.get(i).getUrlog()%></td>
				<td><%=lista.get(i).getVersaoOrigem()%></td>
				
				<td>
					<a href="selectTela?idTela=<%=lista.get(i).getIdTela()%>"
					class="Botao1">Editar</a>
					
					<a href="javascript: confirmarTela(<%=lista.get(i).getIdTela()%>)"
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