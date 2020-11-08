import java.util.*;

public class Aula {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Num1?: ");
        int num1 = input.nextInt();
        System.out.print("Num2?: ");
        int num2 = input.nextInt();
        System.out.print("Num3?: ");
        int num3 = input.nextInt();
        int min = minimo(num1,num2,num3);
        System.out.println("Valor minimo: " + min);
    }

    public static int minimo(int num1, int num2, int num3) {
        int min = num1;
        if(num2 < min){
            min = num2;
        }
        else if(num3 < min){
            min = num3;
        }
        return min;
    }

    

}

