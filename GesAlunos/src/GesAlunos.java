import java.util.ArrayList;

public class GesAlunos {

	public static void main(String[] args) {
		//criar alunos
		Aluno a1 = new Aluno("Duarte Cota", 16, "dcota@gmail.com", 15.5);
		Aluno a2 = new Aluno("Carla Silva", 23, "dcota@gmail.com", 9.8);
		Aluno a3 = new Aluno("Ana Santos", 21, "dcota@gmail.com", 8.5);
		Aluno a4 = new Aluno("Marco Sousa", 15, "dcota@gmail.com", 19.0);
		Aluno a5 = new Aluno("Rodrigo Silva", 16, "dcota@gmail.com", 13.6);
		Aluno a6 = new Aluno("Mafalda Viveiros", 18, "dcota@gmail.com", 7.6);
		Aluno a7 = new Aluno("Madalena Silva", 17, "dcota@gmail.com", 10.0);
		Aluno a8 = new Aluno("Marcos Soares", 20, "dcota@gmail.com", 8.9);
		Aluno a9 = new Aluno("João Costa", 17, "dcota@gmail.com", 7.8);
		Aluno a10 = new Aluno("Manuel Marques", 21, "dcota@gmail.com", 12.5);
		
		//criar turmas
		ArrayList<Aluno> tA = new ArrayList<>();
		tA.add(a1);
		tA.add(a2);
		tA.add(a3);
		tA.add(a4);
		tA.add(a5);
		
		ArrayList<Aluno> tB = new ArrayList<>();
		tB.add(a6);
		tB.add(a7);
		tB.add(a8);
		tB.add(a9);
		tB.add(a10);
	
		Turma turmaA = new Turma("A",tA);
		Turma turmaB = new Turma("B",tB);
		
		System.out.println("Total de alunos menores da turma A: " + contaMenores(turmaA) );
		System.out.println("Nomes dos alunos:");
		listaNomesMenores(turmaA);
		
		System.out.println("Total de alunos menores da turma B: " + contaMenores(turmaB) );
		System.out.println("Nomes dos alunos:");
		listaNomesMenores(turmaB);
	}
	
	public static int contaMenores(Turma turma) {
		int contaMenores=0;
		for(int i=0; i<turma.getAlunosTurma().size();i++) {
			if(turma.getAlunosTurma().get(i).getIdade()<18) {
				contaMenores++;
			}
		}
		return contaMenores;
	}
	
	public static int contaMediaPos(Turma turma) {
		int contaMediaPos=0;
		for(int i=0; i<turma.getAlunosTurma().size();i++) {
			if(turma.getAlunosTurma().get(i).getIdade()<18) {
				contaMediaPos++;
			}
		}
		return contaMediaPos;
	}
	
	public static void listaNomesMenores(Turma turma) {
		for(int i=0; i<turma.getAlunosTurma().size();i++) {
			if(turma.getAlunosTurma().get(i).getIdade()<18) {
				System.out.println(turma.getAlunosTurma().get(i).getNome());
			}
		}
	}
	
	public static void listaNomesMediaPos(Turma turma) {
		for(int i=0; i<turma.getAlunosTurma().size();i++) {
			if(turma.getAlunosTurma().get(i).getIdade()>=10) {
				System.out.println(turma.getAlunosTurma().get(i).getNome());
			}
		}
	}
}
