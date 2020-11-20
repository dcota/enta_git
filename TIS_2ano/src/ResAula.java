import java.util.Scanner;

public class ResAula{
    public static void main(String[] args){
        String[] nomes={"Carlos", "Bernardo", "Paulo", "Marcelo", "David", "António"};
        Scanner in = new Scanner(System.in);
        System.out.print("Introduza nome: ");
        String str = in.nextLine();
        if( verificaNome(nomes,str) == true ){
            System.out.println("Nome encontrado!");
        } else {
            System.out.println("Nome não encontrado!");
        }               
    }
    public static boolean verificaNome(String[] nomes, String str){
        boolean resultado = false;
        int i=0;
        while(i<nomes.length){
            if( nomes[i].equals(str) == true){
                resultado = true;
                break;
            }
            i++;
        }
        return resultado;
    }  
}