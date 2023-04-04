package ex4;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ex4 extends JFrame {

	private JPanel contentPane;
	private JTextField txtNumD;
	private JButton btnSoma;
	private JButton btnMult;
	private JButton btnSub;
	private JButton btnDiv;

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
		contentPane = 	new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextField txtNumU = new JTextField();
		txtNumU.setBounds(106, 11, 86, 20);
		txtNumU.setBackground(new Color(255, 255, 255));
		contentPane.add(txtNumU);
		txtNumU.setColumns(10);
		
		txtNumD = new JTextField();
		txtNumD.setBounds(234, 11, 86, 20);
		contentPane.add(txtNumD);
		txtNumD.setColumns(10);
		
		btnSoma = new JButton("SOMA");
		btnSoma.setBounds(10, 42, 89, 23);
		contentPane.add(btnSoma);
		btnSoma.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e) {
			 
			 Double num1 = Double.parseDouble(txtNumU.getText());
			 Double num2 = Double.parseDouble(txtNumD.getText());
			 
			 Double soma = (num1 + num2);
			 
			 JOptionPane.showMessageDialog(null, "Valor: " +soma);
		 }	
		});
		 
		
		btnMult = new JButton("MULTIPLICAÇÃO");
		btnMult.setBounds(311, 42, 113, 23);
		contentPane.add(btnMult);
		btnMult.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e) {
			 
			 Double num1 = Double.parseDouble(txtNumU.getText());
			 Double num2 = Double.parseDouble(txtNumD.getText());
			 
			 Double mult = (num1 * num2);
			 
			 JOptionPane.showMessageDialog(null, "Valor: " +mult);
		 }
		});
		
		btnSub = new JButton("SUBTRAÇÃO");
		btnSub.setBounds(106, 42, 101, 23);
		contentPane.add(btnSub);
		btnSub.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e) {
			 
			 Double num1 = Double.parseDouble(txtNumU.getText());
			 Double num2 = Double.parseDouble(txtNumD.getText());
			 
			 Double sub = (num1 - num2);
			 
			 JOptionPane.showMessageDialog(null, "Valor: " +sub);
		 }
		});
		
		btnDiv = new JButton("DIVISÃO");
		btnDiv.setBounds(217, 42, 89, 23);
		contentPane.add(btnDiv);
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			Double num1 = Double.parseDouble(txtNumU.getText());
			Double num2 = Double.parseDouble(txtNumD.getText());
			
			Double div = (num1 / num2);
			
			JOptionPane.showMessageDialog(null, "Valor: "+div);
			
			}
		});
		
	}

}
