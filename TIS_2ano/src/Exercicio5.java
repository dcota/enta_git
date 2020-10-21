import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Introduza um número: ");
		int num = input.nextInt();
		if( num % 2 == 0) {
			System.out.println("O número é PAR");
		} else {
			System.out.println("O número é IMPAR");
		}
		input.close();
	}
}
