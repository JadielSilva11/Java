public class Main{
	public static void main(String args[]){
		Filme f1 = new Filme(" ", -5);
		
		try{
			if(f1.getNome().isEmpty()){
				throw new FilmeInvalidoException("O nome nao pode ser vazio!");
			}
			if(f1.getAno() < 0){
				throw new AnoInvalidoException("O ano nao pode ser negativo");
			}
			System.out.println(f1.imprimeDetalhes());
		}
		catch(FilmeInvalidoException e){
			System.out.println(e);
		}
		catch(AnoInvalidoException e){
			System.out.println(e);
		}
	}
}