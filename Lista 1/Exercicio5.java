import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        System.out.println("Digite o dia do aniversario:");
        int dia = fs.nextInt();
        System.out.println("Digite o mes do aniversario");
        int mes = fs.nextInt();

        int[] diasMes = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] nomeMes = {"", "Janeiro", "Fevereiro", "Marco", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};

        if(mes < 1 || mes > 12 || dia < 1 || dia > diasMes[mes]) {
            System.out.println("Data invalida");
        } else {
            System.out.println("Data valida: " + dia + " de " + nomeMes[mes]);
        }
    }
}
