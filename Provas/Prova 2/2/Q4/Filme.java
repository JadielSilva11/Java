public class Filme{
	private String nome;
	private int ano;

	public Filme(String nome, int ano){
		this.nome = nome;
		this.ano = ano;
	}

	public String getNome(){
		return nome;
	}
	
	public int getAno(){
		return ano;
	}
	
	public String imprimeDetalhes(){
		return "Filme: " + nome + " Ano: " + ano;
	}
}