
public class Aluno {

	private String nome;
	private int idade;
	private String email;
	private double media;

	public Aluno(String n, int i, String e, double m) {
		this.nome = n;
		this.idade = i;
		this.email = e;
		this.media = m;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getMedia() {
		return media;
	}

	public void setMedia(double media) {
		this.media = media;
	}
}
