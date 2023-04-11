package ex3;

import javax.swing.JOptionPane;

public class ex3 {

		public static void main(String[] args) {

			String notaU = JOptionPane.showInputDialog("Digite a primeira nota");
			String notaD = JOptionPane.showInputDialog("Digite a segunda nota");
			String notaT = JOptionPane.showInputDialog("Digite a terceira nota");

			Double nota1 = 0.0;
			Double nota2 = 0.0;
			Double nota3 = 0.0;

			nota1 = Double.valueOf(notaU);

			nota2 = Double.valueOf(notaD);

			nota3 = Double.valueOf(notaT);

			calcMedia(nota1, nota2, nota3);

		}

		public static void calcMedia(Double nota1, Double nota2, Double nota3) {
			Double mediaFinal = (nota1 + nota2 + nota3) / 3;

			if (mediaFinal >= 6) {
				JOptionPane.showMessageDialog(null, "Aluno aprovado! Média: " + mediaFinal);
			}

			if (mediaFinal >= 4 && mediaFinal < 6) {
				JOptionPane.showMessageDialog(null, "Aluno de recuperação! Média: " + mediaFinal);
			}

			if (mediaFinal < 4) {
				JOptionPane.showMessageDialog(null, "Aluno reprovado! Média: " + mediaFinal);
			}
		}

	}
