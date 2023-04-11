package ex2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;

public class ex2 extends JFrame {

	private JPanel contentPane;
	private JTextField txtCadastro;
	private JTextField txtMaiorNum;
	private JTextField txtMenorNum;
	private ArrayList<Double> lista;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ex2 frame = new ex2();
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
	public ex2() {

		lista = new ArrayList<Double>();

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnCad = new JButton("Cadastrar");
		btnCad.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		btnCad.setBounds(156, 75, 99, 28);
		btnCad.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				String numerosStr = txtCadastro.getText();

				if (!numerosStr.isEmpty()) {
					Double numero = Double.valueOf(numerosStr);

					lista.add(numero);
					
					JOptionPane.showMessageDialog(null, "Numero cadastrado com sucesso!");
					txtCadastro.setText(null);
				} else {
					JOptionPane.showMessageDialog(null, "Por favor, insira um número!");

				}
			}

		});

		contentPane.add(btnCad);

		JButton btnExibir = new JButton("Exibir");
		btnExibir.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		btnExibir.setBounds(156, 120, 99, 28);
		btnExibir.addActionListener(new ActionListener() {


			public void actionPerformed(ActionEvent e) {
		
				
				// pega o menor valor existente dentro da lista
				Double min = Collections.min(lista);
				// pega o maior valor existente dentro da lista
				Double max = Collections.max(lista);
				
				txtMaiorNum.setText(max.toString());
				txtMenorNum.setText(min.toString());
			}
			
		});
		contentPane.add(btnExibir);

		txtCadastro = new JTextField();
		txtCadastro.setBounds(146, 45, 110, 20);
		contentPane.add(txtCadastro);
		txtCadastro.setColumns(10);

		txtMaiorNum = new JTextField();
		txtMaiorNum.setEditable(false);
		txtMaiorNum.setBounds(60, 188, 86, 20);
		contentPane.add(txtMaiorNum);
		txtMaiorNum.setColumns(10);

		txtMenorNum = new JTextField();
		txtMenorNum.setEditable(false);
		txtMenorNum.setBounds(282, 188, 86, 20);
		contentPane.add(txtMenorNum);
		txtMenorNum.setColumns(10);

		JLabel lblCadastroNumero = new JLabel("Cadaste um número");
		lblCadastroNumero.setFont(new Font("Ciabatta Bold", Font.BOLD | Font.ITALIC, 16));
		lblCadastroNumero.setBounds(129, 11, 154, 29);
		contentPane.add(lblCadastroNumero);

		JLabel lblMaiorNum = new JLabel("Maior número cadastrado");
		lblMaiorNum.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		lblMaiorNum.setBounds(24, 159, 154, 14);
		contentPane.add(lblMaiorNum);

		JLabel lblMenorNum = new JLabel("Menor número cadastrado");
		lblMenorNum.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		lblMenorNum.setBounds(238, 159, 154, 14);
		contentPane.add(lblMenorNum);
	}
}