import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int soma = 0;
		System.out.print("Introduza o numero 1 ");
		soma = soma + input.nextInt();
		System.out.print("Introduza o numero 2 ");
		soma += input.nextInt();
		System.out.print("Introduza o numero 3 ");
		soma += input.nextInt();
		System.out.print("Introduza o numero 4 ");
		soma += input.nextInt();
		System.out.print("Introduza o numero 5 ");
		soma += input.nextInt();
		System.out.print("Introduza o numero 6 ");
		soma += input.nextInt();
		double media = (double) soma/6;
		System.out.printf("A media dos números é: %.2f\n", media);
		input.close();
	}
}
