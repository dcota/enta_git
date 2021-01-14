import java.util.ArrayList;
public class Turma{
    //atributos
    private int ano;
    private String idTurma;
    private ArrayList<Aluno> alunos;

    public Turma(int ano, String idTurma, ArrayList<Aluno> alunos){
        this.ano=ano;
        this.idTurma=idTurma;
        this.alunos=alunos;
    }

    //setters
    public void setAno(int ano){
        this.ano=ano;
    }
    public void setIdTurma(String idTurma){
        this.idTurma=idTurma;
    }
    public void setAlunos(ArrayList<Aluno> alunos){
        this.alunos=alunos;    
    }
    //getters
    public int getAno(){
        return this.ano;
    }
    public String getIdTurma(){
        return this.idTurma;
    }
    public ArrayList<Aluno> getAlunos(){
        return this.alunos;
    }

}