public class Funcionario{
	protected String nome;
	protected int idade;
	protected double salarioBase;

	public Funcionario(String nome, int idade, double salarioBase){
		this.nome = nome;
		this.idade = idade;
		this.salarioBase = salarioBase;
	}

	protected double calcularSalario(){
		return salarioBase;
	}

	protected void exibirDetalhes(){
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Salario base: " + salarioBase);
	}
}