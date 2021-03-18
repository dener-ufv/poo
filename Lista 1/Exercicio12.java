import java.io.BufferedReader;
import java.io.FileReader;

// Entrada com um arquivo csv no formato (em cada linha):
// NOME, SEXO, PESO, IDADE, ALTURA

public class Exercicio12 {

    public static class Client {
        public String nome, sexo;
        public int peso, idade;
        public double altura;

        Client(String[] build) {
            this.nome = build[0].trim();
            this.sexo = build[1].trim();
            this.peso = Integer.parseInt(build[2].trim());
            this.idade = Integer.parseInt(build[3].trim());
            this.altura = Double.parseDouble(build[4].trim());
        }
    }

    public static void main(String[] args) {
        try {
            FileReader file = new FileReader("input.csv");
            BufferedReader reader = new BufferedReader(file);

            String line = "";
            Client[] clientList = new Client[100];
            int i=0;
            while((line = reader.readLine()) != null) {
                    clientList[i++] = new Client(line.split(","));
            }

            int q1 = i;
            double q2 = 0;
            int q2_qtt = 0;
            int q3 = 0;
            int q4 = 0;
            String q5_name = "";
            int q5_val = 0;
            String q6_name = "";
            double q6_val = 10000;

            for(int j=0; j<i; j++) {
                Client c = clientList[j];
                if(c.sexo.equals("M")) {
                    q2 = (q2_qtt * q2 + c.idade) / ++q2_qtt;
                }
                if(c.sexo.equals("F") && c.altura >= 1.60 && c.altura <= 1.70 && c.peso > 70) q3++;
                if(c.idade >= 18 && c.idade <= 25) q4++;
                if(c.idade > q5_val) {
                    q5_val = c.idade;
                    q5_name = c.nome;
                }
                if(c.sexo.equals("F") && c.altura < q6_val) {
                    q6_val = c.altura;
                    q6_name = c.nome;
                }
            }

            System.out.println("Existem " + q1 + " pacientes");
            System.out.println("A media de idade dos homens eh " + q2);
            System.out.println("O numero de mulheres com altura entre 1,60 e 1,70 e peso acima de 70kg eh " + q3);
            System.out.println("A quantidade de pessoas com idade entre 18 e 15 anos eh " + q4);
            System.out.println("O paciente mais velho eh " + q5_name);
            System.out.println("A mulher mais baixa eh " + q6_name);

            reader.close();
            file.close();
        } catch (Exception e) {

        }
    }
}
