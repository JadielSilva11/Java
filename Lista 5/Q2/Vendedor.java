public class Vendedor extends Funcionario{
	protected double comissao;
	
	public Vendedor(String nome, int idade, double salarioBase, double comissao){
		super(nome, idade, salarioBase);
		this.comissao = comissao;
	}

	public double getComissao(){
		return comissao;
	}

	protected double calcularSalario(){
		return salarioBase + comissao;
	}
	
	@Override
	protected void exibirDetalhes(){
		super.exibirDetalhes();
		System.out.println("Comissao: " + comissao);
	}
}