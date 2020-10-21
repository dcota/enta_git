import java.io.IOException;
import java.util.*;

public class Exercicio11b {
	
		private static int[] numAluno = new int[20];
		private static String[] primNomeAluno = new String[20];
		private static String[] ultNomeAluno = new String[20];
		private static int[] idade = new int[20];
		private static String[] freguesia= new String[20];
		private static String[] concelho= new String[20];
		
		static Scanner op = new Scanner(System.in);
		
		public static void main(String[] args) {
		boolean exit = true;
		
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
					criarAluno();
					break;
				case 2:
					System.out.println("Opção escolhida é: " + escolha + "\n");
					break;
				case 3:
					System.out.println("Opção escolhida é: " + escolha + "\n");
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
			clear();
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
		int escolha;
		while(exit) {
			int index = getIndex();
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
			System.out.println("Introduzir outro aluno? 1-Repetir ; 2 - Sair");
			escolha=esc.nextInt();
			esc.nextLine();
			switch(escolha) {
			case 1:
				criarAluno();
				break;
			case 2:
				exit = false;
				break;
			}
		}
	}
	
	static int getIndex() {
		int index = 0;
		for(int i=0;i<numAluno.length;i++) {
			if(numAluno[i]  == 0) {
				index = i;
				break;
			}
		}
		return index;
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
