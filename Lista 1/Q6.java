import java.util.Scanner;
import java.util.Random;
public class Q6 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int ran = random.nextInt(100)+ 1;

        System.out.print("O programa ira sortear um numero entre 1 e 100. Tente adivinhar.\n>> ");

        int x;
        do
        {
            x = scanner.nextInt();
            if(x > ran)
            {
                System.out.println("Errou! O numero sorteado eh menor.");
            }
            else if(x < ran)
            {
                System.out.println("Errou! O numero sorteado eh maior");
            }
            else
            {
                System.out.println("Acertou!!");
            }
        }while(x != ran);
        
        scanner.close();
    }
}
