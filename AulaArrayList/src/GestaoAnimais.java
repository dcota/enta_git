import java.util.ArrayList;

public class GestaoAnimais {

	public static void main(String[] args) {
		Animal anim1 = new Animal
				("Doberman", "Cão", "M", 10.0, 5,"Imperador");
		Animal anim2 = new Animal
				("Siamês", "Gato", "F", 2.0, 1,"Mia");
		Animal anim3 = new Animal
				("Pitbull", "Cão", "F", 20.0, 4,"Pantufa");
		
		ArrayList<Animal> animais = new ArrayList<>();
		
		animais.add(anim1);
		animais.add(anim2);
		animais.add(anim3);
		
		animais.get(0).setNome("Leo");
		
		for(int i=0 ; i<animais.size() ; i++) {
			System.out.println(animais.get(i).getNome());
			System.out.println(animais.get(i).getPeso());
		}
		
	}

}
