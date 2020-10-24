import java.util.*;
import java.io.*;

public class LerFicheiro {

	public static void main(String[] args) {
		try {
			File f = new File("filename.txt");
			Scanner scan = new Scanner(f);
			while(scan.hasNextLine()) {
				String line = scan.nextLine();
				System.out.println(line);
			}
			scan.close();
			System.out.println("Terminou a leitura no ficheiro...");		
		} catch (FileNotFoundException exc) {
			exc.printStackTrace();
		}

	}

}
