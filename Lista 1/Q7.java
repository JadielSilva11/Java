import java.util.Scanner;
public class Q7 {
    public static void main(String args[]){
        Scanner scanner  = new Scanner(System.in);
        int x, aux, y=0;

        System.out.print("Digite um numero inteiro de 5 digitos: ");
        x = scanner.nextInt();

        aux = x;

        while(x != 0)
        {
            y = y * 10 + (x % 10);
            x = x / 10;
        }

        x = aux;

        if(y == x)
        {
            System.out.println("O numero digitado eh um palindromo!");
        }
        else
        {
            System.out.println("O numero digitado nao eh um palindromo!");
        }
        scanner.close();
    }
}
