import java.util.ArrayList;
import animal.*;

public class Animais {

	public static void main(String[] args) {
		ArrayList<Animal> listaAnimais = new ArrayList<Animal>();
		
		Animal	anim1 = new Animal("Gato","Siamês","Tico",3);
		Animal	anim2 = new Animal("Cão","Pincher","Leão",5);	
		Animal	anim3 = new Animal("Cão","Doberman","Fiel",2);	
		Animal	anim4 = new Animal("Gato","Persa","Leo",3);	
		Animal	anim5 = new Animal("Gato","Indefinida","Smarty",3);	
		
		listaAnimais.add(anim1);
		listaAnimais.add(anim2);
		listaAnimais.add(anim3);
		listaAnimais.add(anim4);
		listaAnimais.add(anim5);
		
		printListaAnimais(listaAnimais);

	}
	
	public static void printListaAnimais(ArrayList<Animal> la) {
		String formatHeader  = "|%1$-10s|%2$-15s|%3$-10s|%4$-10s\n";
		String formatRowData = "|%1$-10s|%2$-15s|%3$-10s|%4$-10d\n";
		System.out.format(formatHeader,"TIPO", "RAÇA", "NOME", "IDADE");
		for(int i = 0; i < la.size(); i++) {
			System.out.format(formatRowData,la.get(i).getTipoAnimal(),la.get(i).getRacaAnimal(), la.get(i).getNomeAnimal(), la.get(i).getIdadeAnimal());
		}
	}
}
