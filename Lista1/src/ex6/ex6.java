package ex6;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.SystemColor;

public class ex6 extends JFrame {

	private JPanel contentPane;
	private JTextField txtFieldNome;
	private JTextField txtN1;
	private JTextField txtN2;
	private JTextField txtN3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ex6 frame = new ex6();
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
	public ex6() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.info);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNome = new JLabel("Nome do aluno");
		lblNome.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		lblNome.setBounds(28, 41, 86, 39);
		contentPane.add(lblNome);

		JLabel lblCalculaMedia = new JLabel("Calculadora de média");
		lblCalculaMedia.setBounds(133, 11, 183, 28);
		lblCalculaMedia.setFont(new Font("Ciabatta SemiBold", Font.BOLD | Font.ITALIC, 18));
		contentPane.add(lblCalculaMedia);

		JLabel lblN1 = new JLabel("Nota 1: ");
		lblN1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblN1.setBounds(56, 91, 46, 14);
		contentPane.add(lblN1);

		JLabel lblN2 = new JLabel("Nota 2: ");
		lblN2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblN2.setBounds(56, 130, 46, 14);
		contentPane.add(lblN2);

		JLabel lblN3 = new JLabel("Nota 3: ");
		lblN3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblN3.setBounds(56, 169, 46, 14);
		contentPane.add(lblN3);

		txtFieldNome = new JTextField();
		txtFieldNome.setBounds(124, 50, 86, 20);
		contentPane.add(txtFieldNome);
		txtFieldNome.setColumns(10);

		txtN1 = new JTextField();
		txtN1.setBounds(124, 88, 86, 20);
		contentPane.add(txtN1);
		txtN1.setColumns(10);

		txtN2 = new JTextField();
		txtN2.setBounds(124, 127, 86, 20);
		contentPane.add(txtN2);
		txtN2.setColumns(10);

		txtN3 = new JTextField();
		txtN3.setBounds(124, 166, 86, 20);
		contentPane.add(txtN3);
		txtN3.setColumns(10);

		JButton btnCalc = new JButton("CALCULAR");
		btnCalc.setBounds(279, 93, 102, 36);

		btnCalc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double nota1 = Double.parseDouble(txtN1.getText());
				Double nota2 = Double.parseDouble(txtN2.getText());
				Double nota3 = Double.parseDouble(txtN3.getText());
				String nome = txtFieldNome.getText();


				JOptionPane.showMessageDialog(null, "ESTUDANTE: " + nome);
				 calculaMedia(nota1, nota2, nota3);

			}

		});

		contentPane.add(btnCalc);
	}

	public static void calculaMedia(Double nota1, Double nota2, Double nota3) {
		Double media = (nota1 + nota2 + nota3) / 3;

		JOptionPane.showMessageDialog(null, "Média final do aluno(a): " + media);
	}
}