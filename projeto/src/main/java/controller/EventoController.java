package controller;

import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import DAO.EventoDAO;
import model.Evento;




@WebServlet(urlPatterns = { "/EventoController", "/evento","/insertEvento" , "/selectEvento", "/updateEvento" , "/deleteEvento"})
public class EventoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 EventoDAO eventodao = new EventoDAO();
	  Evento evento = new Evento();
    
    public EventoController() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String  action = request.getServletPath();
 		System.out.println(action);
 		if(action.equals("/evento")) {
 			eventos(request, response);
 		} else if(action.equals("/insertEvento")){
 			novoEvento(request, response);
 		} else if(action.equals("/selectEvento")){
			listarEvento(request, response);
		}else if(action.equals("/updateEvento")) {
			editarEvento(request, response);	
		}else if(action.equals("/deleteEvento")) {
			deletarEvento(request, response);
		}else {
			response.sendRedirect("evento");
		
 		}
	}

	//listar evento
	private void eventos(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArrayList<Evento> lista = eventodao.listarEvento();
				
		request.setAttribute("evento", lista);
		RequestDispatcher rd = request.getRequestDispatcher("dashboard_evento.jsp");
		rd.forward(request, response);//encaminha para lista
		
	}

	
	
	private void novoEvento(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException  {
		//setar as variaves javabens
		evento.setIdTela(Integer.parseInt(request.getParameter("idTela")));
		evento.setSituacao(Boolean.parseBoolean(request.getParameter("situacao")));
		evento.setOrdem(Integer.parseInt(request.getParameter("ordem")));
		evento.setParametros(request.getParameter("parametros"));
	
		
		
		//invocar o metodo inserir projeto
		eventodao.inserirEvento(evento);
		
		//redicerionar para a pagina que voce quer depois que criou : aula 11
		response.sendRedirect("evento");
		
	}
	
	//editar evento pelo id
	protected void listarEvento(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int IdEvento = Integer.parseInt(request.getParameter("idEvento"));
		evento.setIdEvento(IdEvento);
		
		eventodao.selecionarEvento(evento);
		
		request.setAttribute("idEvento", evento.getIdEvento());
		request.setAttribute("idTela", evento.getIdTela());
		request.setAttribute("situacao", evento.isSituacao());
		request.setAttribute("ordem", evento.getOrdem());
		request.setAttribute("parametros", evento.getParametros());
	
		
		RequestDispatcher rd = request.getRequestDispatcher("alterar_evento.jsp");
		rd.forward(request, response);
	}
	
	protected void editarEvento(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		evento.setIdEvento(Integer.parseInt(request.getParameter("idEvento")));
		evento.setIdTela(Integer.parseInt(request.getParameter("idTela")));
		evento.setSituacao(Boolean.parseBoolean(request.getParameter("situacao")));
		evento.setOrdem(Integer.parseInt(request.getParameter("ordem")));
		evento.setParametros(request.getParameter("parametros"));
		
		//invocar o metodo inserir projeto
		eventodao.alterarEvento(evento);
		
		response.sendRedirect("evento"); // redirecionar
	}

	//remover versao
	protected void deletarEvento(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int idevento = Integer.parseInt(request.getParameter("idEvento"));	
			
		evento.setIdEvento(idevento);
			
			eventodao.deletarEvento(evento);
			
			response.sendRedirect("evento"); // redirecionar
	}
	

}
