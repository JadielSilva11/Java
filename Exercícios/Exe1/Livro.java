public class Livro extends Produto{
	public String autor;
	public String genero;
	public int numeroPaginas;

	public Livro(int id, String nome, double precoBase, String autor, String genero, int numeroPaginas){
		super(id, nome, precoBase);
		this.autor = autor;
		this.genero = genero;
		this.numeroPaginas = numeroPaginas;
	}

	@Override
	public double calcularPreco(){
		if(numeroPaginas > 300){
			return precoBase * 0.9;
		}
		else{
			return precoBase;
		}
	}

	@Override
	public void exibirDetalhes(){
		System.out.println("ID: " + id);
		System.out.println("NOME: " + nome);
		System.out.println("PRECO BASE: " + precoBase);
		System.out.println("AUTOR: " + autor);
		System.out.println("GENERO: " + genero);
		System.out.println("NUMERO DE PAGINAS: " + numeroPaginas);
	}
}