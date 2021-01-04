import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		
		ArrayList<Aluno> alunos = new ArrayList<Aluno>();
		
		Aluno aluno1 = new Aluno("Duarte Cota", 51, 111111111, 'M', "Morada1", 12);
		Aluno aluno2 = new Aluno("Pedro Matos", 23, 222222222, 'M', "Morada2", 9);
		Aluno aluno3 = new Aluno("Ana Santos", 18, 333333333, 'F', "Morada3", 9);
		Aluno aluno4 = new Aluno("Vítor Alves", 19, 444444444, 'M', "Morada4", 9);
		
		
		alunos.add(aluno1);
		alunos.add(aluno2);
		alunos.add(aluno3); 
		alunos.add(aluno4);
		
		printAlunos(alunos);
		
	}
	
	public static void printAlunos(ArrayList<Aluno> alunos) {
		for(int i=0; i<alunos.size(); i++) {
			System.out.println("Nome: " + alunos.get(i).getNome());
			System.out.println("Idade: " + alunos.get(i).getIdade());
			System.out.println("CC: " + alunos.get(i).getCc());
			if(alunos.get(i).getGen()=='M') {
				System.out.println("Género: Masculino");
			} else {
				System.out.println("Género: Feminino");
			}
			System.out.println("***************");
		}
	}
}

