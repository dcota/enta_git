import java.util.*;

public class Aula {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        System.out.print(" Num 1?: ");
        double num1 = input.nextDouble();
        System.out.print(" Num 2?: ");
        double num2 = input.nextDouble();
        System.out.println("MENU");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtracao");
        System.out.println("3 - Divisao 3");
        System.out.println("4 - Multiplicacao 4");
        System.out.print("Escolher operacao: " );
        int opc = input.nextInt();
        switch(opc){
            case 1:
                System.out.println("Escolheu soma");
                System.out.println("A soma dos numeros = " + (num1+num2));
                break;
            case 2:
                System.out.println("Escolheu subtracao");
                System.out.println("A subtracao dos numeros = " + (num1-num2));
                break;
            case 3:
                System.out.println("Escolheu divisao");
                System.out.println("A divisao dos numeros = " + (num1/num2));
                break;
            case 4:
                System.out.println("Escolheu multiplicacao");
                System.out.println("A multiplicacao dos numeros = " + (num1*num2));
                break;
            default:
                System.out.println("Operacao invalida...");
                break;
        }
    }
}

