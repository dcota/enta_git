import java.util.*;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num=0;
		System.out.print("Introduza um n�mero inteiro positivo: ");
		num = input.nextInt();
		if (num<0)
			System.out.println("Tem de ser um n�mero positivo!...");
		else {
			System.out.println("O dobro de " + num + " � " + dobro(num));
		}
		input.close();
	}
	static int dobro(int n) {
		return n*2;
	}
}
