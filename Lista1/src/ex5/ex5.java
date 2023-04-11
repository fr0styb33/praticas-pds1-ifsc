package ex5;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;
import javax.swing.JButton;

public class ex5 extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldL1;
	private JTextField textFieldL2;
	private JTextField textFieldL3;
	private JLabel lblL1;
	private JLabel lblL2;
	private JLabel lblL3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ex5 frame = new ex5();
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
	public ex5() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.desktop);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		textFieldL3 = new JTextField();
		textFieldL3.setBounds(175, 160, 86, 20);
		contentPane.add(textFieldL3);
		textFieldL3.setColumns(10);

		textFieldL2 = new JTextField();
		textFieldL2.setBounds(175, 108, 86, 20);
		contentPane.add(textFieldL2);
		textFieldL2.setColumns(10);

		textFieldL1 = new JTextField();
		textFieldL1.setBounds(175, 50, 86, 20);
		contentPane.add(textFieldL1);
		textFieldL1.setColumns(10);

		JLabel lblVerificaTriangulo = new JLabel("Verificador de tipo de triângulo");
		lblVerificaTriangulo.setForeground(SystemColor.textHighlightText);
		lblVerificaTriangulo.setFont(new Font("Ciabatta Bold", Font.BOLD | Font.ITALIC, 15));
		lblVerificaTriangulo.setBounds(100, 11, 254, 28);
		contentPane.add(lblVerificaTriangulo);

		lblL1 = new JLabel("Medida do lado 1");
		lblL1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblL1.setBounds(61, 53, 104, 14);
		contentPane.add(lblL1);

		lblL2 = new JLabel("Medida do lado 2");
		lblL2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblL2.setBounds(61, 111, 104, 14);
		contentPane.add(lblL2);

		lblL3 = new JLabel("Medida do lado 3 ");
		lblL3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblL3.setBounds(61, 163, 104, 14);
		contentPane.add(lblL3);

		JButton btnResul = new JButton("Verificar");
		btnResul.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				Double medida1 = Double.parseDouble(textFieldL1.getText());
				Double medida2 = Double.parseDouble(textFieldL2.getText());
				Double medida3 = Double.parseDouble(textFieldL3.getText());
				
				 

				if (Double.compare(medida1, medida2) == 0 && Double.compare(medida1, medida3) == 0
						&& Double.compare(medida2, medida3) == 0) {
					JOptionPane.showMessageDialog(null, "Triângulo equilátero!");
				} else if (Double.compare(medida1, medida2) == 0 || Double.compare(medida1, medida3) == 0
						|| Double.compare(medida2, medida3) == 0 || Double.compare(medida3, medida2) == 0) {
					JOptionPane.showMessageDialog(null, "Triângulo isósceles!");
				
				} else {
					JOptionPane.showMessageDialog(null, "Triângulo escaleno!");

				}

			}

		});
		btnResul.setBounds(308, 125, 89, 23);

		contentPane.add(btnResul);
	}
}