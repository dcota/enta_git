import java.util.ArrayList;
public class GesAlunos {
    public static void main(String[] args) {
         // instanciar alunos com construtor que incializa atributos/campos
        Aluno aluno1 = new Aluno("Maria Matos", 15, "Rua do C++, 54", 98765432, "email1@enta.pt", 18.7f);
        Aluno aluno2 = new Aluno("Carlos Manuel", 19, "Rua do Java, 54", 12121212, "email2@enta.pt", 15.3f);
        Aluno aluno3 = new Aluno("Mário Matos", 20, "Rua do HTML, 54", 3232323, "email3@enta.pt", 10.6f);
        Aluno aluno4 = new Aluno("Carla Silva", 16, "Rua do PHP, 54", 98899899, "email4@enta.pt", 9.1f);
        Aluno aluno5 = new Aluno("Mariana Rebelo", 21, "Rua do Python, 54", 65656126, "email5@enta.pt", 8.4f);

        //criar uma turma = ArrayList de alunos
        ArrayList<Aluno> alunos = new ArrayList<Aluno>();
        alunos.add(aluno1);
        alunos.add(aluno2);
        alunos.add(aluno3);
        alunos.add(aluno4);
        alunos.add(aluno5);

        //criar instancia da classe Turma
        Turma turmaTIS2T1 = new Turma(2,"TIS-2-Turma1",alunos);

        //criar lista de turmas
        ArrayList<Turma> turmas = new ArrayList<Turma>();

        //adicionar a turma à lista de turmas
        turmas.add(turmaTIS2T1);
    }
}