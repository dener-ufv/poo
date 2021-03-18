import java.util.Scanner;
import java.lang.Math;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        System.out.println("Digite N:");
        int n = fs.nextInt();
        System.out.println("Digite N numeros:");
        int min = 1000000;
        int max = -1000000;
        int mean = 0;
        int even = 0;
        int odd = 0;

        for(int i=0; i<n; i++) {
            int x = fs.nextInt();
            min = Math.min(min, x);
            max = Math.max(max, x);
            mean += x;
            if(x%2 == 0) even++;
            else odd++;
        }

        System.out.println("Menor: " + min + "\nMaior: " + max + "\nMedia: " + mean/(double)n + "\nQuantidade: " + n + "\nPares: " + even + "\nImpares: " + odd);
    }
}
