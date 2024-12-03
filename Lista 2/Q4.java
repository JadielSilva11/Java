public class Q4{
	public static void main(String args[]){
		int a1[] = {1, 3, 5, 7, 9};
		int a2[] = {2, 4, 6, 8, 10};
		int a3[] = new int[10];
		int j=0;

		for(int i=0;i<10;i++)
		{
			a3[i] = a1[j];
			i++;
			a3[i] = a2[j];
			j++;
		}
		System.out.print("Array 1: ");
		for(int i=0;i<5;i++)
		{
			System.out.printf("%d ", a1[i]);
		}

		System.out.print("\nArray 2: ");
		for(int i=0;i<5;i++)
		{
			System.out.printf("%d ", a2[i]);
		}
		
		System.out.print("\nArray 3: ");
		for(int i=0;i<10;i++)
		{
			System.out.printf("%d ", a3[i]);
		}
	}
}