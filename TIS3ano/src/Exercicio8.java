import java.util.Scanner;

public class Exercicio8 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        System.out.print("Valor de a: ");
        int dec = input.nextInt();
		binario(dec);
		input.close();
	}
	
	static void binario(int valBin) {
		int arrayBin[] = new int[100];
		int quociente = valBin;
		int i=0;
		while(quociente > 0 ) {
			arrayBin[i] = quociente % 2;
			quociente = quociente/2;
			i++;
		}
		for(int j=i-1; j>=0; j--) {
			System.out.print(arrayBin[j]);
		}
	}
}
