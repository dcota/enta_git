import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] lista = { "Duarte", "Marco", "Francisco", "Pedro", "Emanuel" };
		System.out.print("Nome a procurar: ");
		String str = input.next();
		if (existe(lista, str))
			System.out.println("O nome existe na lista...");
		else
			System.out.println("O nome não existe na lista...");
		input.close();
	}

	public static boolean existe(String[] lista, String str) {
		boolean resultado = false;
		for (int i = 0; i < lista.length; i++) {
			if (lista[i].equals(str)) {
				resultado = true;
				break;
			}
		}
		return resultado;
	}
}
