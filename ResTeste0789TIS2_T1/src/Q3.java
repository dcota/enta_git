import java.util.Scanner;

public class Q3 {
	public static void main(String[]argas) {
		Scanner in = new Scanner(System.in);
		System.out.print("Introduzir numero 1: ");
		int n1 = in.nextInt();
		System.out.print("Introduzir numero 2: ");
		int n2 = in.nextInt();
		System.out.println("A soma dos numeros e " + soma(n1, n2));
		in.close();
	}
	
	public static int soma(int n1, int n2) {
		return n1 + n2; 
	}
}
