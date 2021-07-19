package controller;

import java.io.IOException;

import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import DAO.PropriedadeDAO;
import model.Propriedade;


@WebServlet(urlPatterns = { "/PropriedadeController", "/propriedade","/insertPropriedade" , "/selectPropriedade", "/updatePropriedade" , "/deletePropriedade"})
public class PropriedadeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 PropriedadeDAO propriedadeDAO = new PropriedadeDAO();
     Propriedade propriedade = new Propriedade();
  
    public PropriedadeController() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String  action = request.getServletPath();
 		System.out.println(action);
 		if(action.equals("/propriedade")) {
 			Propriedades(request, response);
 		} else if(action.equals("/insertPropriedade")){
 			novaPropriedade(request, response);
 		} else if(action.equals("/selectPropriedade")){
			listarPropriedade(request, response);
		}else if(action.equals("/updatePropriedade")) {
			editarPropriedade(request, response);	
		}else if(action.equals("/deletePropriedade")) {
			deletarPropriedade(request, response);
		}else {
			response.sendRedirect("propriedade");
		
 		}
	}
	
		//lista Proprieade
			protected void Propriedades(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				ArrayList<Propriedade> lista = propriedadeDAO.listarPropriedade();
				
				request.setAttribute("propriedade", lista);
				RequestDispatcher rd = request.getRequestDispatcher("listarPropriedade.jsp");
				rd.forward(request, response);//encaminha para lista
			}
	
			//Criar Propriedade
			protected void novaPropriedade(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				//setar as variaves javabens
			
				propriedade.setIdRequisicao(Integer.parseInt(request.getParameter("idRequisicao")));
				propriedade.setTipoPropriedade(request.getParameter("tipoPropriedade"));
				propriedade.setChave(request.getParameter("chave"));
				propriedade.setValor(Integer.parseInt(request.getParameter("valor")));
				propriedade.setOrdem(Integer.parseInt(request.getParameter("ordem")));
				
				//invocar o metodo inserir projeto
				propriedadeDAO.inserirPropriedade(propriedade);
				
				//redicerionar para a pagina que voce quer depois que criou : aula 11
				response.sendRedirect("propriedade");
				
				
			}

			//Criar novaTela
			protected void listarPropriedade(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				int idPropriedade = Integer.parseInt(request.getParameter("idPropriedade"));
				//int projeto = Integer.parseInt(request.getParameter("projeto"));
				propriedade.setIdPropriedade(idPropriedade);
				
				propriedadeDAO.selecionarPropriedade(propriedade);
				request.setAttribute("idPropriedade", propriedade.getIdPropriedade());
				request.setAttribute("idRequisicao", propriedade.getIdRequisicao());
				request.setAttribute("tipoPropriedade", propriedade.getTipoPropriedade());
				request.setAttribute("chave", propriedade.getChave());
				request.setAttribute("valor", propriedade.getValor());
				request.setAttribute("ordem", propriedade.getOrdem());
				
				RequestDispatcher rd = request.getRequestDispatcher("EditarPropriedade.jsp");
				rd.forward(request, response);
			}

			//editar  Tela
			protected void editarPropriedade(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				
				propriedade.setIdRequisicao(Integer.parseInt(request.getParameter("idRequisicao")));
				propriedade.setTipoPropriedade(request.getParameter("tipoPropriedade"));
				propriedade.setChave(request.getParameter("chave"));
				propriedade.setValor(Integer.parseInt(request.getParameter("valor")));
				propriedade.setOrdem(Integer.parseInt(request.getParameter("ordem")));
				
				
				//invocar o metodo inserir projeto
				propriedadeDAO.alterarPropriedade(propriedade);
				
				response.sendRedirect("propriedade"); // redirecionar
				
			}
			
			//remover tela
			protected void deletarPropriedade(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				int idPropriedade = Integer.parseInt(request.getParameter("idPropriedade"));
				
				propriedade.setIdPropriedade(idPropriedade);
				
				propriedadeDAO.deletarPropriedade(propriedade); 
				
				response.sendRedirect("propriedade"); // redirecionar
			}

	

}
