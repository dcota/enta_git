import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int soma = 0;
		System.out.print("Introduza o número 1 ");
		soma += input.nextInt();
		System.out.print("Introduza o número 2 ");
		soma += input.nextInt();
		System.out.print("Introduza o número 3 ");
		soma += input.nextInt();
		System.out.print("Introduza o número 4 ");
		soma += input.nextInt();
		System.out.print("Introduza o número 5 ");
		soma += input.nextInt();
		System.out.print("Introduza o número 6 ");
		soma += input.nextInt();
		
		double media = (double) soma/6;
		System.out.printf("A media dos números é: %.2f\n", media);
		
		input.close();
	}
}
