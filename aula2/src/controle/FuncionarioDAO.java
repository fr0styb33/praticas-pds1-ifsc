package controle;

 import java.util.ArrayList;
 
 import modelo.Funcionario;

public class FuncionarioDAO {

	private static ArrayList<modelo.Funcionario> listaFuncionarios;
	
	 public boolean inserir(Funcionario func) {
		 
		 listaFuncionarios.add(func);
		 return false;
	 }
	 
	  public static ArrayList<Funcionario> listar() {
		return listaFuncionarios;
		 
	  }
}
