/*
CURSO:TIS 2ano
UFCD: 0789-Fundamentos linguagem JAVA
EXERCICIO: 8 - Metodo que retorna o minimo de 3 numeros
AUTOR: Duarte Cota
DATA: nov2020
*/
import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Num1?: ");
        int num1 = input.nextInt();
        System.out.print("Num2?: ");
        int num2 = input.nextInt();
        System.out.print("Num3?: ");
        int num3 = input.nextInt();
        int min = minimo1(num1,num2,num3);
        System.out.println("Valor minimo: " + min);
        input.close();
    }

    public static int minimo1(int num1, int num2, int num3) {
        int min = num1;
        if(num2 < min){
            min = num2;
        }
        else if(num3 < min){
            min = num3;
        }
        return min;
    }
    public static int minimo2(int num1, int num2, int num3) {
        int min = Math.min(num1,num2);
        if( Math.min(min,num3)<min ) {
            min = Math.min(min,num3);
        }
        return min;
    }
    public static int minimo3(int num1, int num2, int num3) {
        return Math.min(num1,Math.min(num2,num3));
    }
}