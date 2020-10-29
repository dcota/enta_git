import java.io.*;
import java.util.*;

public class Exercicio12 {
	
	private static int[] numAluno = new int[20];
	private static String[] primNomeAluno = new String[20];
	private static String[] ultNomeAluno = new String[20];
	private static int[] idade = new int[20];
	private static String[] freguesia= new String[20];
	private static String[] concelho= new String[20];
		
	static Scanner op = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean exit = true;
		//se existir ficheiro processa o ficheiro
		if (existeFicheiro("dados.txt")) {
			processaFicheiro("dados.txt");
		}
		while(exit) {
			menu();
			int escolha = -1;
			if(!op.hasNextInt()) {
				op.nextLine();
				continue;
			}
			escolha = op.nextInt();
			if(escolha < 1 || escolha > 4){
				System.out.println("Escolha inválida, tente de novo...\n");
				continue;
			}
			switch(escolha) {
				case 1:
					criarAluno(); //Exercicio 11b
					break;
				case 2:
					if(numAluno[0] != 0) {
						consultarAluno(); //Exercicio 11c
						break;
					} else {
						System.out.println("Não há alunos para consulta...");
						break;
					}
				case 3:
					printAlunos(); //Exercicio 11d
					break;
				case 4:
					exit = false;
					System.out.println("A terminar...");
					break;
				default:
					break;
			}
		}	
	}
	
	static void menu() {
		System.out.println("********************");
		System.out.println("* GESTÃO DE ALUNOS *");
		System.out.println("********************");
		System.out.println("");
		System.out.println("1 - Inscrever aluno");
		System.out.println("2 - Consultar aluno");
		System.out.println("3 - Listar alunos");
		System.out.println("4 - Sair");
		System.out.print("Escolher opção (1-4): ");	
	}	
	static void criarAluno() {
		boolean exit = true;
		Scanner esc = new Scanner(System.in);
		while(exit) {
			int escolha=0;
			int index = getFreeIndex();
			numAluno[index] = index + 1;
			System.out.print("Primeiro nome: ");
			primNomeAluno[index]=esc.nextLine();
			System.out.print("Último nome: ");
			ultNomeAluno[index]=esc.nextLine();
			System.out.print("Idade: ");
			idade[index]=esc.nextInt();
			esc.nextLine();
			System.out.print("Freguesia: ");
			freguesia[index]=esc.nextLine();
			System.out.print("Concelho: ");
			concelho[index]=esc.nextLine();
			System.out.println("Criado o aluno número " + numAluno[index] + " com o nome " + 
			primNomeAluno[index] + " " + ultNomeAluno[index] + ", residente em " + freguesia[index]
			+ "-" + concelho[index] + ".");
			System.out.print("Introduzir outro aluno? 1-Repetir ; 2 - Sair");
			escolha=esc.nextInt();
			esc.nextLine();
			switch(escolha) {
			case 1:
				break;
			case 2:
				exit = false;
				if(!existeFicheiro("dados.txt")) {
					String fileName = criarFicheiro();
					gravarDados(fileName);
				} else {
					System.out.println("UPDATE");
					updateDados("dados.txt");
				}
						
				break;
			default:
				break;
			}
		}
	}
	
	static void consultarAluno() {
		boolean exit = true;
		Scanner esc = new Scanner(System.in);
		int nAluno;
		while(exit) {
			int escolha=0;
			System.out.print("Introduzir o número do aluno: ");
			nAluno = esc.nextInt();
			esc.nextLine();
			int index = nAluno-1;
			if(numAluno[index] != 0) {
				System.out.println("Aluno n.: " + nAluno);
				System.out.println("Nome do aluno: " + primNomeAluno[index] + " " + ultNomeAluno[index]);
				System.out.println("Idade: " + idade[index]);
				System.out.println("Freguesia de residência: " + freguesia[index]);
				System.out.println("Concelho de residência: " + concelho[index]);
			} else {
				System.out.println("Aluno inexistente...");
			}
			System.out.print("Consultar outro aluno? 1-Repetir ; 2 - Sair");
			escolha=esc.nextInt();
			esc.nextLine();
			switch(escolha) {
			case 1:
				break;
			case 2:
				exit = false;
				break;
			default:
				break;
			}
		}
	}
	
	static int getFreeIndex() {
		int index = 0;
		if(!existeFicheiro("dados.txt")) {
			for(int i=0; i<numAluno.length; i++) {
				if(numAluno[i] == 0) {
					index = i;
					break;
				}
			}
		}
		else {
			try {
				File f = new File("dados.txt");
				Scanner scan = new Scanner(f);
				while(scan.hasNextLine()) {
					scan.nextLine();
					index++;
				}	
				scan.close();
			} catch (FileNotFoundException exc) {
				exc.printStackTrace();
			}
		}
		
		return index;
	}
	
	static void printAlunos() {		
		System.out.println(
			"+-----+----------------------------------+-------+---------------------------+--------------------------------+\n" +
			"| Nº  |               NOME               | IDADE |         FREGUESIA         |            CONCELHO            |\n" +
			"+-----+----------------------------------+-------+---------------------------+--------------------------------+" );
		
		int index = 0;
		while( numAluno[index] != 0) {
			System.out.print("|");
			System.out.print(" " + numAluno[index]);
			for(int i=0; i <  4 - Integer.toString(numAluno[index]).length(); i++) {
				System.out.print(" ");
			}
			System.out.print("|");
			System.out.print(primNomeAluno[index] + " " + ultNomeAluno[index]);
			for(int i=0; i <  34 - (primNomeAluno[index].length() + ultNomeAluno[index].length() + 1); i++) {
				System.out.print(" ");
			}
			System.out.print("|");
			System.out.print(" " + idade[index]);
			for(int i=0; i <  6 - Integer.toString(idade[index]).length(); i++) {
				System.out.print(" ");
			}
			System.out.print("|");
			System.out.print(freguesia[index]);
			for(int i=0; i <  27 - freguesia[index].length(); i++) {
				System.out.print(" ");
			}
			System.out.print("|");
			System.out.print(concelho[index]);
			for(int i=0; i <  32 - concelho[index].length(); i++) {
				System.out.print(" ");
			}
			System.out.print("|\n");
			index++;
		}
		System.out.println(
				"+-----+----------------------------------+-------+---------------------------+--------------------------------+\n");
	}
	
	static void processaFicheiro(String f) {
		try {
			File ficheiro = new File(f);
			Scanner scan = new Scanner(ficheiro);
			while(scan.hasNextLine()) {
				String linha = scan.nextLine();
				String[] temp = linha.split(";");
				int index = Integer.parseInt(temp[0]) - 1;
				numAluno[index] = Integer.parseInt(temp[0]);
				primNomeAluno[index] = temp[1];
				ultNomeAluno[index] = temp[2];
				idade[index] = Integer.parseInt(temp[3]);
				freguesia[index] = temp[4];
				concelho[index] = temp[5];	
			}
			scan.close();
		} catch (FileNotFoundException exc) {
			exc.printStackTrace();
		}
	}
	
	static String criarFicheiro() {
		String fileName = "";
		try {
			File myObj = new File("dados.txt");
		    if (myObj.createNewFile()) {
		    	fileName = myObj.getName();
		    	//System.out.println("Ficheiro criado: " + fileName);
		    } else {
		        updateDados(fileName);
		    }
		} catch (IOException exc) {
		      System.out.println("Ocorreu um erro...");
		      exc.printStackTrace();
		}
		return fileName;
	}
	
	static void gravarDados(String fileName) {
		int i=0;
		try {
			FileWriter fw = new FileWriter(fileName);
			while(numAluno[i]!=0) {
				fw.write(numAluno[i] + ";" + primNomeAluno[i] + ";" + ultNomeAluno[i] + ";" + idade[i] + ";" + freguesia[i] + ";" + concelho[i] + "\n");
				i++;
			}
			fw.close();
		} catch (IOException exc) {
			System.out.println("Ocorreu um erro...");
		      exc.printStackTrace();
		}
	}
	
	static void updateDados(String fileName) {
		int i = getFreeIndex();
		try {
			FileWriter fw = new FileWriter(fileName, true);
			fw.write(numAluno[i] + ";" + primNomeAluno[i] + ";" + ultNomeAluno[i] + ";" + idade[i] + ";" + freguesia[i] + ";" + concelho[i] + "\n");
			fw.close();
		} catch (IOException exc) {
			System.out.println("Ocorreu um erro...");
		      exc.printStackTrace();
		}
	}
	
	static boolean existeFicheiro(String filename) {
		boolean res = false;
		try {
			File myObj = new File("dados.txt");
		    if (myObj.exists())
		    	res = true;
		} catch (Exception exc) {
		      System.out.println("Ocorreu um erro...");
		      exc.printStackTrace();
		}
		return res;

	}
	
	
	//método para limpar a consola - não funciona no IDE
	static void clear() {
        try {
            if (System.getProperty("os.name").contains("Windows"))
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            else
                Runtime.getRuntime().exec("clear");
        } catch (IOException | InterruptedException ex) {}
    }
}
