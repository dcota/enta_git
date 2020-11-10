import java.util.*;

public class Q4 {

	public static void main(String[] args) {
			//Scanner in = new Scanner(System.in);
			while(true) {
				Scanner in = new Scanner(System.in);
				try {
					int nDia=0;
					System.out.print("Introduza o número do dia: ");
					nDia = in.nextInt();
					while(nDia < 1 || nDia > 7 ) {
						System.out.println("O número deve situar-se entre 1 e 7. Tente de novo...");
						System.out.print("Introduza o número do dia: ");
						nDia = in.nextInt();
					}
					System.out.println("O dia da semana é: " + diaSemana(nDia));
					System.out.println("\n");
				} catch(InputMismatchException e ) {
					System.out.println("Número inválido! Tente de novo...");
				}
			}
	}
	
	public static String diaSemana(int n) {
		String nomeDia="";
		switch(n) {
			case 1 :
				nomeDia="Domingo";
				break;
			case 2 :
				nomeDia="Segunda feira";
				break;
			case 3 :
				nomeDia="Terça feira";
				break;
			case 4 :
				nomeDia="Quarta feira";
				break;
			case 5 :
				nomeDia="Quinta feira";
				break;
			case 6 :
				nomeDia="Sexta feira";
				break;
			case 7 :
				nomeDia="Sábado";
				break;
		}
		return nomeDia;
	}

}
