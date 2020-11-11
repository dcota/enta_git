import java.util.ArrayList;

public class GesCarros {

	public static void main(String[] args) {
		
		ArrayList<Carro> carros = new ArrayList<>();
		
		System.out.println(carros.size());
		
		Carro carro = new Carro();
		
		carros.add(carro);
		
		carros.get(0).setMarca("OPEL");
		carros.get(0).setModelo("Astra");
		carros.get(0).setCor("Azul");
		carros.get(0).setNumPortas(5);
		carros.get(0).setMatricula("01-43-ZZ");
		carros.get(0).setAnoMatricula(1980);
		
		System.out.println(carros.get(0).getMarca());
		System.out.println(carros.get(0).getModelo());
		System.out.println(carros.get(0).getCor());
		System.out.println(carros.get(0).getNumPortas());
		System.out.println(carros.get(0).getMatricula());
		System.out.println(carros.get(0).getAnoMatricula());

	}

}
