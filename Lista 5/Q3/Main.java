public class Main{
	public static void main(String args[]){
		Solido cubo = new Cubo(3);
		Solido cilindro = new Cilindro(2, 5);

		System.out.println("Volume do cubo: " + cubo.calcularVolume());
		System.out.println("Volume do cilindro: " + cilindro.calcularVolume());
	}
}