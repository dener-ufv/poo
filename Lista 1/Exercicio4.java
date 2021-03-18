import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        
        System.out.println("Digite o nome do mes com letras minusculas e sem caracteres especiais:");
        String s = fs.next();
        int ans = -1;
        if(s.equals("janeiro")) ans = 1;
        if(s.equals("fevereiro")) ans = 2;
        if(s.equals("marco")) ans = 3;
        if(s.equals("abril")) ans = 4;
        if(s.equals("maio")) ans = 5;
        if(s.equals("junho")) ans = 6;
        if(s.equals("julho")) ans = 7;
        if(s.equals("agosto")) ans = 8;
        if(s.equals("setembro")) ans = 9;
        if(s.equals("outubro")) ans = 10;
        if(s.equals("novembro")) ans = 11;
        if(s.equals("dezembro")) ans = 12;

        if(ans == -1) System.out.println(s + " eh um mes invalido");
        else System.out.println(s + " = " + ans);

    }
}