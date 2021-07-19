package DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import model.Requisicao;
import model.Tela;
import util.ConnectionFactory;

public class RequisicaoDAO {

	//create Tela
		public void inserirRequisicao(Requisicao requisicao) {
			String createRequisicao = "insert into requisicao (idEvento , urlHomolog, uriProd, descricao, requisicaoPai,camada, situacao, ordem) values(?,?,?,?,?,?,?,?)";
			try {
				//abrir conexao
				Connection con =  ConnectionFactory.getConectar();
				//Prepar a query no banco de dados
				PreparedStatement pst = con.prepareStatement(createRequisicao);
				//subtituir os paramentos (?) pelas variaveis
				pst.setInt(1, requisicao.getIdEvento());
				pst.setString(2, requisicao.getUrlHomolog());
				pst.setString(3, requisicao.getUriProd());
				pst.setString(4, requisicao.getDescricao());
				pst.setInt(5, requisicao.getRequisicaoPai());
				pst.setString(6, requisicao.getCamada());
				pst.setBoolean(7, requisicao.isSituacao());
				pst.setInt(8, requisicao.getOrdem());
				//excutar a query
				pst.executeUpdate();
				
				//fecha conexao
				con.close();
			} catch (Exception e) {
				System.out.println(e);
			}
		}	
		
		
		//READ listar todas as versoes 
		public ArrayList<Requisicao> listarRequisicao() {
			ArrayList<Requisicao> requisicao = new ArrayList<>();
			String read = "select * from requisicao";
			try {
				//abrir conexao
				Connection con =  ConnectionFactory.getConectar();
				//Prepar a query no banco de dados - ler read
				PreparedStatement pst = con.prepareStatement(read);
				//executa a query read
				ResultSet rs = pst.executeQuery();
				
				//laco de projeto
				while(rs.next()) {
					int idRequisicao = rs.getInt(1);
					int idEvento = rs.getInt(2);
					String urlHomolog = rs.getString(3);
					String uriProd = rs.getString(4);
					String descricao = rs.getString(5);
					int requisicaoPai = rs.getInt(6);
					String camada = rs.getString(7);
					Boolean situacao = rs.getBoolean(8);
					int ordem = rs.getInt(9);
					
					requisicao.add(new Requisicao(idRequisicao ,idEvento ,urlHomolog, uriProd ,descricao ,requisicaoPai,camada,situacao,ordem));
				}

				//fecha conexao
				con.close();
				
				return requisicao;
			} catch (Exception e) {
				System.out.println(e);
				return null;
			}
		}
		
		
		//selecionar reequisicao pela id 
		public void selecionarRequisicao(Requisicao requisicao) {
			//query
			String read2 = "select * from requisicao where idRequisicao=?";
			try {
				//abrir conexao
				Connection con =  ConnectionFactory.getConectar();
				
				PreparedStatement pst = con.prepareStatement(read2);
				pst.setInt(1, requisicao.getIdRequisicao());
				ResultSet rs = pst.executeQuery();
				while(rs.next()) {
					requisicao.setIdRequisicao(rs.getInt(1));
					requisicao.setIdEvento(rs.getInt(2));
					requisicao.setUrlHomolog(rs.getString(3));
					requisicao.setUriProd(rs.getString(4));
					requisicao.setDescricao(rs.getString(5));
					requisicao.setRequisicaoPai(rs.getInt(6)); 
					requisicao.setCamada(rs.getString(7));
					requisicao.setSituacao(rs.getBoolean(8));
					requisicao.setOrdem(rs.getInt(9));
				}

				//fecha conexao
				con.close();
				
			} catch (Exception e) {
				System.out.println(e);
			}
				
		}	
		
		//alterar tela
		public void alterarRequisicao(Requisicao requisicao ) {
			String create = "update requisicao set idEvento=?, urlHomolog=?, uriProd=? , descricao=?, requisicaoPai=? , camada=?, situacao=? , ordem=?  where idRequisicao=? ";
			try {
				//abrir conexao
				Connection con =  ConnectionFactory.getConectar();
				
				PreparedStatement pst = con.prepareStatement(create);
				
				pst.setInt(1, requisicao.getIdEvento());
				pst.setString(2, requisicao.getUrlHomolog());
				pst.setString(3, requisicao.getUriProd());
				pst.setString(4, requisicao.getDescricao());
				pst.setInt(5, requisicao.getRequisicaoPai());
				pst.setString(6, requisicao.getCamada());
				pst.setBoolean(7, requisicao.isSituacao());
				pst.setInt(8, requisicao.getOrdem());
				pst.setInt(9, requisicao.getIdRequisicao());
				
				pst.executeUpdate();
				//fecha conexao
				con.close();
				
			} catch (Exception e) {
				System.out.println(e);
			}
		}	
		
		
		//deletar tela
		public void deletarRequisicao(Requisicao requisicao ) {
			String delete = "delete from requisicao where idRequisicao=?";
			try {
				//abrir conexao
				Connection con =  ConnectionFactory.getConectar();
				
				PreparedStatement pst = con.prepareStatement(delete);
				pst.setInt(1, requisicao.getIdRequisicao());
				pst.executeUpdate(); //excuta query
				//fecha conexao
				con.close();
			} catch (Exception e) {
				System.out.println(e);
			}
		}
			
}
