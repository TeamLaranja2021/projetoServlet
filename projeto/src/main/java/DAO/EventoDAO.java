package DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import model.Evento;
import model.Tela;
import util.ConnectionFactory;

public class EventoDAO {

	//create Evento
	public void inserirEvento(Evento evento) {
		String createEvento = "insert into evento (idTela , situacao, ordem, parametros) values(?,?,?,?)";
		try {
			//abrir conexao
			Connection con =  ConnectionFactory.getConectar();
			//Prepar a query no banco de dados
			PreparedStatement pst = con.prepareStatement(createEvento);
			//subtituir os paramentos (?) pelas variaveis
			pst.setInt(1, evento.getIdEvento());
			pst.setBoolean(2, evento.isSituacao());
			pst.setInt(3, evento.getOrdem());
			pst.setString(4, evento.getParametros());
		
			//excutar a query
			pst.executeUpdate();
			
			//fecha conexao
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}	
	
	
	//READ listar todas as versoes 
	public ArrayList<Evento> listarEvento() {
		ArrayList<Evento> evento = new ArrayList<>();
		String read = "select * from evento";
		try {
			//abrir conexao
			Connection con =  ConnectionFactory.getConectar();
			//Prepar a query no banco de dados - ler read
			PreparedStatement pst = con.prepareStatement(read);
			//executa a query read
			ResultSet rs = pst.executeQuery();
			
			//laco de projeto
			while(rs.next()) {
				
				int idEvento = rs.getInt(1);
				int idTela = rs.getInt(2);
				Boolean situacao = rs.getBoolean(3);
				int ordem = rs.getInt(4);
				String parametros = rs.getString(5);
			
				
				evento.add(new Evento(idEvento,idTela,situacao, ordem,parametros));
			}

			//fecha conexao
			con.close();
			
			return evento;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
	
	
	//selecionar tela
	public void selecionarEvento(Evento evento ) {
		//query
		String read2 = "select * from evento where idEvento =?";
		try {
			//abrir conexao
			Connection con =  ConnectionFactory.getConectar();
			
			PreparedStatement pst = con.prepareStatement(read2);
			pst.setInt(1, evento.getIdEvento());
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				evento.setIdTela(rs.getInt(1));
				evento.setSituacao(rs.getBoolean(2));
				evento.setOrdem(rs.getInt(3));
				evento.setParametros(rs.getString(5));
				
				
			}

			//fecha conexao
			con.close();
			
		} catch (Exception e) {
			System.out.println(e);
		}
			
	}	
	
	//alterar tela
	public void alterarEvento(Evento evento) {
		String create = "update evento set idTela=?,  situacao=? , ordem=? , parametros=?  where idEvento=? ";
		try {
			//abrir conexao
			Connection con =  ConnectionFactory.getConectar();
			
			PreparedStatement pst = con.prepareStatement(create);
			
			pst.setInt(1, evento.getIdTela());
			pst.setBoolean(2, evento.isSituacao());
			pst.setInt(3,evento.getOrdem());
			pst.setString(4, evento.getParametros());
			pst.setInt(5, evento.getIdEvento());
			pst.executeUpdate();
			//fecha conexao
			con.close();
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}	
	
	
	//deletar tela
	public void deletarEvento(Evento evento ) {
		String delete = "delete from evento where idEvento=?";
		try {
			//abrir conexao
			Connection con =  ConnectionFactory.getConectar();
			
			PreparedStatement pst = con.prepareStatement(delete);
			pst.setInt(1, evento.getIdEvento());
			pst.executeUpdate(); //excuta query
			//fecha conexao
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
