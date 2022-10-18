import java.util.Scanner;

public class Exercicio1
{
    public static void main(String[] args)
    {
        Scanner vetor = new Scanner(System.in);
        System.out.print("Quantos numeros: ");
        int[] y  = new int[vetor.nextInt()];
        vetor.nextLine();
        double media = 0;
        for (int i = 0; i < y.length; i++)
        {
            y[i] = vetor.nextInt();
            media = media + y[i];
        }
        media= media / y.length;
        System.out.println("Media "+ media);
    }
}
