public class Main{
	public static void main(String args[]){
		int matriz[][] = {{1, 2, 3},
				 {3, 2, 1}};

		int transpose[][] = MatrixUtils.transpose(matriz);
		
		System.out.println("Matriz original:");
		for(int i=0;i<matriz.length;i++){
			for(int j=0;j<matriz[0].length;j++){
				System.out.print(matriz[i][j] + " ");
			}System.out.println();
		}


		System.out.println("Matriz transposta:");
		for(int i=0;i<transpose.length;i++){
			for(int j=0;j<transpose[0].length;j++){
				System.out.print(transpose[i][j] + " ");
			}System.out.println();
		}
		
	}
}