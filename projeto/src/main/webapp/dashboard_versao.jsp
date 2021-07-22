<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="model.Versao"%>
<%@ page import="java.util.ArrayList"%>
<%
	ArrayList<Versao> lista = (ArrayList<Versao>) request.getAttribute("versao");
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
						<div id="slider_div" class="table-header-div">
							<p>Mostar apenas ativos</p>
							<label id="slider_label" class="switch">
								<input id="slider_input" type="checkbox">
								<span id="slider_span" class="slider"></span>
							</label>
						</div>
						<div id="add_div" class="table-header-div">
							<p>Cadastrar</p>
							<a href="cadastrar_versao.html" class="add-button">+</a>
						</div>
                        <div id="selected_project_div" class="table-header-div" style="display: block;">
                            <a href="dashboard-project.html"><span id="selected_project_close" class="close" style="color: rgb(70, 125, 223);">×</span></a>
                            <p>DevSchool 2.0</p>
                        </div>
						<div id="selected_version_div" class="table-header-div" style="display: none;"><span id="selected_version_close" class="close" style="color: rgb(70, 125, 223);">×</span><p></p></div></div></div>
                    <div>
                        <input id="search-input" type="text" class="search-input" placeholder="Busca...">
                    </div>
                    <div id="table_list">
						<table id="projects_table">
							<tr id="version_table_row">
								<th id="version-header">Núm. da versão</th>
								<th id="version-header">ID</th>
								<th id="date-header">Projeto</th>
								<th id="gmud-header">Data</th>
								<th id="functions-header">GMUD</th>
								<th id="functions-header">Ordem</th>
								<th id="date-header">Descrição</th>
								<th id="active-header">Situacão</th>
								
							</tr>
							<%
								for (int i = 0; i < lista.size(); i++) {
							%>
                            <tr class="project-row">
                                <td>
                                    <div style="display: flex;">
                                        <a href="selectVersao?idVersao=<%=lista.get(i).getIdVersao()%>"
										class="">
                                            <img width="20" height="20" src="imagens/edit.png" alt="Editar" style="margin-right: 10px;">
                                        </a>
                                        <a href="javascript: confirmarVersao(<%=lista.get(i).getIdVersao()%>)"
										class="">
                                            <img width="20" height="20" src="imagens/delete.png" alt="Deletar" style="margin-right: 10px;">
                                        </a>
                                        <a href="dashboard-screen.html">
                                            <p style="margin-left: 10px;"><%=lista.get(i).getNumeroVersao()%></p>
                                        </a>
                                    </div>
                                </td>
                                <td><%=lista.get(i).getIdVersao()%></td>
                                <td><%=lista.get(i).getIdProjeto()%></td>                         
                                <td><%=lista.get(i).getDataLancamento()%></td>
                                <td><%=lista.get(i).getGMUD()%></td>
                                <td><%=lista.get(i).getOrdem()%></td>
                                <td><%=lista.get(i).getDescricao()%></td>
                                <td><%=lista.get(i).isSituacao()%></td>
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