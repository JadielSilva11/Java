public class Cilindro implements Solido{
	public double raio;
	public double altura;

	public Cilindro(double raio, double altura){
		this.raio = raio;
		this.altura = altura;
	}

	@Override
	public double calcularVolume(){
		return Math.PI * Math.pow(raio, 2) * altura;
	}
}