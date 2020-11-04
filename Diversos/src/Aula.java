import java.util.*;

public class Aula {
    public static void main(String[] args)
    {
        ArrayList<Integer> lista = new ArrayList<Integer>(Arrays.asList(2,5,4,6,2));
        ArrayList<Integer> listaFinal = new ArrayList<Integer>(Arrays.asList());
        
        listaFinal.add(lista.get(0));
        
        for(int i=0; i<lista.size()-1; i++)
        {
              listaFinal.add(i+1, lista.get(i+1)-lista.get(i));
        }
        for (int i=0; i<5; i++)
        {
            System.out.printf("%d\t",listaFinal.get(i));
        }
    }
}
