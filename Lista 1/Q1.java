import java.util.Scanner;
public class Q1{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int x;
        double y;
        x = scanner.nextInt();
        y = scanner.nextDouble();

        System.out.println("Soma como Double: "+ (x + y));
        System.out.println("Soma como Inteiro: "+ (int) (x + y));

        scanner.close();
    }
}