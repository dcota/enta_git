import java.util.*;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num=0;
		System.out.print("Introduza um número inteiro: ");
		num = input.nextInt();
		System.out.println("O número introduzido é " + parImpar(num));
		input.close();
	}

	static String parImpar(int n) {
		if( n % 2 == 0)
			return "PAR";
		else
			return "IMPAR";
	}
}
