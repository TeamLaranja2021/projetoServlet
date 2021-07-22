package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import model.Usuario;
import util.ConnectionFactory;

public class UsuarioDAO {

	//CRUD - Create Usuario
	public void inserirUsuario(Usuario usuario) {
		
		String create = "insert into usuario (nome , email, senha, cargo) values(?,?,?,?)";
		
		try {
			//abrir conexao
			Connection con =  ConnectionFactory.getConectar();
			
			// peprara a query no banco de dados
			PreparedStatement pst = con.prepareStatement(create);
			
			//Substituir os paramentros (?) pela conteudo as variavas no javabens
			pst.setString(1, usuario.getNome());
			pst.setString(2, usuario.getEmail());
			pst.setString(3, usuario.getSenha());
			pst.setString(4, usuario.getCargo());
			//executar a query
			pst.executeUpdate();
			
			
			//encessar a conexao do banco
			con.close();
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	
	//READ listar todas os  usuarios
	public ArrayList<Usuario> listarUsuario() {
		ArrayList<Usuario> usuario = new ArrayList<>();
		String read = "select * from usuario";
		try {
			//abrir conexao
			Connection con =  ConnectionFactory.getConectar();
			//Prepar a query no banco de dados - ler read
			PreparedStatement pst = con.prepareStatement(read);
			//executa a query read
			ResultSet rs = pst.executeQuery();
			
			//laco de projeto
			while(rs.next()) {
				int idUsuario= rs.getInt(1);
				String nome = rs.getString(2);
				String email = rs.getString(3);
				String senha  = rs.getString(4);
				String cargo = rs.getString(5);
				usuario.add(new Usuario(idUsuario, nome, email, senha,cargo));
			}

			//fecha conexao
			con.close();
			
			return usuario;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
	
	
	//selecionar usuario pelo id
	public void selecionarUsuario(Usuario usuario) {
		//query
		String read2 = "select * from usuario where idUsuario =?";
		try {
			//abrir conexao
			Connection con =  ConnectionFactory.getConectar();
			
			PreparedStatement pst = con.prepareStatement(read2);
			pst.setInt(1, usuario.getIdUsuario());
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				usuario.setIdUsuario(rs.getInt(1));
				usuario.setNome(rs.getString(2));
				usuario.setSenha(rs.getString(3));
				usuario.setEmail(rs.getString(4));
				usuario.setCargo(rs.getString(5));
				
			}

			//fecha conexao
			con.close();
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	//editar o projeto
	public void alterarUsuario(Usuario usuario) {
		String create = "update usuario set nome=?, senha=?, email=? , cargo=? where idUsuario=? ";
		try {
			//abrir conexao
			Connection con =  ConnectionFactory.getConectar();
			
			PreparedStatement pst = con.prepareStatement(create);
			
			pst.setString(1, usuario.getNome());
			pst.setString(2, usuario.getSenha());
			pst.setString(3, usuario.getEmail());
			pst.setString(4, usuario.getCargo());
			pst.setInt(5, usuario.getIdUsuario());
			pst.executeUpdate();
		
			//fecha conexao
			con.close();
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	//deletar
	public void deletarUsuario(Usuario usuario) {
		String delete = "delete from usuario where idUsuario=?";
		try {
			//abrir conexao
			Connection con =  ConnectionFactory.getConectar();
			PreparedStatement pst = con.prepareStatement(delete);
			pst.setInt(1, usuario.getIdUsuario());
			pst.executeUpdate(); //excuta query
			//fecha conexao
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
		
}
