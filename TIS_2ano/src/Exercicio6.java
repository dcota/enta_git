import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final int tamanho = 20;
		double[] lista = new double[tamanho];	
		//solicitar os numeros e guardar no array
		for(int i=0; i<tamanho; i++ ) {
			System.out.print("Introduzir numero "+ (i+1) + ":");
			lista[i] = input.nextDouble();
		}
		double soma = 0;
		for(int i=0; i<tamanho; i++ ) {
			soma = soma + lista[i];
		}
		double media = soma / tamanho;
		System.out.println("Media: " + media);
		input.close();			
	}
}
