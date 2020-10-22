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
		//invocar método que mostra o conteúdo do array
		mostraArray(lista);
		//invocar método que calcula a média dos valores do array
		System.out.printf("A media dos valores e: %.2f", media(lista));
		
	}
	//método utilizando array
	static void mostraArray(double[] lista) {
		for(int i=0; i<lista.length; i++) {
			System.out.print(lista[i] + " ");
		}
		System.out.println("");
	}
	//método utilizando a soma acumulada
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
