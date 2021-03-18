import java.util.Arrays;
import java.util.Scanner;


public class Exercicio9 {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int[] arr = new int[100000];
        int i=0;
        while(true) {
            String s = fs.next();
            if(s.equals("fim")) break;
            arr[i++] = Integer.parseInt(s);
        }

        Arrays.sort(arr, 0, i);

        for(int j=0; j<i; j++) {
            System.out.println(arr[j]);
        }
    }
}
