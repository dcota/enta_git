public class Aluno {
    private String nome;
    private int idade;
    private String morada;
    private int CC;
    private String email;
    private float mediaNotas;

    public Aluno(){
        //construtor vazio
    }

    public Aluno(String nome, int idade, String morada, int CC, String email, float mediaNotas){
        this.nome=nome;
        this.idade=idade;
        this.morada=morada;
        this.CC=CC;
        this.email=email;
        this.mediaNotas=mediaNotas;
    }

    public void setNome(String nome){
        this.nome=nome;
    }
    public void setIdade(int idade){
        this.idade=idade;
    }
    public void setMorada(String morada){
        this.morada=morada;
    }
    public void setCC(int CC){
        this.CC=CC;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public void setMediaNotas(float mediaNotas){
        this.mediaNotas=mediaNotas;
    }

    public String getNome(){
        return this.nome;
    }
    public int getIdade(){
        return this.idade;
    }
    public String getMorada(){
        return this.morada;
    }
    public int getCC(){
        return this.CC;
    }
    public String getEmail(){
        return this.email;
    }
    public float getMediaNotas(){
        return this.mediaNotas;
    }
}
