import java.text.DecimalFormat;
import java.util.Scanner;
public class Raizes {
	
  public static void main(String[] Strings) {
	  	String df = "0.00";
	  	DecimalFormat decf = new DecimalFormat(df);
        Scanner input = new Scanner(System.in);
            System.out.print("Input a: ");
            double a = input.nextDouble();
            System.out.print("Input b: ");
            double b = input.nextDouble();
            System.out.print("Input c: ");
            double c = input.nextDouble();

            double result = Math.pow(b, 2) - 4.0 * a * c;

            if (result > 0.0) {
                double r1 = (-b + Math.sqrt(result)) / (2.0 * a);
                double r2 = (-b - Math.sqrt(result)) / (2.0 * a);
                System.out.println("The roots are " + r1 + " and " + r2);
            } else if (result == 0.0) {
                double r1 = -b / (2.0 * a);
                System.out.println("The root is " + decf.format(r1));
            } else {
                System.out.println("The equation has no real roots.");
            }
            input.close();

    }
}
