import java.util.ArrayList;

public class Turma {
	private String turmaID;
	private ArrayList<Aluno> alunosTurma;
	
	public Turma(String tID, ArrayList<Aluno> aT) {
		this.turmaID=tID;
		this.alunosTurma=aT;
	}

	public String getTurmaID() {
		return turmaID;
	}

	public void setTurmaID(String turmaID) {
		this.turmaID = turmaID;
	}

	public ArrayList<Aluno> getAlunosTurma() {
		return alunosTurma;
	}

	public void setAlunosTurma(ArrayList<Aluno> alunosTurma) {
		this.alunosTurma = alunosTurma;
	}
	
	
}
