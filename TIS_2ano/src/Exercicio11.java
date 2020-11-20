import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args){
        //ponto 1
        Scanner input = new Scanner(System.in);
        System.out.print("a= ");
        double a = input.nextDouble();
        System.out.print("b= ");
        double b = input.nextDouble();
        System.out.print("s= ");
        double c = input.nextDouble();
        System.out.println("delta = " +delta(a,b,c));
        input.close();
    }

    public static double delta(double a, double b, double c){
        return (b*b)-(4*a*c);
    }
}