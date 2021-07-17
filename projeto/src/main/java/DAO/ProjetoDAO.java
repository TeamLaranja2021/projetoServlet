package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import model.Projeto;
import util.ConnectionFactory;


public class ProjetoDAO {

		//create Projeto
		public void inserirProjeto(Projeto projeto) {
			String createProjeto = "insert into projeto(nomeProjeto, situacao) values(? ,?)";
			try {
				//abrir conexao
				Connection con =  ConnectionFactory.getConectar();
				//Prepar a query no banco de dados
				PreparedStatement pst = con.prepareStatement(createProjeto);
				//subtituir os paramentos (?) pelas variaveis
				pst.setString(1, projeto.getNomeProjeto());
				pst.setBoolean(2, projeto.isSituacao());
				
				//excutar a query
				pst.executeUpdate();
				
				//fecha conexao
				con.close();
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		
		//READ listar todas os  Projeto
		public ArrayList<Projeto> listarProjetos() {
			ArrayList<Projeto> projeto = new ArrayList<>();
			String read = "select * from projeto";
			try {
				//abrir conexao
				Connection con =  ConnectionFactory.getConectar();
				//Prepar a query no banco de dados - ler read
				PreparedStatement pst = con.prepareStatement(read);
				//executa a query read
				ResultSet rs = pst.executeQuery();
				
				//laco de projeto
				while(rs.next()) {
					int IdProjeto = rs.getInt(1);
					String nomeProjeto = rs.getString(2);
					Boolean situacao = rs.getBoolean(3);
					
					projeto.add(new Projeto(IdProjeto, nomeProjeto, situacao));
				}

				//fecha conexao
				con.close();
				
				return projeto;
			} catch (Exception e) {
				System.out.println(e);
				return null;
			}
		}
		
		//selecionar projeto pelo id
		public void selecionarProjeto(Projeto projeto) {
			//query
			String read2 = "select * from projeto where idProjeto =?";
			try {
				Connection con =  ConnectionFactory.getConectar();
				PreparedStatement pst = con.prepareStatement(read2);
				pst.setInt(1, projeto.getIdProjeto());
				ResultSet rs = pst.executeQuery();
				while(rs.next()) {
					projeto.setIdProjeto(rs.getInt(1));
					projeto.setNomeProjeto(rs.getString(2));
					projeto.setSituacao(rs.getBoolean(3));
					
				}

				//fecha conexao
				con.close();
				
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		
		//editar o projeto
		public void altearProjeto(Projeto projeto) {
			String create = "update projeto set nomeProjeto=?, situacao=? where idProjeto=? ";
			try {
				Connection con =  ConnectionFactory.getConectar();
				PreparedStatement pst = con.prepareStatement(create);
				pst.setString(1, projeto.getNomeProjeto());
				pst.setBoolean(2, projeto.isSituacao());
				pst.setInt(3, projeto.getIdProjeto());
				pst.executeUpdate();
			
		
				//fecha conexao
				con.close();
				
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		
		//delete
		public void deletarProjeto(Projeto projeto) {
			String delete = "delete from projeto where idProjeto=?";
			try {
				Connection con =  ConnectionFactory.getConectar();
				PreparedStatement pst = con.prepareStatement(delete);
				pst.setInt(1, projeto.getIdProjeto());
				pst.executeUpdate(); //excuta query
				//fecha conexao
				con.close();
			} catch (Exception e) {
				System.out.println(e);
			}
		}
}
