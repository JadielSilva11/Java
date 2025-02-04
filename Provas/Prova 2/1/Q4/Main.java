import java.util.Scanner;
public class Main{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		Usuario u1 = new Usuario();
		
		try{
			System.out.println("digite seu nome: ");
			u1.setNome(scan.nextLine());
			if(u1.getNome().isEmpty()){
				throw new NomeInvalidoException("Nome nao pode estar vazio!!");
			}
			System.out.println("Nome cadastrado.");

			System.out.println("Digite sua senha: (Precisa ter 4 digitos)");
			u1.setSenha(scan.nextInt());
			Senha.receberSenha(u1);
			System.out.println("Senha salva.");
		}
		catch(NomeInvalidoException e){
			System.out.println(e.getMessage());
		}
		catch(SenhaInvalidaException e){
			System.out.println(e.getMessage());
		}
	}
}