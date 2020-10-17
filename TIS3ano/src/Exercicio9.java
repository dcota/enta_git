import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        System.out.print("Valor binario a converter: ");
        long bin = input.nextInt();
		long numDec = 0;
		long resto = 0;
		long exp = 0;
		while(bin > 0) {
			resto = bin % 10;
			bin = bin / 10;
			numDec += resto * Math.pow(2, exp);
			exp++;
		}
		System.out.println("Numero decimal: " + numDec);
		input.close();
	}
}
