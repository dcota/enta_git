import java.util.*;

public class Aula {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double[] nums = new double[6]; 

        for(int i = 0 ; i < 6  ; i++ ) {
            System.out.print("Num " + (i+1) + ":");
            nums[i]= input.nextDouble();
        }

        /*System.out.print("Num 1: ");
        nums[0] = input.nextDouble();
        System.out.print("Num 2: ");
        nums[1] = input.nextDouble();
        System.out.print("Num 3: ");
        nums[2] = input.nextDouble();
        System.out.print("Num 4: ");
        nums[3] = input.nextDouble();
        System.out.print("Num 5: ");
        nums[4] = input.nextDouble();
        System.out.print("Num 6: ");
        nums[5] = input.nextDouble();*/
    }
}
