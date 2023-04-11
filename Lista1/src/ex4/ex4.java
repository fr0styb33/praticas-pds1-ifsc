package ex4;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import java.awt.Font;

public class ex4 extends JFrame {

	private JPanel contentPane;
	private JTextField txtFieldNumero2;
	private JTextField txtNumero1;
	private JLabel lblNumeroD;
	private JButton btnDivisao;
	private JButton btnMultiplicacao;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ex4 frame = new ex4();
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
	public ex4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.desktop);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		txtNumero1 = new JTextField();
		txtNumero1.setBounds(121, 85, 86, 20);
		contentPane.add(txtNumero1);
		txtNumero1.setColumns(10);

		txtFieldNumero2 = new JTextField();
		txtFieldNumero2.setBounds(121, 168, 86, 20);

		contentPane.add(txtFieldNumero2);
		System.out.println(txtFieldNumero2);
		txtFieldNumero2.setColumns(10);

		JLabel lblNumeroU = new JLabel("Primeiro número");
		lblNumeroU.setForeground(SystemColor.textHighlightText);
		lblNumeroU.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNumeroU.setBounds(10, 88, 141, 14);
		contentPane.add(lblNumeroU);

		lblNumeroD = new JLabel("Segundo número");
		lblNumeroD.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNumeroD.setForeground(SystemColor.textHighlightText);
		lblNumeroD.setBounds(10, 171, 161, 14);
		contentPane.add(lblNumeroD);

		JButton btnSoma = new JButton("+");
		btnSoma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Double numero1 = Double.parseDouble(txtNumero1.getText());
				Double numero2 = Double.parseDouble(txtFieldNumero2.getText());

				Double soma = (numero1 + numero2);

				JOptionPane.showMessageDialog(null, "Valor: " + soma);

			}
		});
		btnSoma.setBounds(251, 24, 89, 23);
		contentPane.add(btnSoma);

		JButton btnSubtracao = new JButton("-");
		btnSubtracao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double numero1 = Double.parseDouble(txtNumero1.getText());
				Double numero2 = Double.parseDouble(txtFieldNumero2.getText());

				Double subtracao = (numero1 - numero2);

				JOptionPane.showMessageDialog(null, "Valor: " + subtracao);

			}

		});

		btnSubtracao.setBounds(251, 74, 89, 23);
		contentPane.add(btnSubtracao);

		btnDivisao = new JButton("/");
		btnDivisao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double numero1 = Double.parseDouble(txtNumero1.getText());
				Double numero2 = Double.parseDouble(txtFieldNumero2.getText());

				Double divisao = (numero1 / numero2);

				JOptionPane.showMessageDialog(null, "Valor: " + divisao);

			}
		});
		btnDivisao.setBounds(251, 133, 89, 23);
		contentPane.add(btnDivisao);

		btnMultiplicacao = new JButton("*");
		btnMultiplicacao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double numero1 = Double.parseDouble(txtNumero1.getText());
				Double numero2 = Double.parseDouble(txtFieldNumero2.getText());

				Double multiplicacao = (numero1 * numero2);

				JOptionPane.showMessageDialog(null, "Valor: " + multiplicacao);

			
			}
		});
		btnMultiplicacao.setBounds(251, 193, 89, 23);
		contentPane.add(btnMultiplicacao);
	}
}