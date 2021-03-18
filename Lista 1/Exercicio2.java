import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        System.out.println("Digite os numeros A e B para ser feita a divisao A / B");
        Scanner fs = new Scanner(System.in);
        int A = fs.nextInt();
        int B = fs.nextInt();
        if(B == 0) {
            System.out.println("Impossivel dividir por 0");
        } else {
            System.out.println(A + " / " + B + " = " + A/(double)B);
        }
    }
}
