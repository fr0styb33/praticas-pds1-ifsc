package ex1;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;

public class ex1 extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldDesativado;
	private JTextField textAtivado;
	private JButton btnCadastrar;
	private JButton btnExibir;
	private ArrayList<Double> listaNumeros;
	private int contapar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ex1 frame = new ex1();
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
	public ex1() {
		// instanciando arraylist
		listaNumeros = new ArrayList<Double>();
		contapar = 0;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		textAtivado = new JTextField();
		textAtivado.setBounds(174, 10, 109, 20);
		contentPane.add(textAtivado);
		textAtivado.setColumns(10);

		textFieldDesativado = new JTextField();
		textFieldDesativado.setEnabled(false);
		textFieldDesativado.setBounds(175, 74, 108, 20);
		contentPane.add(textFieldDesativado);
		textFieldDesativado.setColumns(10);

		JLabel lblCadastro = new JLabel("Cadastro de número");
		lblCadastro.setBounds(10, 13, 108, 14);
		contentPane.add(lblCadastro);

		JLabel lblResultado = new JLabel("Quantidade de números pares");
		lblResultado.setBounds(10, 76, 155, 17);
		contentPane.add(lblResultado);

		btnCadastrar = new JButton("CADASTRAR");
		btnCadastrar.setBounds(41, 151, 118, 33);

		btnCadastrar.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				String numerosStr = textAtivado.getText();

				if (!numerosStr.isEmpty()) {
					Double numeros = Double.valueOf(numerosStr);

					listaNumeros.add(numeros);
					JOptionPane.showMessageDialog(null, "Numero cadastrado!");
				} else {
					JOptionPane.showMessageDialog(null, "Por favor, digite um número para poder cadastrá-lo!");
				}

			}

		});
		contentPane.add(btnCadastrar);

		btnExibir = new JButton("EXIBIR");
		btnExibir.setBounds(234, 151, 118, 33);
		btnExibir.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				String numeroStr = textAtivado.getText();

				Double numeros = Double.valueOf(numeroStr);

				for (Double teste : listaNumeros) {
					System.out.println(teste);
					
					if (teste % 2 == 0) {
						contapar++;

					}	
				}
				
				textFieldDesativado.setText(String.valueOf(contapar));
			}

		});
		contentPane.add(btnExibir);
	}

}
