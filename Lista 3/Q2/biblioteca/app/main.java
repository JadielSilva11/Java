package biblioteca.app;
import biblioteca.Livro;

public class Main{
	public static void main(String args[]){
		Livro obj = new Livro("Macacos", "Jadiel", 10);
		obj.exibirInfo();
		obj.setTitulo("Jumentos");
		obj.setAutor("Juvenildo");
		obj.setNumeroPaginas(25);
		obj.exibirInfo();
		System.out.println("50 paginas "+ obj.verificarNumeroPaginas(50));
		System.out.println("15 paginas "+ obj.verificarNumeroPaginas(15));
	}
}