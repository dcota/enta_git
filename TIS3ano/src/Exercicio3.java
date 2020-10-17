import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//descomentar linha 8 e comentar linhas 9-14 para testes
		String[] lista= {"Duarte", "Marco", "Francisco", "Pedro", "Emanuel"};
		/*String[] lista = new String[5];
		//ler os 5 nomes e guardar no array
		for(int i=0; i<lista.length; i++) {
			System.out.print("Nome "+ (i+1) + ":");
			lista[i]=input.next();
		}*/
		// mostrar o array na consola
		for(int i=0; i<lista.length; i++) {
			System.out.print(lista[i] + " ");
		}
		System.out.println("");
		//pedir o nome a verificar
		System.out.print("Nome a procurar: ");
		String str = input.next();
		//verificar se existe no array
		if(existe(lista,str))
			System.out.println("O nome existe na lista...");
		else
			System.out.println("O nome não existe na lista...");
		input.close();
	}
	
	public static boolean existe(String[] lista, String str) {
		boolean resultado = false;
		for(int i=0; i<lista.length; i++) {
			if(lista[i].compareTo(str)==0) {
				resultado = true;
				break;
			} 
		}
		return resultado;
	}

}
