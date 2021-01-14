public class Carro {
	//atributos da classe Animal
	private String marca;
	private String modelo;
	private String cor;
	private String matricula ;
	private int numPortas;
	private int anoMatricula;
	
	//contrutor da classe Carro
	public Carro(String marca, String modelo,
			String cor, String matricula, int numPortas, int anoMatricula) {
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
		this.matricula = matricula;
		this.numPortas = numPortas;
		this.anoMatricula = anoMatricula;
	}
	
	//contrutor da classe Carro
	public Carro() {
		
	}
	
	//setters = métodos de set
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public void setNumPortas(int numPortas) {
		this.numPortas = numPortas;
	}
	public void setAnoMatricula(int anoMatricula) {
		this.anoMatricula = anoMatricula;
	}
	
	//getters = métodos de get
	public String getMarca() {
		return this.marca;
	}
	public String getModelo() {
		return this.modelo;
	}
	public String getCor() {
		return this.cor;
	}
	public String getMatricula() {
		return this.matricula;
	}
	public int getNumPortas() {
		return this.numPortas;
	}
	public int getAnoMatricula() {
		return this.anoMatricula;
	}
}