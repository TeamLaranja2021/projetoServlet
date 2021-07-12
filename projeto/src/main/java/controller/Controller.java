package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.cj.x.protobuf.MysqlxDatatypes.Array;

import model.DAO;
import model.JavaBeans;

@WebServlet(urlPatterns = {"/Controller" , "/main", "/insert", "/select", "/update", "/delete"})
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
    DAO dao = new DAO();
    JavaBeans projeto = new JavaBeans();
    public Controller() {
        super();
      
    }

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
		dao.testeConexao();
	}
	
	// listar projetos
	protected void projetos(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//recebe os dados - objetos
		ArrayList<JavaBeans> lista = dao.listarProjetos();
		
		request.setAttribute("projeto", lista);
		RequestDispatcher rd = request.getRequestDispatcher("listarProjeto.jsp");
		rd.forward(request, response);//encaminha para lista
		
	}
	
	
	// Criar projeto
	protected void novoProjeto(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//setar as variaves javabens
		projeto.setNomeProjeto(request.getParameter("nomeProjeto"));
		projeto.setSituacao(request.getParameter("situacao"));
		
		//invocar o metodo inserir projeto
		dao.inserirProjeto(projeto);
		
		//redicerionar para a pagina que voce quer depois que criou : aula 11
		response.sendRedirect("main");
	}
	
	
	//editar proejto
	protected void listarprojeto(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String IdProjeto = request.getParameter("idProjeto");
		projeto.setIdProjeto(IdProjeto);
		
		dao.selecionarProjeto(projeto);
		
		request.setAttribute("idProjeto", projeto.getIdProjeto());
		request.setAttribute("nomeProjeto", projeto.getNomeProjeto());
		request.setAttribute("situacao", projeto.getSituacao());
	
		RequestDispatcher rd = request.getRequestDispatcher("EditarProjeto.jsp");
		rd.forward(request, response);
	}
	
	protected void editarProjeto(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		projeto.setIdProjeto(request.getParameter("idProjeto"));
		projeto.setNomeProjeto(request.getParameter("nomeProjeto"));
		projeto.setSituacao(request.getParameter("situacao"));
		
		dao.altearProjeto(projeto);
		
		response.sendRedirect("main"); // redirecionar
	}
	
	//remover projeto
	protected void removerProjeto(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			String idprojeto = request.getParameter("idProjeto");
			
			projeto.setIdProjeto(idprojeto);
			
			dao.deletarProjeto(projeto);
			
			response.sendRedirect("main"); // redirecionar
	}
	
}
