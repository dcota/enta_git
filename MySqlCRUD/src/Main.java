import java.io.*;
import java.sql.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Properties p = new Properties();
		Connection conn = myConnection(p);
		ResultSet consulta = consulta(conn);
		int numLinha = 1;
		while (consulta.next()) {
			String nome = consulta.getString("name");
			int pop = consulta.getInt("population");
			System.out.println("Linha " + numLinha + ": " + nome + " " + pop);
			numLinha++;
		}
		int media = (int) mediaPop(consulta);
		System.out.println("Media da população: " + media);
		String maxPop = maxPop(consulta);
		System.out.println("Cidade com maior população: " + maxPop);
		String minPop = minPop(consulta);
		System.out.println("Cidade com menor população: " + minPop);
	}

	// método que retorna o nome da cidade com maior população
	public static String maxPop(ResultSet consulta) throws SQLException {
		try {
			consulta.first(); // move para a posição do objeto consulta
			int max = consulta.getInt("population"); // assume que o máximo está na primeira posição
			String cidade = consulta.getString("name"); // assume que a cidade é a da primeira po
			// verifica as restantes linhas e atualiza se maior
			while (consulta.next()) {
				int pop = consulta.getInt("population");
				if (pop > max) {
					max = pop;
					cidade = consulta.getString("name");
				}
			}
			return cidade;
		} catch (SQLException e) {
			System.out.println("Ocorreu um erro...");
			return null;
		}
	}

	// método que retorna o nome da cidade com menor população
	public static String minPop(ResultSet consulta) throws SQLException {
		try {
			consulta.first(); // move para a primeira posição do objeto consulta
			int min = consulta.getInt("population"); // assume que o mínimo está na primeira posição
			String cidade = consulta.getString("name"); // assume que a cidade é a da primeira posição
			// verifica as restantes linhas e atualiza se menor
			while (consulta.next()) {
				int pop = consulta.getInt("population");
				if (pop < min) {
					min = pop;
					cidade = consulta.getString("name");
				}
			}
			return cidade;
		} catch (SQLException e) {
			System.out.println("Ocorreu um erro...");
			return null;
		}
	}

	// método que retorna a média da população de todas as cidades
	public static double mediaPop(ResultSet consulta) throws SQLException {
		try {
			consulta.beforeFirst(); // move para a posição anterior à primeira
			double media = 0;
			int conta = 0;
			int soma = 0;
			// percorre todas as linhas e atualiza soma
			while (consulta.next()) {
				soma += consulta.getInt("population");
				conta++;
			}
			// calcula e retorna a média
			media = soma / conta;
			return media;
		} catch (SQLException e) {
			System.out.println("Ocorreu um erro...");
			return -1;
		}

	}

	// método que executa a consulta na base de dados e retorna objeto do tipo
	// ResultSet
	public static ResultSet consulta(Connection connection) {
		try {
			String frase = "SELECT name,population FROM city WHERE CountryCode LIKE 'PRT'";
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
			System.out.println("Ligado...");
			return connection;
		} catch (FileNotFoundException e) {
			System.out.println("Ficheiro não encontrado...");
		}
		return null;
	}
}
