import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class FromFileToArray {
	private static int[] numAluno = new int[20];
	private static String[] primNomeAluno = new String[20];
	private static String[] ultNomeAluno = new String[20];
	private static int[] idade = new int[20];
	private static String[] freguesia= new String[20];
	private static String[] concelho= new String[20];
	
	public static void main(String[] args) {
		String[] linha = null;
		try {
			//ler do ficheiro
			File f = new File("ficheiro.txt");
			Scanner scan = new Scanner(f);
			int index = 0;
			//enquanto houver linhas processar cada linha
			while(scan.hasNextLine()) {
				String data = scan.nextLine();
				//faz split da string usando o separador ";"
				linha = data.split(";");
				//copia os dados do array linha para cada array de dados
				numAluno[index] = Integer.parseInt(linha[0]);
				primNomeAluno[index] = linha[1];
				ultNomeAluno[index] = linha[2];
				idade[index] = Integer.parseInt(linha[3]);
				freguesia[index] = linha[4];
				concelho[index] = linha[5];
				index++;	
			}	
			scan.close();
		} catch (FileNotFoundException e) {
			System.out.print("Ficheiro n encontrado...");
		}	
		//mostrar o conteúdo dos arrays de dados para teste
		printArrays();	
	}
	
	//método para mostrar os arrays
	static void printArrays() {
		for(int num : numAluno) {
			System.out.print(num + " ");	
		}
		System.out.println("");
		for(String primNom : primNomeAluno) {
			System.out.print(primNom + " ");	
		}
		System.out.println("");
		for(String ultNom : ultNomeAluno) {
			System.out.print(ultNom + " ");	
		}
		System.out.println("");
		for(int idade : idade) {
			System.out.print(idade + " ");	
		}
		System.out.println("");
		for(String freg : freguesia) {
			System.out.print(freg + " ");	
		}
		System.out.println("");
		for(String conc : concelho) {
			System.out.print(conc + " ");	
		}
		System.out.println("");
	}
}
