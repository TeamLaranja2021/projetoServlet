package DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;

import model.Projeto;
import model.Usuario;
import model.Versao;
import util.ConnectionFactory;

public class VersaoDAO {

	//create versao
			public void inserirVersao(Versao versao) {
				String createVersao = "insert into versao (idprojeto , GMUD, descricao, situacao, dataLancamento,ordem, numeroVersao) values(?,?,?,?,?,?,?)";
				try {
					//abrir conexao
					Connection con =  ConnectionFactory.getConectar();
					//Prepar a query no banco de dados
					PreparedStatement pst = con.prepareStatement(createVersao);
					//subtituir os paramentos (?) pelas variaveis
					pst.setInt(1, versao.getIdProjeto());
					pst.setString(2, versao.getGMUD());
					pst.setString(3, versao.getDescricao());
					pst.setBoolean(4, versao.isSituacao());
					pst.setDate(5, (Date) versao.getDataLancamento());
					//pst.setString(5, versao.getDataLancamento());
					pst.setString(6, versao.getOrdem());
					pst.setString(7, versao.getNumeroVersao());
					//excutar a query
					pst.executeUpdate();
					
					//fecha conexao
					con.close();
				} catch (Exception e) {
					System.out.println(e);
				}
			}
			
			
			//READ listar todas as versoes 
			public ArrayList<Versao> listarVersao() {
				ArrayList<Versao> versao = new ArrayList<>();
				String read = "select * from versao";
				try {
					//abrir conexao
					Connection con =  ConnectionFactory.getConectar();
					//Prepar a query no banco de dados - ler read
					PreparedStatement pst = con.prepareStatement(read);
					//executa a query read
					ResultSet rs = pst.executeQuery();
					
					//laco de projeto
					while(rs.next()) {
						int IdVersao = rs.getInt(1);
						int idProjeto = rs.getInt(2);
						String GMUD = rs.getString(3);
						String descricao = rs.getString(4);
						Boolean situacao = rs.getBoolean(5);
						Date dataLancamento = rs.getDate(6);
						String ordem = rs.getString(7);
						String numeroVersao = rs.getString(8);	
						versao.add(new Versao(IdVersao, idProjeto, GMUD, descricao, situacao, dataLancamento, ordem, numeroVersao));
					}

					//fecha conexao
					con.close();
					
					return versao;
				} catch (Exception e) {
					System.out.println(e);
					return null;
				}
			}
			
			
			
			//selecionar versao pelo id
			public void selecionarVersao(Versao versao) {
				//query
				String read2 = "select * from versao where idVersao =?";
				try {
					//abrir conexao
					Connection con =  ConnectionFactory.getConectar();
					
					PreparedStatement pst = con.prepareStatement(read2);
					pst.setInt(1, versao.getIdVersao());
					ResultSet rs = pst.executeQuery();
					while(rs.next()) {
						versao.setIdVersao(rs.getInt(1));
						versao.setIdProjeto(rs.getInt(2));
						versao.setGMUD(rs.getString(3));
						versao.setDescricao(rs.getString(4));
						versao.setSituacao(rs.getBoolean(5));
						versao.setDataLancamento(rs.getDate(6));
						versao.setOrdem(rs.getString(7));
						versao.setNumeroVersao(rs.getString(8));
					}

					//fecha conexao
					con.close();
					
				} catch (Exception e) {
					System.out.println(e);
				}
			}
			
			
			//editar a versao
			public void alterarVersao(Versao versao) {
				String create = "update versao set idprojeto=?, GMUD=?, descricao=? , situacao=?, dataLancamento=? , ordem=?, numeroVersao=? where idVersao=? ";
				try {
					//abrir conexao
					Connection con =  ConnectionFactory.getConectar();
					
					PreparedStatement pst = con.prepareStatement(create);
					
					//pst.setString(0, projeto.getIdProjeto());
					pst.setInt(1, versao.getIdProjeto());
					pst.setString(2, versao.getGMUD());
					pst.setString(3, versao.getDescricao());
					pst.setBoolean(4, versao.isSituacao());
					pst.setDate(5, (Date) versao.getDataLancamento());
					//pst.setString(5, versao.getDataLancamento());
					pst.setString(6, versao.getOrdem());
					pst.setString(7, versao.getNumeroVersao());
					pst.setInt(8, versao.getIdVersao());
					pst.executeUpdate();
				
					//fecha conexao
					con.close();
					
				} catch (Exception e) {
					System.out.println(e);
				}
			}
			
			//deletar
			public void deletarVersao(Versao versao) {
				String delete = "delete from versao where idVersao=?";
				try {
					//abrir conexao
					Connection con =  ConnectionFactory.getConectar();
					
					PreparedStatement pst = con.prepareStatement(delete);
					pst.setInt(1, versao.getIdVersao());
					pst.executeUpdate(); //excuta query
					//fecha conexao
					con.close();
				} catch (Exception e) {
					System.out.println(e);
				}
			}
}
