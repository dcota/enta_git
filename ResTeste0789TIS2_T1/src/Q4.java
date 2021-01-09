import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Introduzir numero: ");
		int n = in.nextInt();
		if(checkPositivo(n)==true) {
			System.out.println("Numero positivo");
		} else {
			System.out.println("Numero negativo");
		}
		in.close();
	}
	
	public static boolean checkPositivo(int n) {
		if(n<0) {
			return false;
		} else {
			return true;
		}
	}
}
