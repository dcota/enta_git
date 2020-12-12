
public class Pessoa {
	private int cc;
	private int tlm;
	private String nome;
	private int idade;
	private boolean resultado;
	
	public Pessoa(int cc, int tlm, String nome, int idade, boolean resultado) {
		this.cc = cc;
		this.tlm = tlm;
		this.nome = nome;
		this.idade = idade;
		this.resultado = resultado;
	}
	
	public Pessoa() {

	}
	


	public int getCc() {
		return cc;
	}

	public int getTlm() {
		return tlm;
	}

	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	public boolean getResultado() {
		return resultado;
	}

	public void setCc(int cc) {
		this.cc = cc;
	}

	public void setTlm(int tlm) {
		this.tlm = tlm;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public void setResultado(boolean resultado) {
		this.resultado = resultado;
	}

}
