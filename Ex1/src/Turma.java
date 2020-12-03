
public class Turma {
	private String curso;
	private int anoCurso;

	public Turma() {
		// construtor
	}

	public Turma(String curso, int aC) {
		this.curso = curso;
		this.anoCurso = aC;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public int getAnoCurso() {
		return anoCurso;
	}

	public void setAnoCurso(int anoCurso) {
		this.anoCurso = anoCurso;
	}

}
