package formas.app;
import formas.Retangulo;

public class Main{
	public static void main(String args[]){
		Retangulo obj = new Retangulo(5.0, 4.0);
		System.out.println("Area do retangulo = "+ obj.calcularArea());
		System.out.println("Perimetro do retangulo = "+ obj.calcularPerimetro());
		obj.aumentarDimensoes(5);
	}
}