public class MatrixUtils{
	public static int[] FindMaxInEachColumn(int matriz[][]){
		int maior;
		int vetor[] = new int[matriz[0].length];

		for(int j=0;j<matriz[0].length;j++){
			maior = 0;

			for(int i=0;i<matriz.length;i++){
				if(matriz[i][j] > maior){
					maior = matriz[i][j];
				}
			}
			vetor[j] = maior;
		}
		
		return vetor;
	}
}