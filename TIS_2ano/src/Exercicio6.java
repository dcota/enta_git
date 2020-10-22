import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[] lista = new double[6];	
		//solicitar os numeros e guardar no array
		for(int i=0; i<lista.length; i++) {
			System.out.print("Numero "+ (i+1) + ":");
			lista[i] = input.nextDouble();
		}
		input.close();
		//invocar m�todo que mostra o conte�do do array
		mostraArray(lista);
		//invocar m�todo que calcula a m�dia dos valores do array
		System.out.printf("A media dos valores e: %.2f", media(lista));
		
	}
	//m�todo utilizando array
	static void mostraArray(double[] lista) {
		for(int i=0; i<lista.length; i++) {
			System.out.print(lista[i] + " ");
		}
		System.out.println("");
	}
	//m�todo utilizando a soma acumulada
	static double media(double[] lista) {
		int soma=0;
		double media=0;
		for(int i=0; i < lista.length; i++) {
			soma += lista[i];
		}
		media = (double)soma/lista.length;
		return media;
	} 
}
