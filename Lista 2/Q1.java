import java.util.Scanner;
public class Q1{
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		int vetor[] = new int[5];
		int soma=0;
		
		for(int i=0;i<5;i++)
		{
			vetor[i] = scanner.nextInt();
			soma += vetor[i];
		}

		System.out.println("A soma de todos os numeros do vetor: "+soma);
	}
}