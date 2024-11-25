import java.util.Scanner;
public class Q5 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int n;

        System.out.print("Digite um numero: ");
        n = scanner.nextInt();

        System.out.printf("Numeros pares entre 1 e %d: ",n);
        for(int i=0;i<n;i++)
        {
            if(i % 2 == 0)
            {
                System.out.printf("%d ", i);
            }
        }

        System.out.printf("\nNumeros impares entre 1 e %d: ",n);
        for(int i=0;i<n;i++)
        {
            if(i % 2 != 0)
            {
                System.out.printf("%d ", i);
            }
        }

        scanner.close();
    }
}
