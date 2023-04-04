package ex2;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ex2 {

	public static void main (String[] args) {
		
		ArrayList<String> lista = new ArrayList<String>();
		
		for(int i = 0; i < 5; i++) {
			String valor = JOptionPane.showInputDialog("Digite os valores a serem colocados na lista: ");
			lista.add(valor);
		}
		JOptionPane.showMessageDialog(null, lista);
	}
}
