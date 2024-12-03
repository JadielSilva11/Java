import java.util.Scanner;
public class Q2{
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		int vetor[] = new int[10];
		int cont=0;		

		for(int i=0;i<10;i++)
		{
			vetor[i] = scanner.nextInt();
			if(vetor[i]%2==0)
			{
				cont++;
			}
		}

		System.out.println("Total de numeros pares: "+cont);
	}
}