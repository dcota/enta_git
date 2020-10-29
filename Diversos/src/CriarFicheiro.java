import java.util.*;
import java.io.*;

public class CriarFicheiro {

	public static void main(String[] args) {
		try {
			File f = new File("filename.txt");
			if (f.createNewFile()) {
				System.out.println("Ficheiro criado: " + f.getName());
			} else {
				System.out.println("Ficheiro existente.");
			}
		} catch (IOException exc) {
			System.out.println("Ocorreu um erro...");
			exc.printStackTrace();
		}
	}
}
