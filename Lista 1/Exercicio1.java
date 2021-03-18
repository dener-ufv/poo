import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        System.out.println("Digite o ano de nascimento:");
        int birth = fs.nextInt();
        System.out.println("Digite o ano atual:");
        int year = fs.nextInt();

        System.out.println("A pessoa faz " + (year - birth) + " anos este ano");
    }
}