
import java.util.Scanner;

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args){
        Scanner dados = new Scanner(System.in);
        System.out.print("Introduzir frase: ");
        String frase = dados.nextLine();
        int numVogais = contaVogais(frase);
        System.out.println("Num de vogais: "+ numVogais);
    }

    public static int contaVogais(String frase){
        int contador=0;
        frase = frase.toLowerCase();
        System.out.println(frase);
        for(int i=0; i<frase.length(); i++){
            char letra = frase.charAt(i);
            switch(letra){
                case 'a':
                    contador++;
                    break;
                case 'e':
                    contador++;
                    break;
                case 'i':
                    contador++;
                    break;
                case 'o':
                    contador++;
                    break;
                case 'u':
                contador++;
                    break;
            }
        }
        return contador;
    }

}






/*import java.util.Scanner;

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

    
}*/