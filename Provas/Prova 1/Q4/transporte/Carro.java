public class Carro{
	private String modelo;
	private int numeroDeLugares;
	private double preco;

	public void setModelo(String a){
		modelo = a;
	}
	public String getModelo(){
		return modelo;
	}

	public void setNumerodelugares(int b){
		numeroDeLugares = b;
	}
	public int getNumeroDeLugares(){
		return numeroDeLugares;
	}
	
	public void setPreco(double c){
		preco = c;
	}
	public double getPreco(){
		return preco;
	}
}