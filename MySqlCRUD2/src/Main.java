import java.io.*;
import java.sql.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Properties p = new Properties();
		Connection conn = myConnection(p);
		//inserir(conn);
		ResultSet consulta = consulta(conn);
		int numLinha = 1;
		while (consulta.next()) {
			String primNome = consulta.getString("primNome");
			String ultNome = consulta.getString("ultNome");
			int idade = consulta.getInt("idade");
			System.out.println("Linha " + numLinha + ": " + primNome + " " + ultNome + " " + idade);
			numLinha++;
		}	
	}
	
	public static void inserir(Connection connection) {
		String sql = 
				"INSERT INTO alunos (primNome,ultNome,idade) VALUES (?,?,?)";
		try {
			PreparedStatement stm = connection.prepareStatement(sql);
			stm.setString(1, "Alberto");
			stm.setString(2, "Rocha");
			stm.setInt(3, 20);
			
			int linhas = stm.executeUpdate();
			
			if(linhas>0) {
				System.out.println("Linha adicionada");
			} else {
				System.out.println("Algo correu mal...");
			}
			
		} catch (SQLException e) {
			System.out.println("Ocorreu um erro...");
			e.printStackTrace();
		}
	}

	
	
	// método que executa a consulta na base de dados e retorna objeto do tipo ResultSet
	public static ResultSet consulta(Connection connection) {
		try {
			String frase = "SELECT primNome,ultNome,idade FROM alunos";
			Statement stm = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			stm.setFetchSize(1);
			ResultSet resultado = stm.executeQuery(frase);
			return resultado;
		} catch (Exception exc) {
			System.out.println("Ocorreu um erro...");
		}
		return null;
	}

	public static Connection myConnection(Properties p) throws Exception {
		try {
			InputStream input = new FileInputStream("dbConfig.properties");
			p.load(input);
			Connection connection = DriverManager.getConnection(p.getProperty("url"), p.getProperty("username"),
					p.getProperty("password"));
			return connection;
		} catch (FileNotFoundException e) {
			System.out.println("Ficheiro não encontrado...");
		}
		return null;
	}
}
