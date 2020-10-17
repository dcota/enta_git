import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int soma=0;
		double media=0;
		int min=0;
		int max=0;
		for(int i=0; i<5; i++) {
			System.out.print("Numero "+ (i+1) + ":");
			int num = input.nextInt();
			if(i==0) {
				min=num;
				max=num;
			}
			else if (num < min){
				min = num;
			}
			else if (num > max) {
				max = num;
			}
			soma += num;
		}
		media = (double)soma/5;
		System.out.println("");
		System.out.println("Média simples: " + media);
		System.out.println("Mínimo da lista: " + min);
		System.out.println("Máximo da lista: " + max);
		input.close();
	}
}
