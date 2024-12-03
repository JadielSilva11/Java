public class Q5{
	public static void main(String args[]){
		int matriz[][] = {{10, 7, 13}, {56, 72, 2}};
		int soma=0;

		System.out.println("Matriz 2x3:");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.printf("%d ", matriz[i][j]);
				soma += matriz[i][j];
			}System.out.print("\n");
		}

		System.out.println("Soma de todos os numeros da matriz: "+soma);
	}
}