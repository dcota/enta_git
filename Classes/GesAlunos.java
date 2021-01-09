import java.util.*;
public class GesAlunos {
    public static void main(String[] args){

        ArrayList<Aluno> listaAlunos = new ArrayList<Aluno>();

        //instanciar objeto aluno1 com o contrutor vazio (nenhum valor de atributo é definido)
        Aluno aluno1 = new Aluno();
        //atribuir os valores dos atributos
        aluno1.setNomeAluno("Daniel Ponte");
        aluno1.setIdadeAluno(20);
        aluno1.setMoradaAluno("Rua.....");
        aluno1.setNumCCAluno(111111111);
        aluno1.setMediaAluno(0.0f);
        //mostrar o nome do aluno1
        System.out.println(aluno1.getNomeAluno());
        //mostrar a idade do aluno1
        System.out.println(aluno1.getIdadeAluno());
        //alterar a idade do aluno1
        aluno1.setIdadeAluno(aluno1.getIdadeAluno()+1);
        //mostrar a idade do aluno1 depois da alteração
        System.out.println(aluno1.getIdadeAluno());

        //instanciar objeto aluno2 com o segundo construtor (valores dos atributos são logo definidos)
        Aluno aluno2 = new Aluno("Duarte Cota", 51, "Rua das Flores" , 999999999,0.0f);



        


    }
}
