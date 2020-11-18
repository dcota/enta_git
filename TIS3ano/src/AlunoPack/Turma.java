package AlunoPack;

import java.util.ArrayList;

public class Turma {
	private String idTurma;
	private ArrayList<Aluno> alunos;
	
	public Turma(String id, ArrayList<Aluno> alunos) {
		this.idTurma=id;
		this.alunos=alunos;
	}
	
	public String getIdTurma() {
		return idTurma;
	}
	public ArrayList<Aluno> getAlunos() {
		return alunos;
	}
	public void setIdTurma(String idTurma) {
		this.idTurma = idTurma;
	}
	public void setAlunos(ArrayList<Aluno> alunos) {
		this.alunos = alunos;
	}
	
	public int getContaMenores() {
		int contador = 0;
		for (int i = 0; i < alunos.size(); i++) {
			if (alunos.get(i).getIdade() < 18) {
				contador++;
			}
		}
		return contador;
	}
}
