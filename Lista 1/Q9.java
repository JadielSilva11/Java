import java.util.Scanner;
public class Q9 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int x;

        System.out.print("Digite um dia da semana de 1 a 7: ");
        x = scanner.nextInt();

        if(x == 2)
        {
            System.out.println("O numero 2 eh segunda-feira!\nE eh um dia util.");
        }
        else if(x == 3)
        {
            System.out.println("O numero 3 eh terca-feira!\nE eh um dia util.");
        }
        else if(x == 4)
        {
            System.out.println("O numero 4 eh quarta-feira\nE eh um dua util.");
        }
        else if(x == 5)
        {
            System.out.println("O numero 5 eh quinta-feira\nE eh um dia util.");
        }
        else if(x == 6)
        {
            System.out.println("O numero 6 eh sexta-feira\nE eh um dia util.");
        }
        else if(x == 1)
        {
            System.out.println("O numero 1 eh domingo\nE eh fim de semana.");
        }
        else        
        {
            System.out.println("O numero 7 eh sabado\nE eh fim de semana.");
        }
        scanner.close();
    }
}
