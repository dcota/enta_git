import java.util.ArrayList;

public class GestCozinha {

	public static void main(String[] args) {
		//criar stock
		ArrayList<Ingrediente> stockCozinha = new ArrayList<Ingrediente>();
		stockCozinha.add(new Ingrediente(10.0,"Kg","Tomate"));
		stockCozinha.add(new Ingrediente(5.0,"Lt","Azeite virgem"));
		stockCozinha.add(new Ingrediente(15.0,"Kg","Cebola branca"));
		stockCozinha.add(new Ingrediente(5.0,"Kg","Arroz agulha"));
		//adiciona a stock
		Stock stock = new Stock(stockCozinha);
		//criar duas receitas
		ArrayList<Ingrediente> arroz_branco = new ArrayList<Ingrediente>();
	    arroz_branco.add(new Ingrediente(1.0,"Kg","Arroz carolino"));
	    arroz_branco.add(new Ingrediente(1.0,"Kg","Cebola branca"));
	    arroz_branco.add(new Ingrediente(1.0,"Lt","Azeite virgem"));
	    ArrayList<Ingrediente> arroz_tomate = new ArrayList<Ingrediente>();
	    arroz_tomate.add(new Ingrediente(1.0,"Kg","Arroz carolino"));
	    arroz_tomate.add(new Ingrediente(1.0,"Kg","Cebola branca"));
	    arroz_tomate.add(new Ingrediente(1.0,"Lt","Azeite virgem"));
	    arroz_tomate.add(new Ingrediente(1.0,"Kg","Tomate"));

	    //invocar método que verifica o stock para um dado prato
	    checkQtd(stock.getStock(),arroz_branco,10);

	}
	
	public static void checkQtd(ArrayList<Ingrediente> stock, ArrayList<Ingrediente> receita, int doses) {
		//para cada ingrediente da receita
		for(int i=0; i<receita.size();i++) {
			String ingrediente = receita.get(i).getNome(); 
			double qtdNecessaria = receita.get(i).getQtd() * doses;	
			if(verificaStock(stock,ingrediente)<qtdNecessaria) {
				System.out.println("Quantidade de " + ingrediente + "insuficiente.");
				System.out.println("Quantidade em falta: " + (verificaStock(stock,ingrediente)- qtdNecessaria));
			}
		}	
	}
	//método que retorna o atock de um dado ingrediente
	public static double verificaStock(ArrayList<Ingrediente> stock, String ingrediente) {
		for(int i=0; i<stock.size(); i++) {
			if(stock.get(i).getNome()==ingrediente) {
				return stock.get(i).getQtd();
			}
		}
		return -1;
	}

}
