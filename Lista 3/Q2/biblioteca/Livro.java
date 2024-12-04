package biblioteca;

public class Livro{
	private String titulo;
	private String autor;
	private int numeroPaginas;

	public Livro(String titulo, String autor, int numeroPaginas){
		this.titulo = titulo;
		this.autor = autor;
		this.numeroPaginas = numeroPaginas;
	}

	public void setTitulo(String a){
		this.titulo = a;
	}

	public String getTitulo(){
		return titulo;
	}

	public void setAutor(String b){
		this.autor = b;
	}

	public String getAutor(){
		return autor;
	}

	public void setNumeroPaginas(int c){
		this.numeroPaginas = c;
	}

	public int getNumeroPaginas(){
		return numeroPaginas;
	}

	public void exibirInfo(){
		System.out.println("Titulo: "+ getTitulo());
		System.out.println("Autor: "+ getAutor());
		System.out.println("Numero de Paginas: "+ getNumeroPaginas());
	}

	public boolean verificarNumeroPaginas(int numero){
		boolean checker;
		if(numero > this.numeroPaginas)
		{
			checker = true;
		}
		else
		{
			checker = false;
		}
		return checker;
	}
}