public class Main{
	public static void main(String args[]){
		int matriz[][] = {{1, 2, 3},
				  {4, 5, 6},
				  {7, 8, 9}};

		int vetor[] = MatrixUtils.FindMaxInEachColumn(matriz);
		
		System.out.println("Maiores valores de cada coluna da matriz: ");
		for(int i=0;i<vetor.length;i++){
			System.out.println("coluna " + i + ": " + vetor[i]);
		}
	}
}