public class Main{
	public static void main(String args[]){
		Produto produto = new Produto("celular", 100, 400.0);

		produto.adicionarEstoque(10);
		produto.vender(5);
		System.out.println(produto.calcularValorEstoque());
	}
}