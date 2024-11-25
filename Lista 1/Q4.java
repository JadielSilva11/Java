import java.util.Scanner;
public class Q4 {
    public static void main(String args[]){
        double x, y, op;
        int opcao;

        Scanner scanner = new Scanner(System.in);

        System.out.println("\t\tCALCULADORA");
        System.out.printf("1 - Adicao\n2 - Subtracao\n3 - Multiplicacao\n4 - Divisao\n  >>Digite a operacao desejada: ");
        opcao = scanner.nextInt();

        System.out.print("Digite o primeiro numero: ");
        x = scanner.nextDouble();
        System.out.print("Digite o segundo numero: ");
        y = scanner.nextDouble();

        switch (opcao) {
            case 1:
                op = x + y;
                System.out.println("O resultado da soma dos dois numeros: "+ op);    
                break;
        
            case 2:
                op = x - y;
                System.out.println("O resultado da subtracao dos dois numeros: "+ op);
                break;

            case 3:
                op = x * y;
                System.out.println("O resultado da multiplicacao dos dois numeros: "+ op);
                break;

            case 4:
                op = x / y;
                System.out.println("O resultado da divisao dos dois numeros: "+ op);
                break;
               
            default:
                break;
        }

        scanner.close();
    }
}