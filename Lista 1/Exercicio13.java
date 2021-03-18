import java.util.Scanner;
import java.lang.Math;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        System.out.println("Digite o tempo em minutos para outras operadoras:");
        double outro = (double)fs.nextInt();
        System.out.println("Digite o tempo em minutos para Vai-Vai:");
        int vaivai = fs.nextInt();
        System.out.println("Digite o tempo em minutos para Telefine Fixo:");
        double fixo = (double)fs.nextInt();

        outro += fixo/2;

        double custo = 50;
        if(outro > 100) {
            custo += 0.65 * (outro - 100);
            custo += Math.max(0, 0.2 * (vaivai - 50));
        } else {
            double available = 150 - outro;
            custo += Math.max(0, 0.2 * (vaivai - available));
        }

        System.out.println("A conta tem custo: " + custo + " reais.");
    }
}
