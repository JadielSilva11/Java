public class Main{
	public static void main(String args[]){
		Livro livro = new Livro(1, "principeSigma", 35.0, "Jadiel", 			"Masculino", 350);

		System.out.println("Preco do livro: " + livro.calcularPreco());
		livro.exibirDetalhes();
	}
}