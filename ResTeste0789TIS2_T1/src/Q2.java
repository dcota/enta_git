

public class Q2 {
	public static void main(String[] args) {
		int[] lista = new int[]{23, 10, 45, 12, 43, 32};
			System.out.println("\nMédia simples da lista: " + media(lista));
	}

	public static double media(int[] lista) {
		int soma=0;
		int i=0;
		double media=0;
		while(i<lista.length) {
			soma = soma + lista[i];
			i++;
		}
		System.out.println(soma);
		media = (double)soma/lista.length;
		return media;
	}
}

