import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		/*comentar a invoca��o de m�todo n�o pretendida*/
		//media();
		media1();
	}
	//m�todo utilizando array
	public static void media() {
		Scanner input = new Scanner(System.in);
		int[] lista = new int[5];
		int soma=0;
		double media=0;
		//solicitar os numeros e guardar no array
		for(int i=0; i<lista.length; i++) {
			System.out.print("Numero "+ (i+1) + ":");
			lista[i] = input.nextInt();
		}
		//mostrar o conte�do do array e calcular a soma de todos os elementos
		for(int i=0; i<lista.length; i++) {
			System.out.print(lista[i] + " ");
			soma += lista[i];
		}
		media = (double)soma/5; //calcular media
		System.out.println("");
		System.out.println("M�dia simples: "+ (double)media);
		input.close();
	}
	//m�todo utilizando a soma acumulada
	public static void media1() {
		Scanner input = new Scanner(System.in);
		int soma=0;
		double media=0;
		for(int i=0; i<5; i++) {
			System.out.print("Numero "+ (i+1) + ":");
			int num = input.nextInt();
			soma += num;
		}
		media = (double)soma/5;
		System.out.println("");
		System.out.println("M�dia simples: "+ media);
		input.close();
	} 
}
