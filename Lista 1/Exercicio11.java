import java.lang.Math;
import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        System.out.println("Tente acertar o numero entre 1 e 100. (Dica: nao precisa de mais de 7 tentativas)");
        int ans = (int)(Math.random() * 99 + 1);

        int t=0;
        while(true) {
            int n = fs.nextInt();
            t++;
            if(n < ans) System.out.println("eh MAIOR que isso");
            else if(n > ans) System.out.println("eh MENOR que isso");
            else {
                System.out.println("ACERTOU !!\n" + t + " tentativas.");
                break;
            }
        }
    }
}
