import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Introduzir número: ");
		double n = in.nextDouble();
		if(checkPositivo(n)) {
			System.out.println("Número positivo");
		} else {
			System.out.println("Número negativo");
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
