import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x, y, z;

        System.out.println("Digite a idade da primeira pessoa: ");
        x = scanner.nextInt();
        System.out.println("Digite a idade da segunda pessoa: ");
        y = scanner.nextInt();
        System.out.println("Digite a idade da terceira pessoa: ");
        z = scanner.nextInt();

        if(x > y && x > z)
        {
            System.out.println("A primeira pessoa e a mais velha!!");

            if(y > z)
            {
                System.out.println("A terceira pessoa e a mais nova!!");
            }
            else
            {
                System.out.println("A segunda pessoa e a mais nova!!");
            }
        }
        else if(y > x && y > z)
        {
            System.out.println("A segunda pessoa e a mais velha!!");

            if(x > z)
            {
                System.out.println("A terceira pessoa e a mais nova!!");
            }
            else
            {
                System.out.println("A primeira pessoa e a mais nova!!");
            }
        }
        else if(z > x && z > y)
        {
            System.out.println("A terceira pessoa e a mais velha!!");

            if(y > x)
            {
                System.out.println("A primeira  pessoa e a mais nova!!");
            }
            else
            {
                System.out.println("A segunda pessoa e a mais nova!!");
            }
        }

        scanner.close();
    }
}
