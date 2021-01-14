public class Aluno {
    //atributos da classe Aluno
    private String nome;
    private int idade;
    private String morada;
    private int CC;
    private String email;
    private double mediaNotas;

    //contrutor da classe
    public Aluno (String nome, int idade, String morada, int CC, String email, double mediaNotas){
        this.nome=nome;
        this.idade=idade;
        this.morada=morada;
        this.CC=CC;
        this.email=email;
        this.mediaNotas=mediaNotas;
    }

    public Aluno(){
        //empty
    }

    //métodos de get
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
    public double getMedia(){
        return this.mediaNotas;
    }

    //métodos de set
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
    public void setMedia(double mediaNotas){
        this.mediaNotas=mediaNotas;
    }

    public void printAtributos(){
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.morada);
        System.out.println(this.CC);
        System.out.println(this.email);
        System.out.println(this.mediaNotas);
    }
}

