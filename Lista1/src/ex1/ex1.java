package ex1;

import javax.swing.JOptionPane;

public class ex1 {

	public static void main(String[] args) {
		
		String precoL = JOptionPane.showInputDialog("Digite o preço (por litro): ");
		Double precoLitro = 0.0;
		String quantL = JOptionPane.showInputDialog("Digite a quantidade (por litro): ");
		Integer quantidadeLitros = 0;

		if(precoL.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Insira algum valor!");
		}
		else {
			precoLitro = Double.valueOf(precoL);
		}
		if(quantL.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Insira algum valor!");
		}
		else {
			quantidadeLitros = Integer.valueOf(quantL);
	
		}
		
		totalPagamento(precoLitro, quantidadeLitros);
	}
	
		public static void totalPagamento(Double precoLitro, Integer quantidadeLitros) {
		  double calculo = precoLitro * quantidadeLitros;
		  	JOptionPane.showMessageDialog(null,"Valor total do pagamento: " + calculo);
		  	

	    }

   }
