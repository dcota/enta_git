import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Numero?: ");
		int num = input.nextInt();
		if ( num >= -100 ) {
			if( num <= 100){
				System.out.println("DENTRO");
			}
			else {
				System.out.println("FORA");
			}
		}
		else {
			System.out.println("FORA");
		}
		input.close();
	}
}
