import java.util.StringTokenizer;

public class ContadorPalavra{
	public static String word;

	public static int contador(){
		StringTokenizer tokenizer = new StringTokenizer(word);
		return tokenizer.countTokens();
	}
	
	public static void main(String args[]){
		word = "Olá, meu nome e Jadiel e estou cursando sistemas de informação na UFC";

		int numPalavras = contador();
		System.out.println("Numero de palavras da String word: "+ numPalavras);
	}	
}