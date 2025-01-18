public class Revista extends Produto{
	public double edicao;
	public String periodicidade;

	public Revista(int id, String nome, double precoBase, double edicao, String periodicidade){
		super(id, nome, precoBase);
		this.edicao = edicao;
		this.periodicidade = periodicidade;
	}

	@Override
	public double calcularPreco(){
		if(periodicidade.equals("mensal")){
			return precoBase * 1.15;
		}
		if(edicao.equals("especial")){
			return precoBase * 1.25;
		}
	}

	@Override
	public void exibirDetalhes(){
		System.out.println("ID: " + id);
		System.out.println("NOME: " + nome);
		System.out.println("PRECO BASE: " + precoBase);
		System.out.println("EDICAO: " + edicao);
		System.out.println("PERIODICIDADE: " + periodicidade);

	}
}