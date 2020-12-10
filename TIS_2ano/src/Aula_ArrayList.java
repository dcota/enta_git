import java.util.*;

public class Aula_ArrayList {
    public static void main(String[] args) {
    	//criar a lista de inteiros, uma inst�ncia da classe ArrayList
        ArrayList<Integer> lista = new ArrayList<Integer>();
        //calcular o numero de elementos da lista
        int tamanhoLista = lista.size();
        //mostrar na linha de comandos
        System.out.println("Num elementos da lista: " + tamanhoLista);
        //adicionar 5 n�meros � lista
        lista.add(3);
        lista.add(34);
        lista.add(54);
        lista.add(6);
        lista.add(78);
        //calcular o numero de elementos da lista depois de inserir os 5 n�meros
        tamanhoLista = lista.size();
        //mostrar na linha de comandos
        System.out.println("Num elementos da nova lista: " + tamanhoLista);
        //chamar o m�todo que mostra o conte�do da lista
        mostraLista(lista);
        //chamar o m�todo que calcula a soma de todos os elementos da lista
        int soma = somaLista(lista);
        //mostrar a soma na linha de comandos
        System.out.println("Soma de todos os elementos da lista: " + soma);
    }
    
    //m�todo para mostrar o conte�do da lista
    public static void mostraLista(ArrayList<Integer> lista){
        for(int i=0; i<lista.size() ; i++){
            System.out.print(lista.get(i) + " ");
        }
        System.out.println();
    }
    
    //m�todo para somar todos os elementos da lista
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
