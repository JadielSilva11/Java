public class Jogo extends Produto{
	public int idadeRecomendada;
	public String categoria;

	public Jogo(int id, String nome, double precoBase, int idadeRecomendada, String categoria){
		super(id, nome, precoBase);
		this.idadeRecomendada = idadeRecomendada;
		this.categoria = categoria;
	}

	@Override
	public double calcularPreco(){
		if(categoria.equals("eletronico")){
			return precoBase * 1.2;
		}
		else if(categoria.equals("tabuleiro")){
			return precoBase * 1.05;
		}
	}

	@Override
	public void exibirDetalhes(){
		System.out.println("ID: " + id);
		System.out.println("NOME: " + nome);
		System.out.println("PRECO BASE: " + precoBase);
		System.out.println("CATEGORIA: " + categoria);
		System.out.println("IDADE RECOMENDADA: " + idadeRecomendada);
	}
}