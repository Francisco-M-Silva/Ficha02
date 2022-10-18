import java.util.Arrays;

public class Exercicio3
{
    public static void main(String[] args)
    {
        int n = 6;
        String nomes[] = { " João "," Teresa "," Pedro "," Maria "," Paulo "," Beatriz " };
        Arrays.sort(nomes);
        System.out.println("Nomes por ordem alfabetica: ");
        for (int i = 0; i < n; i++)
        {
            System.out.print("|" + nomes[i] + "|");
        }
    }
}