
public class Aluno {
	private String nome;
	private int idade;
	private int cc;
	private char gen;
	private String morada;
	private int escolaridade;

	public Aluno(String n, int i, int c, char g, String m, int e) {
		this.nome = n;
		this.idade = i;
		this.cc = c;
		this.gen = g;
		this.morada = m;
		this.escolaridade = e;
	}

	public Aluno() {

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getCc() {
		return cc;
	}

	public void setCc(int cc) {
		this.cc = cc;
	}

	public char getGen() {
		return gen;
	}

	public void setGen(char gen) {
		this.gen = gen;
	}

	public String getMorada() {
		return morada;
	}

	public void setMorada(String morada) {
		this.morada = morada;
	}

	public int getEscolaridade() {
		return escolaridade;
	}

	public void setEscolaridade(int escolaridade) {
		this.escolaridade = escolaridade;
	}
	
	
}


