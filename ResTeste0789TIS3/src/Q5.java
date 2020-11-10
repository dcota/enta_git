import java.util.InputMismatchException;
import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		// Scanner in = new Scanner(System.in);
		while (true) {
			Scanner in = new Scanner(System.in);
			try {
				int num = 0;
				;
				System.out.print("Introduza um número inteiro positivo: ");
				num = in.nextInt();
				while (num < 0) {
					System.out.println("O número deve ser positivo. Tente de novo...");
					System.out.print("Introduza um número inteiro positivo: ");
					num = in.nextInt();
				}
				converteNum(num);

			} catch (InputMismatchException e) {
				System.out.println("Número inválido! Tente de novo...");
			}
		}
	}

	public static void converteNum(int n) {
		int num = n;
		String[] algarismos = { "zero", "um", "dois", "três", "quatro", "cinco", "seis", "sete", "oito", "nove" };
		int len = String.valueOf(n).length();
		String[] extenso = new String[len];
		for(int i=0; i<len; i++) {
			int resto = n%10;
			n=n/10;
			extenso[i]=algarismos[resto];
		}
		System.out.print("Número " + num + " por extenso: ");
		for(int j=len-1; j>=0; j--) {
			System.out.print(extenso[j] + " ");
		}
		System.out.println("\n");
	}

}