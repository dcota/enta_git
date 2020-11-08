import java.util.Scanner;

public class Exercicio7 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num=0;
		System.out.print("Introduza um numero inteiro: ");
		num = input.nextInt();
		if(checkIntervalo(num))
			System.out.println("O numero esta no intervalo...");
		else
			System.out.println("O numero nao esta no intervalo...");
		input.close();
	}
	
	static boolean checkIntervalo(int n) {
		if ( n >= -100 && n <= 100)
			return true;
		else
			return false;
	}
}
