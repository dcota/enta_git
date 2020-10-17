import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio7 {
	public static void main(String[] args) {
		String df = "0.00";
	  	DecimalFormat decf = new DecimalFormat(df);
	  	Scanner input = new Scanner(System.in);
        System.out.print("Valor de a: ");
        double a = input.nextDouble();
        System.out.print("Valor de b: ");
        double b = input.nextDouble();
        System.out.print("Valor de c: ");
        double c = input.nextDouble();
        
        double radicando = Math.pow(b, 2) - 4.0 * a * c;
        
        if(radicando < 0) {
        	System.out.println("A equacao ao tem raizes!");
        } else if (radicando == 0) {
        	double r1 = -b / (2.0*a);
        	System.out.println("A equacao tem uma raiz. O seu valor e: " + decf.format(r1));        	
        } else {
        	double r1 = (-b + Math.sqrt(radicando)) / (2.0*a);
        	double r2 = (-b - Math.sqrt(radicando)) / (2.0*a);
        	System.out.println("A equacao tem duas raizes: R1 =  " + decf.format(r1) + " ; R2 = " + decf.format(r2));
        }
        input.close();
	}

}
