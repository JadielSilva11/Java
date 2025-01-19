package game.app;
import game.Jogador;

public class Principal{
	public static void main(String args[]){
		Jogador jog1 = new Jogador("Jadiel");
		Jogador jog2 = new Jogador("Palote");

		jog1.adicionarPontos(10);
		jog2.adicionarPontos(5);

		jog1.removerPontos(4);
		jog2.removerPontos(2);

		jog1.exibirPontuacao();
		jog2.exibirPontuacao();

		String vencedor = Jogador.compararPontuacao(jog1, jog2);
		System.out.println("Vencedor: "+ vencedor);
	}
}