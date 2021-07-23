<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="model.Evento"%>
<%@ page import="java.util.ArrayList"%>
<%
	ArrayList<Evento> lista = (ArrayList<Evento>) request.getAttribute("evento");
%>
<!DOCTYPE html>
<html lang="pt-BR"><head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="https://fonts.googleapis.com/css?family=Montserrat:400,700,900|Roboto+Slab:700|Roboto:400,400i" rel="stylesheet">
        <link rel="stylesheet" href="css/styles.css">
        <title> Home -  Mobicare</title>
    </head>

    <body onload="load()">
        <nav class="navegacao">
            <div class="navegacao__box">
                <a class="navegacao__logo" href="home.html">
                    <img class="img-responsive" src="imagens/logo-mobicare-akross.png" alt="Logotipo da Mobicare e Akross ">
                </a>

                <div class="navegacao__itens">
                    
                </div>
               
            </div>
        </nav>

        <header class="header">
            <div>
            </div>
        </header>

        <main>
            <section>
                <div id="projects_list" class="container-list">
                    <div id="table_list_header">
						<div id="table_header_buttons" class="table-header-buttons-div">
						<div id="add_div" class="table-header-buttons-div">
							<div class="">
								<p>
									<h1>Eventos</h1>
								</p>
							</div><br>
                        
							<!-- <button id="add-button" class="add-button">
                                <a href="cadastrar_projeto.html">+</a>
                            </button> -->
						</div>
						<div id="slider_div" class="table-header-div">
							<p>Cadastrar Evento</p>
							<a href="cadastrar_evento.html" class="add-button">+</a>
						</div>
						<div id="add_div" class="table-header-div">
							<p>Requisicao</p>
							<a href="requisicao" class="add-button">+</a>
						</div>
                        <div id="selected_project_div" class="table-header-div" style="display: block;">
                            <a href="main"><span id="selected_project_close" class="close" style="color: rgb(70, 125, 223);">×</span></a>
                            <p>DevSchool 2.0</p>
                        </div>
						<div id="selected_version_div" class="table-header-div" style="display: none;"><span id="selected_version_close" class="close" style="color: rgb(70, 125, 223);">×</span><p></p></div></div></div>
                    <div>
                        <input id="search-input" type="text" class="search-input" placeholder="Busca...">
                    </div>
                    <div id="table_list">
						<table id="projects_table">
							<tr id="version_table_row">
								<th id="version-header">ID</th>
								<th id="version-header">ID da tela</th>
								<th id="date-header">Situação</th>
								<th id="gmud-header">Ordem</th>
								<th id="functions-header">Parametros</th>
								
								
							</tr>
							<%
								for (int i = 0; i < lista.size(); i++) {
							%>
                            <tr class="project-row">
                                <td>
                                    <div style="display: flex;">
                                        <a href="selectEvento?idEvento=<%=lista.get(i).getIdEvento()%>"
										class="">
                                            <img width="20" height="20" src="imagens/edit.png" alt="Editar" style="margin-right: 10px;">
                                        </a>
                                        <a href="javascript: confirmarEvento(<%=lista.get(i).getIdEvento()%>)"
										class="">
                                            <img width="20" height="20" src="imagens/delete.png" alt="Deletar" style="margin-right: 10px;">
                                        </a>
                                        <a href="main">
                                            <p style="margin-left: 10px;"><%=lista.get(i).getIdEvento()%></p>
                                        </a>
                                    </div>
                                </td>
                                <td><%=lista.get(i).getIdTela()%></td>
								<td><%=lista.get(i).isSituacao()%></td>
								<td><%=lista.get(i).getOrdem()%></td>
								<td><%=lista.get(i).getParametros()%></td>
                            </tr>
                            <%
								}
							%>
                         
                            
						</table>
					</div>
					<div id="page-div" class="page-div">
						<p id="back-button" class="page-button">&lt;</p>
						<p id="show-page" class="page">1</p>
						<p id="foward-button" class="page-button">&gt;</p>
					</div>
				</div>               
            </section>
            <!-- The Modal -->
            <div id="modal" class="modal" style="display: none;">
                <!-- Modal content -->
                <div class="modal-content">
                    <div class="modal-header">
                        <span id="close" class="close">×</span>
                        <h2 id="modal_header">Versão: 99181</h2>
                    </div>
                    <div id="project-content" class="modal-body" style="flex-direction: unset;"><div style="display: flex; flex-direction: column;"><div><label>Número da Versão: </label><input></div><div><label>Data: </label><input></div><div><label>Descrição: </label><input></div><div><label>Número GMUD: </label><input></div></div><div class="edit-div"><label id="slider_label" class="switch"><input id="slider_input" type="checkbox"><span id="slider_span" class="slider"></span></label></div></div>
                </div>
            </div>
        </main>

        <footer class="rodape">
            <div class="rodape__principal"></div>
                               
            
            <div class="rodape__cc">
                <p>DevSchool 2.0 | 2021</p>
            </div>
        </footer>

        <script src="script/projects2.js"></script>
    	<script src="scripts/confirmador.js"></script>

</body></html>