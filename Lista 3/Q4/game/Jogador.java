package game;

public class Jogador{
	private String nome;
	private int pontos;

	public Jogador(String nome){
		this.nome = nome;
		this.pontos = 0; 
	}

	public void setNome(String a){
		nome = a;
	}

	public String getNome(){
		return nome;
	}

	public void setPontos(int b){
		pontos = b;
	}

	public int getPontos(){
		return pontos;
	}

	public void adicionarPontos(int pontos){
		System.out.println(nome +" seus pontos: "+ this.pontos);
		System.out.print("Voce ganhou " + pontos + " pontos\n");
		this.pontos += pontos;
	}

	public void removerPontos(int pontos){
		System.out.println(nome + " seus pontos: "+ this.pontos);
		System.out.print("Voce perdeu " + pontos + " pontos\n");
		this.pontos -= pontos;
	}

	public void exibirPontuacao(){
		System.out.println("Sua Pontuacao: "+ nome +" " + pontos);
	}

	public static String compararPontuacao(Jogador one, Jogador two){
		if(one.pontos > two.pontos)
		{
			return one.nome;
		}
		else
		{
			return two.nome;
		}
	}
}