import java.util.Arrays;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Quantos numeros? ");
        int length = s.nextInt();
        int[] Array1 = new int[length];
        System.out.println("Que numeros? ");

        for (int i = 0; i < length; i++)
        {
            Array1[i] = s.nextInt();
        }
        Arrays.sort(Array1);
        System.out.println("Numeros de ordem crescente");
         // até agora so pus a funcionar por ordem crescente
        for (int i = 0; i < Array1.length; i++) {
            System.out.println(Array1[i]);
            // Array1(0) ira imprimir o primeiro numero tantas vezes quanto o numero no length, assim n ira funcionar
        }
    }
}