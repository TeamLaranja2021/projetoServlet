package controller;

import java.io.IOException;
import java.sql.Date;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.ProjetoDAO;
import DAO.TelaDAO;
import model.Projeto;
import model.Tela;
import model.Versao;


@WebServlet(urlPatterns = { "/TelaController", "/tela","/insertTela" , "/selectTela", "/updateTela" , "/deleteTela"})
public class TelaController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	   TelaDAO teladao = new TelaDAO();
	    Tela tela = new Tela();
	    public TelaController() {
	    	super();
		}
	
	
	//rotas
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String  action = request.getServletPath();
 		System.out.println(action);
 		if(action.equals("/tela")) {
 			Telas(request, response);
 		} else if(action.equals("/insertTela")){
 			novaTela(request, response);
 		} else if(action.equals("/selectTela")){
			listarTelas(request, response);
		}else if(action.equals("/updateTela")) {
			editarTela(request, response);	
		}else if(action.equals("/deleteTela")) {
			deletarTela(request, response);
		}else {
			response.sendRedirect("tela");
		
 		}
	}
	
	
	
	//lista
	protected void Telas(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArrayList<Tela> lista = teladao.listarTela();
		
		request.setAttribute("tela", lista);
		RequestDispatcher rd = request.getRequestDispatcher("listarTela.jsp");
		rd.forward(request, response);//encaminha para lista
	}
	
	
	//Criar novaTela
		protected void novaTela(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			//setar as variaves javabens
			//tela.setIdTela(Integer.parseInt(request.getParameter("idTela")));
			tela.setIdVersao(Integer.parseInt(request.getParameter("idVersao")));
			tela.setDataCadastro(Date.valueOf(request.getParameter("dataCadastro")));
			tela.setNomeTela(request.getParameter("nomeTela"));
			tela.setImagem(request.getParameter("imagem"));
			tela.setSituacao(Boolean.parseBoolean(request.getParameter("situacao")));
			tela.setTelaPai(Integer.parseInt(request.getParameter("telaPai")));
			tela.setOrdem(Integer.parseInt(request.getParameter("ordem")));
			tela.setIdTela(Integer.parseInt(request.getParameter("idVersao")));
			tela.setUrlog(request.getParameter("urlog"));
			tela.setVersaoOrigem(Integer.parseInt(request.getParameter("versaoOrigem")));
			
			//invocar o metodo inserir projeto
			teladao.inserirTela(tela);
			
			//redicerionar para a pagina que voce quer depois que criou : aula 11
			response.sendRedirect("tela");
			
			
		}

	
	//listar novaTela
	protected void listarTelas(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int IdTela = Integer.parseInt(request.getParameter("idTela"));
		//int projeto = Integer.parseInt(request.getParameter("projeto"));
		tela.setIdTela(IdTela);
		
		teladao.selecionarTela(tela);
		request.setAttribute("idTela", tela.getIdTela());
		request.setAttribute("idVersao", tela.getIdVersao());
		request.setAttribute("dataCadastro", tela.getDataCadastro());
		request.setAttribute("nomeTela", tela.getNomeTela());
		request.setAttribute("imagem", tela.getImagem());
		request.setAttribute("situacao", tela.isSituacao());
		request.setAttribute("telaPai", tela.getTelaPai());
		request.setAttribute("ordem", tela.getOrdem());
		request.setAttribute("urlog", tela.getUrlog());
		request.setAttribute("versaoOrigem", tela.getVersaoOrigem());
		
		RequestDispatcher rd = request.getRequestDispatcher("EditarTela.jsp");
		rd.forward(request, response);
	}
	
	
	//editar  Tela
	protected void editarTela(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		tela.setIdTela(Integer.parseInt(request.getParameter("idTela")));
		tela.setIdVersao(Integer.parseInt(request.getParameter("idVersao")));
		tela.setDataCadastro(Date.valueOf(request.getParameter("dataCadastro")));
		tela.setNomeTela(request.getParameter("nomeTela"));
		tela.setImagem(request.getParameter("imagem"));
		tela.setSituacao(Boolean.parseBoolean(request.getParameter("situacao")));
		tela.setTelaPai(Integer.parseInt(request.getParameter("telaPai")));
		tela.setOrdem(Integer.parseInt(request.getParameter("ordem")));
		tela.setUrlog(request.getParameter("urlog"));	
		tela.setVersaoOrigem(Integer.parseInt(request.getParameter("versaoOrigem")));
		
		//invocar o metodo inserir projeto
		teladao.alterarTela(tela);
		
		response.sendRedirect("tela"); // redirecionar
		
	}
	
	//remover novaTela
	protected void deletarTela(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int idtela = Integer.parseInt(request.getParameter("idTela"));	
		
		tela.setIdTela(idtela);
		
		teladao.deletarTela(tela); 
		
		response.sendRedirect("tela"); // redirecionar
	}

		
		
}
