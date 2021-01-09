public class Aluno {
    //atributos
    private String nomeAluno;
    private int idadeAluno;
    private String moradaAluno;
    private int numCCAluno;
    private float mediaAluno;

    //método construtor da classe
    public Aluno(){
    }

    //método construtor da classe
    public Aluno(String nome, int idade, String morada, int numCC, float media){
        this.nomeAluno = nome;
        this.idadeAluno = idade;
        this.moradaAluno = morada;
        this.numCCAluno = numCC;
        this.mediaAluno = media;
    }

    //métodos de set ou setters
    public void setNomeAluno(String nomeAluno){
        this.nomeAluno = nomeAluno;
    }
    public void setIdadeAluno(int idadeAluno){
        this.idadeAluno = idadeAluno;
    }
    public void setMoradaAluno(String moradaAluno){
        this.moradaAluno = moradaAluno;
    }
    public void setNumCCAluno(int numCCAluno){
        this.numCCAluno = numCCAluno;
    }
    public void setMediaAluno(float mediaAluno){
        this.mediaAluno = mediaAluno;
    }

    //métodos de get ou getters
    public String getNomeAluno(){
        return this.nomeAluno;
    }
    public int getIdadeAluno(){
        return this.idadeAluno;
    }
    public String getMoradaAluno(){
        return this.moradaAluno;
    }
    public int getNumCCAluno(){
        return this.numCCAluno;
    }
    public float getMediaAluno(){
        return this.mediaAluno;
    }

}
