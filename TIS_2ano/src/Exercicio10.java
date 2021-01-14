import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Introduzir uma frase: ");
        String s = scan.nextLine();
        String str = s;
        System.out.println(s);
        str = str.replaceAll("\\s+", " "); //retirar espaços em branco
        String[] sSplit = str.split("\\s+"); 
        System.out.println(str);
        int length = sSplit.length;
        System.out.println("Num palavras = " + length);
        for(int i=0; i<length; i++){
            System.out.println(sSplit[i]);
        } 
        scan.close();
    }  
}
