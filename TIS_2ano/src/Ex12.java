import java.util.*;

public class Ex12{
    public static void main(String[] args){
        //ponto 3
        ArrayList<Integer> nums = new ArrayList<Integer>();
        //ponto 4
        ArrayList<String> carros = new ArrayList<String>();
        //ponto 5
        nums.add(23);
        nums.add(12);
        nums.add(2);
        nums.add(3);
        nums.add(54);
        nums.add(46);
        //ponto 6
        carros.add("Peugeot");
        carros.add("Renault");
        carros.add("Kia");
        carros.add("Suzuki");
        carros.add("Toyota");
        carros.add("Mercedes Benz");
        mostraNums(nums);
        mostraCarros(carros);
        //ponto 9
        nums.remove(3);
        carros.remove(4);
        //ponto 10
        mostraNums(nums);
        mostraCarros(carros);
        //ponto 11
        nums.set(3, 200);
        carros.set(4, "Subaru");
        //ponto 12
        mostraNums(nums);
        mostraCarros(carros);
        //ponto 13
        Collections.sort(nums);
        Collections.sort(carros);
        //ponto 14
        mostraNums(nums);
        mostraCarros(carros);
    }
    //ponto 7
    public static void mostraNums(ArrayList<Integer> nums){
        for(int i=0; i<nums.size(); i++) {
            System.out.print(nums.get(i) + " ");
        }
        System.out.println();
    }
    //ponto 8
    public static void mostraCarros(ArrayList<String> carros){
        for(int i=0; i<carros.size(); i++) {
            System.out.print(carros.get(i) + " ");
        } 
        System.out.println();      
    }
}