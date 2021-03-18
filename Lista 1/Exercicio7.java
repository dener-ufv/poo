import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        System.out.println("Digite N:");
        int n = fs.nextInt();

        System.out.println("Digite N numeros:");
        int soma=0;
        int produto=1;

        for(int i=0; i<n; i++) {
            int x = fs.nextInt();
            soma += x;
            produto *= x;
        }

        System.out.println("A soma eh: " + soma + "\nO produto eh: " + produto);
    }
}
