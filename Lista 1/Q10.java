import java.util.Scanner;
public class Q10 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int x, fatorial=1;

        System.out.print("Digite um numero: ");
        x = scanner.nextInt();
        
        System.out.printf("%d! = ", x);
        while(x >= 1)
        {
            System.out.printf("%d * ", x);
            fatorial = fatorial * x;
            x--;
        }
        System.out.printf(" = %d", fatorial);

        scanner.close();
    }
}
