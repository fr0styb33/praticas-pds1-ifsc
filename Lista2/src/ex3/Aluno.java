package ex3;

public class Aluno extends Pessoa {
	private Long matricula;

	public Long getMatricula() {
		return matricula;
	}

	public void setMatricula(Long matricula) {
		this.matricula = matricula;
	}

	@Override
	public String toString() {
		return "Nome:" + this.getNome() + "\n Matrícula:" + this.getMatricula();
	}
}

