package formas;
import formas.app.Main;

public class Retangulo{
	private double altura;
	private double largura;

	public Retangulo(double altura, double largura){
		this.altura = altura;
		this.largura = largura;
	}

	public void setAltura(int a){
		altura = a;
	}
	
	public double getAltura(){
		return altura;
	}

	public void setLargura(int b){
		largura = b;
	}

	public double getLargura(){
		return largura;
	}

	public double calcularArea(){
		double area;
		area = (getAltura() * getLargura());
		return area;
	}

	public double calcularPerimetro(){
		double perimetro;
		perimetro = (getAltura() * 2) + (getLargura() * 2);
		return perimetro;		
	}

	public void aumentarDimensoes(int fator){
		double a = (getAltura() * fator);
		double l = (getLargura() * fator);
		
		System.out.print("As dimensoes do retangulo aumentadas por "+ fator +" Ficaram: Altura = "+ a +"\nLargura = "+ l);
	}
}