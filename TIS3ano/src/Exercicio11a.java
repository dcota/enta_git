import java.io.IOException;
import java.util.*;

public class Exercicio11a {

	public static void main(String[] args) {
		boolean exit = true;
		Scanner op = new Scanner(System.in);
		while(exit) {
			menu();
			int escolha = -1;
			if(!op.hasNextInt()) {
				op.nextLine();
				continue;
			}
			escolha = op.nextInt();
			if(escolha < 1 || escolha > 4){
				System.out.println("Escolha inv�lida, tente de novo...\n");
				continue;
			}
			switch(escolha) {
				case 1:
					System.out.println("Op��o escolhida �: " + escolha + "\n");
					break;
				case 2:
					System.out.println("Op��o escolhida �: " + escolha + "\n");
					break;
				case 3:
					System.out.println("Op��o escolhida �: " + escolha + "\n");
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
			System.out.println("");
			System.out.println("********************");
			System.out.println("* GEST�O DE ALUNOS *");
			System.out.println("********************");
			System.out.println("");
			System.out.println("1 - Inscrever aluno");
			System.out.println("2 - Consultar aluno");
			System.out.println("3 - Listar alunos");
			System.out.println("4 - Sair");
			System.out.print("Escolher op��o (1-4): ");	
	}
	
	
	//m�todo para limpar a consola - n�o funciona no IDE
	static void clear() {
        try {
            if (System.getProperty("os.name").contains("Windows"))
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            else
                Runtime.getRuntime().exec("clear");
        } catch (IOException | InterruptedException ex) {}
    }


}
