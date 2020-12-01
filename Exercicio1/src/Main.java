import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.Scanner;

public class Main {
	
	private static Properties p = new Properties();
	private static Connection conn = myConnection(p);
	
	public static void main(String[] args) throws Exception {
		
		boolean sair = false;
		while (sair == false) {
			int op = menu();
			while (op == -1) {
				op = menu();
			}
			switch (op) {
			case 1:
				Turma novaTurma = criarTurma();
				inserirTurma(novaTurma);
				break;
			case 2:
				Aluno novoAluno = criarAluno();
				inserirAluno(novoAluno);
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				sair = true;
				System.out.println("Terminado...");
			}
		}
	}

	// mostrar menu e retornar opção
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
			} while (op < 1 || op > 5);
			return op;
		} catch (Exception e) {
			System.out.println("Opção inválida, tente outra vez...");
			return -1;
		}

	}

	// método para criar objeto aluno
	public static Aluno criarAluno() {
		Aluno novoAluno = new Aluno();
		Scanner in = new Scanner(System.in);
		System.out.print("Primeiro nome: ");
		String firstname = in.nextLine();
		System.out.print("Último nome: ");
		String lastname = in.nextLine();
		System.out.print("Idade: ");
		int idade = in.nextInt();
		System.out.println("Inserir aluno numa turma disponível: ");
		idTurmas(); //mostrar a lista de turmas com id's, disponível na based de dados
		System.out.print("Inserir o ID da turma para este aluno: ");
		int idTurma = in.nextInt();
		novoAluno.setFirstname(firstname);
		novoAluno.setLastname(lastname);
		novoAluno.setIdade(idade);
		novoAluno.setIdTurma(idTurma);
		return novoAluno;
	}

	// etodo para criar turma
	public static Turma criarTurma() {
		Turma novaTurma = new Turma();
		String curso = "";
		int anoCurso = 0;
		Scanner in = new Scanner(System.in);
		// in.nextLine();
		// if(!in.hasNextInt()) {
		System.out.print("Nome do curso: ");
		curso = in.nextLine();
		System.out.print("Ano do curso: ");
		anoCurso = in.nextInt();
		// }

		novaTurma.setCurso(curso);
		novaTurma.setAnoCurso(anoCurso);
		return novaTurma;

	}

	public static void inserirAluno(Aluno novoAluno) {
		String sql = "INSERT INTO Alunos (primNome,ultNome,idade,idTurma) VALUES (?,?,?,?)";
		try {
			PreparedStatement stm = conn.prepareStatement(sql);
			stm.setString(1, novoAluno.getFirstname());
			stm.setString(2, novoAluno.getLastname());
			stm.setInt(3, novoAluno.getIdade());
			stm.setInt(4, novoAluno.getIdTurma());

			int linhas = stm.executeUpdate();

			if (linhas > 0) {
				System.out.println("Aluno adicionado com sucesso!");
			} else {
				System.out.println("Algo correu mal...");
			}

		} catch (SQLException e) {
			System.out.println("Ocorreu um erro...");
			e.printStackTrace();
		}
	}

	public static void inserirTurma(Turma novaTurma) {
		String sql = "INSERT INTO Turmas (curso,anoCurso) VALUES (?,?)";
		try {
			PreparedStatement stm = conn.prepareStatement(sql);
			stm.setString(1, novaTurma.getCurso());
			stm.setInt(2, novaTurma.getAnoCurso());

			int linhas = stm.executeUpdate();

			if (linhas > 0) {
				System.out.println("Turma adicionada com sucesso!");
			} else {
				System.out.println("Algo correu mal...");
			}

		} catch (SQLException e) {
			System.out.println("Ocorreu um erro...");
			e.printStackTrace();
		}
	}

	// método que executa a consulta de todas as turmas existentes na base de dados para inscrição de um aluno
	public static void idTurmas() {
		try {
			String query = "SELECT * FROM Turmas";
			Statement stm = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			// stm.setFetchSize(1);
			ResultSet resultado = stm.executeQuery(query);
			System.out.println("Turmas disponíveis:");
			if (!resultado.next()) {
				System.out.println("Nenhuma turma...");
			} else {
				resultado.beforeFirst();
				while (resultado.next()) {
					int idTurma = resultado.getInt("idTurma");
					String curso = resultado.getString("curso");
					int anoCurso = resultado.getInt("anoCurso");
					System.out.println("ID: " + idTurma + " ; Curso: " + curso + " Ano do curso: " + anoCurso);
				}
			}
		} catch (Exception e) {
			System.out.println("Ocorreu um erro...");
			e.printStackTrace();
		}
	}

	// método que cria uma ligação à base de dados
	public static Connection myConnection(Properties p) {
		try {
			InputStream input = new FileInputStream("dbConfig.properties");
			p.load(input);
			Connection connection = DriverManager.getConnection(p.getProperty("url"), p.getProperty("username"), p.getProperty("password"));
			System.out.println("Ligado...");
			return connection;
		} catch (IOException | SQLException e) {
			System.out.println("Ficheiro não encontrado...");
		}
		return null;
	}
}
