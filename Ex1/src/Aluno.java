
public class Aluno {
	private String primNome;
	private String ultNome;
	private int idade;
	private int idTurma;
	
	public Aluno() {
		//constructor
	}
	
	public Aluno(String pn, String un, int idade, int idT) {
		this.primNome=pn;
		this.ultNome=un;
		this.idade=idade;
		this.idTurma=idT;
	}

	public String getPrimNome() {
		return primNome;
	}

	public void setPrimNome(String primNome) {
		this.primNome = primNome;
	}

	public String getUltNome() {
		return ultNome;
	}

	public void setUltNome(String ultNome) {
		this.ultNome = ultNome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getIdTurma() {
		return idTurma;
	}

	public void setIdTurma(int idTurma) {
		this.idTurma = idTurma;
	}

		
}
