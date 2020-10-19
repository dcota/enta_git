import java.util.*;
import java.io.IOException;

public class Exercicio11b {
	private static int[] numAluno = new int[100];
	private  static String[] nomeAluno = new String[100];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		boolean menu = true;
		while (menu){
			menu();
			int menuNumberChoice = -1;
			while(menuNumberChoice < 1 || menuNumberChoice > 3) {
				if(!in.hasNextInt()) {
					in.nextLine();
					continue;
				}
				menuNumberChoice = in.nextInt();
				if(menuNumberChoice < 1 || menuNumberChoice > 3){
					System.out.println("Invalid Input - Retry");
					continue;
				}
			}
			
			if(menuNumberChoice == 1){
				int n;
				int square = 0;
				System.out.println("How many squares would you like to calculate?");
				if(in.hasNextInt()){
					n = in.nextInt();
					if(n < 0){
						System.out.println("Invalid Input - Retry");
						n = in.nextInt();}
				}
				else{
					System.out.println("Invalid Input - Retry");
					String dummy = in.nextLine();
					n = in.nextInt();}
				int repeat = 0;
				for(int counter = 1; counter <= n; counter++){
					square = counter * counter;
					System.out.print(square + " ");
					repeat++;
					if(repeat == 5){
						System.out.println();
						repeat = 0;
					}
				}
			}
			else if(menuNumberChoice == 2){
				int n;
				System.out.println("What number should the primes be calculated up to?");
				if(in.hasNextInt()){
					n = in.nextInt();
					if(n < 0){
						System.out.println("Invalid Input - Retry");
						n = in.nextInt();}
				}
				else{
					System.out.println("Invalid Input - Retry");
					String dummy = in.nextLine();
					n = in.nextInt();}

				int prime = 0; //Checks to see if the number in question is prime or not
				int repeat = 0;

				for(int num1=2;num1<=n;num1++)
				{
					prime=0;
					for(int num2=1;num2<num1;num2++) //Remove the num2<=num1 and let it be as shown
					{
						if(((num1%num2)==0) & num2!=1) //Thus you can remove the third condition
						{
							prime=1; //Flag set to indicate that the number is prime
						}
					}
					if(prime==0)
					{
						System.out.print(num1 + " ");
						repeat++;
						if(repeat == 5){
							System.out.println();
							repeat = 0;
						}
					}

				}
			}
			else if(menuNumberChoice == 3){
				menu = false;
				System.out.println("Exiting...");
			}
		}
	}
	
	static void menu() {
		System.out.println("Menu: ");
		System.out.println("1. Display Squares");
		System.out.println("2. Display Primes");
		System.out.println("3. Quit");
		System.out.print("Opção?");
	}

}