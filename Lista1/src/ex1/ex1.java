package ex1;

import javax.swing.JOptionPane;

public class ex1 {

	public static void main(String[] args) {
		String precoS = JOptionPane.showInputDialog("Digite o preço por litro");
		String quantidadeLitroS = JOptionPane.showInputDialog("Digite a quantidade por litro ");
		Double precoLitro = 0.0;
		Integer quantidadeLitro = 0;

		if (precoS.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Insira um valor!");

		} else {
			precoLitro = Double.valueOf(precoS);
		}

		if (quantidadeLitroS.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Insira um valor!");

		} else {
			quantidadeLitro = Integer.valueOf(quantidadeLitroS);

		}

		totalPagamento(precoLitro, quantidadeLitro);
	}

	public static void totalPagamento(Double precoLitro, Integer quantidadeLitro) {

		double calc = precoLitro * quantidadeLitro;

		JOptionPane.showMessageDialog(null, "Valor total do pagamento" + calc);
	}
	
}
