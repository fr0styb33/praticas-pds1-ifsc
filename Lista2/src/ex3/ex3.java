package ex3;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class ex3 extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldNome;
	private JTextField textFieldNascimento;
	private JTextField textFieldCpf;
	private JTextField textFieldMatricula;
	private JLabel lblNomeAluno;
	private JLabel lblNascimentoAluno;
	private JLabel lblCpfAluno;
	private JLabel lblMatriculaAluno;
	private JLabel lblCadastroProfessor;
	private JLabel lblNomeProfessor;
	private JLabel lblNascimentoProfessor;
	private JLabel lblCpfProfessor;
	private JLabel lblSiapeProfessor;
	private JButton btnCadastraProfessor;
	private JTextField textFieldNomeProfessor;
	private JTextField textFieldNascimentoProfessor;
	private JTextField textFieldCpfProfessor;
	private JTextField textFieldSiapeProfessor;
	private JButton btnConsultaAlunos;
	private JButton btnConsultaProfessores;
	private ArrayList<Aluno> alunos;
	private ArrayList<Professor> professores;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ex3 frame = new ex3();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ex3() {

		alunos = new ArrayList<Aluno>();
		professores = new ArrayList<Professor>();

		Aluno aluninho = new Aluno();
		Professor prof = new Professor();

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		textFieldNome = new JTextField();
		textFieldNome.setBounds(80, 46, 86, 20);
		contentPane.add(textFieldNome);
		textFieldNome.setColumns(10);

		textFieldNascimento = new JTextField();
		textFieldNascimento.setBounds(80, 77, 86, 20);
		contentPane.add(textFieldNascimento);
		textFieldNascimento.setColumns(10);

		textFieldCpf = new JTextField();
		textFieldCpf.setBounds(80, 108, 86, 20);
		contentPane.add(textFieldCpf);
		textFieldCpf.setColumns(10);

		textFieldMatricula = new JTextField();
		textFieldMatricula.setBounds(80, 140, 86, 20);
		contentPane.add(textFieldMatricula);
		textFieldMatricula.setColumns(10);

		JButton btnCadastroAluno = new JButton("Cadastrar aluno");
		btnCadastroAluno.setBounds(43, 181, 144, 23);

		btnCadastroAluno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nomeAluno = textFieldNome.getText();
				String dataNascimento = textFieldNascimento.getText();
				String cpf = textFieldCpf.getText();
				String matricula = textFieldMatricula.getText();

				if (!dataNascimento.isEmpty()) {

					Date nacimento = new Date(dataNascimento);
					aluninho.setDataNasc(nacimento);

				} else {
					JOptionPane.showMessageDialog(null, "Digite a data de nascimento!");
				}

				if (!nomeAluno.isEmpty()) {

					aluninho.setNome(nomeAluno);

				} else {
					JOptionPane.showMessageDialog(null, "Digite o nome do aluno!");
				}

				if (!cpf.isEmpty()) {

					Long cpfAluno = Long.valueOf(cpf);
					aluninho.setCpf(cpfAluno);

				} else {
					JOptionPane.showMessageDialog(null, "Digite o cpf do aluno!");
				}

				if (!matricula.isEmpty()) {
					Long matriculaAluno = Long.valueOf(matricula);
					aluninho.setMatricula(matriculaAluno);
				} else {
					JOptionPane.showMessageDialog(null, "Digite o número da matrícula!");

				}

				alunos.add(aluninho);
				JOptionPane.showMessageDialog(null, "Aluno cadastrado!");
				textFieldNome.setText(null);
				textFieldCpf.setText(null);
				textFieldNascimento.setText(null);
				textFieldMatricula.setText(null);
			}

		});
		contentPane.add(btnCadastroAluno);

		JLabel lblCadastroAluno = new JLabel("Cadastro aluno");
		lblCadastroAluno.setBounds(10, 21, 86, 14);
		contentPane.add(lblCadastroAluno);

		lblNomeAluno = new JLabel("Nome");
		lblNomeAluno.setBounds(10, 49, 46, 14);
		contentPane.add(lblNomeAluno);

		lblNascimentoAluno = new JLabel("nascimento");
		lblNascimentoAluno.setBounds(10, 80, 60, 14);
		contentPane.add(lblNascimentoAluno);

		lblCpfAluno = new JLabel("CPF");
		lblCpfAluno.setBounds(10, 117, 46, 14);
		contentPane.add(lblCpfAluno);

		lblMatriculaAluno = new JLabel("Matricula");
		lblMatriculaAluno.setBounds(10, 143, 46, 14);
		contentPane.add(lblMatriculaAluno);

		lblCadastroProfessor = new JLabel("Cadastro professor");
		lblCadastroProfessor.setBounds(268, 21, 98, 14);
		contentPane.add(lblCadastroProfessor);

		lblNomeProfessor = new JLabel("Nome");
		lblNomeProfessor.setBounds(268, 49, 46, 14);
		contentPane.add(lblNomeProfessor);

		lblNascimentoProfessor = new JLabel("Nascimento");
		lblNascimentoProfessor.setBounds(268, 80, 65, 14);
		contentPane.add(lblNascimentoProfessor);

		lblCpfProfessor = new JLabel("CPF");
		lblCpfProfessor.setBounds(268, 111, 26, 14);
		contentPane.add(lblCpfProfessor);

		lblSiapeProfessor = new JLabel("Siape");
		lblSiapeProfessor.setBounds(268, 142, 46, 14);
		contentPane.add(lblSiapeProfessor);

		btnCadastraProfessor = new JButton("Cadastrar professor");
		btnCadastraProfessor.setBounds(280, 181, 144, 23);
		btnCadastraProfessor.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String nome = textFieldNomeProfessor.getText();
				String cpf = textFieldCpfProfessor.getText();
				String nascimentoProf = textFieldNascimentoProfessor.getText();
				String siape = textFieldSiapeProfessor.getText();

				if (!nome.isEmpty()) {

					prof.setNome(nome);

				} else {
					JOptionPane.showMessageDialog(null, "Digite o nome do professor!");
				}

				if (!cpf.isEmpty()) {
					Long cpfProf = Long.valueOf(cpf);
					prof.setCpf(cpfProf);
				} else {
					JOptionPane.showMessageDialog(null, "Digite o CPF do professor!");
				}

				if (!siape.isEmpty()) {
					Long siapeProf = Long.valueOf(siape);
					prof.setSiape(siapeProf);
				} else {
					JOptionPane.showMessageDialog(null, "Digite o código siape do professor!");
				}

				if (!nascimentoProf.isEmpty()) {
					Date nacimento = new Date(nascimentoProf);
					prof.setDataNasc(nacimento);
				} else {
					JOptionPane.showMessageDialog(null, "Digite a data de nascimento do professor!!");
				}
				professores.add(prof);
				JOptionPane.showMessageDialog(null, "Professor cadastrado!");
				textFieldNomeProfessor.setText(null);
				textFieldCpfProfessor.setText(null);
				textFieldNascimentoProfessor.setText(null);
				textFieldSiapeProfessor.setText(null);
			}

		});
		contentPane.add(btnCadastraProfessor);

		textFieldNomeProfessor = new JTextField();
		textFieldNomeProfessor.setBounds(338, 46, 86, 20);
		contentPane.add(textFieldNomeProfessor);
		textFieldNomeProfessor.setColumns(10);

		textFieldNascimentoProfessor = new JTextField();
		textFieldNascimentoProfessor.setBounds(338, 77, 86, 20);
		contentPane.add(textFieldNascimentoProfessor);
		textFieldNascimentoProfessor.setColumns(10);

		textFieldCpfProfessor = new JTextField();
		textFieldCpfProfessor.setBounds(338, 108, 86, 20);
		contentPane.add(textFieldCpfProfessor);
		textFieldCpfProfessor.setColumns(10);

		textFieldSiapeProfessor = new JTextField();
		textFieldSiapeProfessor.setBounds(338, 139, 86, 20);
		contentPane.add(textFieldSiapeProfessor);
		textFieldSiapeProfessor.setColumns(10);

		btnConsultaAlunos = new JButton("Consultar alunos");
		btnConsultaAlunos.setBounds(43, 227, 144, 23);
		btnConsultaAlunos.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				JOptionPane.showMessageDialog(null, alunos.toString());
			}

		});

		contentPane.add(btnConsultaAlunos);

		btnConsultaProfessores = new JButton("Consultar professores");
		btnConsultaProfessores.setBounds(280, 227, 144, 23);

		btnConsultaProfessores.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, professores.toString());

			}

		});
		contentPane.add(btnConsultaProfessores);
	}

}