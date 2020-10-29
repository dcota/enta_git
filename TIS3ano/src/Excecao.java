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
		
		//ler do ficheiro
		try {
			File f = new File("ficheiro.txt");
			Scanner scan = new Scanner(f);
			while(scan.hasNextLine()) {
				String data = scan.nextLine();
				String[] linha = data.split(";");


			}
		} catch (Exception e) {
			System.out.print("Ficheiro n encontrado...");
		}
		
	}
}
