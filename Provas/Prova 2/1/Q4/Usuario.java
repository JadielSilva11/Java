public class Usuario{
	private int senha;
	private String nome;

	public Usuario(){
		this.senha = 0;
		this.nome = " ";
	}

	public void setSenha(int senha){
		this.senha = senha;
	}
	public int getSenha(){
		return senha;
	}

	public void setNome(String nome){
		this.nome = nome;
	}
	public String getNome(){
		return nome;
	}
}