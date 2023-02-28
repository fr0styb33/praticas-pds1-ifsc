package q1;

import javax.swing.JOptionPane;

public class Q1 {

	public static void main(String[]args) {
		
		String precoLitro = JOptionPane.showInputDialog(null, "Valor do Preço por Litro:");
		String quantidadeLitros = JOptionPane.showInputDialog(null, "Quantidade em Litros:");
		
		// conversao de tipo String para Double e Integer
		
		Double precoL = Double.valueOf(precoLitro);
		Integer quantL = Integer.valueOf(quantidadeLitros);

		//chamando func
		totalPagamento(precoL, quantL);
	}
	//metodo que chama o preco e quant
	public static void totalPagamento(Double precoLitro, Integer quantidadeLitros) {
		
		//fazer o calculo(descobrir como faz SoS)
		
	}
	
}
