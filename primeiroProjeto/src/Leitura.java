import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Digite seu filme Favorito");
        String filme = sc.nextLine();

        System.out.println("qual o Ano de lançamento? ");
        int anoDeLancamento = sc.nextInt();

        System.out.println("De sua nota para o filme: ");
        double avaliacao = sc.nextDouble();

        System.out.println("Seu fime favorito é: " + filme);
        System.out.println("O ano de lançamento é: " + anoDeLancamento);
        System.out.println("Sua avalição do Filme é: " + avaliacao);

        sc.close();
    }
}
