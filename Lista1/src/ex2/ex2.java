package ex2;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ex2 {

		public static void main(String[] args) {
			ArrayList<String> lista = new ArrayList<String>();

			for (int i = 0; i < 5; i++) {
				String valorL = JOptionPane.showInputDialog("Digite o que será adicionado: ");

				lista.add(valorL);

			}
			JOptionPane.showMessageDialog(null, lista);
		}
}
