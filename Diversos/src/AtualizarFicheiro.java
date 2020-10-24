import java.util.*;
import java.io.*;

public class AtualizarFicheiro {

	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("filename.txt", true);
			fw.write("O meu primeiro ficheiro em JAVA\n");
			fw.close();
			System.out.println("Atualizou com sucesso no ficheiro...");			
		} catch (IOException exc) {
			exc.printStackTrace();
		}
	}
	
}

