public abstract class Produto{
	public int id;
	public String nome;
	public double precoBase;

	public Produto(int id, String nome, double precoBase){
		this.id = id;
		this.nome = nome;
		this.precoBase = precoBase;	
	}

	public abstract double calcularPreco();
	public abstract void exibirDetalhes();
}