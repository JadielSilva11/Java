public class Exe4{
	public static void main(String args[]){
		double operandoA = 3;
		double operandoB = 42;

		boolean diferenca = operandoA != operandoB;
		boolean maiorQue = operandoA > operandoB;
		boolean menorIgual = operandoA <= operandoB;

		System.out.println("Operacoes com os numeros 3 e 42.");
		System.out.println("Diferença: "+ diferenca);
		System.out.println("Maior que: "+ maiorQue);
		System.out.println("Menor igual: "+ menorIgual); 
	}
}