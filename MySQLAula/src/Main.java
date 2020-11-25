import java.io.*;
import java.sql.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Properties p = new Properties();
		Connection conn = myConnection(p);
		ResultSet consulta = consulta(conn);
		/*int numLinha=1;
		while(consulta.next()) {
			String nome = consulta.getString("name");
			int pop = consulta.getInt("population");
			System.out.println("Linha " + numLinha + ": " + nome + " " + pop);
			numLinha++;
		}*/
		double media = mediaPop(consulta);
		System.out.println("Media: " + media);
		String maxPop = maxPop(consulta);
		System.out.println("Maximo: " + maxPop);
	}
	
	public static String maxPop(ResultSet consulta) throws SQLException {
		String cidade="";
		int max=0;
		while(consulta.next()) {
			int pop = consulta.getInt("population");
			if(pop > max) {
				max=pop;
				cidade=consulta.getString("name");
			}
				
		}
		return cidade;
	}
	
	public static int minPop(ResultSet consulta) {
		int min=0;
		//processar
		return min;
	}
	
	public static double mediaPop(ResultSet consulta) throws SQLException {
		double media=0;
		int conta=0;
		int soma=0;
		while(consulta.next()) {
			soma += consulta.getInt("population");
			conta++;
		}
		media=soma/conta;
		return media;
	}
	
	public static ResultSet consulta(Connection connection) {
		try {
			String frase = 
			"SELECT name,population FROM city WHERE CountryCode LIKE 'PRT'";
			Statement stm = connection.createStatement();
			ResultSet resultado = stm.executeQuery(frase);
			return resultado;
		}catch(Exception exc) {
			System.out.println("Ocorreu um erro...");	
		}
		return null;
	}
	
	
	
	
	
	
	
	public static Connection myConnection(Properties p) throws Exception {
		try {	
			
		InputStream input = new FileInputStream("dbConfig.properties");
			p.load(input);
			Connection connection = DriverManager.getConnection(
					p.getProperty("url"), p.getProperty("username"), p.getProperty("password"));
			System.out.println("Ligado...");
			return connection;
		} catch (FileNotFoundException e) {
			System.out.println("Ficheiro não encontrado...");
		}
		return null;
	}
}
