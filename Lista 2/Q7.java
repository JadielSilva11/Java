import java.util.Scanner;
public class Q7{
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		int matriz_1[][] = {{6, 5, 10} , {5, 1, 11} , {10, 11, 8}};
		int matriz_2[][] = {{3, 5, 5} , {6, 10, 9} , {11, 6, 18}};
		int cont=0, op;

		System.out.println("Matriz 1:");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.printf("%d ", matriz_1[i][j]);
			}System.out.print("\n");
		}
		
		System.out.print("\n");
		System.out.println("Matriz 2:");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.printf("%d ", matriz_2[i][j]);
			}System.out.print("\n");
		}

		System.out.println("\nSelecione a matriz que desea verificar:\n1 - Matriz 1\n2 - Matriz 2\n");
		op = scanner.nextInt();
		if(op ==1)
		{
			for(int i=0;i<3;i++)
			{
				for(int j=0;j<3;j++)
				{
					if(matriz_1[i][j] == matriz_1[j][i])
					{
						cont++;
					}
				}
			}

			if(cont == 9)
			{
				System.out.println("A matriz escolhida eh simetrica!");
			}
			else
			{
				System.out.println("A matriz escolhida nao eh simetrica!");
			}
		}
		else
		{
			for(int i=0;i<3;i++)
			{
				for(int j=0;j<3;j++)
				{
					if(matriz_2[i][j] == matriz_2[j][i])
					{
						cont++;
					}
				}
			}

			if(cont == 9)
			{
				System.out.println("A matriz escolhida eh simetrica!");
			}
			else
			{
				System.out.println("A matriz escolhida nao eh simetrica!");
			}
		}
		scanner.close();
	}
}