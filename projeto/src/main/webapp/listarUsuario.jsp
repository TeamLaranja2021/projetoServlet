<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="ISO-8859-1"%>
<%@ page import="model.Usuario"%>
<%@ page import="java.util.ArrayList"%>
<%
	ArrayList<Usuario> lista = (ArrayList<Usuario>) request.getAttribute("usuario");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Lista de Usuario</title>
<link rel="stylesheet" href="style.css">
</head>
<body>
	<h1>Mostrar todos os Usuarios</h1>
	<a href="novoUsuario.html" class="Botao1">Novo Usuario</a>

	<table id="tabela">
		<thead>
			<tr>
				<th>Id</th>
				<th>Nome</th>
				<th>E-mail</th>
				<th>Senha</th>
				<th>Cargo</th>
				<th>Opções</th>
			</tr>
		</thead>
		<tbody>
			<%
				for (int i = 0; i < lista.size(); i++) {%>
			<tr>
				<td><%=lista.get(i).getIdUsuario()%></td>	
				<td><%=lista.get(i).getNome()%></td>
				<td><%=lista.get(i).getEmail()%></td>
				<td><%=lista.get(i).getSenha()%></td>
				<td><%=lista.get(i).getCargo()%></td>
				
				<td>
					<a href="selectUser?idUsuario=<%=lista.get(i).getIdUsuario()%>"
					class="Botao1">Editar</a>
					
					<a href="javascript: confirmarUser(<%=lista.get(i).getIdUsuario()%>)"
					class="Botao2">Excluir</a>
					
				</td>
			</tr>
			<%}%>
		</tbody>
	</table>
	<script src="scripts/confirmador.js"></script>
</body>
</html>