import java.util.Scanner;

public class Exercicio7 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num=0;
		System.out.print("Introduza um n�mero inteiro: ");
		num = input.nextInt();
		if(checkIntervalo(num))
			System.out.println("O n�mero est� no intervalo...");
		else
			System.out.println("O n�mero n�o est� no intervalo...");
		input.close();
	}
	
	static boolean checkIntervalo(int n) {
		if ( n >= -100 && n <= 100)
			return true;
		else
			return false;
	}
}
