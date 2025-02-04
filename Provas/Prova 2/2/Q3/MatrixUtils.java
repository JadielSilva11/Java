public class MatrixUtils{
	public static int[][] transpose(int matriz[][]){
		int y = matriz.length;
		int x = matriz[0].length;
		int matTrans[][] = new int[x][y];

		for(int i=0;i<matriz.length;i++){
			for(int j=0;j<matriz[0].length;j++){
				matTrans[j][i] = matriz[i][j];
			}
		}
		return matTrans;
	}
}