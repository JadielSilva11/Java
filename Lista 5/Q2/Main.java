public class Main{
	public static void main(String args[]){

		Gerente f1 = new Gerente("Jadiel", 18, 2000.00, "Gerencia");
		Vendedor f2 = new Vendedor("Danilo", 20, 1500.00, 200.00);

		System.out.println("Departamento do gerente: " + f1.getDepartamento());
		System.out.println("Comissao do funcionario: " + f2.getComissao());
	
		f1.exibirDetalhes();
		f2.exibirDetalhes();
	}
}