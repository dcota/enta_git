import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Introduzir n�mero: ");
		double n = in.nextDouble();
		if(checkPositivo(n)) {
			System.out.println("N�mero positivo");
		} else {
			System.out.println("N�mero negativo");
		}
	}
	
	public static boolean checkPositivo(double n) {
		if(n<0) {
			return false;
		} else {
			return true;
		}
	}

}
