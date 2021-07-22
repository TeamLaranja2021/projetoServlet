package controller;

import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;
import java.time.LocalDate;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.VersaoDAO;
import model.Versao;

@WebServlet(urlPatterns = { "/VersaoController", "/versao","/insertVersao" , "/selectVersao", "/updateVersao" , "/deleteVersao"})
public class VersaoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
     VersaoDAO versaodao = new VersaoDAO();
     Versao versao = new Versao();
     
    public VersaoController() {
        super();
        // TODO Auto-generated constructor stub
    }

    //Rotas
 	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
 		String  action = request.getServletPath();
 		System.out.println(action);
 		if(action.equals("/versao")) {
 			versaoes(request, response);
 		} else if(action.equals("/insertVersao")){
 			novaVersao(request, response);
 		} else if(action.equals("/selectVersao")){
			listarVersao(request, response);
		}else if(action.equals("/updateVersao")) {
			editarVersao(request, response);	
		}else if(action.equals("/deleteVersao")) {
			deletarVersao(request, response);
		}else {
			response.sendRedirect("user");
		
 		}

 	}

 	//listar versao
	private void versaoes(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArrayList<Versao> lista = versaodao.listarVersao();
				
		request.setAttribute("versao", lista);
		RequestDispatcher rd = request.getRequestDispatcher("dashboard_versao.jsp");
		rd.forward(request, response);//encaminha para lista
		
	}

	
	private void novaVersao(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException  {
		//setar as variaves javabens
		versao.setIdProjeto(Integer.parseInt(request.getParameter("idProjeto")));
		versao.setGMUD(request.getParameter("GMUD"));
		versao.setDescricao(request.getParameter("descricao"));
		versao.setSituacao(Boolean.parseBoolean(request.getParameter("situacao")));
		versao.setDataLancamento(Date.valueOf(request.getParameter("dataLancamento")));
		//versao.setDataLancamento(request.getParameter("dataLancamento"));
		versao.setOrdem(request.getParameter("ordem"));
		versao.setNumeroVersao(request.getParameter("numeroVersao"));
		
		
		//invocar o metodo inserir projeto
		versaodao.inserirVersao(versao);
		
		//redicerionar para a pagina que voce quer depois que criou : aula 11
		response.sendRedirect("versao");
		
	}
	
	//listar versao pelo id
	protected void listarVersao(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int IdVersao = Integer.parseInt(request.getParameter("idVersao"));
		versao.setIdVersao(IdVersao);
		
		versaodao.selecionarVersao(versao);
		
		request.setAttribute("idVersao", versao.getIdVersao());
		request.setAttribute("idProjeto", versao.getIdProjeto());
		request.setAttribute("GMUD", versao.getGMUD());
		request.setAttribute("descricao", versao.getDescricao());
		request.setAttribute("situacao", versao.isSituacao());
		request.setAttribute("dataLancamento", versao.getDataLancamento());
		request.setAttribute("ordem", versao.getOrdem());
		request.setAttribute("numeroVersao", versao.getNumeroVersao());
		
		RequestDispatcher rd = request.getRequestDispatcher("alterar_versao.jsp");
		rd.forward(request, response);
	}
	
	
	protected void editarVersao(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		versao.setIdVersao(Integer.parseInt(request.getParameter("idVersao")));
		versao.setIdVersao(Integer.parseInt(request.getParameter("idProjeto")));
		versao.setGMUD(request.getParameter("GMUD"));
		versao.setDescricao(request.getParameter("descricao"));
		versao.setSituacao(Boolean.parseBoolean(request.getParameter("situacao")));
		versao.setDataLancamento(Date.valueOf(request.getParameter("dataLancamento")));
		//versao.setDataLancamento(request.getParameter("dataLancamento"));
		versao.setOrdem(request.getParameter("ordem"));
		versao.setNumeroVersao(request.getParameter("numeroVersao"));
		
		//invocar o metodo inserir projeto
		versaodao.alterarVersao(versao);
		
		response.sendRedirect("versao"); // redirecionar
	}

	//remover versao
	protected void deletarVersao(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int idversao = Integer.parseInt(request.getParameter("idVersao"));	
			
			versao.setIdVersao(idversao);
			
			versaodao.deletarVersao(versao);
			
			response.sendRedirect("versao"); // redirecionar
	}


}
