import java.util.Scanner;
public class Q2 {
    public static void main(String args[]){
            Scanner scanner = new Scanner(System.in);
            double x[] = new double[4];
            double media = 0;
            for(int i=0;i<4;i++)
            {
                System.out.println("Digite a nota "+ (i + 1));
                x[i] = scanner.nextDouble();
                media += x[i];
            }

            media /= 4;
            
            if(media >= 7)
            {
                System.out.println("Aprovado!!");
                System.out.println("Sua media: "+ media);
            }
            else if(media < 7 && media >= 5)
            {
                System.out.println("Voce esta de racuperacao!!");
                System.out.println("Sua media: "+ media);
            }
            else if(media < 5)
            {
                System.out.println("Voce esta reprovado!!");
                System.out.println("Sua media: "+media);
            }

            scanner.close();
    }
}
