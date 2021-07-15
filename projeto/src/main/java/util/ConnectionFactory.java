package util;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {

	
	private static final String driver = "com.mysql.cj.jdbc.Driver";
	private static final String url = "jdbc:mysql://127.0.0.1:3306/projeto_documentacao?useTimezone=true&serverTimezone=UTC";
	private static final String user = "root";
	private static final String password = "rot";
	
//metodo de conexao
	public static Connection getConectar() {
		Connection con = null;
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			System.out.println(e);
			
		}
		return con;
	}
}
