package DAO;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import model.Propriedade;

import util.ConnectionFactory;

public class PropriedadeDAO {

	//create Tela
	public void inserirPropriedade(Propriedade propriedade) {
		String createPropriedade = "insert into propriedade (idRequisicao , tipoPropriedade, chave, valor, ordem) values(?,?,?,?,?)";
		try {
			//abrir conexao
			Connection con =  ConnectionFactory.getConectar();
			//Prepar a query no banco de dados
			PreparedStatement pst = con.prepareStatement(createPropriedade);
			//subtituir os paramentos (?) pelas variaveis
			pst.setInt(1, propriedade.getIdRequisicao());
			pst.setString(2, propriedade.getTipoPropriedade());
			pst.setString(3, propriedade.getChave());
			pst.setInt(4, propriedade.getValor());
			pst.setInt(5, propriedade .getOrdem());
	
			//excutar a query
			pst.executeUpdate();
			
			//fecha conexao
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}	
	
	
	//READ listar todas as versoes 
	public ArrayList<Propriedade> listarPropriedade() {
		ArrayList<Propriedade> propriedade = new ArrayList<>();
		String read = "select * from propriedade";
		try {
			//abrir conexao
			Connection con =  ConnectionFactory.getConectar();
			//Prepar a query no banco de dados - ler read
			PreparedStatement pst = con.prepareStatement(read);
			//executa a query read
			ResultSet rs = pst.executeQuery();
			
			//laco de projeto
			while(rs.next()) {
				int idPropriedade = rs.getInt(1);
				int idRequisicao = rs.getInt(2);
				String tipoPropriedade = rs.getString(3);
				String chave = rs.getString(4);
				int valor = rs.getInt(5);
				int ordem = rs.getInt(6);

				propriedade.add(new Propriedade(idPropriedade,  idRequisicao, tipoPropriedade, chave, valor,ordem));
			}

			//fecha conexao
			con.close();
			
			return propriedade;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
	
	
	//selecionar tela
	public void selecionarPropriedade(Propriedade propriedade) {
		//query
		String read2 = "select * from propriedade where  idPropriedade=?";
		try {
			//abrir conexao
			Connection con =  ConnectionFactory.getConectar();
			
			PreparedStatement pst = con.prepareStatement(read2);
			pst.setInt(1, propriedade.getIdPropriedade());
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				propriedade.setIdPropriedade(rs.getInt(1));
				propriedade.setIdRequisicao(rs.getInt(2));
				propriedade.setTipoPropriedade(rs.getString(3));
				propriedade.setChave(rs.getString(4));
				propriedade.setValor(rs.getInt(5));
				propriedade.setOrdem(rs.getInt(6));
			
			}

			//fecha conexao
			con.close();
			
		} catch (Exception e) {
			System.out.println(e);
		}
			
	}	
	
	//alterar tela
	public void alterarPropriedade(Propriedade propriedade) {
		String create = "update propriedade set idRequisicao=?, tipoPropriedade=?, chave=? , valor=?, ordem=? where  idPropriedade=? ";
		try {
			//abrir conexao
			Connection con =  ConnectionFactory.getConectar();
			
			PreparedStatement pst = con.prepareStatement(create);
	
			pst.setInt(1, propriedade.getIdRequisicao());
			pst.setString(2, propriedade.getTipoPropriedade());
			pst.setString(3, propriedade.getChave());
			pst.setInt(4, propriedade.getValor());
			pst.setInt(5, propriedade .getOrdem());
			pst.setInt(6, propriedade.getIdPropriedade());
			pst.executeUpdate();
			//fecha conexao
			con.close();
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}	
	
	
	//deletar tela
	public void deletarPropriedade(Propriedade propriedade) {
		String delete = "delete from propriedade where idPropriedade=?";
		try {
			//abrir conexao
			Connection con =  ConnectionFactory.getConectar();
			
			PreparedStatement pst = con.prepareStatement(delete);
			pst.setInt(1, propriedade.getIdPropriedade());
			pst.executeUpdate(); //excuta query
			//fecha conexao
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
