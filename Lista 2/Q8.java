import java.util.Scanner;
public class Q8{
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		int matriz_1[][] = new int[3][3];
		int matriz_2[][] = new int[3][3];
		int matriz_Diferenca[][] = new int[3][3];

		System.out.println("Digite os valores da primeira matriz 3x3: ");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				matriz_1[i][j] = scanner.nextInt();
			}
		}
	
		System.out.println("Agora digite os valores da segunda matriz 3x3: ");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				matriz_2[i][j] = scanner.nextInt();
			}
		}

		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				matriz_Diferenca[i][j] = matriz_1[i][j] - matriz_2[i][j];
			}
		}

		System.out.println("\nMatriz 1: ");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.printf("%d ", matriz_1[i][j]);
			}System.out.print("\n");
		}

		System.out.println("\nMatriz 2: ");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.printf("%d ", matriz_2[i][j]);
			}System.out.print("\n");
		}

		System.out.println("\nMatriz 3: (Diferenca entre as duas matrizes anteriores) ");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.printf("%d ", matriz_Diferenca[i][j]);
			}System.out.print("\n");
		}

		scanner.close();
	}
}