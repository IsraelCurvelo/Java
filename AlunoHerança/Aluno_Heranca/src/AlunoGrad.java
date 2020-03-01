
public final class AlunoGrad extends Aluno{
	private String curso;
	private String turno;
	private String semestre;
	
	
	public AlunoGrad(String ra, String nome, String curso, String turno, String semestre) {
		super(ra, nome);
		this.curso = curso;
		this.turno = turno;
		this.semestre = semestre;
	}


	public String getCurso() {
		return curso;
	}


	public void setCurso(String curso) {
		this.curso = curso;
	}


	public String getTurno() {
		return turno;
	}


	public void setTurno(String turno) {
		this.turno = turno;
	}


	public String getSemestre() {
		return semestre;
	}


	public void setSemestre(String semestre) {
		this.semestre = semestre;
	}
	
		
		
}
