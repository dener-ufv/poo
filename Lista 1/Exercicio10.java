import java.util.Scanner;

import javax.print.event.PrintEvent;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        System.out.println("calculadora:");
        String s1 = fs.next();
        int s2 = fs.nextInt();
        String s3 = fs.next();
        int s4 = fs.nextInt();

        int ans;
        if(s1.equals("MULTIPLICA")) {
            ans = s2 * s4;
        } else if(s1.equals("DIVIDE")) {
            if(s4 == 0) {
                System.out.println("Impossivel dividir por 0");
                return;
            }
            ans = s2 / s4;
        } else if(s1.equals("SOMA")) {
            ans = s2 + s4; 
        } else {
            ans = s2 - s4;
        }

        System.out.println(ans);
    }
}
