public class AppCalcular{
	public static void main(String args[]){
		Retangulo retangulo = new Retangulo(3, 4);
		Circulo circulo = new Circulo(5);

		System.out.println("Area do ratangulo: " + retangulo.calcularArea());
		System.out.println("Perimetro do retangulo: " + retangulo.calcularPerimetro());

		System.out.println("Area do circulo: " + circulo.calcularArea());
		System.out.println("Perimetro do circulo: " + circulo.calcularPerimetro());
	}
}