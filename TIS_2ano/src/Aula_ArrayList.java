import java.util.*;

public class Aula_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<Integer>();
        //ver dimensão da lista
        int numElementos = lista.size();
        //mostrar numero de elementos da lista
        System.out.println("Número de elementos: " + numElementos);
        //adicionar elementos à lista
        lista.add(56);
        lista.add(23);
        lista.add(45);
        lista.add(7);
        lista.add(78);
        numElementos=lista.size();
        System.out.println("Número de elementos: " + numElementos);
        mostraLista(lista);
        lista.remove(3);
        numElementos=lista.size();
        System.out.println("Número de elementos: " + numElementos);
        mostraLista(lista);
        lista.add(550);
        mostraLista(lista);
        lista.set(4, 1);
        mostraLista(lista);
        Collections.sort(lista);
        mostraLista(lista);
    }

    public static void mostraLista(ArrayList<Integer> lista){
        //forma 1
        for(int i=0; i<lista.size(); i++){
            System.out.print(lista.get(i) + " ");
        }
        System.out.println();
        /*//forma 2
        for(int i : lista){
            System.out.print(i + " ");
        }
        System.out.println();
        //forma 3
        System.out.println(lista);*/
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
