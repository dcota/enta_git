import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Aula_ArrayList {
    public static void main(String[] args) throws FileNotFoundException {
        //array estático
        /*String[] nomes2 = new String[6];
        for(int i = 0; i<nomes2.length ; i++){
            System.out.println(nomes2[i]);
        }
        System.out.println("\n");
        nomes2[1] = "Marco";
        for(int i = 0; i<nomes2.length ; i++){
            System.out.println(nomes2[i]);
        }*/

        //array dinâmico
        Scanner scanCMD = new Scanner(System.in); //criar scanner
        ArrayList<Integer> numeros = new ArrayList<Integer>(); //criar lista/array

        int tamanhoArrayList = numeros.size();//determinar o tamanho da lista
        System.out.println("Tamanho do ArrayList: " + tamanhoArrayList);//mostrar o tamanho da lista

        numeros.add(4); //adicionar o número 4 à lista numeros
        numeros.add(8); //adicionar o número 8 à lista numeros
        numeros.add(2); //adicionar o número 2 à lista numeros
        numeros.add(5); //adicionar o número 5 à lista numeros

        tamanhoArrayList = numeros.size();//determinar o tamanho da lista
        System.out.println("Tamanho do ArrayList: " + tamanhoArrayList);//mostrar o tamanho da lista

        for(int i=0; i<numeros.size(); i++){
            System.out.print(numeros.get(i) + " ");
        }
        System.out.println();

        numeros.set(1,564);
        
        for(int i=0; i<numeros.size(); i++){
            System.out.print(numeros.get(i) + " ");
        }
    }
}























/*ArrayList<String> nomes = new ArrayList<String>();
        Scanner input = new Scanner(System.in);

        int tamanho = nomes.size();
        System.out.println("O tamanho é: " + tamanho);

        System.out.print(
            "Meu caro Amigo, escreva o seu primeiro nome: ");
        String nome = input.next();

        nomes.add(nome);

        tamanho = nomes.size();
        System.out.println("O tamanho é: " + tamanho);

        for(int i=0; i<5 ;i++ ){
            //System.out.println(nomes[i] + " ");
        }*/
