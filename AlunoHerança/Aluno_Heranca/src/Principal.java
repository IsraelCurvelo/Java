
import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nome, ra, curso,turno,semestre;
		
		JOptionPane.showMessageDialog(null, "Cadastro de alunos");
		nome= JOptionPane.showInputDialog("Digite o nome");
		ra = JOptionPane.showInputDialog("Digite o RA");
		curso = JOptionPane.showInputDialog("Digite o curso");
		turno = JOptionPane.showInputDialog("Digite o turno");
		semestre = JOptionPane.showInputDialog("Digite o semestre");
				
				AlunoGrad novo = new AlunoGrad(ra,nome,curso,turno,semestre);
				
				JOptionPane.showMessageDialog(null,"Aluno Cadastrado!\n"
				+ "\nNome   :"+novo.getNome()
				+ "\nRA     :"+novo.getRa()
				+ "\nCurso  :"+novo.getCurso()
				+ "\nTurno  :"+novo.getTurno()
				+ "\nSemestre:"+novo.getSemestre());

	}

}
