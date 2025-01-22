public class Gerente extends Funcionario{
	protected String departamento;

	public Gerente(String nome, int idade, double salarioBase, String departamento){
		super(nome, idade, salarioBase);
		this.departamento = departamento;
	}

	public String getDepartamento(){
		return departamento;
	}

	protected double calcularSalario(){
		return salarioBase += salarioBase * 0.2;
	}

	@Override
	protected void exibirDetalhes(){
		super.exibirDetalhes();
		System.out.println("Departamento: " + departamento);
	}
}