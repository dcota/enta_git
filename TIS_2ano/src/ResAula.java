import java.util.Scanner;

public class ResAula{
    public static void main(String[] args){
        String[] nomes={"Carlos", "Bernardo", "Paulo", "Marcelo", "David", "António"};
        Scanner in = new Scanner(System.in);
        System.out.print(nomes[5]);
        System.out.print("Introduza nome: ");
        String str = in.nextLine();
        verificaNome(nomes,str);
                
    }

    public static boolean verificaNome(String[] nomes, String str){
        boolean resultado = false;

        
        return resultado;
    }
   
}