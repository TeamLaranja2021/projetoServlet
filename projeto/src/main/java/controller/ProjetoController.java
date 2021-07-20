package controller;

import java.io.IOException;
import java.util.ArrayList;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import DAO.ProjetoDAO;
import model.Projeto;

@WebServlet(urlPatterns = {"/Controller" , "/main", "/insert", "/select", "/update", "/delete"})
public class ProjetoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final Integer IdProjeto = null;
    ProjetoDAO dao = new ProjetoDAO();
    Projeto projeto = new Projeto();
    public ProjetoController() {
        super();
      
    }

    //Rotas
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String  action = request.getServletPath();
		System.out.println(action);
		if(action.equals("/main")) {
			projetos(request, response);
		} else if(action.equals("/insert")){
			novoProjeto(request, response);
		} else if(action.equals("/select")){
			listarprojeto(request, response);
		} else if(action.equals("/update")){
			editarProjeto(request, response);
		} else if(action.equals("/delete")){
			removerProjeto(request, response);
		}else {
			response.sendRedirect("index.html");
		}
	//	dao.testeConexao();
	}
	
	// listar projetos
	protected void projetos(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//recebe os dados - objetos
		ArrayList<Projeto> lista = dao.listarProjetos();
		
		request.setAttribute("projeto", lista);
		RequestDispatcher rd = request.getRequestDispatcher("dashboard_projeto.jsp");
		rd.forward(request, response);//encaminha para lista
		
	}
	
	
	// Criar projeto
	protected void novoProjeto(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//setar as variaves javabens
		projeto.setNomeProjeto(request.getParameter("nomeProjeto"));
		projeto.setSituacao(Boolean.parseBoolean(request.getParameter("situacao")));
		
		//invocar o metodo inserir projeto
		dao.inserirProjeto(projeto);
		
		//redicerionar para a pagina que voce quer depois que criou : aula 11
		response.sendRedirect("main");
	}
	
	
	//editar projeto
	protected void listarprojeto(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int idprojeto = Integer.parseInt(request.getParameter("idProjeto"));
		
		projeto.setIdProjeto(idprojeto);
		
		dao.selecionarProjeto(projeto);
		
		request.setAttribute("idProjeto", projeto.getIdProjeto());
		request.setAttribute("nomeProjeto", projeto.getNomeProjeto());
		request.setAttribute("situacao", projeto.isSituacao());
	
		RequestDispatcher rd = request.getRequestDispatcher("alterar_projeto.jsp");
		rd.forward(request, response);
	}
	
	protected void editarProjeto(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		projeto.setIdProjeto(Integer.parseInt(request.getParameter("idProjeto")));
		projeto.setNomeProjeto(request.getParameter("nomeProjeto"));
		projeto.setSituacao(Boolean.parseBoolean(request.getParameter("situacao")));
		
		dao.altearProjeto(projeto);
		
		response.sendRedirect("main"); // redirecionar
	}
	
	//remover projeto
	protected void removerProjeto(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			int idprojeto = Integer.parseInt(request.getParameter("idProjeto"));
			
			projeto.setIdProjeto(idprojeto);
			
			dao.deletarProjeto(projeto);
			
			response.sendRedirect("main"); // redirecionar
	}
	
}
