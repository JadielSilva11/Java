class Pessoa{
	public String nome;
	public int idade;
	
	public Pessoa(String nome, int idade){
		this.nome = nome;
		this.idade = idade;
	}

	public void printInfo(){
		System.out.printf("Nome: %s, Idade: %d", nome, idade);
	}
}


public class Jadiel{
	public static void main(String[] args){
		Pessoa pessoa1 = new Pessoa("Obede", 20);
		pessoa1.printInfo();
		
	}
}
