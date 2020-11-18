package AlunoPack;

import java.util.ArrayList;

public class GesAlunos {

	public static void main(String[] args) {
		ArrayList<Aluno> alunos = new ArrayList<Aluno>();
		// criar alunos
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

		// criar Turma A
		ArrayList<Aluno> alunosTA = new ArrayList<Aluno>();
		alunosTA.add(a1);
		alunosTA.add(a2);
		alunosTA.add(a3);
		alunosTA.add(a4);
		alunosTA.add(a5);
		Turma turmaA = new Turma("A", alunosTA);

		// criar Turma B
		ArrayList<Aluno> alunosTB = new ArrayList<Aluno>();
		alunosTB.add(a6);
		alunosTB.add(a7);
		alunosTB.add(a8);
		alunosTB.add(a9);
		alunosTB.add(a10);
		Turma turmaB = new Turma("B", alunosTB);

		System.out.println("Num de alunos menores da turma: " + turmaA.getContaMenores());
		/*System.out.println("Nomes dos alunos:");
		printMenores(turmaB);

		System.out.println("Num de c/ media positiva: " + contaMediaPos(turmaB));
		System.out.println("Nomes dos alunos:");
		printMediaPos(turmaB);*/
	} // end main

	

	public static int contaMediaPos(Turma turma) {
		int contador = 0;
		for (int i = 0; i < turma.getAlunos().size(); i++) {
			if (turma.getAlunos().get(i).getMedia() >= 10) {
				contador++;
			}
		}
		return contador;
	}

	public static void printMenores(Turma turma) {
		for (int i = 0; i < turma.getAlunos().size(); i++) {
			if (turma.getAlunos().get(i).getIdade() < 18) {
				System.out.println(turma.getAlunos().get(i).getNome());
			}
		}
	}

	public static void printMediaPos(Turma turma) {
		for (int i = 0; i < turma.getAlunos().size(); i++) {
			if (turma.getAlunos().get(i).getMedia() >= 10) {
				System.out.println(turma.getAlunos().get(i).getNome());
			}
		}
	}

}
