
public class Ingrediente {
	private double qtd;
	private String unidade;
	private String nome;

	public Ingrediente(double q, String u, String n) {
		this.qtd = q;
		this.unidade = u;
		this.nome = n;
	}

	public double getQtd() {
		return qtd;
	}

	public String getUnidade() {
		return unidade;
	}

	public String getNome() {
		return nome;
	}

	public void setQtd(double qtd) {
		this.qtd = qtd;
	}

	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}	
}
