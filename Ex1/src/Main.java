import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Properties;
import java.util.Scanner;

public class Main {
	
	private static Properties p = new Properties();
	private static Connection conn = setConnection(p);

	public static void main(String[] args) {
		boolean sair = false;
		while (sair == false) {
			int op = menu();
			while (op == -1) {
				op = menu();
			}
			switch(op) {
			case 1:
				Turma novaTurma = criarTurma();
				inserirTurma(novaTurma);
				break;
			case 2:
				//realizar tarefa
				break;
			case 3:
				//realizar tarefa
				break;
			case 4:
				//realizar tarefa
				break;
			case 5:
				sair=true;
				System.out.println("A terminar...");
				break;
			default:
				break;
			}
		}
	}
	
	//método para mostrar o menu e obter a opção do utilizador
	public static int menu() {
		Scanner in = new Scanner(System.in);
		try {
			int op;
			do {
				System.out.println("GESALUNOS - SISTEMA DE INSCRIÇÃO DE ALUNOS");
				System.out.println("1-Criar nova turma");
				System.out.println("2-Inscrever novo aluno numa turma");
				System.out.println("3-Consultar turmas existentes");
				System.out.println("4-Listar todos os alunos de uma turma");
				System.out.println("5-Terminar");
				System.out.print("Escolha uma operação (1-5): ");
				op = in.nextInt();
			} while(op<1 || op>5);
			return op;
		} catch (InputMismatchException e) {
			System.out.println("Opção inválida, tentar novamente...");
			return -1;
		}
	}
	
	//método para criar uma turma
	public static Turma criarTurma() {	
		Scanner in = new Scanner(System.in);
		//pedir dados ao utilizador
		System.out.print("Introduzir o nome do curso: ");
		String curso = in.nextLine();
		System.out.print("Introduzir o ano do curso (1, 2 ou 3: ");
		int anoCurso = in.nextInt();		
		//criar o objeto da classe turma com os dados introduzidos
		Turma novaTurma = new Turma(curso,anoCurso);	
		//retornar o objeto da classe turma
		return novaTurma;
	}

	//método para criar uma turma
	public static void inserirTurma(Turma novaTurma) {	
		String sql = 
				"INSERT INTO Turmas (curso,anoCurso) VALUES (?,?)";
		try {
			PreparedStatement stm = conn.prepareStatement(sql);
			stm.setString(1, novaTurma.getCurso());
			stm.setInt(2, novaTurma.getAnoCurso());
			
			int linhas = stm.executeUpdate();
			
			if(linhas>0) {
				System.out.println("Turma criada com sucesso!");
			} else {
				System.out.println("Algo correu mal...");
			}
			
		} catch (SQLException e) {
			System.out.println("Ocorreu um erro...");
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//método para fazer a ligação à base de dados
	public static Connection setConnection(Properties p) {
		try {
			InputStream input = new FileInputStream("dbConfig.properties");
			p.load(input);
			Connection connection = DriverManager.getConnection(
				p.getProperty("url"), p.getProperty("username"), p.getProperty("password"));
			System.out.println("Ligado...");
			return connection;
		} catch (IOException | SQLException e) {
			System.out.println("Ficheiro não encontrado...");
		}
		return null;
		
	}

}
