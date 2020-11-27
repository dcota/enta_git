import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args){
        double a = Integer.parseInt(args[0]);
        double b = Integer.parseInt(args[1]);
        double c = Integer.parseInt(args[2]);
        //ponto 1
        /*Scanner input = new Scanner(System.in);
        System.out.println("Introduza os coeficientes da equação...");
        System.out.print("a= ");
        double a = input.nextDouble();
        System.out.print("b= ");
        double b = input.nextDouble();
        System.out.print("c= ");
        double c = input.nextDouble();*/
        //ponto 4
        if(a==0){
            System.out.println("Equação inválida...");
        } else {
            //ponto 2
            double delta = delta(a,b,c);
            //ponto 3
            calculaRaizes(delta,a,b);
        }
        //input.close();
    }

    public static double delta(double a, double b, double c){
        double calculaDelta = b*b - 4*a*c;
        return calculaDelta;
    }

    public static void calculaRaizes(double delta, double a, double b){
        if(delta>0){
            double raiz1 = (-b + Math.sqrt(delta)) / (2*a);
            double raiz2 = (-b - Math.sqrt(delta)) / (2*a);
            System.out.println(
                "A equação tem duas raízes: X1=" + raiz1 + "; X2= " + raiz2);
        } else if(delta==0){
            double raiz = -b / (2*a);
            System.out.println("A equação tem uma raíz: X=" + raiz);
        } else {
            System.out.println("A equação não tem raízes...");
        }
    } 
}