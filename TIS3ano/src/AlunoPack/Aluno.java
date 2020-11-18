package AlunoPack;

public class Aluno {
	private String nome;
	private int idade;
	private String email;
	private double media;

	public Aluno() {
		// contrutor
	}

	public Aluno(String nome, int idade, String email, double media) {
		this.nome = nome;
		this.idade = idade;
		this.email = email;
		this.media = media;
	}

	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	public String getEmail() {
		return email;
	}

	public double getMedia() {
		return media;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setMedia(double media) {
		this.media = media;
	}

}
