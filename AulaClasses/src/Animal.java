

public class Animal {
	private String tipoAnimal;
	private String racaAnimal;
	private String nomeAnimal;
	private int idadeAnimal;
	
	//contrutor
	public Animal(String tipo, String raca, String nome, int idade) {
		this.tipoAnimal = tipo;
		this.racaAnimal = raca;
		this.nomeAnimal = nome;
		this.idadeAnimal = idade;	
	}
	
	//setters ou métodos de set	
	public void setTipoAnimal(String tipo) {
		this.tipoAnimal = tipo;
	}

	public void setNomeAnimal(String nome) {
		this.tipoAnimal = nome;
	}
	
	public void setRacaAnimal(String raca) {
		this.tipoAnimal = raca;
	}
	
	public void setIdadeAnimal(int idade) {
		this.idadeAnimal = idade;
	}
	
	//getters ou métodos de get
	public String getTipoAnimal() {
		return tipoAnimal;
	}
	
	public String getRacaAnimal() {
		return racaAnimal;
	}
	
	public String getNomeAnimal() {
		return nomeAnimal;
	}
	
	public int getIdadeAnimal() {
		return idadeAnimal;
	}
	
	
}
