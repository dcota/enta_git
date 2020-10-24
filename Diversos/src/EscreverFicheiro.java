import java.util.*;
import java.io.*;

public class EscreverFicheiro {

	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("filename.txt");
			fw.write("O meu primeiro ficheiro em JAVA\n");
			fw.close();
			System.out.println("Escreveu com sucesso no ficheiro...");			
		} catch (IOException exc) {
			exc.printStackTrace();
		}
	}
	
}
