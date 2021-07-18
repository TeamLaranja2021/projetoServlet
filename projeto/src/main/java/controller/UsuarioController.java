package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.UsuarioDAO;
import model.Projeto;
import model.Usuario;


@WebServlet(urlPatterns = {"/UsuarioController", "/user", "/insertUser" ,"/selectUser", "/updateUser", "/deleteUser"})
public class UsuarioController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 UsuarioDAO usuariodao = new UsuarioDAO();
	 Usuario usuario = new Usuario();
	 
	 public UsuarioController() {
	        super();
	      
	    }
  
	 //rotas
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String  action = request.getServletPath();
		System.out.println(action);
		if(action.equals("/user")) {
			usuarios(request, response);
		}else if(action.equals("/insertUser")) {
			novoUsuario(request, response);
		} else if(action.equals("/selectUser")){
			listarUsuario(request, response);
		}else if(action.equals("/updateUser")) {
			editarUsuario(request, response);	
		}else if(action.equals("/deleteUser")) {
			deletarUsuario(request, response);
		}else {
			response.sendRedirect("user");
		}

	}
	
	//listar todos os usuarios
	protected void usuarios(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//get usuario
		ArrayList<Usuario> lista = usuariodao.listarUsuario();
		
		request.setAttribute("usuario", lista);
		RequestDispatcher rd = request.getRequestDispatcher("listarUsuario.jsp");
		rd.forward(request, response);
	}
	
	// Criar projeto
	protected void novoUsuario(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//setar as variaves javabens
		usuario.setNome(request.getParameter("nome"));
		usuario.setEmail(request.getParameter("email"));
		usuario.setSenha(request.getParameter("senha"));
		usuario.setCargo(request.getParameter("cargo"));
		
		//invocar o metodo inserir projeto
		usuariodao.inserirUsuario(usuario);
		
		//redicerionar para a pagina que voce quer depois que criou : aula 11
		response.sendRedirect("user");
	}
	
	//editar usuario pelo id
	protected void listarUsuario(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int IdUsuario = Integer.parseInt(request.getParameter("idUsuario"));
		usuario.setIdUsuario(IdUsuario);
		
		usuariodao.selecionarUsuario(usuario);
		
		request.setAttribute("idUsuario", usuario.getIdUsuario());
		request.setAttribute("nome", usuario.getNome());
		request.setAttribute("senha", usuario.getSenha());
		request.setAttribute("email", usuario.getEmail());
		request.setAttribute("cargo", usuario.getCargo());
	
		RequestDispatcher rd = request.getRequestDispatcher("EditarUsuario.jsp");
		rd.forward(request, response);
	}
	
	protected void editarUsuario(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		usuario.setIdUsuario(Integer.parseInt(request.getParameter("idUsuario")));
		
		usuario.setNome(request.getParameter("nome"));
		usuario.setSenha(request.getParameter("senha"));
		usuario.setEmail(request.getParameter("email"));
		usuario.setCargo(request.getParameter("cargo"));
		
		//invocar o metodo inserir projeto
		usuariodao.alterarUsuario(usuario);
		
		response.sendRedirect("user"); // redirecionar
	}
	
	//remover usuario
	protected void deletarUsuario(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			int idusuario = Integer.parseInt(request.getParameter("idUsuario"));
			
			usuario.setIdUsuario(idusuario);
			
			usuariodao.deletarUsuario(usuario);
			
			response.sendRedirect("user"); // redirecionar
	}

	
}
