import java.util.Scanner;
import java.lang.Math;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        System.out.println("Digite o primeiro horario (H M S):");
        int h1 = fs.nextInt();
        int m1 = fs.nextInt();
        int s1 = fs.nextInt();

        System.out.println("Digite o segundo horario (H M S):");
        int h2 = fs.nextInt();
        int m2 = fs.nextInt();
        int s2 = fs.nextInt();

        int time1 = s1 + 60*m1 + 60*60*h1;
        int time2 = s2 + 60*m2 + 60*60*h2;

        System.out.println("Diferenca em segundos eh " + Math.abs(time1 - time2));
    }
}
