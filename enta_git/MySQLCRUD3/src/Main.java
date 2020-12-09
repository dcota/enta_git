import java.io.*;
import java.sql.*;
import java.util.*;

public class Main {
	
	private static Properties p = new Properties();
	private static Connection connection = setConnection(p);
	public static void main(String[] args) throws Exception {
		
		long startTime = System.currentTimeMillis();
		consultaSQL();
		long endTime = System.currentTimeMillis();
		long timeElapsed = endTime - startTime;
		
		System.out.println("Execution time in milliseconds: " + timeElapsed);
	}
	
	public static void consulta() {
		try {
			String frase = "SELECT Population FROM city";
			Statement stm = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			ResultSet resultado = stm.executeQuery(frase);
			int soma=0;
			while (resultado.next()) {
				soma += resultado.getInt(1);
			}	
			System.out.println(soma);
		} catch (SQLException exc) {
			System.out.println("Ocorreu um erro...");
		}
	}
	
	public static void consultaSQL() {
		try {
			String frase = "SELECT SUM(Population) FROM city";
			Statement stm = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			ResultSet resultado = stm.executeQuery(frase);
			resultado.next();
			int soma = resultado.getInt(1);
			System.out.println(soma);
		} catch (Exception exc) {
			System.out.println("Ocorreu um erro...");
			exc.printStackTrace();
		}
	}
	
	public static Connection setConnection(Properties p) {
		try {
			InputStream input = new FileInputStream("dbConfig.properties");
			p.load(input);
			Connection connection = DriverManager.getConnection(p.getProperty("url"), p.getProperty("username"),
					p.getProperty("password"));
			System.out.println("Ligado...");
			return connection;
		} catch (IOException | SQLException e) {
			System.out.println("Ficheiro n�o encontrado...");
		}
		return null;

	}
}