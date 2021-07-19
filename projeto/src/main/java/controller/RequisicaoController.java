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

import DAO.RequisicaoDAO;
import DAO.VersaoDAO;
import model.Requisicao;
import model.Versao;

@WebServlet(urlPatterns = { "/RequisicaoController", "/requisicao","/insertRequisicao" , "/selectRequisicao", "/updateRequisicao" , "/deleteRequisicao"})
public class RequisicaoController extends HttpServlet {
	private static final long serialVersionUID = 1L;  
    Requisicao requisicao = new Requisicao();
    RequisicaoDAO requisicaodao = new RequisicaoDAO();
    
    public RequisicaoController() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String  action = request.getServletPath();
 		System.out.println(action);
 		if(action.equals("/requisicao")) {
 			Requisicoes(request, response);
 		} else if(action.equals("/insertRequisicao")){
 			novaRequisicao(request, response);
 		} else if(action.equals("/selectRequisicao")){
			listarRequisicao(request, response);
		}else if(action.equals("/updateRequisicao")) {
			editarRequisicao(request, response);	
		}else if(action.equals("/deleteRequisicao")) {
			deletarRequisicao(request, response);
		}else {
			response.sendRedirect("requisicao");
		
 		}
 		
	}
 	 	//listar versao
 		private void Requisicoes(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
 			ArrayList<Requisicao> lista = requisicaodao.listarRequisicao();
 					
 			request.setAttribute("requisicao", lista);
 			RequestDispatcher rd = request.getRequestDispatcher("listarRequisicao.jsp");
 			rd.forward(request, response);//encaminha para lista
 			
 		}
 		
 		//criar
 		private void novaRequisicao(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException  {
 			//setar as variaves javabens
 			requisicao.setIdEvento(Integer.parseInt(request.getParameter("idEvento")));
 			requisicao.setUrlHomolog(request.getParameter("urlHomolog"));
 			requisicao.setUriProd(request.getParameter("uriProd"));
 			requisicao.setDescricao(request.getParameter("descricao"));
 			requisicao.setRequisicaoPai(Integer.parseInt(request.getParameter("requisicaoPai")));
 			requisicao.setDescricao(request.getParameter("camada"));
 			requisicao.setSituacao(Boolean.parseBoolean(request.getParameter("situacao")));
 	
 			//invocar o metodo inserir projeto
 			requisicaodao.inserirRequisicao(requisicao);
 			
 			//redicerionar para a pagina que voce quer depois que criou : aula 11
 			response.sendRedirect("requisicao");
 			
 		}
 		
 		
 		//listar versao pelo id
 		protected void listarRequisicao(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
 			int IdRequisicao = Integer.parseInt(request.getParameter("idRequisicao"));
 			requisicao.setIdRequisicao(IdRequisicao);
 			
 			requisicaodao.selecionarRequisicao(requisicao);
 			
 			request.setAttribute("idRequisicao", requisicao.getIdRequisicao());
 			request.setAttribute("idEvento", requisicao.getIdEvento());
 			request.setAttribute("urlHomolog", requisicao.getUrlHomolog());
 			request.setAttribute("uriProd", requisicao.getUriProd());
 			request.setAttribute("descricao", requisicao.getDescricao());
 			request.setAttribute("requisicaoPai", requisicao.getRequisicaoPai());
 			request.setAttribute("camada", requisicao.getCamada());
 			request.setAttribute("situacao", requisicao.isSituacao());
 			request.setAttribute("ordem", requisicao.getOrdem());
 			
 			RequestDispatcher rd = request.getRequestDispatcher("EditarRequisicao.jsp");
 			rd.forward(request, response);
 		}
 		
 		protected void editarRequisicao(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
 			requisicao.setIdRequisicao(Integer.parseInt(request.getParameter("idRequisicao")));
 			requisicao.setIdEvento(Integer.parseInt(request.getParameter("idEvento")));
 			requisicao.setUrlHomolog(request.getParameter("urlHomolog"));
 			requisicao.setUriProd(request.getParameter("uriProd"));
 			requisicao.setDescricao(request.getParameter("descricao"));
 			requisicao.setRequisicaoPai(Integer.parseInt(request.getParameter("requisicaoPai")));
 			requisicao.setCamada(request.getParameter("camada"));
 			requisicao.setSituacao(Boolean.parseBoolean(request.getParameter("situacao")));
 			requisicao.setOrdem(Integer.parseInt(request.getParameter("ordem")));
 		
 			
 			//invocar o metodo inserir projeto
 			requisicaodao.alterarRequisicao(requisicao);
 			
 			response.sendRedirect("requisicao"); // redirecionar
 		}

 		//remover versao
 		protected void deletarRequisicao(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
 			int idrequisicao = Integer.parseInt(request.getParameter("idRequisicao"));	
 				
 				requisicao.setIdRequisicao(idrequisicao);
 				
 				requisicaodao.deletarRequisicao(requisicao); 
 				
 				response.sendRedirect("requisicao"); // redirecionar
 		}

 			
	

}
