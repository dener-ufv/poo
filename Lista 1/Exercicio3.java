import java.util.Scanner;


public class Exercicio3 {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        System.out.println("Salario bruto:");
        double salario = fs.nextDouble();
        System.out.println("Descontos:");
        double descontos = fs.nextDouble();
        System.out.println("Pedido de Emprestimo:");
        double pedido = fs.nextDouble();

        if(pedido <= 0.3 * (salario - descontos)) {
            System.out.println("Pode fazer o emprestimo");
        } else {
            System.out.println("NAO pode fazer o emprestimo");
        }
    }
}
