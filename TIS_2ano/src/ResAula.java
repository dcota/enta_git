import java.util.Scanner;

public class ResAula{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n1, n2, n3;
        System.out.print("Num1?: ");
        n1 = in.nextInt();
        System.out.print("Num2?: ");
        n2 = in.nextInt();
        System.out.print("Num3?: ");
        n3 = in.nextInt();
        int min = minimo(n1,n2,n3);
        System.out.println("Valor minimo: " + min);
        in.close();
    }

    public static int minimo(int n1, int n2, int n3) {
        int min;
        min = n1;
        if (n2 < min){
            min = n2;
        } else if (n3 < min){
            min = n3;
        }
        return min;
    }
}