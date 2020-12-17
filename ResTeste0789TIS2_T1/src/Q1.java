import java.util.Scanner;

public class Q1 {
	public static void main(String[]argas) {
		Scanner in = new Scanner(System.in);
		double raio;
		System.out.print("Raio do circulo em mm: ");
		raio = in.nextDouble();
		double perimetro = perimetro(raio);
		double area = area(raio);
		System.out.printf("O perímetro da circunferência é %.2f mm\n", perimetro);
		System.out.printf("A área do círculo é %.2f mm2\n", area);
	}
	
	public static double perimetro(double raio) {
		return 2 * Math.PI * raio; 
	}
	
	public static double area(double raio) {
		return Math.PI * Math.pow(raio, 2);
	}
}

