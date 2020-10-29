import java.util.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;

public class Excecao {
	private static int[] numAluno = new int[20];
	private static String[] primNomeAluno = new String[20];
	private static String[] ultNomeAluno = new String[20];
	private static int[] idade = new int[20];
	private static String[] freguesia= new String[20];
	private static String[] concelho= new String[20];
	
	public static void main(String[] args) {
		String[] linha = null;
		try {
			File f = new File("ficheiro.txt");
			Scanner scan = new Scanner(f);
			int index = 0;
			while(scan.hasNextLine()) {
				String data = scan.nextLine();
				linha = data.split(";");
				numAluno[index] = Integer.parseInt(linha[0]);
				primNomeAluno[index] = linha[1];
				ultNomeAluno[index] = linha[2];
				idade[index] = Integer.parseInt(linha[3]);
				freguesia[index] = linha[4];
				concelho[index] = linha[5];
				index++;	
			}			
		} catch (Exception e) {
			System.out.print("Ficheiro n encontrado...");
		}	
		printArrays();
	}
	
	static void printArrays() {
		for(int num : numAluno) {
			System.out.print(num + " ");	
		}
		/*for(int i=0; i<numAluno.length; i++) {
			System.out.print(numAluno[i] + " ");
		}*/
		System.out.println("");
		for(String s : primNomeAluno) {
			System.out.print(s + " ");	
		}
		System.out.println("");
	}
}
