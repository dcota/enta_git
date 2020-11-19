import java.util.ArrayList;

public class Stock {
	private ArrayList<Ingrediente> stock;
	
	public Stock(ArrayList<Ingrediente> stock) {
		this.stock=stock;
	}

	public ArrayList<Ingrediente> getStock() {
		return stock;
	}

	public void setStock(ArrayList<Ingrediente> stock) {
		this.stock = stock;
	}

}
