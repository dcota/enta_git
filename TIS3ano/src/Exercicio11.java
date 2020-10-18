import java.util.*;
import java.io.IOException;

public class Exercicio11 {
	private static int[] numAluno = new int[100];
	private static String[] nomeAluno = new String[100];
	private static String[] curso = new String[100];

	private static Scanner op = new Scanner(System.in);

	public static void main(String[] args) {
		

		String op = menu();
		switch(op) {
		case "1":
			criarAluno(checkFreeIndex());
			break;
		case "2":
			break;
		case "3":
			break;
		}
		System.out.println("aqui");
		
	}
	
	static String menu() {
		String opc="";
		while (!checkOp(opc)) {
			System.out.println("GESTÃO DE ALUNOS");
			System.out.println("");
			System.out.println("1 - Inscrever aluno");
			System.out.println("2 - Consultar aluno");
			System.out.print("Escolher opção: ");
			opc = op.nextLine();
		}
		return opc;
		
	}
	static boolean checkOp(String op) {
		boolean res = false;
		if( op.compareTo("1") == 0 || op.compareTo("2") == 0) {
			res = true;
		} 
		return res;
	}
	
	static int checkFreeIndex() {
		int index = 0;
		for(int i=0;i<numAluno.length;i++) {
			if(numAluno[i]  == 0) {
				index = i;
				break;
			}
		}
		return index;
	}
	
	static void criarAluno(int index) {
		Scanner input = new Scanner(System.in);
		numAluno[index]=index+1;
		System.out.print("Nome do aluno: ");
		nomeAluno[index] = input.nextLine();
		System.out.println("Criado o aluno numero " + numAluno[index] + " com o nome " + nomeAluno[index]);
		System.out.print("Criar outro aluno? (s/n): ");
		if(input.nextLine().compareTo("s")==0) {
			criarAluno(checkFreeIndex());
		} else  {
			input.close();
			return;
		}
	}
	static void clear()
    {
        try
        {
            if (System.getProperty("os.name").contains("Windows"))
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            else
                Runtime.getRuntime().exec("clear");
        } catch (IOException | InterruptedException ex) {}
    }

}
