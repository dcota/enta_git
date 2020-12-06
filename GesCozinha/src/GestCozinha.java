import java.util.ArrayList;

public class GestCozinha {

	public static void main(String[] args) {
		// criar um stock
		ArrayList<Ingrediente> stockCozinha = new ArrayList<Ingrediente>();
		stockCozinha.add(new Ingrediente(1.0, "Kg", "Tomate"));
		stockCozinha.add(new Ingrediente(5.0, "Lt", "Azeite virgem"));
		stockCozinha.add(new Ingrediente(15.0, "Kg", "Cebola branca"));
		stockCozinha.add(new Ingrediente(5.0, "Kg", "Arroz carolino"));

		// adiciona stock à classe Stock
		Stock stock = new Stock(stockCozinha);

		// criar duas receitas
		ArrayList<Ingrediente> arroz_branco = new ArrayList<Ingrediente>();
		arroz_branco.add(new Ingrediente(1.0, "Kg", "Arroz carolino"));
		arroz_branco.add(new Ingrediente(0.5, "Kg", "Cebola branca"));
		arroz_branco.add(new Ingrediente(0.2, "Lt", "Azeite virgem"));
		
		ArrayList<Ingrediente> arroz_tomate = new ArrayList<Ingrediente>();
		arroz_tomate.add(new Ingrediente(1.0, "Kg", "Arroz carolino"));
		arroz_tomate.add(new Ingrediente(1.0, "Kg", "Cebola branca"));
		arroz_tomate.add(new Ingrediente(1.0, "Lt", "Azeite virgem"));
		arroz_tomate.add(new Ingrediente(1.0, "Kg", "Tomate"));
		
		/*for(int i=0; i<stockCozinha.size(); i++) {
			//procura o objeto com nome Tomate
			if (stockCozinha.get(i).getNome()=="Tomate") {
				double novaQtd = stockCozinha.get(i).getQtd() + 5; //calcula a nova quantidade
				stockCozinha.get(i).setQtd(novaQtd); //atualiza nova quantidade no objeto com o nome Tomate
				System.out.println(stockCozinha.get(i).getQtd());
			}
		}*/
		

		// invocar método que verifica quantidades necessárias
		// neste exemplo verifica se há ingredientes para fazer 5 doses de arroz de tomate
		checkQtd(stock, arroz_tomate, 5);

	}

	public static void checkQtd(Stock stock, ArrayList<Ingrediente> receita, int doses) {
		// para cada ingrediente da receita verifica a disponibilidade no stock
		for (int i = 0; i < receita.size(); i++) {
			String ingrediente = receita.get(i).getNome(); //seleciona ingrediente
			double qtdNecessaria = receita.get(i).getQtd() * doses; // calcular a quantidade necessária
			//invocar método que retorna a quantidade existente de cada ingrediente
			if (verificaStock(stock.getStock(), ingrediente) < qtdNecessaria) {
				System.out.println("Quantidade de " + ingrediente + " insuficiente.");
				System.out.println("Quantidade necessária: " + qtdNecessaria);
				System.out.println(
						"Quantidade em falta: " + (qtdNecessaria - verificaStock(stock.getStock(), ingrediente)));
			}
			// se a quantidade em stock é zero o ingrediente não existe ou não há stock
			if (verificaStock(stock.getStock(), ingrediente) == 0) {
				System.out.println("Ingrediente: " + ingrediente + " inexistente ou sem stock...");
			}
		}
	}

	// método que retorna a quantidade em stock de um dado ingrediente
	public static double verificaStock(ArrayList<Ingrediente> stock, String ingrediente) {
		double qtd = 0;
		for (int i = 0; i < stock.size(); i++) {
			if (stock.get(i).getNome().equals(ingrediente)) {
				qtd = stock.get(i).getQtd();
				break;
			}
		}
		return qtd;
	}
}
