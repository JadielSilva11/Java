public class Produto{
	public String nome;
	public int quantidade;
	public double preco;

	public Produto(String nome, int quantidade, double preco){
		this.nome = nome;
		this.quantidade = quantidade;
		this.preco = preco;
	}

	public void adicionarEstoque(int quantidade){
		this.quantidade += quantidade;
	}

	public void vender(int quantidade){
		this.quantidade -= quantidade;
	}

	public double calcularValorEstoque(){
		return this.quantidade * this.preco;
	}
}