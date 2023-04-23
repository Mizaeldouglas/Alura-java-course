import java.util.Scanner;

public class OutroLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;
        int totaldeNotas = 0;

        while (nota != -1) {
            System.out.println("De sua nota para o filme e digite -1 para sair: ");
            nota = sc.nextDouble();
            if ( nota != -1){
                mediaAvaliacao += nota;
                totaldeNotas++;
            }
        }

        System.out.printf("Média de avaliações %.2f",( mediaAvaliacao / totaldeNotas));


        sc.close();

    }
}


