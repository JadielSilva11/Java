public class Senha{
	public static void receberSenha(Usuario u1) throws SenhaInvalidaException{
		if(u1.getSenha() < 1000){
			throw new SenhaInvalidaException("Senha nao pode comecar com 0!!");
		}

		if(u1.getSenha() > 9999){
			throw new SenhaInvalidaException("A senha deve ter apenas 4 digitos!");
		}
	}	
}