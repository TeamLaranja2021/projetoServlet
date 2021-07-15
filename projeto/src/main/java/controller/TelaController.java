package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.ProjetoDAO;
import DAO.TelaDAO;
import model.Projeto;


@WebServlet(urlPatterns = { "/TelaController"})
public class TelaController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	   TelaDAO teladao = new TelaDAO();
	    Projeto projeto = new Projeto();
	    public TelaController() {
	    	super();
		}
	
	
	//rotas
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String  action = request.getServletPath();
		System.out.println(action);
	}
	
	//lista
	protected void Telas(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
	
	//Criar novaTela
	protected void listarTelas(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
	}
	
	//Criar novaTela
	protected void novaTela(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	//editar  Tela
	protected void editarTela(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
	
	//remover novaTela
	protected void removerTela(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

		
		
}
