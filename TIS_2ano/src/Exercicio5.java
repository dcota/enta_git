import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Introduza um numero: ");
		int num = input.nextInt();
		if( num % 2 == 0) {
			System.out.println("O numero e PAR");
		} else {
			System.out.println("O numero e IMPAR");
		}
		input.close();
	}
}
