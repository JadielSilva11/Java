import java.util.Scanner;
public class Q8 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int x;
        
        System.out.print("Digite um numero: ");
        x = scanner.nextInt();

        while(x != 1)
        {
            if(x % 2 == 0)
            {
                x = x / 2;
                System.out.printf("%d ->", x);
            }
            else
            {
                x = 3 * x + 1;
                System.out.printf("%d ->", x);
            }
        }

        scanner.close();
    }
}