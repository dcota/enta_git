import java.util.*;

public class Aula_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<Integer>();
        int tamanhoLista = lista.size();
        System.out.println("Dimensão da lista: " + tamanhoLista);
        lista.add(3);
        lista.add(34);
        lista.add(54);
        lista.add(6);
        lista.add(78);
        tamanhoLista = lista.size();
        System.out.println("Dimensão da nova lista: " + tamanhoLista);
        mostraLista(lista);
        System.out.println("Soma:" + somaLista(lista));
    }

    public static void mostraLista(ArrayList<Integer> lista){
        for(int i=0; i<lista.size() ; i++){
            System.out.print(lista.get(i) + " ; ");
        }
    }

    public static int somaLista(ArrayList<Integer> lista){
        int soma = 0;
        for(int i=0; i<lista.size() ; i++){
            soma = soma + lista.get(i);
        }
        return soma;
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
