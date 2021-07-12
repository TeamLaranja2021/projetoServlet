package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


public class DAO {
	//Modulo de conexao com o assesar
	
		private String driver = "com.mysql.cj.jdbc.Driver";
		private String url = "jdbc:mysql://127.0.0.1:3306/projeto_documentacao?useTimezone=true&serverTimezone=UTC";
		private String user = "root";
		private String password = "rot";
		
	//metodo de conexao
		private Connection conectar() {
			Connection con = null;
			try {
				Class.forName(driver);
				con = DriverManager.getConnection(url, user, password);
				return con ;
			} catch (Exception e) {
				System.out.println(e);
				return null;
			}
		}
		
		//teste de conexao
		public void testeConexao() {
			try {
				Connection con = conectar();
				System.out.println(con);
				con.close();
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		
		//create Projeto
		public void inserirProjeto(JavaBeans projeto) {
			String createProjeto = "insert into projeto(nomeProjeto, situacao) values(? ,?)";
			try {
				//abrir conexao
				Connection con = conectar();
				//Prepar a query no banco de dados
				PreparedStatement pst = con.prepareStatement(createProjeto);
				//subtituir os paramentos (?) pelas variaveis
				pst.setString(1, projeto.getNomeProjeto());
				pst.setString(2, projeto.getSituacao());
				
				//excutar a query
				pst.executeUpdate();
				
				//fecha conexao
				con.close();
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		
		//READ de Projeto
		public ArrayList<JavaBeans> listarProjetos() {
			ArrayList<JavaBeans> projeto = new ArrayList<>();
			String read = "select * from projeto";
			try {
				//abrir conexao
				Connection con = conectar();
				//Prepar a query no banco de dados - ler read
				PreparedStatement pst = con.prepareStatement(read);
				//executa a query read
				ResultSet rs = pst.executeQuery();
				
				//laco de projeto
				while(rs.next()) {
					String IdProjeto = rs.getString(1);
					String nomeProjeto = rs.getString(2);
					String situacao = rs.getString(3);
					
					projeto.add(new JavaBeans(IdProjeto, nomeProjeto, situacao));
				}

				//fecha conexao
				con.close();
				
				return projeto;
			} catch (Exception e) {
				System.out.println(e);
				return null;
			}
		}
		
		//UPDATE
		public void selecionarProjeto(JavaBeans projeto) {
			//query
			String read2 = "select * from projeto where idProjeto =?";
			try {
				Connection con = conectar();
				PreparedStatement pst = con.prepareStatement(read2);
				pst.setString(1, projeto.getIdProjeto());
				ResultSet rs = pst.executeQuery();
				while(rs.next()) {
					projeto.setIdProjeto(rs.getString(1));
					projeto.setNomeProjeto(rs.getString(2));
					projeto.setSituacao(rs.getString(3));
					
				}

				//fecha conexao
				con.close();
				
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		
		//editar o projeto
		public void altearProjeto(JavaBeans projeto) {
			String create = "update projeto set nomeProjeto=?, situacao=? where idProjeto=? ";
			try {
				Connection con = conectar();
				PreparedStatement pst = con.prepareStatement(create);
				pst.setString(1, projeto.getNomeProjeto());
				pst.setString(2, projeto.getSituacao());
				pst.setString(3, projeto.getIdProjeto());
				pst.executeUpdate();
			
		
				//fecha conexao
				con.close();
				
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		
		//delete
		public void deletarProjeto(JavaBeans projeto) {
			String delete = "delete from projeto where idProjeto=?";
			try {
				Connection con = conectar();
				PreparedStatement pst = con.prepareStatement(delete);
				pst.setString(1, projeto.getIdProjeto());
				pst.executeUpdate(); //excuta query
				//fecha conexao
				con.close();
			} catch (Exception e) {
				System.out.println(e);
			}
		}
}
