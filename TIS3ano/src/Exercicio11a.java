import java.io.IOException;
import java.util.*;

public class Exercicio11a {

	public static void main(String[] args) {
		String op = menu();
		System.out.println("Opção escolhida é: " + op);
	}
	
	static String menu() {
		String opc="";
		Scanner op = new Scanner(System.in);
		while (!checkOp(opc)) {
			System.out.println("GESTÃO DE ALUNOS");
			System.out.println("");
			System.out.println("1 - Inscrever aluno");
			System.out.println("2 - Consultar aluno");
			System.out.println("3 - Listar alunos");
			System.out.print("Escolher opção: ");
			opc = op.nextLine();
		}
		op.close();
		return opc;		
	}
	
	static boolean checkOp(String op) {
		/*boolean res = false;
		if( op.compareTo("1") == 0 || op.compareTo("2") == 0 || op.compareTo("3") == 0) {
			res = true;
		} 
		return res;*/
		switch(op) {
		case "1":
			return true;
		case "2":
			return true;
		case "3":
			return true;
		default:
			return false;
		}
	}
	
	//método para limpar a consola - não funciona no IDE
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
