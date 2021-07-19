package DAO;

import java.sql.Connection;
import java.sql.Date;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import model.Tela;

import util.ConnectionFactory;

public class TelaDAO {
	
	//create Tela
	public void inserirTela(Tela tela) {
		String createTela = "insert into tela (idVersao , dataCadastro, nomeTela, imagem, situacao,telaPai, ordem, urlog, versaoOrigem) values(?,?,?,?,?,?,?,?,?)";
		try {
			//abrir conexao
			Connection con =  ConnectionFactory.getConectar();
			//Prepar a query no banco de dados
			PreparedStatement pst = con.prepareStatement(createTela);
			//subtituir os paramentos (?) pelas variaveis
			pst.setInt(1, tela.getIdVersao());
			pst.setDate(2, (Date) tela.getDataCadastro());
			pst.setString(3, tela.getNomeTela());
			pst.setString(4, tela.getImagem());
			pst.setBoolean(5, tela.isSituacao());
			pst.setInt(6, tela.getTelaPai());
			pst.setInt(7, tela.getOrdem());
			pst.setString(8, tela.getUrlog());
			pst.setInt(9, tela.getVersaoOrigem());
			//excutar a query
			pst.executeUpdate();
			
			//fecha conexao
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}	
	
	
	//READ listar todas as versoes 
	public ArrayList<Tela> listarTela() {
		ArrayList<Tela> tela = new ArrayList<>();
		String read = "select * from tela";
		try {
			//abrir conexao
			Connection con =  ConnectionFactory.getConectar();
			//Prepar a query no banco de dados - ler read
			PreparedStatement pst = con.prepareStatement(read);
			//executa a query read
			ResultSet rs = pst.executeQuery();
			
			//laco de projeto
			while(rs.next()) {
				int idTela = rs.getInt(1);
				int idVersao = rs.getInt(2);
				Date dataCadastro = rs.getDate(3);
				String nomeTela = rs.getString(4);
				String imagem = rs.getString(5);
				Boolean situacao = rs.getBoolean(6);
				int telaPai = rs.getInt(7);
				int ordem = rs.getInt(8);
				String urlog = rs.getString(9);
				int versaoOrigem = rs.getInt(10);	
				
				tela.add(new Tela(idTela,idVersao, dataCadastro,nomeTela ,imagem ,situacao, telaPai , ordem, urlog, versaoOrigem ));
			}

			//fecha conexao
			con.close();
			
			return tela;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
	
	
	//selecionar tela
	public void selecionarTela(Tela tela ) {
		//query
		String read2 = "select * from tela where idTela =?";
		try {
			//abrir conexao
			Connection con =  ConnectionFactory.getConectar();
			
			PreparedStatement pst = con.prepareStatement(read2);
			pst.setInt(1, tela.getIdTela());
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				tela.setIdTela(rs.getInt(1));
				tela.setIdVersao(rs.getInt(2));
				tela.setDataCadastro(rs.getDate(3));
				tela.setNomeTela(rs.getString(4));
				tela.setImagem(rs.getString(5));
				tela.setSituacao(rs.getBoolean(6));
				tela.setTelaPai(rs.getInt(7));
				tela.setOrdem(rs.getInt(8));
				tela.setUrlog(rs.getString(9));
				tela.setVersaoOrigem(rs.getInt(10));
			}

			//fecha conexao
			con.close();
			
		} catch (Exception e) {
			System.out.println(e);
		}
			
	}	
	
	//alterar tela
	public void alterarTela(Tela tela ) {
		String create = "update tela set idVersao=?, dataCadastro=?, nomeTela=? , imagem=?, situacao=? , telaPai=?, ordem=? , urlog=? , versaoOrigem=? where idTela=? ";
		try {
			//abrir conexao
			Connection con =  ConnectionFactory.getConectar();
			
			PreparedStatement pst = con.prepareStatement(create);
			
			pst.setInt(1, tela.getIdVersao());
			pst.setDate(2, (Date) tela.getDataCadastro());
			pst.setString(3, tela.getNomeTela());
			pst.setString(4, tela.getImagem());
			pst.setBoolean(5, tela.isSituacao());
			pst.setInt(6, tela.getTelaPai());
			pst.setInt(7, tela.getOrdem());
			pst.setString(8, tela.getUrlog());
			pst.setInt(9, tela.getVersaoOrigem());
			pst.setInt(10, tela.getIdTela());
			pst.executeUpdate();
			//fecha conexao
			con.close();
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}	
	
	
	//deletar tela
	public void deletarTela(Tela tela ) {
		String delete = "delete from tela where idTela=?";
		try {
			//abrir conexao
			Connection con =  ConnectionFactory.getConectar();
			
			PreparedStatement pst = con.prepareStatement(delete);
			pst.setInt(1, tela.getIdTela());
			pst.executeUpdate(); //excuta query
			//fecha conexao
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
		
}
