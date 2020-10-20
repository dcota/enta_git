import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Qual o raio do circulo em cm: ");
		double raio = input.nextDouble();
		double area = Math.PI * Math.pow(raio, 2);
		double perimetro = 2 * Math.PI * raio;
		System.out.printf("O perimetro do circulo é: %.2f cm\n", perimetro);
		System.out.printf("A área do circulo é: %.2f cm2\n", area);
		input.close();
	}
}
