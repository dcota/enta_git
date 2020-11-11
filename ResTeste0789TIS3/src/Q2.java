import java.util.Scanner;

	public class Q2 {
		public static void main(String[] args) {
			int[] lista = new int[]{23, 10, 45, 12, 43, 32};
			System.out.println("\nMédia simples da lista: " + media(lista));
		}

		public static double media(int[] lista) {
			int soma=0;
			double media=0;
			for(int i=0; i<lista.length; i++) {
				System.out.print(lista[i] + " ");
				soma += lista[i];
			}
			media = (double)soma/lista.length;
			return media;
		}
	}
