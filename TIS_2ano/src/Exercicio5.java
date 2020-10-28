import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); //passo1
		System.out.print("Introduza um numero: ");//passo1
		int num = input.nextInt();//passo1
		int resto = num % 2; //passo2
		if( resto == 0) { //passo2
			System.out.println("O numero e PAR"); //passo3
		} else {
			System.out.println("O numero e IMPAR"); //passo3
		}
		input.close();
	}
}
