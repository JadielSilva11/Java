public class Cubo implements Solido{
	public double lado;

	public Cubo(double lado){
		this.lado = lado;
	}

	@Override
	public double calcularVolume(){
		return Math.pow(lado, 3);
	}
}