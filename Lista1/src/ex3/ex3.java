package ex3;

import javax.swing.JOptionPane;

public class ex3 {

	public static void main (String[] args) {
	
		String nota1 = JOptionPane.showInputDialog("Digite a primeira nota: ");
		String nota2 = JOptionPane.showInputDialog("Digite a segunda nota: ");
		String nota3 = JOptionPane.showInputDialog("Digite a terceira nota: ");
		
		Double notaU = 0.0;
		Double notaD = 0.0;
		Double notaT = 0.0;

		notaU = Double.valueOf(nota1);
		notaD = Double.valueOf(nota2);
		notaT = Double.valueOf(nota3);
		
		calculaMF (notaU, notaD, notaT);
		
	}
	public static void calculaMF (Double notaU, Double notaD, Double notaT) {
		
		Double MF =(notaU + notaD + notaT) / 3;
		
		if(MF >= 6) {
			JOptionPane.showMessageDialog(null, "Aprovado(a)! \n Média: " +MF);
		}
		   if(MF >= 4 && MF < 6) {
			JOptionPane.showMessageDialog(null, "Recuperação! \n Média: " +MF);
		   }
		     if(MF < 4) {
			  JOptionPane.showMessageDialog(null, "Reprovado! \n Média: " +MF);
		      }
	}
}
