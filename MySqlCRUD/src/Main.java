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
		System.out.println("Media da popula��o: " + media);
		String maxPop = maxPop(consulta);
		System.out.println("Cidade com maior popula��o: " + maxPop);
		String minPop = minPop(consulta);
		System.out.println("Cidade com menor popula��o: " + minPop);
	}

	// m�todo que retorna o nome da cidade com maior popula��o
	public static String maxPop(ResultSet consulta) throws SQLException {
		try {
			consulta.first(); // move para a posi��o do objeto consulta
			int max = consulta.getInt("population"); // assume que o m�ximo est� na primeira posi��o
			String cidade = consulta.getString("name"); // assume que a cidade � a da primeira po
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

	// m�todo que retorna o nome da cidade com menor popula��o
	public static String minPop(ResultSet consulta) throws SQLException {
		try {
			consulta.first(); // move para a primeira posi��o do objeto consulta
			int min = consulta.getInt("population"); // assume que o m�nimo est� na primeira posi��o
			String cidade = consulta.getString("name"); // assume que a cidade � a da primeira posi��o
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

	// m�todo que retorna a m�dia da popula��o de todas as cidades
	public static double mediaPop(ResultSet consulta) throws SQLException {
		try {
			consulta.beforeFirst(); // move para a posi��o anterior � primeira
			double media = 0;
			int conta = 0;
			int soma = 0;
			// percorre todas as linhas e atualiza soma
			while (consulta.next()) {
				soma += consulta.getInt("population");
				conta++;
			}
			// calcula e retorna a m�dia
			media = soma / conta;
			return media;
		} catch (SQLException e) {
			System.out.println("Ocorreu um erro...");
			return -1;
		}

	}

	// m�todo que executa a consulta na base de dados e retorna objeto do tipo
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
			System.out.println("Ficheiro n�o encontrado...");
		}
		return null;
	}
}
