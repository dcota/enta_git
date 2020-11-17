import java.util.Scanner;

public class Exercicio9{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Introduza frase: ");
        String str = in.nextLine();
        System.out.println("Numero de vogais = " + contaVog(str));
    }

    public static int contaVog(String str){
        String strLower = str.toLowerCase();
        int contaVogais=0;
        int compStr = strLower.length();
        for(int i=0; i<compStr; i++){
            char c = strLower.charAt(i);
            if(c=='a' || c=='e' || c=='i'|| c=='o' || c=='u'){
                contaVogais++;
            }  
        }
        return contaVogais;
    } 

    
}