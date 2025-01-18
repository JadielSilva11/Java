public class Retangulo extends FiguraGeometrica{
	public double altura;
	public double largura;
	
	public Retangulo(double altura, double largura){
		this.altura = altura;
		this.largura = largura;
	}

	public double calcularArea(){
		return altura * largura;
	}

	public double calcularPerimetro(){
		return 2 * (largura + altura);
	}
}